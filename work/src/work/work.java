package work;
import java.sql.*;
public class work {
	public static void main(String[] args)throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("create table vamsi(id number(10),name varchar2(10),age number(5),phn number(10),nationality varchar2(20))");
        String s1 = "insert into student values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(s1);
        ps.setInt(1,222);
        ps.setString(2,"DEF");
        ps.setInt(3, 19);
        ps.setInt(4, 1234567890);
        ps.setString(5, "Hindu");
        ps.executeUpdate();

        con.close(); 
	}
}
