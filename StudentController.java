import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class StudentController {
	
    public static final String URL = "jdbc:mysql://localhost:3306/pdoposts";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    

    public ArrayList<Object> view_value(Statement stmt,Connection conn,int input) throws ClassNotFoundException, SQLException {//read the data from database
    	
    
         
    	 String sql="SELECT ID, Name,Math_Mark, Science_Mark FROM student WHERE ID=?";
		 
		 PreparedStatement preparedStatement = conn.prepareStatement(sql);
		 
	      preparedStatement.setInt(1, input);
	      
	      ResultSet rs = preparedStatement.executeQuery();
	      
	      Object[] arr =new Object[4];
	      
	      ArrayList<Object> sites = new ArrayList<Object>();
	 
	        //，rs.next() return true
	        while(rs.next()){//view the data
	        	
	            sites.add(rs.getString("ID"));
	        	
	        	sites.add(rs.getString("Name"));
	        	
	       
	        	sites.add(rs.getString("Math_Mark"));
	                
	        	sites.add(rs.getString("Science_Mark"));
	        }
	        
	        
	        return sites;
	
		
    }
    
    

}
