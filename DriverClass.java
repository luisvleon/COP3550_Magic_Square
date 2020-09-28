/*------------------------------------------------------------------------
#Name: Luis Leon
#Student ID: 
#COP3530- Data Structures
#Fall 2020 – We 6:00 PM - 7:40 PM
#Assignment # 2 - Driver class
*/

import java.util.*;

public class DriverClass {

	public static void main(String[] args) 
	{
		boolean again = false;		
		
		do 
		{			
			again = false;	
			
			System.out.print("Please enter an odd number\n");
			Scanner user_input = new Scanner(System.in);
			
			int num = user_input.nextInt();
			
			MagicSquare.Magic(num);
			
			System.out.print("############################################################\n");
			System.out.print("Do you want to try again? Type \"Y\" or type other character to exit\n");
			
			String answer = user_input.next();
			
			if(answer.equalsIgnoreCase("y"))
			{
				again = true;
			}
			else
			{
				again = false;
			}
						
		}while(again == true);
		
		
		System.out.print("\n\nThanks for use our program, see you soon!!!");

	}

}
