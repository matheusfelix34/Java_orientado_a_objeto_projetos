package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Emplyoee;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		System.out.println("How many employees will be registered?");
		int cont=sc.nextInt();
	
		String id=null;
		Double salary=0.0;
		boolean permissao = false;
		
		
		
		List<String> list = new ArrayList<>();
		List<Emplyoee> emplyoees=new ArrayList<Emplyoee>();
		
		
		
		for (int i = 0; i <cont; i++) {
			//obeject
			Emplyoee emplyoeer=new Emplyoee();
			
			//begin of loop to get permission for add in arraylist
			
				
				System.out.printf("Emplyoee # %d",i+1);
				System.out.println();
				
				
				
				
				//second loop for dont have same id's
				System.out.println("Id:");
				id=sc.next();
				while(permissao == false & i>0) {
					
					
					
					
					   for (Emplyoee emplyoee : emplyoees) {
					    
					    	if(emplyoee.getId().equals(id)) {
								System.out.println("Repeated Id, try again");
								System.out.println("Id:");
								id=sc.next();
							}else {
								//available id
								permissao=true;
							}
					    	 
									
					}
					
					
					
				}
				//the others data 
				System.out.println();
				System.out.println("Name:");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Salary:");
				salary=sc.nextDouble();
			    emplyoeer=new Emplyoee(id,name,salary);
			    permissao=false;
			
		  
			
			    
			 
			   
			

		emplyoees.add(emplyoeer);
		

			
			
		
		}
		
		
		//new, choice emplyoee for  growth of solary
		
		permissao=false;
		System.out.println("Enter the employee id that will have salary increase :");
		id=sc.next();
		String id2=id;
		
		for (Emplyoee emplyoee : emplyoees) {
			
			
			if(emplyoee.getId().equals(id)) {
				permissao=true;
				System.out.println("Enter the percentage:");
				double percentage=sc.nextDouble();
				emplyoee.increaseSalary(percentage);
				
			}			
			
		}
		
		if(permissao==false) {
			System.out.println("This id does not exist!");
			
		
		}
		
		//end of program
		System.out.println("List of employees:");
		for (Emplyoee emplyoee : emplyoees) {
				System.out.println(emplyoee);
			}
		
				
				/*//EXAMPLES FOR TESTS
Id: 333
Name: Maria Brown
Salary: 4000.00

Emplyoee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Emplyoee #3:
Id: 772
Name: Bob Green
Salary: 5000.00*/

		
		
	}
}
