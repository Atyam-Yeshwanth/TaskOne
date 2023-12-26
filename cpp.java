package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class cpp {
	Scanner sc=new Scanner(System.in);
	public void cpp() {
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basic CPP");
		System.out.println("Enter 2 for Intermediate CPP");
		System.out.println("Enter 3 for Advanced CPP");
		System.out.println("Enter 4 for Expert CPP");
		int choice =sc.nextInt();
		String complete =null;
		if(choice ==1)
		{
			System.out.println("#include <iostream>\n\nint main() {\n\tstd::cout << \"Hello, World!\" << std::endl;\n\treturn 0;\n}");

	        // Data Types
	        System.out.println("int age = 25;\nfloat price = 10.99f;\ndouble pi = 3.14159;\nchar grade = 'A';\nbool isPassed = true;");

	        // Variables and Constants
	        System.out.println("int x = 5; // Variable\nconst float PI = 3.14f; // Constant");

	        // Input/Output
	        System.out.println("int age;\nstd::cout << \"Enter your age: \";\nstd::cin >> age;");

	        // Operators
	        System.out.println("int a = 5, b = 3;\nint sum = a + b;");

	        // Control Flow
	        System.out.println("if (x > 0) {\n\tstd::cout << \"Positive\" << std::endl;\n} else if (x < 0) {\n\tstd::cout << \"Negative\" << std::endl;\n} else {\n\tstd::cout << \"Zero\" << std::endl;\n}");

	        System.out.println("for (int i = 0; i < 5; i++) {\n\tstd::cout << i << \" \";\n}");

	        // Functions
	        System.out.println("int add(int a, int b) {\n\treturn a + b;\n}\n\nint main() {\n\tint result = add(3, 4);\n\tstd::cout << \"Sum: \" << result << std::endl;\n\treturn 0;\n}");
	        complete = complete + "c";
	        System.out.println("If You want to continue enter 2");
	        choice = sc.nextInt();
		}
		if(choice == 2) 
		{
			System.out.println("int num = 10;\nswitch (num) {\n\tcase 5:\n\t\tSystem.out.println(\"Five\");\n\t\tbreak;\n\tcase 10:\n\t\tSystem.out.println(\"Ten\");\n\t\tbreak;\n\tdefault:\n\t\tSystem.out.println(\"Other\");\n}");

	        // Arrays
	        System.out.println("int numbers[] = {1, 2, 3, 4, 5};");

	        // Pointers and References
	        System.out.println("int number = 10;\nint* ptr = &number;\nstd::cout << \"Value at pointer: \" << *ptr << std::endl;");

	        // Dynamic Memory Allocation
	        System.out.println("int* dynamicArray = new int[5];\ndelete[] dynamicArray;");

	        // Functions with Multiple Parameters
	        System.out.println("int multiply(int a, int b) {\n\treturn a * b;\n}\n\nint main() {\n\tint result = multiply(3, 4);\n\tstd::cout << \"Product: \" << result << std::endl;\n}");

	        // Classes and Objects
	        System.out.println("class Rectangle {\npublic:\n\tint length;\n\tint width;\n\n\tint calculateArea() {\n\t\treturn length * width;\n\t}\n};\n\nint main() {\n\tRectangle rect;\n\trect.length = 5;\n\trect.width = 3;\n\tint area = rect.calculateArea();\n\tstd::cout << \"Area: \" << area << std::endl;\n\treturn 0;\n}");

	        // File Handling
	        System.out.println("std::ofstream outFile;\noutFile.open(\"example.txt\");\noutFile << \"Hello, File!\";\noutFile.close();");

	        // Standard Template Library (STL)
	        System.out.println("#include <vector>\n\nstd::vector<int> numbers = {1, 2, 3, 4, 5};");

	        // Exception Handling
	        System.out.println("try {\n\tint result = divide(10, 0);\n\tstd::cout << \"Result: \" << result << std::endl;\n} catch (const std::exception& e) {\n\tstd::cerr << \"Error: \" << e.what() << std::endl;\n}");
	        complete = complete + "o";
	        System.out.println("If You want to continue enter 3");
	        choice = sc.nextInt();
		}
		if(choice == 3) {
			 System.out.println("int numbers[] = {1, 2, 3, 4, 5};\nint* ptr = numbers;\nstd::cout << \"Value at pointer: \" << *ptr << std::endl;\nptr++;\nstd::cout << \"Value at incremented pointer: \" << *ptr << std::endl;");

		        // Advanced Data Structures (Graph)
		        System.out.println("#include <vector>\n#include <iostream>\n\nclass Graph {\nprivate:\n\tint numVertices;\n\tstd::vector<std::vector<int>> adjMatrix;\npublic:\n\tGraph(int vertices);\n\tvoid addEdge(int source, int destination);\n\tvoid displayGraph();\n};");

		        // File Handling (Binary Files)
		        System.out.println("struct Record {\n\tchar name[50];\n\tint age;\n};\n\nstd::ofstream outFile(\"data.dat\", std::ios::binary);\nRecord record = {\"John Doe\", 25};\noutFile.write(reinterpret_cast<char*>(&record), sizeof(Record));\noutFile.close();");

		        // Low-Level Bit Manipulation
		        System.out.println("unsigned int setBit(unsigned int x, int position) {\n\treturn x | (1 << position);\n}\n\nint main() {\n\tunsigned int value = 5;\n\tvalue = setBit(value, 2);\n\tstd::cout << \"Result: \" << value << std::endl;\n}");

		        // Understanding C++ Memory Model
		        System.out.println("int* ptr = new int;\n*ptr = 10;\ndelete ptr;");

		        // Advanced Preprocessor Directives
		        System.out.println("#define SQUARE(x) ((x) * (x))\n\nint main() {\n\tint result = SQUARE(5 + 3);\n\tstd::cout << \"Result: \" << result << std::endl;\n\treturn 0;\n}");

		        // Function Pointers and Callbacks
		        System.out.println("typedef int (*Operation)(int, int);\n\nint add(int a, int b) {\n\treturn a + b;\n}\n\nint main() {\n\tOperation operation = &add;\n\tint result = operation(3, 4);\n\tstd::cout << \"Sum: \" << result << std::endl;\n}");

		        // Advanced Multithreading
		        System.out.println("#include <thread>\n\nvoid printNumbers() {\n\tfor (int i = 0; i < 5; i++) {\n\t\tstd::cout << \"Thread: \" << i << std::endl;\n\t}\n}\n\nint main() {\n\tstd::thread t(printNumbers);\n\tt.join();\n\treturn 0;\n}");
		        complete = complete + "m";
		        System.out.println("If You want to continue enter 4");
		        choice = sc.nextInt();
		}
		if(choice ==4)
		{
			System.out.println("int* numbers = new int[5];\ndelete[] numbers;");

	        // Smart Pointers
	        System.out.println("#include <memory>\n\nstd::unique_ptr<int> number = std::make_unique<int>(10);");

	        // Move Semantics and Rvalue References
	        System.out.println("class MyString {\nprivate:\n\tchar* data;\npublic:\n\tMyString(MyString&& other) noexcept;\n};");

	        // Lambda Expressions
	        System.out.println("auto add = [](int a, int b) { return a + b; };\nint result = add(3, 4);");

	        // Standard Template Library (STL) Algorithms
	        System.out.println("#include <algorithm>\n#include <vector>\n\nstd::vector<int> numbers = {3, 1, 4, 1, 5, 9};\nstd::sort(numbers.begin(), numbers.end());");

	        // Templates and Generic Programming
	        System.out.println("template <typename T>\nT add(T a, T b) {\n\treturn a + b;\n}\n\nint result = add<int>(3, 4);");

	        // Multithreading with C++11
	        System.out.println("#include <thread>\n#include <iostream>\n\nvoid printNumbers() {\n\tfor (int i = 0; i < 5; i++) {\n\t\tstd::cout << \"Thread: \" << i << std::endl;\n\t}\n}\n\nint main() {\n\tstd::thread t(printNumbers);\n\tt.join();\n\treturn 0;\n}");

	        // Modern C++ Features (C++11 and later)
	        System.out.println("auto add = [](auto a, auto b) { return a + b; };\nint result = add(3, 4);");

	        // Exception Handling (Custom Exception)
	        System.out.println("class CustomException : public std::exception {\npublic:\n\tconst char* what() const noexcept override {\n\t\treturn \"Custom Exception\";\n\t}\n};");
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
	        	System.out.println("To get certificate Complete Basics in cpp");
	        	e=1;
	        }
	        if(o==0) {
	        	System.out.println("To get certificate Complete Intermediate in cpp");
	        	e=1;
	        }
	        if(m==0) {
	        	System.out.println("To get certificate Complete Advance in cpp");
	        	e=1;
	        }
	        if(e==0) 
	        {
	        	System.out.println("Please confirm your email to send certificate to your mail");
	        	String email = sc.next(); 
	        
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}
	        Connection yes = null;
	        
	        try {
				yes=DriverManager.getConnection("jdbc:mysql://localhost:3306/reg","root","root@123");
			} catch (SQLException e1) {
				
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
						
						String updateProductQuery ="update records SET cpp=? where rec_email = ?";
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
