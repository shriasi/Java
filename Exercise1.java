/*Exercise 1
      Write a program to input marks of three subjects for a student and calculate the average marks.
      In your class.
      a) Include a constructor to initialize the three marks to 0
      b) Include a method to calculate and store the average
      c) Include a method to display the ID, name and the average marks of the student
  */
  
package exercise1;

public class Marks {
    
	
        float mark1 , mark2 , mark3 , Avg;
        String name , Sid;
        
       public Marks(int mark1 , int mark2 , int mark3) {
    	   
    	   this.mark1 =0;
    	   this.mark2 = 0;
    	   this.mark3 = 0;
    	 
       }
       void Calculate() {
    	  
    	   this.Avg =( (this.mark1 +this.mark2 + this.mark3)/3);
    	   this.name = "Nimal";
    	   this.Sid = "0002";
    	   
    	      System.out.println("Student Details are\n") ;
        	System.out.println("student name is:"+ this.name ) ;
        	System.out.println("student ID is:"+ this.Sid ) ;
        	System.out.println("students avergae mark is :" + this.Avg);
    	    
       }
       public static void main(String[] args) {
   		// TODO Auto-generated method stub
   		
        	Marks m1 = new Marks( 10 , 10 ,10);
        	m1.Calculate();
   	}
       
}
   
 
