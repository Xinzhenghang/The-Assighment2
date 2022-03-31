import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class PatternModel {
	
    public static final String URL = "jdbc:mysql://localhost:3306/pdoposts";
    public static final String USER = "root";
    public static final String PASSWORD = "";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
	    Scanner input = new Scanner(System.in);
	    Class.forName("com.mysql.jdbc.Driver");
        //2. Gain the database connection
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.operate the database
        Statement stmt = conn.createStatement();
        
        
		StudentController sc=new StudentController();
		
		 StudentView view = new StudentView();
		 
		 
		
	    System.out.println("Please enter the students id:");  
	    
	    int number = input.nextInt();
		
		
		  ArrayList<Object> sites=sc.view_value(stmt,conn,number);
		
		  
		  for(int i = 0, j = 1,m=2,n=3; i < sites.size() && j < sites.size()&&m<sites.size()&&n<sites.size(); i=i+4, j=j+4,m=m+4,n=n+4) {
			  
			  StudentModel SM=new StudentModel(Integer.parseInt(sites.get(i).toString()),sites.get(j).toString(),Integer.parseInt(sites.get(m).toString()),Integer.parseInt(sites.get(n).toString()));
			  
			  System.out.println("Studen_ID: "+SM.ID+" "+"Student_Name: "+SM.Name+" "+"Stuent Math_Mark: "+SM.Math_Mark+" "+"Student Science Mark: "+SM.Science_Mark);
			  
		  }
	
	
		

	}

}
