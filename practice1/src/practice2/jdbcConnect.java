package practice2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class jdbcConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		

		Connection con=   (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ashu","root","root");
		
		Statement st=(Statement) con.createStatement();
		/*PreparedStatement pst=(PreparedStatement) con.prepareStatement("insert into ashutosh values(?,?)");
		pst.setInt(1,40);
		pst.setString(2,"Yogesh");
		int i=pst.executeUpdate();
		System.out.println("inserted succsesfully using prepare stmt -"+i);
		*/
		//ResultSet rs=st.executeQuery("select * from ashutosh");
		/*int a=st.executeUpdate("insert into ashutosh values(35,'amol')");
		if(a!=0)
		{
			System.out.println("inserted succsesfully");
		}*/
		ResultSet rs=st.executeQuery("select * from ashutosh");

			while(rs.next())
			{
				
				System.out.println("result -"+rs.getInt(1)+" "+rs.getString(2));
			}
		
			rs.close();
			st.close();
			con.close();

	}

}
