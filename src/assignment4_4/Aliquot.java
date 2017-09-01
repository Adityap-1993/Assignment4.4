package assignment4_4;

public class Aliquot {   //class declaration 
	
	public int aliquotsum(int n)   //method for finding aliquot sum 
	{
		int i,sum=0;       
		
		for(i=1;i<n;i++)
		{
			if(n%i==0)            //taking divisors
			{
				sum=sum+i;           //taking sum of aliquot divisors 
			}
			
		}
		return sum;
		
	}  //class ends

	
	
	
}
