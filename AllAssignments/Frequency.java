//Find the frequency of a word in a given line
import java.util.Map;
import java.util.TreeMap;
import java.io.*;
import java.util.*;

public class Frequency
{    
	static void count_freq(String str)
        {
        	Map<String,Integer> mp=new TreeMap<>();
                String arr[]=str.split(" ");
                for(int i=0;i<arr.length;i++)
                { 
                	if(mp.containsKey(arr[i]))
                	{
                		mp.put(arr[i], mp.get(arr[i])+1);
               		}
	     		else
            		{
                		mp.put(arr[i],1);
            		}
        	}
        		for(Map.Entry<String,Integer> entry:mp.entrySet())
        		{
            			System.out.println(entry.getKey()+" - "+entry.getValue());
        		}
    	}
        public static void main(String[] args)throws IOException
        {
		System.out.println("Enter the string");
		InputStreamReader r=new InputStreamReader(System.in);    
        	BufferedReader br=new BufferedReader(r);            
                String str=br.readLine(); 
	        count_freq(str);
	}
}