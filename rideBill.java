package assignment;

import java.util.Scanner;

public class rideBill {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("start");
		int height;
		int age;
		int a=0; 
		String photo;
		System.out.println("whats ur height in cm");
		height=sc.nextInt();
		//System.out.println("your height is "+height);
		if(height>120)
		{
			System.out.println("you can ride");
			System.out.println("What is ur age");
			age=sc.nextInt();
			if(age<12)
			{
				System.out.println("you have to paid $5" );
				a=a+5;
			}
			else if(age>=12 && age<18) {
				a=a+7;
			}	
			else if(age>=18 && age<=44) {
				a=a+12;
			}
			else if(age>=45 && age<=55) {
				a=0;
			}
			
			System.out.println("do you want photos");
			photo=sc.next();
			if(photo.equalsIgnoreCase("yes")) {
				a=a+3;
			}
			else {
				a=a+0;
			}
			
			System.out.println("your total bill is " +a);	
		}
		else
		{
		    System.out.println("you cant");
				
		}


		}
}

