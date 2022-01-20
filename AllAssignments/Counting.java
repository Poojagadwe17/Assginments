//Question: Find out the no of digits entered by user.

import java.util.*;

public class Counting
{
	public static void main(String args[])
   	{
      		Scanner sc = new Scanner(System.in);
      		int count = 0;
      		System.out.println("Enter any number:");
      		int num = sc.nextInt();
      		while(num!=0)
      		{
         		num = num/10;
         		count++;
      		}
      		System.out.println("Number of digits in the entered number is: "+count);
   	}
}