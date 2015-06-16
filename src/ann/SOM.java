/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

import java.awt.Toolkit;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;
import jxl.Workbook;
import org.pushingpixels.substance.api.skin.SubstanceMagellanLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceRavenLookAndFeel;

/**
 *
 * @author USER
 */
public class SOM extends javax.swing.JFrame {

    /**
     * Creates new form SOM
     */
    Toolkit toolkit;
    Timer timer;
    double laju;
    public SOM() {
        initComponents();
        laju = 0.5;
    }
    
    class proses_iterasi extends TimerTask{
        int loop = 1;
        int a = Integer.parseInt(jTextField3.getText());

        @Override
        public void run() {
            if (loop <= a) {
                jButton1ActionPerformed(null);
                jLabel5.setText(String.valueOf(loop));
                loop++;
            }else{
                toolkit.beep();
                System.out.format("\nThat's it.. Done..!");
                timer.cancel();
            }
        }
    }
    public void aksi_iterasi(){
        toolkit = Toolkit.getDefaultToolkit();
        timer = new java.util.Timer();
        timer.schedule(new proses_iterasi(), 0, // initial delay
                1 * 1000); // subsequent rate
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "1", null, null, null},
                {"2", "4", "1", null, null, null},
                {"3", "1", "2", null, null, null},
                {"4", "3", "4", null, null, null},
                {"5", "5", "4", null, null, null}
            },
            new String [] {
                "No", "sepal length", "sepal width", "petal length", "petal width", "Class"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "2", "2", null, null},
                {"2", "2", "3", null, null},
                {"3", "2", "5", null, null}
            },
            new String [] {
                "W", "sepal length", "sepal width", "petal length", "petal width"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("Jumlah Data =");

        jLabel2.setText("Jumlah Cluster =");

        jButton2.setText("Set");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Random");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Automatic");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Jumlah Iterasi =");

        jLabel4.setText("Iterasi ke =");

        jLabel5.setText(" ");

        jButton5.setText("Open File...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5))))
                                    .addComponent(jButton5))))
                        .addGap(0, 305, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DecimalFormat df = new DecimalFormat("#.#");
         double data1[] = new double[jTable2.getRowCount()];
        double data2[] = new double[jTable2.getRowCount()];
        double data3[] = new double[jTable2.getRowCount()];
        double data4[] = new double[jTable2.getRowCount()];
        
        for(int i=0;i<jTable2.getRowCount();i++){
            data1[i] = Double.parseDouble(jTable2.getValueAt(i, 1).toString());
            data2[i] = Double.parseDouble(jTable2.getValueAt(i, 2).toString());
            data3[i] = Double.parseDouble(jTable2.getValueAt(i, 3).toString());
            data4[i] = Double.parseDouble(jTable2.getValueAt(i, 4).toString());
        }
        
        double cluster[][] = new double[jTable1.getRowCount()*data1.length][jTable1.getRowCount()*data1.length];
        for(int i=0;i<jTable1.getRowCount();i++){
            double a = Double.parseDouble(jTable1.getValueAt(i, 1).toString());
            double b = Double.parseDouble(jTable1.getValueAt(i, 2).toString());
            double c = Double.parseDouble(jTable1.getValueAt(i, 3).toString());
            double d = Double.parseDouble(jTable1.getValueAt(i, 4).toString());
            for(int j=0;j<data1.length;j++){
                cluster[i][j] = Math.pow((data1[j]-a), 2) 
                                + Math.pow((b-data2[j]), 2)
                                + Math.pow((c-data3[j]), 2)
                                + Math.pow((d-data4[j]), 2);
            }
            
            double awal = cluster[i][0];
            int clas = 1;
            for(int j=0;j<data1.length;j++){
            double cek = cluster[i][j];
                if(awal < cek){
                    clas = clas;
                }else{
                    clas = j+1;
                }
            }
            double hasil1 = Double.parseDouble(jTable2.getValueAt(clas-1, 1).toString()) + (laju * (a  - Double.parseDouble(jTable2.getValueAt(clas-1, 1).toString())));
            double hasil2 = Double.parseDouble(jTable2.getValueAt(clas-1, 2).toString()) + (laju * (b  - Double.parseDouble(jTable2.getValueAt(clas-1, 2).toString())));
            double hasil3 = Double.parseDouble(jTable2.getValueAt(clas-1, 3).toString()) + (laju * (c  - Double.parseDouble(jTable2.getValueAt(clas-1, 3).toString())));
            double hasil4 = Double.parseDouble(jTable2.getValueAt(clas-1, 4).toString()) + (laju * (d  - Double.parseDouble(jTable2.getValueAt(clas-1, 4).toString())));
            
            data1[clas-1] = hasil1;
            data2[clas-1] = hasil2;
            data3[clas-1] = hasil3;
            data4[clas-1] = hasil4;
            jTable2.setValueAt(df.format(hasil1), clas-1, 1);
            jTable2.setValueAt(df.format(hasil2), clas-1, 2);
            jTable2.setValueAt(df.format(hasil3), clas-1, 3);
            jTable2.setValueAt(df.format(hasil4), clas-1, 4);
            jTable1.setValueAt(clas, i, 5);
            //chek
        }
        laju = laju * 0.6;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int t1 = Integer.parseInt(jTextField1.getText());
        int t2 = Integer.parseInt(jTextField2.getText());
        
        setttable(jTable1, t1);
        setttable2(jTable2, t2);
        
        for (int i = 0; i < t1; i++) {
            jTable1.setValueAt(String.valueOf(i+1), i, 0);
        }
        
        for (int i = 0; i < t2; i++) {
            jTable2.setValueAt(String.valueOf(i+1), i, 0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      //  int t1 = Integer.parseInt(jTextField1.getText());
        //int t2 = Integer.parseInt(jTextField2.getText());
        
       /* for (int i = 0; i < jTable1.getRowCount(); i++) {
            int rand1 = (int) (Math.random() * 100);
            int rand2 = (int) (Math.random() * 100);
            int rand3 = (int) (Math.random() * 100);
            int rand4 = (int) (Math.random() * 100);
            jTable1.setValueAt(String.valueOf(rand1), i, 1);
            jTable1.setValueAt(String.valueOf(rand2), i, 2);
            jTable1.setValueAt(String.valueOf(rand3), i, 3);
            jTable1.setValueAt(String.valueOf(rand4), i, 4);
        }*/
        DecimalFormat df = new DecimalFormat("#.#");
        for (int i = 0; i < jTable2.getRowCount(); i++) {
            double rand1 = 4.3 + (Math.random() * (7.7 - 4.3));
            double rand2 = 2.2 + (Math.random() * (4.0 - 2.2));
            double rand3 = 1.2 + (Math.random() * (6.7 - 1.2));
            double rand4 = 0.09 + (Math.random() * (2.6 - 0.1));
            jTable2.setValueAt(df.format(rand1), i, 1);
            jTable2.setValueAt(df.format(rand2), i, 2);
            jTable2.setValueAt(df.format(rand3), i, 3);
            jTable2.setValueAt(df.format(rand4), i, 4);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        aksi_iterasi();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Excel File", "xls"));

        int retval = chooser.showOpenDialog(null);
        if(retval == JFileChooser.APPROVE_OPTION){
            File f = chooser.getSelectedFile();
            filltable(f,jTable1,5);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        try {
            UIManager.setLookAndFeel(new SubstanceMagellanLookAndFeel());
        //  UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel");
        } catch (Exception e) {
          System.out.println("Substance Graphite failed to initialize");
        }
        SOM w = new SOM();
        w.setVisible(true);
      }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    public void setttable(JTable table, int row){
            DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(    
              new Object [][] {
                    {null,null,null,null,null,null}
                },
                new String [] {
                    "No","sepal length","sepal width"," petal length","petal width", "Class"
                }  
        );

        table.setModel(tableModel);
            String[] data= {null,null,null,null,null,null};

            for (int i=1; i<row; i++){
                ((DefaultTableModel)table.getModel()).addRow(data);
            }
     }
    
    public void setttable2(JTable table, int row){
            DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(    
              new Object [][] {
                    {null,null,null,null,null}
                },
                new String [] {
                    "W","sepal length","sepal width"," petal length","petal width"
                }  
        );

        table.setModel(tableModel);
            String[] data= {null,null,null,null,null};

            for (int i=1; i<row; i++){
                ((DefaultTableModel)table.getModel()).addRow(data);
            }
     }

    private void filltable(File excelfile, JTable table, int kolom) {
        if(excelfile.exists()){
            try {
                Workbook workbook = Workbook.getWorkbook(excelfile);
                Sheet sheet = workbook.getSheet(0);
                //int jumlahrow = sheet.getRows();
                //int jumlahcolumn = sheet.getColumns();
                //untuk setting table
                
                for (int row = 0; row < table.getRowCount(); row++) {
                    for (int column = 1; column < kolom; column++) {
                        String isi = sheet.getCell(column-1, row).getContents();
                        table.setValueAt(isi, row, column);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
