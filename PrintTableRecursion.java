/* Code provided by hakerarenatutorials.wordpress.com */

import java.util.Scanner;
public class PrintTableRecursion
{
	public static int printTable(int x,int i)
	{
	    if(i==1)
	    {
	        return i;
	    }
	    else
	    {
	        printTable(x,--i);
	        System.out.println(x+" * "+i+" = "+(x*i));
	    }
	    return 0;
	}
	public static void main(String[] args) 
	{
		  Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	  	printTable(x,10);
	}
}
