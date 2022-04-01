import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentView {
	
    public static final String URL = "jdbc:mysql://localhost:3306/pdoposts";
    public static final String USER = "root";
    public static final String PASSWORD = "";

	StudentController sc1=new StudentController();
	
	public void realize_view(int sc) throws ClassNotFoundException, SQLException {
		

	    Class.forName("com.mysql.jdbc.Driver");
        //2. Gain the database connection
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.operate the database
        Statement stmt = conn.createStatement();
        

		
		sc1.view_value(stmt, conn, sc);
		
		
		
	
		
	}
	
	
	public void realize_insert(int number, String number1, int number2, int number3) throws ClassNotFoundException, SQLException {
	
		
	    Class.forName("com.mysql.jdbc.Driver");
        //2. Gain the database connection
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.operate the database
        Statement stmt = conn.createStatement();
        
 
        
        sc1.insert_value(stmt, conn, number, number1, number2, number3);
        

		
	}
	 
	    
}
