package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class clang {
	Scanner sc=new Scanner(System.in);;
	public void c() {
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basic C");
		System.out.println("Enter 2 for Intermediate C");
		System.out.println("Enter 3 for Advanced C");
		System.out.println("Enter 4 for Expert C");
		int choice =sc.nextInt();
		String complete =null;
		if(choice ==1)
		{
			System.out.println("#include <stdio.h>\n\nint main() {\n\t// Program code goes here\n\treturn 0;\n}");

	        // Comments
	        System.out.println("// This is a single-line comment\n\n/*\nThis is a\nmulti-line comment\n*/");

	        // Data Types
	        System.out.println("int age = 25;\nfloat price = 10.99;\ndouble pi = 3.14159;\nchar grade = 'A';\n");

	        // Variables and Constants
	        System.out.println("int x = 5; // Variable\nfinal float PI = 3.14f; // Constant");

	        // Input/Output
	        System.out.println("int age;\nSystem.out.print(\"Enter your age: \");\nScanner scanner = new Scanner(System.in);\nage = scanner.nextInt();");

	        // Operators
	        System.out.println("int a = 5, b = 3;\nint sum = a + b;");

	        // Control Flow
	        System.out.println("if (x > 0) {\n\tSystem.out.println(\"Positive\");\n} else if (x < 0) {\n\tSystem.out.println(\"Negative\");\n} else {\n\tSystem.out.println(\"Zero\");\n}");

	        System.out.println("for (int i = 0; i < 5; i++) {\n\tSystem.out.print(i + \" \");\n}");

	        // Functions
	        System.out.println("int add(int a, int b) {\n\treturn a + b;\n}\n\nint main() {\n\tint result = add(3, 4);\n\tSystem.out.println(\"Sum: \" + result);\n\treturn 0;\n}");
	        complete = complete + "c";
	        System.out.println("If You want to continue enter 2");
	        choice = sc.nextInt();
		}
		if(choice == 2) 
		{
			System.out.println("int num = 10;\nswitch (num) {\n\tcase 5:\n\t\tSystem.out.println(\"Five\");\n\t\tbreak;\n\tcase 10:\n\t\tSystem.out.println(\"Ten\");\n\t\tbreak;\n\tdefault:\n\t\tSystem.out.println(\"Other\");\n}");

	        // Arrays
	        System.out.println("int[] numbers = {1, 2, 3, 4, 5};");

	        // Pointers
	        System.out.println("int number = 10;\nint *ptr = &number;");

	        // Dynamic Memory Allocation
	        System.out.println("int* dynamicArray = (int*)malloc(5 * sizeof(int));");

	        // Functions with Multiple Parameters
	        System.out.println("int multiply(int a, int b) {\n\treturn a * b;\n}\n\nint main() {\n\tint result = multiply(3, 4);\n\tSystem.out.println(\"Product: \" + result);\n\treturn 0;\n}");

	        // Structures
	        System.out.println("struct Point {\n\tint x;\n\tint y;\n};\n\nstruct Point p1;\np1.x = 5;\np1.y = 10;");

	        // File Handling
	        System.out.println("FILE *file = fopen(\"example.txt\", \"w\");\nif (file != NULL) {\n\tfprintf(file, \"Hello, File!\");\n\tfclose(file);\n}");

	        // Preprocessor Directives
	        System.out.println("#define PI 3.14159\n\nint main() {\n\tfloat radius = 5.0;\n\tfloat area = PI * radius * radius;\n\tSystem.out.println(\"Area: \" + area);\n\treturn 0;\n}");
	        complete = complete + "o";
	        System.out.println("If You want to continue enter 3");
	        choice = sc.nextInt();
	        
		}
		if(choice==3)
		{
			System.out.println("#include <stdlib.h>\n#include <stdbool.h>\n\nstruct Node {\n\tint data;\n\tstruct Node* next;\n};\n\nstruct Node* createNode(int data) {\n\tstruct Node* newNode = (struct Node*)malloc(sizeof(struct Node));\n\tnewNode->data = data;\n\tnewNode->next = NULL;\n\treturn newNode;\n}");

	        // Memory Management
	        System.out.println("int* array = (int*)calloc(5, sizeof(int));\nfree(array);");

	        // Function Pointers
	        System.out.println("int add(int a, int b) {\n\treturn a + b;\n}\n\nint multiply(int a, int b) {\n\treturn a * b;\n}\n\nint main() {\n\tint (*operation)(int, int);\n\toperation = &add;\n\tint result = operation(3, 4);\n\tSystem.out.println(\"Sum: \" + result);\n}");

	        // Command-Line Arguments
	        System.out.println("int main(int argc, char* argv[]) {\n\tfor (int i = 0; i < argc; i++) {\n\t\tSystem.out.println(\"Argument \" + i + \": \" + argv[i]);\n\t}\n\treturn 0;\n}");

	        // Multithreading
	        System.out.println("#include <pthread.h>\n\nvoid* printNumbers(void* arg) {\n\tfor (int i = 0; i < 5; i++) {\n\t\tSystem.out.println(\"Thread: \" + i);\n\t}\n\treturn NULL;\n}\n\nint main() {\n\tpthread_t thread;\n\tpthread_create(&thread, NULL, printNumbers, NULL);\n\tpthread_join(thread, NULL);\n\treturn 0;\n}");

	        // System-Level Programming
	        System.out.println("#include <unistd.h>\n\nint main() {\n\twrite(1, \"Hello, System!\", 14);\n\treturn 0;\n}");

	        // Bitwise Operations
	        System.out.println("int x = 5;\nint y = x << 2; // Left shift by 2\nSystem.out.println(\"Result: \" + y);");

	        // Optimizing Code
	        System.out.println("int square(int x) {\n\treturn x * x;\n}\n\nint main() {\n\tint result = square(5);\n\tSystem.out.println(\"Square: \" + result);\n\treturn 0;\n}");
	        complete = complete + "m";
	        System.out.println("If You want to continue enter 4");
	        choice = sc.nextInt();
		}
		if(choice == 4)
		{
			System.out.println("int numbers[] = {1, 2, 3, 4, 5};\nint* ptr = numbers;\nSystem.out.println(\"Value at pointer: \" + *ptr);\nptr++;\nSystem.out.println(\"Value at incremented pointer: \" + *ptr);");

	        // Advanced Data Structures (Graph)
	        System.out.println("#include <stdio.h>\n#include <stdlib.h>\n\nstruct Node {\n\tint data;\n\tstruct Node* next;\n};\n\nstruct Graph {\n\tint numVertices;\n\tstruct Node** adjLists;\n};");

	        // File Handling (Binary Files)
	        System.out.println("struct Record {\n\tchar name[50];\n\tint age;\n};\n\nFILE* file = fopen(\"data.dat\", \"wb\");\nstruct Record record = {\"John Doe\", 25};\nfwrite(&record, sizeof(struct Record), 1, file);\nfclose(file);");

	        // Low-Level Bit Manipulation
	        System.out.println("unsigned int setBit(unsigned int x, int position) {\n\treturn x | (1 << position);\n}\n\nint main() {\n\tunsigned int value = 5;\n\tvalue = setBit(value, 2);\n\tSystem.out.println(\"Result: \" + value);\n}");

	        // Understanding C Memory Model
	        System.out.println("int main() {\n\tint* ptr = (int*)malloc(sizeof(int));\n\t*ptr = 10;\n\tfree(ptr);\n\treturn 0;\n}");

	        // Advanced Preprocessor Directives
	        System.out.println("#define SQUARE(x) ((x) * (x))\n\nint main() {\n\tint result = SQUARE(5 + 3);\n\tSystem.out.println(\"Result: \" + result);\n\treturn 0;\n}");

	        // Function Pointers and Callbacks
	        System.out.println("typedef int (*Operation)(int, int);\n\nint add(int a, int b) {\n\treturn a + b;\n}\n\nint main() {\n\tOperation operation = &add;\n\tint result = operation(3, 4);\n\tSystem.out.println(\"Sum: \" + result);\n}");

	        // Advanced Multithreading
	        System.out.println("#include <omp.h>\n\nint main() {\n\t#pragma omp parallel for\n\tfor (int i = 0; i < 5; i++) {\n\t\tSystem.out.println(\"Thread: \" + i);\n\t}\n\treturn 0;\n}");
	        System.out.println("*************");
	        complete = complete + "l";
	        int c=0;
	        int o=0;
	        int m=0;
	        int l=0;
	        int e=0;
	        for(int i=0; i<complete.length(); i++) {
	        	if( complete.contains("c")) {
	        		c=1;
	        	}
	        	if(complete.contains("o")) {
	        		o=1;
	        	}
	        	if(complete.contains("m")) {
	        		m=1;
	        	}
	        	
	        	if(complete.contains("l")) {
	        		l=1;
	        	}
	        }
	        if(c==0) {
	        	System.out.println("To get certificate Complete Basics in c");
	        	e=1;
	        }
	        if(o==0) {
	        	System.out.println("To get certificate Complete Intermediate in c");
	        	e=1;
	        }
	        if(m==0) {
	        	System.out.println("To get certificate Complete Advance in c");
	        	e=1;
	        }
	        if(e==0) {
	        	System.out.println("Please confirm your email to send certificate to your mail");
	        	String email = sc.next(); 
	   
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}
	        Connection yes= null;
	        
	        try {
				yes=DriverManager.getConnection("jdbc:mysql://localhost:3306/reg","root","root@123");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        String quer="select * from records";
	        PreparedStatement view;
	        try {
	        	int user=1;
				view = yes.prepareStatement(quer);
				ResultSet rs=view.executeQuery();
				while(rs.next()) {
					if(email.equals(rs.getString("rec_email"))) {
						user=2;
						
						String updateProductQuery ="update records SET c =? where rec_email = ?";
						try(PreparedStatement upateProductStatement =yes.prepareStatement(updateProductQuery)){
							upateProductStatement.setInt(1,1);
							upateProductStatement.setString(2,email);
							upateProductStatement.executeUpdate();
						}
					  }	
					}
				if(user ==1) {
					System.out.println("Please enter your email with registered email");
				}
				else
				{
					System.out.println("Your certificate is send to your registered email id "+email);
				}
	        
			} 
	        catch (SQLException e1) {
				
				e1.printStackTrace();
	        }
	        }
	        
		}

	}

}
