
import java.util.Scanner;

class Customer
{  
private String customerFirstname = "Tom";
private String customerLastname = "Jason";
private String customerAddress = "123 abc rd";
private String customerZip = "12345";
private String customerState = "Ga";
private String customerUsername = "customer";
private String customerPassword = "123456";
private String customerEmail = "tom@email.com";
private String customerSSN = "123456789";
private String customerSecurityQ = "IDK";
  
public void createCustomer() {
	this.customerFirstname = "Tom";
	 this.customerLastname = "Jason";
	 this.customerAddress = "123 abc rd";
	 this.customerZip = "12345";
	 this.customerState = "Ga";
	 this.customerUsername = "customer";
	 this.customerPassword = "123456";
	 this.customerEmail = "tom@email.com";
	 this.customerSSN = "123456789";
	 this.customerSecurityQ = "IDK";
}
public void createCustomer(String customerFirstname,
String customerLastname,
String customerAddress,
String customerZip,
String customerState,
String customerUsername,
String customerPassword,
String customerEmail,
String customerSSN,
String customerSecurityQ)
{
	 this.customerFirstname = customerFirstname;
	 this.customerLastname = customerLastname;
	 this.customerAddress = customerAddress;
	 this.customerZip = customerZip;
	 this.customerState = customerState;
	 this.customerUsername = customerUsername;
	 this.customerPassword = customerPassword;
	 this.customerEmail = customerEmail;
	 this.customerSSN = customerSSN;
	 this.customerSecurityQ = customerSecurityQ;   
}  
public void setcustomerFirstname(String customerFirstname) {
	this.customerFirstname = customerFirstname;
}
public void setcustomerLastname(String customerLastname) {
	this.customerLastname = customerLastname;
}
public void setcustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public void setcustomerZip(String customerZip) {
	this.customerZip = customerZip;
}
public void setcustomerState(String customerState) {
	this.customerState = customerState;
}
public void setcustomerUsername(String customerUsername) {
	this.customerUsername = customerUsername;
}
public String getcustomerUsername() {
	return customerUsername;
}
public void setcustomerPassword(String customerPassword) {
	this.customerPassword = customerPassword;
}
public String getcustomerPassword() {
	return customerPassword;
}
public void setcustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public void customerSSN(String customerSSN) {
	this.customerSSN = customerSSN;
}
public void setcustomerSecurityQ(String customerSecurityQ) {
	this.customerSecurityQ = customerSecurityQ;
}
public String getcustomerSecurityQ() {
	return customerSecurityQ;
}
	Scanner sc = new Scanner(System.in);
	public void User() {
		setcustomerUsername(customerUsername);
		setcustomerPassword(customerPassword);
		int count = 1;
		String ID;
		String Pas;
		System.out.println("Type user ID:");
		 ID = sc.next();
		 System.out.println("Type user Password:");
			Pas = sc.next();
			if((getcustomerUsername().equals(ID) && getcustomerPassword().equals(Pas)) == true ) {
				System.out.println("Welcome!");	
			}else {
				System.out.println("Incorrect User ID or Password");
				System.out.println("Remaining chance: " + (3- count));
				System.out.println();
				while(count<4)
				{
					
				 System.out.println("Please Re-type user ID:");
				ID = sc.next();
				System.out.println("Please Re-type user Password:");
				Pas = sc.next();
				if((getcustomerUsername().equals(ID) && getcustomerPassword().equals(Pas)) == true) {
				System.out.println("Welcome!");
				break;
				}else {
					count++;
				System.out.println("Incorrect User ID or Password");
				System.out.println("Remaining chance: " + (3- count));
				}
				}if(count == 4) {
					System.out.println("Back to Main Menu");
					System.out.println();
				}
				}
}
	}

