/* Code provided by hakerarenatutorials.wordpress.com */

import java.util.Scanner;
public class checkPrime
{
	public static void chkPrime()
	{
	    Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean flag=true;
        if(x%2==0)
        {
            flag=false;
        }
        else
        {
            for(int i=2;i<=x/2;i++)
            {
                if(x%i==0)
                {
                    flag=false;
                    break;
                }
                    
            }
        }
        if(flag==true)
            System.out.println("Prime");
        else    
            System.out.println("Not Prime");
	}
	public static void main(String[] args) 
	{
        chkPrime();
	}
}
