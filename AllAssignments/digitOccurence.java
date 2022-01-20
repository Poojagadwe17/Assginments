//Question: Find out total occurences of a digit in a given number.

import java.util.*;
import java.io.*;
import java.util.*;
class digitOccurence
{
	static int count(int n,int d)
	{
        	int count = 0;
                while (n > 0)
    		{
 	        	count = (n % 10 == d) ?count + 1 : count;
        		n = n / 10;
	 	}
    		return count;
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of which occurences you want to find:");
		int d=Integer.parseInt(br.readLine());
	        System.out.println("digit "+ d +" occur "+ count(n, d) +" times in a number "+ n);
	}
}