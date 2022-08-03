package practiceProject;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class EmailIdVerification {

	    public static void main(String[] args) {
	        
	        ArrayList<String> emailID = new ArrayList<String>();
	        
	        emailID.add("devraj.efghi@gyt.com");
	        emailID.add("master.jklmn@omx.com");
	        emailID.add("linux.jdfn@gmx.com");
	        emailID.add("ajay.ueman@opx.com");
	        emailID.add("vasant.@mnb.com");
	   
	        
	         String searchEmail = null;
	         System.out.println("Enter the email to search");
	         
	         try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter email Id : ");
	          searchEmail = sc.nextLine(); 
			}
	             if(emailID.contains(searchEmail)){
	          System.out.println("email ID " + searchEmail + " found");
	      }
	      else{
	          System.out.println( "email ID " + searchEmail + " not found");
	      }
	 
	        
	    }

	}


