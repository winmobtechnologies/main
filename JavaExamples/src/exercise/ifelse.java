package exercise ;
import java.util.Scanner;

public class ifelse {
private static Scanner a;

public static void main(String args[]) 
{
	int i;
	System.out.println("check odd or even");
	a = new Scanner(System.in);
	i=a.nextInt();
	
	if(i%2==0)
	{
		System.out.println("the number is even");
	}
	else
	{
		System.out.println("the number is odd");
	}
}
}