package resume;
import java.util.Scanner;
import java.util.*;

public class resumeBuilder {
	
	    
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Please enter your name:");
	        String name = scanner.nextLine();
	        
	        System.out.println("Please enter your email address:");
	        String email = scanner.nextLine();
	        
	        System.out.println("Please enter your phone number:");
	        String phone = scanner.nextLine();
	        
	        System.out.println("Please enter your education information:");
	        String education = scanner.nextLine();
	        
	        System.out.println("Please enter your work experience:");
	        String experience = scanner.nextLine();
	        
	        System.out.println("\n\n\n\n");
	        System.out.println("------------------------------");
	        System.out.println("RESUME");
	        System.out.println("------------------------------");
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("Phone: " + phone);
	        System.out.println("Education: " + education);
	        System.out.println("Work Experience: " + experience);
	        System.out.println("------------------------------");

	    }
	}


