package mysql_project1;
import java.sql.*;
import java.util.Scanner;


public class employee_details {
	
	static void insert() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo","root","Allwin@261=261");
		    Statement st=con.createStatement();
		    st.executeUpdate("insert into employee values(5,'suriya',50000,'chennai','developer')");
		    con.close();
		    
		}
	catch(Exception e) {
		System.out.println(e.getMessage());
		System.out.println("Successfully inserted");
	}
	}
	
	static void read() {
		
	 try{ Class.forName("com.mysql.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo","root","Allwin@261=261");
	    Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("select * from employee_details");
	 while(rs.next())
	 {
	 System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
	 }
	 }
	 catch(Exception e)
	 {
	 System.out.println(e.toString());
	 }
	 }
	
	static void update() {
		
		try { Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo","root","Allwin@261=261");
	    Statement st=con.createStatement();
	    st.executeUpdate("update employe set employee_name ='guru' were employee_id = 6 ");
	    con.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void delete() {
		
		try {  Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo","root","Allwin@261=261");
	    @SuppressWarnings("unused")
		Statement st=con.createStatement();
	    String s= "delete from employee_details were employee_id = ?";
		PreparedStatement ps = con.prepareStatement(s);
	    ps.setInt(1, 2);
	    ps.execute();
	    con.close();
		}
	    catch(Exception e) {
	    	
	    System.out.println(e.getMessage());
	    	
	    }
			
	}
	
	
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 System.out.println("To perform operation select any one num");
		 System.out.println("Insert:1");
		 System.out.println("Select:2");
		 System.out.println("Update:3");
		 System.out.println("Delete:4");
		 int i = sc.nextInt();
		 employee_details d= new employee_details();
		 switch(i) {
		 
		 case 1:
			 d.insert();
			 break;
		 case 2:
			 d.read();
			 break;
		 case 3:
			 d.update();
			 break;
		 case 4:
			 d.delete();
			 break;	
		default:
			System.out.println("select the correct opction");
		 }
		
}
}
