//Question: Find out all the Perfect numbers in a given range.

import java.io.*;
import java.util.*;
public class Perfect
{ 
	public static void main(String[] args) throws IOException
	{
        	
                Scanner sc= new Scanner (System.in);
                System.out.println("enter the 1st number in a range:");
                int n1 = sc.nextInt();
		System.out.println("enter the last number in a range:");
                int n2 = sc.nextInt();
        	System.out.println("Perfect Numbers between "+n1+ " and "+n2);
        	for (int i = n1; i <=n2; i++)
		{
            		if (isPerfectNumber(i))
			{
                		System.out.println(i+" is a perfect number");
            		}	 
        	}
        }
        public static boolean isPerfectNumber(int number)
        {
    		int sum=0;         
        	for(int i=1; i<=number/2; i++) 
		{
        		if(number%i == 0)
	    		{
                		sum += i;
            		}
        	}
        	if(sum==number) 
		{ 
            		return true;
        	}
		else
		{
            		return false;
        	}
    	}  
}