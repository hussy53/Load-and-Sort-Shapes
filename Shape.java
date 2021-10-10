/*
 * Name:		Hasnain Saifee
 * Course:		EECS 3311
 * Description:	This software project is about an application that consists of two
 * 				buttons: The one (load button) loads 6 different shapes onto the interface
 * 				and the other (sort button) displays the shapes in a sorted order based on 
 * 				their size.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public abstract class Shape {

	private int upperX, upperY, width, height;
	protected double area;
	private String shape;
	private Color randomColor;

	//This method picks out a random color
	public Shape() {
		randomColor = randomColor();
	}
	
	public Color randomColor() {
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);

		return new Color(r, g, b);
	}

	//Draws shapes and fills different colors
	public void paintComponent(Graphics g) {

		if (shape.equals("Rectangle") || shape.equals("Square")) { //If type is rectangle else circle
			g.setColor(randomColor);
			g.fillRect(this.getUpperX(), this.getUpperY(), this.getWidth(), this.getHeight());
		} else {
			g.setColor(randomColor);
			g.fillOval(this.getUpperX(), this.getUpperY(), this.getWidth(), this.getWidth());
		}
	}

	// getters
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getUpperX() {
		return upperX;
	}

	public int getUpperY() {
		return upperY;
	}
	
	public double getArea() { 
		return area; 
	}

	// setters
	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}

	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}

}
