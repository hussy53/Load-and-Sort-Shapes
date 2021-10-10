import java.util.Random;

/*
 * Name:		Hasnain Saifee
 * Course:		EECS 3311
 * Description:	This software project is about an application that consists of two
 * 				buttons: The one (load button) loads 6 different shapes onto the interface
 * 				and the other (sort button) displays the shapes in a sorted order based on 
 * 				their size.
 */


public class Square extends Rectangle{
	
	/**
	 * 
	 */
	public Square(int coord) {
		super(coord, "Square");
		
		setCoordinates(coord);

		// get length and width
		setDimensions();
		
		setArea();
	}

	private void setCoordinates(int coord) {
		// TODO Auto-generated method stub
		setUpperX(coord * 75 + 100);
		setUpperY(coord * 75 + 100);
	}
	
	private void setDimensions() {
		// TODO Auto-generated method stub
		setWidth(new Random().nextInt(65) + 5);
		setHeight(getWidth());
	}

	public void setArea() {
		this.area = Math.pow(this.getWidth(), 2);
	}
}
