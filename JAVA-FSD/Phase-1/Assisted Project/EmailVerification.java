package Practice;
import java.util.Scanner;
public class EmailVerification {

	public static void main(String[] args) {
		Boolean flag = false;
		String emails[] = new String[5];
		emails[0] = "akankshaligade7@gmail.com";
		emails[1] = "akankshaligade11@gmail.com";
		emails[2] = "ligadeakanksha777@gmail.com";
		emails[3] = "akanksha.ligade@gmail.com";
		emails[4] = "Akankshaligade07@gmail.com";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email:");
		String userEmail = sc.next();
		for(String email:emails)
		{
			if(userEmail.matches(email))
			{
				System.out.println("Welcome back"+userEmail);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Invalid User");
		}

	}

}
