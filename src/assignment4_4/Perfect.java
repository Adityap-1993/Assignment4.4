package assignment4_4;

public class Perfect extends Aliquot{      //extending superclass for finding perfect number
	
	public void printperfect()             //method for printing perfect numbers 
	{
		System.out.println("The Perfect numbers between 1 and 100 are:  ");  
		
		for(int i=1;i<100;i++)  
		{
			int sum=aliquotsum(i);          
			
			if(sum==i)                         //condition for perfect numbers
				
				System.out.println(i);          //printing perfect numbers
		}
		
	}
	

}//class ends 
