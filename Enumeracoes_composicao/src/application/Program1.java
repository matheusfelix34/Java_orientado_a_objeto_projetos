package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program1 {
	
	
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department's name:");
		String name_dedepartment=sc.next();
		System.out.println("Enter worker data:");
		System.out.println("Name:");
		sc.nextLine();
		String name=sc.next();
		
		System.out.println("Level:");
		String level=sc.next();
		System.out.println("Base salary:");
		String bsalary=sc.next();
		System.out.println("How many contracts to this worker?");
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter contract # %d data:",(i+1));
			System.out.println();
			System.out.println("Enter contract #1 data:");
			System.out.println("Date (DD/MM/YYYY):");
			//Date data=sc.next
			
		}
	}
	/*
	 * Enter department's name: Design
Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00
How many contracts to this worker? 3
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20
Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18
Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10
Enter month and year to calculate income (MM/YYYY): 08/2018
Name: Alex
Department: Design
Income for 08/2018: 3000.00*/
	
}
