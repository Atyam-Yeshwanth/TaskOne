package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class ruby {
	Scanner sc=new Scanner(System.in);
	public void ruby() {
		System.out.println("When You Complete all topics you get an certificate");
		System.out.println("Enter 1 for Basics of RUBY");
		System.out.println("Enter 2 for Intermediate RUBY");
		System.out.println("Enter 3 for Advanced RUBY");
		System.out.println("Enter 4 for Expert RUBY");
		int choice =sc.nextInt();
		String complete =null;
		if(choice ==1) {
			// Hello World Program
	        System.out.println("puts \"Hello, World!\"");

	        // Variables
	        System.out.println("name = \"John\"");
	        System.out.println("age = 25");

	        // Data Types
	        System.out.println("text = \"Hello\"");
	        System.out.println("number = 42");
	        System.out.println("pi = 3.14");
	        System.out.println("is_true = true");

	        // Arrays
	        System.out.println("fruits = [\"apple\", \"banana\", \"orange\"]");

	        // Hashes
	        System.out.println("person = { \"name\" => \"Alice\", \"age\" => 30 }");

	        // Control Flow
	        System.out.println("if age > 18\n\tputs \"Adult\"\nelse\n\tputs \"Minor\"\nend");

	        // Loops
	        System.out.println("fruits.each do |fruit|\n\tputs fruit\nend");

	        // Methods (Functions)
	        System.out.println("def greet(name)\n\tputs \"Hello, #{name}!\"\nend\ngreet(\"Bob\")");

	        // Symbols
	        System.out.println("status = :success");

	        // Classes and Objects
	        System.out.println("class Person\n\tattr_accessor :name, :age\n\n\tdef initialize(name, age)\n\t\t@name = name\n\t\t@age = age\n\tend\nend\n\nperson = Person.new(\"John\", 25)");

	        // Modules
	        System.out.println("module MathOperations\n\tdef self.add(a, b)\n\t\ta + b\n\tend\nend\n\nresult = MathOperations.add(3, 4)");

	        // File I/O
	        System.out.println("File.open(\"example.txt\", \"w\") do |file|\n\tfile.puts \"Hello, File!\"\nend");

	        // Exception Handling
	        System.out.println("begin\n\t# Code that may raise an exception\nrescue => exception\n\tputs \"An error occurred: #{exception.message}\"\nensure\n\t# Code that will always run\nend");
	        complete = complete + "c";
	        System.out.println("If You want to continue enter 2");
	        choice = sc.nextInt();
		}
		if(choice == 2)
		{
			System.out.println("- Syntax:");
	        System.out.println("  - Ruby has a clean and easy-to-read syntax that emphasizes human-readable code.");
	        System.out.println("  - Statements end with a newline character or a semicolon (;).");

	        // 2. Variables
	        System.out.println("\n- Variables:");
	        System.out.println("  - Variables in Ruby are dynamically typed, meaning you don't need to declare their type.");
	        System.out.println("  - Variable names begin with a lowercase letter or an underscore.");
	        System.out.println("  Example:");
	        System.out.println("  int age = 25;");
	        System.out.println("  String name = \"John\";");

	        // 3. Data Types
	        System.out.println("\n- Data Types:");
	        System.out.println("  - Ruby supports various data types, including integers, floats, strings, symbols, arrays, and hashes.");
	        System.out.println("  Example:");
	        System.out.println("  int num = 42;");
	        System.out.println("  double price = 29.99;");
	        System.out.println("  String greeting = \"Hello, World!\";");

	        // 4. Control Flow
	        System.out.println("\n- Control Flow:");
	        System.out.println("  - Ruby supports standard control flow structures like if, else, elsif, unless, case, while, and until.");
	        System.out.println("  Example:");
	        System.out.println("  if (age >= 18) {");
	        System.out.println("      System.out.println(\"You are an adult.\");");
	        System.out.println("  } else {");
	        System.out.println("      System.out.println(\"You are a minor.\");");
	        System.out.println("  }");

	        // 5. Methods
	        System.out.println("\n- Methods:");
	        System.out.println("  - Methods in Ruby are defined using the def keyword.");
	        System.out.println("  - Ruby methods can return values implicitly without using the return keyword.");
	        System.out.println("  Example:");
	        System.out.println("  String greet(String name) {");
	        System.out.println("      return \"Hello, \" + name + \"!\";");
	        System.out.println("  }");
	        System.out.println("  System.out.println(greet(\"Bob\")); // Outputs: Hello, Bob!");

	        // 6. Classes and Objects
	        System.out.println("\n- Classes and Objects:");
	        System.out.println("  - Ruby is an object-oriented language, and everything in Ruby is an object.");
	        System.out.println("  - Classes are used to define objects, and they can have methods and attributes.");
	        System.out.println("  Example:");
	        System.out.println("  class Dog {");
	        System.out.println("      void bark() {");
	        System.out.println("          System.out.println(\"Woof!\");");
	        System.out.println("      }");
	        System.out.println("  }");
	        System.out.println("  Dog myDog = new Dog();");
	        System.out.println("  myDog.bark(); // Outputs: Woof!");

	        // 7. Symbols
	        System.out.println("\n- Symbols:");
	        System.out.println("  - Symbols are immutable and are often used as identifiers.");
	        System.out.println("  Example:");
	        System.out.println("  :mySymbol;");

	        // 8. Blocks and Iterators
	        System.out.println("\n- Blocks and Iterators:");
	        System.out.println("  - Ruby supports blocks, which are chunks of code that can be passed around.");
	        System.out.println("  - Iterators are methods that execute a block of code repeatedly.");
	        System.out.println("  Example:");
	        System.out.println("  5.times {");
	        System.out.println("      System.out.println(\"Hello!\");");
	        System.out.println("  }");

	        // 9. Modules
	        System.out.println("\n- Modules:");
	        System.out.println("  - Modules provide a way to group related methods, classes, and constants.");
	        System.out.println("  - They are used for namespacing and mixin functionality.");
	        System.out.println("  Example:");
	        System.out.println("  module MyModule {");
	        System.out.println("      void myMethod() {");
	        System.out.println("          System.out.println(\"This is a method in MyModule.\");");
	        System.out.println("      }");
	        System.out.println("  }");

	        System.out.println("\nThese are just some basic aspects of Ruby. The language offers a rich set of features and has a vibrant community. If you're interested in learning more, you may want to explore topics like exception handling, file I/O, regular expressions, and metaprogramming in Ruby. There are also many resources and tutorials available online to help you dive deeper into Ruby programming.");
	        complete = complete + "o";
	        System.out.println("If You want to continue enter 3");
	        choice = sc.nextInt();
		}
		if(choice ==3)
		{
			// Advanced Concepts in Ruby

	        // 10. Exception Handling
	        System.out.println("\n- Exception Handling:");
	        System.out.println("  - Ruby uses begin, rescue, and ensure blocks for exception handling.");
	        System.out.println("  Example:");
	        System.out.println("  begin");
	        System.out.println("      # Code that might raise an exception");
	        System.out.println("      raise 'An error occurred'");
	        System.out.println("  rescue => exception");
	        System.out.println("      puts 'Error handled: #{exception.message}'");
	        System.out.println("  ensure");
	        System.out.println("      # Code that will always run");
	        System.out.println("  end");

	        // 11. File I/O
	        System.out.println("\n- File I/O:");
	        System.out.println("  - Ruby provides simple file I/O operations.");
	        System.out.println("  Example:");
	        System.out.println("  File.open('example.txt', 'w') do |file|");
	        System.out.println("      file.puts 'Hello, File!'");
	        System.out.println("  end");
	        System.out.println("  content = File.read('example.txt')");
	        System.out.println("  puts content");

	        // 12. Regular Expressions
	        System.out.println("\n- Regular Expressions:");
	        System.out.println("  - Ruby has powerful support for regular expressions.");
	        System.out.println("  Example:");
	        System.out.println("  text = 'The quick brown fox'");
	        System.out.println("  match = /quick/.match(text)");
	        System.out.println("  puts match[0] if match");

	        // 13. Metaprogramming
	        System.out.println("\n- Metaprogramming:");
	        System.out.println("  - Ruby allows you to write code that writes code.");
	        System.out.println("  Example:");
	        System.out.println("  class DynamicClass");
	        System.out.println("      define_method(:dynamic_method) do");
	        System.out.println("          puts 'This method is created dynamically!'");
	        System.out.println("      end");
	        System.out.println("  end");
	        System.out.println("  dynamic_instance = DynamicClass.new");
	        System.out.println("  dynamic_instance.dynamic_method");

	        // 14. Closures and Procs
	        System.out.println("\n- Closures and Procs:");
	        System.out.println("  - Ruby supports closures through Procs and lambdas.");
	        System.out.println("  Example:");
	        System.out.println("  add = ->(a, b) { a + b }");
	        System.out.println("  puts add.call(3, 5)");

	        // 15. Reflection
	        System.out.println("\n- Reflection:");
	        System.out.println("  - Ruby allows you to examine and modify its own structure.");
	        System.out.println("  Example:");
	        System.out.println("  class MyClass");
	        System.out.println("      attr_accessor :my_attribute");
	        System.out.println("  end");
	        System.out.println("  obj = MyClass.new");
	        System.out.println("  obj.my_attribute = 'Hello, Reflection!'");
	        System.out.println("  puts obj.my_attribute");

	        System.out.println("\nThese are some advanced concepts in Ruby. Exploring these topics will deepen your understanding of the language and its capabilities.");
	        complete = complete + "m";
	        System.out.println("If You want to continue enter 4");
	        choice = sc.nextInt();
		}
		if(choice == 4) 
		{
			// 16. Metaprogramming with method_missing
	        System.out.println("\n- Metaprogramming with method_missing:");
	        System.out.println("  - Ruby allows dynamic handling of undefined methods using method_missing.");
	        System.out.println("  Example:");
	        System.out.println("  class DynamicHandler");
	        System.out.println("      def method_missing(method_name, *args)");
	        System.out.println("          puts \"Undefined method: #{method_name}\"");
	        System.out.println("      end");
	        System.out.println("  end");
	        System.out.println("  dynamic_obj = DynamicHandler.new");
	        System.out.println("  dynamic_obj.undefined_method();");

	        // 17. Modules and Mixins
	        System.out.println("\n- Modules and Mixins:");
	        System.out.println("  - Ruby supports multiple inheritance using modules and mixins.");
	        System.out.println("  Example:");
	        System.out.println("  module A");
	        System.out.println("      def method_a");
	        System.out.println("          puts 'Method A'");
	        System.out.println("      end");
	        System.out.println("  end");
	        System.out.println("  module B");
	        System.out.println("      def method_b");
	        System.out.println("          puts 'Method B'");
	        System.out.println("      end");
	        System.out.println("  end");
	        System.out.println("  class C");
	        System.out.println("      include A");
	        System.out.println("      include B");
	        System.out.println("  end");
	        System.out.println("  obj = C.new");
	        System.out.println("  obj.method_a");
	        System.out.println("  obj.method_b");

	        // 18. Blocks, Procs, and Lambdas
	        System.out.println("\n- Blocks, Procs, and Lambdas:");
	        System.out.println("  - Ruby has powerful support for closures through blocks, procs, and lambdas.");
	        System.out.println("  Example:");
	        System.out.println("  def execute_block");
	        System.out.println("      yield if block_given?");
	        System.out.println("  end");
	        System.out.println("  execute_block { puts 'Executing block!' }");

	        // 19. DSLs (Domain-Specific Languages)
	        System.out.println("\n- DSLs (Domain-Specific Languages):");
	        System.out.println("  - Ruby's flexibility allows the creation of expressive DSLs.");
	        System.out.println("  Example:");
	        System.out.println("  class HTMLBuilder");
	        System.out.println("      def build");
	        System.out.println("          puts '<html>'");
	        System.out.println("          yield if block_given?");
	        System.out.println("          puts '</html>'");
	        System.out.println("      end");
	        System.out.println("  end");
	        System.out.println("  html_builder = HTMLBuilder.new");
	        System.out.println("  html_builder.build do");
	        System.out.println("      puts '  <body>'");
	        System.out.println("      puts '    <p>Hello, DSL!</p>'");
	        System.out.println("      puts '  </body>'");
	        System.out.println("  end");

	        // 20. Advanced Enumerable
	        System.out.println("\n- Advanced Enumerable:");
	        System.out.println("  - Ruby's Enumerable module provides powerful methods for collections.");
	        System.out.println("  Example:");
	        System.out.println("  numbers = [1, 2, 3, 4, 5]");
	        System.out.println("  squared = numbers.map { |n| n * n }");
	        System.out.println("  sum = numbers.reduce(0) { |acc, n| acc + n }");
	        System.out.println("  puts squared");
	        System.out.println("  puts sum");

	        System.out.println("\nThese are some expert-level concepts in Ruby. Mastering these topics will make you proficient in using Ruby for complex and expressive programming tasks.");
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
	        	System.out.println("To get certificate Complete Basics in ruby");
	        	e=1;
	        }
	        if(o==0) {
	        	System.out.println("To get certificate Complete Intermediate in ruby");
	        	e=1;
	        }
	        if(m==0) {
	        	System.out.println("To get certificate Complete Advance in ruby");
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
							
							String updateProductQuery ="update records SET ruby=? where rec_email = ?";
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
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
	        }
		}
	}
}
