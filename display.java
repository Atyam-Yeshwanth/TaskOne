package task;

import java.util.Scanner;

public class display {

	public void displays() {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("**************************");
			System.out.println("Courses Available");
			System.out.println("Enter 1->C ");
			System.out.println("Enter 2-> CPP");
			System.out.println("Enter 3-> RUBY");
			System.out.println("**************************");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				clang a = new clang();
				a.c();
			}
			else if(choice == 2) {
				cpp b = new cpp();
				b.cpp();
			}
			else if(choice == 3) {
				ruby c = new ruby();
				c.ruby();
			}		
		}
		
	}