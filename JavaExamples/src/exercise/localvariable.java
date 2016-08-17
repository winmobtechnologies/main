package exercise;

public class localvariable {
	public void cool()
	{
	   int shan=15;
	   shan=shan+7;
	   System.out.println("my name is:" + shan);
	}
	public static void main(String args[]){
	    localvariable test1 = new localvariable();
	    test1.cool();
	 }
}
