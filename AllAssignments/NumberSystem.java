//Conversion of number into word in American format.
import java.io.*;

public class NumberSystem
{
	static final String[] one = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ", "fifteen ","sixteen ", "seventeen ", "eighteen ","nineteen "};
	static final String[] ten = {"","","twenty ", "thirty ", "forty ","fifty ", "sixty ", "seventy ", "eighty ","ninety "};
	static final String[] hundred = {""," thousand "," million ","billion","trillion ","quadrillion "};
	
private static String Word(long num)
{
	String word = "";
	int index = 0;
	do
	{
		long number = num % 1000l;
		if(number != 0)
		{
			String str = NumberToWord(number);
			word = str + hundred[index] + word;
		}
		index++;
		num = num / 1000l;
	}while(num>0);
	return word;
}
public static String NumberToWord(long num)
{
	String word="";
	long number = num%100;
	if(number<20)
		word = word+one[(int)(long)number];
	else
	{ 
		long index1 = number/10;
		long index2 = number%10;
		word=ten[(int)(long)index1]+one[(int)(long)index2];
	}
	long index = num/100;
	word=((int)(long)index > 0) ? one[(int)(long)index] + "hundred " + word : word;
	return word;	
}
public static void main(String args[])throws IOException
{
	System.out.println("Enter Number of your choice:");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long num = Long.parseLong(br.readLine());
	if(num>999999999999999999L)
	System.exit(0);
	else
	System.out.println(Word(num));
}	

}