import java.util.Scanner;

public class LinecomparisonUC1
{
	public static void main(String arg[])
	
	{
	
             	 int x1,x2,y1,y2;
 
	         Double   lengthOne;
				Double  lengthTwo;
	
	         Scanner s= new Scanner(System.in);
 
	         System.out.println("enter x1 point");
	   
                 x1=s.nextInt();
	    
                 System.out.println("enter y1 point");
	   
                 y1=s.nextInt();
 
	         System.out.println("enter x2point");
	   
                 x2=s.nextInt();
 
	         System.out.println("enter y2 point");
	   
                 y2=s.nextInt();
	  	    
		 lengthOne =Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		lengthTwo=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	         System.out.println("length is " +lengthOne);
				System.out.println("length is " +lengthTwo);
 

			System.out.println(lengthOne.equals(lengthTwo));
			
	}
 
}
