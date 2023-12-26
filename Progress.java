package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Progress {
	public String Progresses(String email) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		Connection yes = null;
		try {
			yes = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg","root","root@123");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		String query="select * from records";
		PreparedStatement view;
		try {
			view = yes.prepareStatement(query);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
				
				if(email.equals(rs.getString("rec_email"))) {
					if(rs.getBoolean("c")== false) {
						System.out.println("c" + " - "+"Not Completed");
					}
					else {
						System.out.println("c" + " - "+"Completed");
					}
					if(rs.getBoolean("cpp")== false) {
						System.out.println("cpp" + " - "+"Not Completed");
					}
					else {
						System.out.println("cpp" + " - "+"Completed");
					}
					if(rs.getBoolean("ruby")== false) {
						System.out.println("ruby" + " - "+"Not Completed");
					}
					else {
						System.out.println("ruby" + " - "+"Completed");
					}
				}
			}
		}
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return email;
	}


	
	

}