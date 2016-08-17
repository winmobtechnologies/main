package exercise;

public class looping
{ 
private static looping get;
private static looping get1;
private static looping get2;
private static looping get3;

public void forloop()
{
	for(int i=1;i<10;i++)
		{
		System.out.println("count=" + i);
		}
}
public void nestedloop()
{
	for(int i=1;i<=10;i++)
	   {
		for(int j=1;j<=i;j++)
		{
	     System.out.print(i);
		}
		 System.out.println();
	   }
}
public void whileloop()
{
	float a=(float) 4.5;
	while(a<=10)
	{
		a++;
	System.out.println(a);
	}
}     
public void dowhileloop()
{
	double i=1;
	System.out.println("from 2 to 17");
	do{
		    i++;
			System.out.println(i);
	  } 
		while(i<=16);
}	
public static void main(String args[])
		{
	   looping.get=new looping();
	   get.forloop();
	   looping.get1=new looping();
	   get1.nestedloop();
	   looping.get2=new looping();
	   get2.whileloop();
	   looping.get3=new looping();
	   get3.dowhileloop();
	   }
}
