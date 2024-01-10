package First_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_connection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Hello Jayant");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/seleniumdb", "root", "Jayant@123");
		Statement stm=con.createStatement();
		stm.execute("delete from testdata where TestStatus=0");
		ResultSet rs= stm.executeQuery("select * from testdata where TestStatus=0"); 
		rs.next();
		if(rs.getFetchSize()==0) {
			System.out.println("Successfully deleted");
		}
//		stm.execute("insert into testdata values('Sign up',false,'Jayant Bhadauria')");
		System.out.println("Fetching data");
		ResultSet result=stm.executeQuery("Select * from testdata");
		while(result.next()) {
			int i=1;
			while(i<=3) {
				System.out.println(result.getString(i));
				i++;
				j++;
			}
		}
		System.out.println("END OF TEST");
	}

}
