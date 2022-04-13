package demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoSQl {
	public static void show() {
		
		try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Don96","root","");
	    	Statement stmt=con.createStatement();
	    	ResultSet rs=stmt.executeQuery("select* from students");
	    	while(rs.next()) {
	    		System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3));
	    	
	    	}
	    	
	    	con.close();
	    	   
	    	   
	    	    
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // show();
		
		
 }

}



