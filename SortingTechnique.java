import java.util.ArrayList;
import java.util.Collections;

/*
 * Name:		Hasnain Saifee
 * Course:		EECS 3311
 * Description:	This software project is about an application that consists of two
 * 				buttons: The one (load button) loads 6 different shapes onto the interface
 * 				and the other (sort button) displays the shapes in a sorted order based on 
 * 				their size.
 */


public class SortingTechnique {
	
	//create an object of SingleObject
	   private static SortingTechnique bubbleSort = new SortingTechnique();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SortingTechnique(){}

	   //Get the only object available
	   public static SortingTechnique getInstance(){
	      if(bubbleSort == null) {
	    	  bubbleSort = new SortingTechnique();
	      }
	      
	      return bubbleSort;
	   }

	   public void sortList(ArrayList<Shape> list){
		   
		   int n = list.size(); //size of list = 6
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	            	if ( ((Comparable<Double>)list.get(j).getArea()).compareTo((Double) list.get(j + 1).getArea()) > 0 )
	                {
	                    // swap arr[j+1] and arr[j]
	                    int tempX = list.get(j).getUpperX();
	                    int tempY = list.get(j).getUpperY();
	                    list.get(j).setUpperX(list.get(j + 1).getUpperX());
	                    list.get(j).setUpperY(list.get(j + 1).getUpperY());
	                    list.get(j + 1).setUpperX(tempX);
	                    list.get(j + 1).setUpperY(tempY);
	                    
	                    Collections.swap(list, j, j + 1);
	                }
	            }
	        }
	  }
}
