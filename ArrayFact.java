//factorial of number input by user
import java.util.*;
public class ArrayFact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); //scanner
		//int res=0;
		int fact=1;
		int n=sc.nextInt();  //input
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
			System.out.println(fact);
}}
