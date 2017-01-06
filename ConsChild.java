package assignment.acadgild44;

public class ConsChild extends ChainingCons{
	   //default constructor of the class
	   public ConsChild(){
		     super();		//It will call default constructor of super class
	         System.out.println("Default constructor");
	         
	   }
	   public ConsChild(String str){
	         this();
	    	 System.out.println("Parametrized constructor with single param");
	   }
	   public ConsChild(String str, int num){
	         //It will call the constructor with String argument
	    	 this("Hello"); 
	    	 System.out.println("Parametrized constructor with double args");
	   }
	   public ConsChild(int num1, int num2, int num3){
	   	// It will call the constructor with (String, integer) arguments
	        this("Hello", 2);
	        System.out.println("Parametrized constructor with three args");
	   }
	   public static void main(String args[]){
	        //Creating an object using Constructor with 3 int arguments
		   ConsChild obj = new ConsChild(5,5,15);
	   }
	}

class ChainingCons{
	//default constructor of the child class
	public ChainingCons(){
		System.out.println("This is Super class default constructor. ");
	}
}
	
	