public class Airline {
	public static void main (String []args){ 
		Scanner in = new Scanner(System.in);
	Customer c1 = new Customer();
	System.out.println("Welcom To Airline!");
	System.out.println("Do you want to enter the main menu?(y/n)");
	String YorN = in.next();
	while (YorN.equals("y")){
		System.out.println("-----------------------");
		System.out.println(" Main Menu ");
		System.out.println("-----------------------");
		System.out.println("1. Log in ");
		System.out.println("2. Create a new account ");
		System.out.println("3. Forget my password ");
		System.out.println("Select Option(1,2,3) : ");
		int choice = in.nextInt();
		if (choice == 1) {
			System.out.println("-----------------------");
			System.out.println("Log In");
			System.out.println("-----------------------");
			System.out.println("1. Log in as a user");
			System.out.println("2. Log in as an admin");
			System.out.println("Select Option(1,2) : ");
			int log = in.nextInt();
			if(log == 1) {
			c1.User();
			}
			System.out.println("Back to the main menu?(y/n)");
			YorN = in.next();
			System.out.println();
		}
		if(choice == 2){
		System.out.println("Type First Name : ");   
		String first= in.next();
		System.out.println("Type Last Name : ");   
		String last= in.next();
		System.out.println("Type Address : ");   
		String address= in.nextLine();
		address= in.nextLine();
		System.out.println("Type Zip Code : ");   
		String zip= in.next();
		System.out.println("Type State : ");   
		String state= in.next();
		System.out.println("Type User Name : ");   
		String username= in.next();
		System.out.println("Type Password : ");   
		String password= in.next();
		System.out.println("Type Email : ");   
		String email= in.next();
		System.out.println("Type SSN : ");   
		String ssn= in.next();
		System.out.println("Type a security question for password recovery : ");   
		String securityQ= in.nextLine();
		securityQ= in.nextLine();
		c1.createCustomer(first,  last, address, zip, state, username, password, email, ssn, securityQ);
		   System.out.println("Thank you!");
		   System.out.println("Back to the main menu?(y/n)");
			YorN = in.next();
			System.out.println();
		}
		if(choice == 3) {
			c1.getcustomerUsername();
			c1.getcustomerPassword();
			System.out.println("Type user ID");
			String ID = in.next();
			if(c1.getcustomerUsername().equals(ID) == true) {
				System.out.println("What is the answer for your security question?");
				String Ans = in.next();
				if(c1.getcustomerSecurityQ().equals(Ans) == true) {
					System.out.println("Here is the password for "
				+c1.getcustomerUsername() +" is "+ c1.getcustomerPassword());
				}else { 
					System.out.println("Incorrect answer for your security question?");
					System.out.println("Back to the main menu? Press 'n' if you want to keep trying(y/n)");
					YorN = in.next();
					System.out.println();
					while(YorN.equals("n")) {
						System.out.println("What is the answer for your security question?");
						Ans = in.next();
						if(c1.getcustomerSecurityQ().equals(Ans) == true) {
							System.out.println("That's correct!");
							System.out.println("Here is the password for "
						+c1.getcustomerUsername() +" is "+ c1.getcustomerPassword());
							System.out.println("Back to the main menu?(y/n)");
							YorN = in.next();
							System.out.println();
						}else { 
							System.out.println("Incorrect answer for your security question?");
							System.out.println("Back to the main menu? Press 'n' if you want to keep trying(y/n)");
							YorN = in.next();
							System.out.println();

					}
				}
				}
			}else{
				System.out.println("Incorrect user ID");
				System.out.println("Back to the main menu? Press 'n' if you want to keep trying(y/n)");
				YorN = in.next();
				System.out.println();
				while(YorN.equals("n")) {				
					System.out.println("Please Re-type user ID:");
				ID = in.next();
				if(c1.getcustomerUsername().equals(ID) == true) {
					System.out.println("What is the answer for your security question?");
					String Ans = in.next();
					if(c1.getcustomerSecurityQ().equals(Ans) == true) {
						System.out.println("Here is the password for "
					+c1.getcustomerUsername() +" is "+ c1.getcustomerPassword());
					}else { 
						System.out.println("Incorrect answer for your security question?");
						System.out.println("Back to the main menu? Press 'n' if you want to keep trying(y/n)");
						YorN = in.next();
						System.out.println();
						while(YorN.equals("n")) {
							System.out.println("What is the answer for your security question?");
							 Ans = in.next();
							if(c1.getcustomerSecurityQ().equals(Ans) == true) {
								System.out.println("Here is the password for "
							+c1.getcustomerUsername() +" is "+ c1.getcustomerPassword());
							}else { 
								System.out.println("Incorrect answer for your security question?");
								System.out.println("Back to the main menu? Press 'n' if you want to keep trying(y/n)");
								YorN = in.next();
								System.out.println();
						}
					}
					}
				}
			}
			
			System.out.println("Back to the main menu?(y/n)");
			YorN = in.next();
			System.out.println();
		}
		}
		}
}
}

