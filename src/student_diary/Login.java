package student_diary;

import java.util.Scanner;

public class Login {
	 Scanner s= new Scanner(System.in);
	 String userName,password;
	 void in() {
     System.out.println("Enter UserID");
     userName=s.nextLine();
     System.out.println("Enter password");
     password=s.nextLine();
     int passLen;
     passLen=password.length();
  	     int i=0;
  	  System.out.println("++++STUDENT DIARY++++");
  	  System.out.println("Login:");
     System.out.println("	UserID  :"+userName);
     System.out.print("        Password:");
     for( i=0;i<passLen;++i)
     System.out.print("*");
     System.out.println(" ");
     
	 }
}
