import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
class AccountsStoringApplication{
    public static void main(String args[]) throws Exception{
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashokitdb","root","ashokit");
        Statement statement=connection.createStatement();
        int j=10;
    }
}