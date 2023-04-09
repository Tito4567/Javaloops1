import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Test {
    public static void main(String[] args) throws IOException 
    {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	File stuff = new File("DataII.txt");
    	
    	Scanner scn = new Scanner(stuff);
    	
    	int N = scn.nextInt();

       // int N = Integer.parseInt(bufferedReader.readLine().trim());
        int r;
        int result; 
        for (int i = 1; i <= 20; i++)
        {
        	r = N*i;
            result = r;
            
            System.out.println(N+" X "+ i + " = "+ result);            
        }
        
        
        

        //bufferedReader.close();
    }
}
