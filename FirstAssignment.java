	//package Assignments;
	import java.util.*;

public class FirstAssignment {

	  public static void main(String args[]) {
	    Scanner ss = new Scanner(System.in);   //Strings
	    Scanner sg = new Scanner(System.in);  // integers
	    
	    // 1. Enter the name of two subjects.
	    System.out.println("Enter The Name of The First Subject: ");
	        String sub1 = ss.nextLine();
	        System.out.println("Enter The Name of The Second Subject: ");
	        String sub2 = ss.nextLine();
	    
	     // 2. Enter full name of 5 students and their grades.
	        for (int i = 0; i < 5; i++) {
	          System.out.println("Enter The Student Full Name: " + (i + 1));
	            String name = ss.nextLine();

	            System.out.println("Enter The Grade For The First Subject: " + sub1);
	            double grade1 = sg.nextDouble();

	            System.out.println("Enter The Grade For The Second Subject: " + sub2);
	            double grade2 = sg.nextDouble();
	           
	        
	    // 3. Show the name and grade of each student for each subject.  Name of students and their average in Math and Science
	        System.out.println("********** Name of Students and Their Average in Math and Science **********");
	        System.out.println();
	        System.out.println("name\t\t" + sub1 + "\t\t" + sub2);
	        System.out.println("-------------------------------------------");
	        System.out.println( name + "\t\t" + grade1 + "\t\t" + grade2);
	        System.out.println();}
	       // for (int i = 0; i < 5; i++) {
	           // System.out.println( name + "\t\t" + grade1 + "\t\t" + grade2);
	       // }
	    
	    
	    
	    
	    
	 //   ss.close();
	  //  sg.close();
	  }

	
}
