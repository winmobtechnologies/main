package excersise.protectedcaccess.specifier;

// D3 is an indirect sub class of A3
// if you remove extends ClassB3 , Class D3 cannot access Class A3 protected members
public class ClassD3 extends ClassB3 {


	public static void main(String args[])
	  {  
	   ClassD3 obj = new ClassD3();  
	   obj.msg();  
	   System.out.println( "data variable "+  obj.data);
	  }  
	  
}
