/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author Rendy
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import com.mysql.jdbc.ResultSet;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arif
 */
public class SQlAcces {

    private com.mysql.jdbc.Connection connection;
    private java.sql.Connection conn;
    private Statement stmt;
    private DefaultComboBoxModel dcmb;
    private DefaultTableModel dtm;
    private ResultSet rs;
    public List Alist = new ArrayList();
    public List Alist2 = new ArrayList();
    String connectionString = "";

    public void settingKoneksi(String database, String user, String password) {
//        connectionString = "jdbc:mysql://192.168.1.102/" + database + "?user=" + user + "&password=" + password + "";
        connectionString = "jdbc:mysql://localhost/" + database + "?user=" + user + "&password=" + password + "";
    }

    public void koneksi1() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(connectionString);
            stmt = conn.createStatement();
        } catch (Exception e) {
        }
    }

    //---- UB
    /**
     *
     * @param inTable
     * @param SQLSelect method digunakan untuk menampilkan database
     */
    public void fillTable(JTable inTable, String SQLSelect) {
        try {
            koneksi1();
            rs = (ResultSet) stmt.executeQuery(SQLSelect);
            dtm = createTable(rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        inTable.setModel(dtm);
        try {
            stmt.close();
        } catch (Exception e) {
        }
    }

    public void perintahSQL(String SQL) {

        try {
            koneksi1();
            stmt.execute(SQL);
            stmt.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void fillCombobox(JComboBox CmbAlias, String SQL) {
        try {
            koneksi1();
            ResultSet rs = (ResultSet) stmt.executeQuery(SQL);

            isiList(rs);
            CmbAlias.setModel(new DefaultComboBoxModel(Alist.toArray()));
            stmt.close();
        } catch (Exception e) {
        }

    }

    public void filllabel(JLabel texAlias, String SQL) {
        try {
            koneksi1();
            ResultSet rs = (ResultSet) stmt.executeQuery(SQL);

            isiList2(rs);
            texAlias.setText(new String(Alist2.toString()));
            stmt.close();
        } catch (Exception e) {
        }

    }

    void isi(String SQL) {
        try {
            koneksi1();
            ResultSet rs = (ResultSet) stmt.executeQuery(SQL);

            isiList(rs);
            // CmbAlias.setModel(new DefaultComboBoxModel(Alist.toArray()));
            stmt.close();
        } catch (Exception e) {
        }

    }

    void isiList(ResultSet rs) throws SQLException {
        Alist.clear();
        ResultSetMetaData rsmd = rs.getMetaData();
        int intNum = rsmd.getColumnCount();
        while (rs.next()) {
            String[] data = new String[intNum];
            Alist.add(rs.getString(0 + 1));
        }
    }

    void isiList2(ResultSet rs) throws SQLException {
        Alist2.clear();
        ResultSetMetaData rsmd = rs.getMetaData();
        int intNum = rsmd.getColumnCount();
        while (rs.next()) {
            String[] data = new String[intNum];
            Alist2.add(rs.getInt(0 + 1) + 1);
        }
    }

    /**
     *
     * @param rs
     * @return
     * @throws SQLException digunakan untuk membuat tabel model
     */
    public DefaultTableModel createTable(ResultSet rs)
            throws SQLException {

        // Menciptakan model tabel
        DefaultTableModel dtm = new DefaultTableModel();
        // Mendapatkan metadata
        ResultSetMetaData rsmd = rs.getMetaData();
        // Mendapatkan jumlah kolom

        int intNum = rsmd.getColumnCount();

        // Menciptakan array string nama kolom
        String[] str = new String[intNum];
        for (int i = 0; i < intNum; i++) {
            str[i] = rsmd.getColumnName(i + 1);
        } // Menetapkan kolom model tabel
        dtm.setColumnIdentifiers(str);

        // Iterasi data tabel
        while (rs.next()) {
            String[] data = new String[intNum];
            for (int i = 0; i < intNum; i++) {
                data[i] = rs.getString(i + 1);
            } // Menambah baris data ke model
            dtm.addRow(data);

        } // Mengembalikan model tabel
        return dtm;

    }
    private String username;
    private String password;

    public int cekadmin(String SQL, String u, String p) {
        int temp = -1;
        String cek_user = "";
        try {

            koneksi1();
            rs = (ResultSet) stmt.executeQuery(SQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            // Mendapatkan jumlah kolom

            int intNum = rsmd.getColumnCount();

            String[] str = new String[intNum];
            for (int i = 0; i < intNum; i++) {
                str[i] = rsmd.getColumnName(i + 1);
            }
            rs.beforeFirst();
            while (rs.next()) {
                username = rs.getString(str[0]);
                password = rs.getString(str[1]);
                cek_user = rs.getString(str[2]);
            }
            if (username.equals(u) && password.equals(p) && cek_user.equals("Admin")) {
                temp = 1;
            } else if (username.equals(u) && password.equals(p) && cek_user.equals("User")) {
                temp = 2;
//                setUsername(username);
            }

            //stmt.close(); 
        } catch (Exception e) {
        }
        return temp;

    }

    public com.mysql.jdbc.Connection getConnection() {
        return connection;
    }
}
