/*------------------------------------------------------------------------
#Name: Luis Leon
#Student ID: 
#COP3530- Data Structures
#Fall 2020 – We 6:00 PM - 7:40 PM
#Assignment # 2 - MagicSquare Class
*/

public class MagicSquare {	
	
	public static void Magic(int num)
	{
		int operations = 0;
		
		//Determine if the number is even show the message
        if (num % 2 == 0) 
        {
        	System.out.print("The number of elements must be odd");
        }
        else
        {
        	//Create the cube depending the number of elements selected
        	int[][] magic_cube = new int[num][num];
        	
        	//Initialize row in the first position
            int row = 0;
            
            //Initialize the column in the middle position
            int col = num / 2;
            
            //Initialize the maximum number of elements
            int max_number = num * num;
            
            //Start counting
            int count = 1;
            
            //Set the number 1
            magic_cube[row][col] = count;

            //Rutine to place each number on the magic cube
            while(count < max_number)
            {
            	//Raise 1 the number to be placed on the array
            	count += 1;
            	
            	//validate the position to be tested if is already taken
                if((row - 1) >= 0 && (col - 1) >= 0)
                {
                	//Evaluate if the position was already occupied
                	if(magic_cube[row -1][col-1] !=0)
                	{
                		//Select the point immediately down the previous number
                		row++;
                	}
                	else
                	{
                		//Go up and left 1 position each
                		row--;
                		col--;
                	}                	
                }
                else
                {
                	//Evaluate if both row and column are in 0 position
                	if(row < 1 && col < 1)
	                {
                		//go down 1 position
	                	row++;
	                }           
	                else if(row < 1)
	                {
	                	//if only the row is 0 go to the other side and go up 
	                	row = num - 1;
	                	col--;
	                }
	                else if(col < 1)
	                {
	                	//if only the column is 0 go to the right and down 1 position
	                	col = num -1;
	                	row--;
	                }
	                else
	                {
	                	//if both rows and columns are greater than 0 go up and left 1 position
	                	row--;
	                	col--;
	                }
                }	
                magic_cube[row][col] = count;		//add the number in the selected position each
                operations++;
            }

            System.out.print("\n\nMagic Square Numbers for: " + num + "\n\n\n");
            
            // print de magic_cube array - set the rows
            for (int i = 0; i < num; i++)             
            {
            	//set the columns
                for (int j = 0; j < num; j++)                 
                {         
                	//Added separations with spaces for better format
                    if (magic_cube[i][j] < 10)  System.out.print(" ");
                    if (magic_cube[i][j] < 100) System.out.print("  ");
                    if (magic_cube[i][j] > 100) System.out.print(" ");
                    
                    //Print the number
                    System.out.print(magic_cube[i][j] + " ");
                }
                
                //Print some space lines
                System.out.print("\n\n\n");
                
            }
        }        
        System.out.print(operations + "\n");
	}
}
