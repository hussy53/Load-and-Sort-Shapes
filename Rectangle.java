/*
 * Name:		Hasnain Saifee
 * Course:		EECS 3311
 * Description:	This software project is about an application that consists of two
 * 				buttons: The one (load button) loads 6 different shapes onto the interface
 * 				and the other (sort button) displays the shapes in a sorted order based on 
 * 				their size.
 */

import java.util.Random;

public class Rectangle extends Shape {
	
	Random randomNum = new Random();
	
	public Rectangle(int coord, String shape) {
		super();
		
		setCoordinates(coord);
		
		
		int side = randomNum.nextInt((75 - 20) + 1) + 20;
		setDimensions(side, side, shape);
	}

	public Rectangle(int coord) {
		super();
		setShape("Rectangle");

		setCoordinates(coord);

		// get length and width
		int width = randomNum.nextInt(50);
		int height = randomNum.nextInt(width) + 10;
		setDimensions(width, height, "Rectangle");

		setArea();
	}

	private void setCoordinates(int coord) {
		// TODO Auto-generated method stub
		setUpperX(coord * 75 + 100);
		setUpperY(coord * 75 + 100);
	}

	private void setDimensions(int width, int height, String shape) {
		// TODO Auto-generated method stub
		setWidth(width);
		setHeight(height);
		setShape(shape);
	}

	public void setArea() {
		// TODO Auto-generated method stub
		area = (getWidth() * getHeight());
	}

}
