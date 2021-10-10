import java.util.Random;

/*
 * Name:		Hasnain Saifee
 * Course:		EECS 3311
 * Description:	This software project is about an application that consists of two
 * 				buttons: The one (load button) loads 6 different shapes onto the interface
 * 				and the other (sort button) displays the shapes in a sorted order based on 
 * 				their size.
 */


public class Circle extends Shape{
	
	public Circle(int coord) {
		super();
		setShape("Circle");
		
		setCoordinates(coord);
		
		//get diameter = 2 * radius/width
		setDimensions();
		
		setArea();
	}
	
	public void setDimensions() {
		// TODO Auto-generated method stub
		setWidth(new Random().nextInt(65) + 5);
		setHeight(this.getWidth());
		
	}
	
	public void setCoordinates(int coord) {
		setUpperX(coord * 75 + 100);
		setUpperY(coord * 75 + 100);
	}

	public void setArea() { 
		this.area = Math.PI * Math.pow(getWidth()/2, 2); 
	}

}
