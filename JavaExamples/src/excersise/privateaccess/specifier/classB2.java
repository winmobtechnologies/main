package excersise.privateaccess.specifier;

public class classB2 {

	 public static void main(String args[])
     {  
     classA2 obj=new classA2();  
     
     
    //Compile Time Error   
    //uncomment the line below and check if data is visible 
    // private members are not visible.
	
	//System.out.println(obj.data);
   
     obj.msg();

    }  
}
