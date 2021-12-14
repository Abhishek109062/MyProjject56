import java.sql.*;
import java.util.Scanner;

public class JDBC2 {
    public static void main(String ...args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hello","root","");
        Statement ss=con.createStatement();
        ResultSet rs= ss.executeQuery("Select  * from details");
        while(rs.next())
        {
            System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
        }
        Scanner sc =new Scanner(System.in);

    }
}
