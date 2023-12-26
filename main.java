package task;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int useropt=1;
		
		while(useropt==1) {
			System.out.println("*********************");
			System.out.println("Enter 1 to register");
			System.out.println("Enter 2 to login");
			System.out.println("Enter 3 to Leave");
			int select=sc.nextInt();
			
			if(select==1) {
				register r=new register();
				r.registerusers();
			}
			else if(select ==2) {
				log l=new log();
				l.logins();
			}
			else if(select==3) {
				System.out.println("Exited Successfully");
				break;
			}
		}
	}

}
