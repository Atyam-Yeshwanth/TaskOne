package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class register {
    String user_name;
    String user_email;
    String user_password;
    int u_Id;
    
    Scanner sc = new Scanner(System.in);
	public void registerusers() {
		
		
		System.out.println("Enter Your Name : ");
		user_name = sc.next();
		System.out.println("Enter Your Email : ");
		user_email = sc.next();
		System.out.println("Enter Your Password : ");
		user_password = sc.next();
		
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

		String qee ="select * from registration";
		try {
					
					PreparedStatement view = yes.prepareStatement(qee);
					ResultSet rs = view.executeQuery();
					while (rs.next()) {
			            if(user_email.equals(rs.getString("user_email"))) {
			            	System.out.println("Email id already exists");
			            	return;
			            }
					}
				}
				catch (SQLException e) {
					
					e.printStackTrace();
				}
                String query = "INSERT INTO registration(user_name, user_email, user_password) VALUES (?, ?, ?)";

        try (PreparedStatement ps = yes.prepareStatement(query)) {
            ps.setString(1, user_name);
            ps.setString(2, user_email);
            ps.setString(3, user_password);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        String query1="select * from registration";
		PreparedStatement view;
		try {
			
			view = yes.prepareStatement(query1);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
	            if(user_email.equals(rs.getString("user_email"))) {
	            	u_Id = rs.getInt("user_id");
	            }
			}
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	            	
		
		int opt = 1;
		
		while(opt == 1) {
			System.out.println("-------------------------------");
			System.out.println("Your Registration is successful");
			System.out.println("-------------------------------");
			System.out.println("Enter->1 Login");
			System.out.println("Enter->2 Leave");
			int select = sc.nextInt();
			String insertProductQuery = "insert into records (rec_id,rec_name,rec_email,c,cpp,ruby) VALUES (?, ?, ?, '0', '0', '0')";
            try (PreparedStatement insertps = yes
                    .prepareStatement(insertProductQuery)) {
                insertps.setInt(1, u_Id);
                insertps.setString(2, user_name);
                insertps.setString(3, user_email);
                insertps.executeUpdate();
            }
            catch (SQLException e) {
    			
    			e.printStackTrace();
    		}
			
			if(select == 1) {
				log l = new log();
				l.logins();
				System.out.println("Thanks for visiting");
				opt = 2;
			}
			else if(select == 2) {
				System.out.println("Thanks for visiting");
				opt = 2;
			}
		}
		
	}

}