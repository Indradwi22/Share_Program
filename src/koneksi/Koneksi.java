package koneksi;

/*
*@ author resa cr
* This program can modify and share
*/
import com.mysql.jdbc.Driver;
import naivebayes.Sekolah;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Koneksi 
{
	private static Connection koneksi;

	public static Connection getKoneksi()
	{
		if(koneksi == null)
		{
			try
			{
				String url = "jdbc:mysql://localhost/bos";
				String user = "root";
				String password = "";
				
				DriverManager.registerDriver(new Driver());
				koneksi = DriverManager.getConnection(url,user,password);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		return koneksi;
	}
        
}
