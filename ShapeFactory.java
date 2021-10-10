/*
 * Name:		Hasnain Saifee
 * Course:		EECS 3311
 * Description:	This software project allows users to load 6 shapes (rectangles, squares, circles) and
 * 				has the functionality to sort the shapes by their areas, all displayed on a Java GUI.
 * 				This software project implements two design patterns: Singleton and Factory.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ShapeFactory {
	
	private Random randomNumber = new Random();
	
	   //create an object of SingleObject
	   private static ShapeFactory factory = new ShapeFactory();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private ShapeFactory(){}

	   //Get the only object available
	   public static ShapeFactory getInstance(){
		if(factory == null) {
			factory = new ShapeFactory();
		}
			return factory;
	   }

	   public Shape newShape(int random){
		   int r = randomNumber.nextInt(15);
		   
		   if (r < 5) {
			   return new Rectangle(random);
		   }
		   else if (r < 10) {
				return new Circle(random);
			}
			else {
				return new Square(random);
			}
	  }
}
