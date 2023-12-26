package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class log {
	String email;
	String password;
	
	Scanner sc=new Scanner(System.in);
	public void logins() {
		System.out.println("Enter Your Registered Email Id:");
		email=sc.next();
		System.out.println("Enter Your password");
		password=sc.next();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection yes=null;
		
		try {
			yes=DriverManager.getConnection("jdbc:mysql://localhost:3306/reg","root","root@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String que1="select * from registration";
		PreparedStatement view;
		int user=1;
		try {
			view = yes.prepareStatement(que1);
			ResultSet rs=view.executeQuery();
			while (rs.next()) {
				  if(email.equals(rs.getString("user_email")) && password.equals(rs.getString("user_password"))) {
		            	int opt=1;
		            	user=2;
		            	System.out.println("*********************************");
	        			System.out.println("Login Successful.");
	        			System.out.println();
	        			while(opt ==1) {
	        				System.out.println("*********************************");
		        			System.out.println("Enter 1 to Diplay the courses");
		        			System.out.println("Enter 2 to check the progress");
		        			System.out.println("Enter 3 to log out");
		        			System.out.println("*********************************");
		        			System.out.println("");
		        			int select = sc.nextInt();
		        			
		        			if(select == 1) {
		        				display s=new display();
		        				s.displays();
		        			}
		        			if(select == 2) {
		        				Progress a=new Progress();
		        				email = a.Progresses(email);
		        			}
		        			if(select == 3) {
		        				System.out.println("You are Logged Out");
		        				System.out.println("Thank You !");
		        				opt =2;
		        				break;
		        				
		        			}
		        			
		        		}
						break;
		            }
		             
				}
				if(user == 1) {
		           	System.out.println(" User Name or Password are wrong");
		           	System.out.println("Please check once while giving the credentials");
		            
					}
	      		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
