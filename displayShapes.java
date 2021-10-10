/*
 * Name:		Hasnain Saifee
 * Course:		EECS 3311
 * Description:	This software project allows users to load 6 shapes (rectangles, squares, circles) and
 * 				has the functionality to sort the shapes by their areas, all displayed on a Java GUI.
 * 				This software project implements two design patterns: Singleton and Factory.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class displayShapes implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JButton loadbutton;
	JButton sortbutton;
	
	private Graphics g;	
	
	private ShapeFactory factory;			// ShapeFactory object; implements Singleton, Factory design pattern
	private ArrayList<Shape> list;
	private SortingTechnique sort;
	
	public displayShapes() {
		
		//creating a new frame make it visible
				frame = new JFrame("Display Shapes"); 
				frame.setVisible(true);
				frame.setSize(600, 600);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close when 'x' button is clicked
				
				panel = new JPanel(); //creating a new panel
				loadbutton = new JButton("Load shapes"); //creating a load shapes button
				sortbutton = new JButton("Sort shapes"); //creating a sort shapes button
				
				//Adding actions to buttons
				loadbutton.addActionListener(this);
				sortbutton.addActionListener(this);
				
				//panel added to frame and buttons added to panel
				frame.add(panel);
				panel.add(loadbutton); panel.add(sortbutton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// This method runs when a button is pressed.
		
		if (e.getSource() == loadbutton) {			// if 'Load shapes' button is clicked
			
			factory = ShapeFactory.getInstance();		// get Singleton instance of ShapeFactory
			list = new ArrayList<>();					// instantiate a (new) ArrayList
			
			for (int i = 0; i < 6; i++)
				list.add(factory.newShape(i));			// generate 6 random shapes & add onto an ArrayList
			
			displayShapes(list);						// calls display method
			
		}
			
		else {										// else if 'Sort shapes' button is clicked
			
			if (list != null) {
				// if there are shapes to sort
				sort = SortingTechnique.getInstance();		// get Singleton instance of SortingTechnique
				sort.sortList(list);						// sort the ArrayList using that instance
				displayShapes(list);						// calls display method
			}
		}		
	
	}
	
	public void displayShapes (ArrayList<Shape> list) {	
		// This method displays shapes to the GUI.
		
		g = panel.getGraphics();
		
		g.clearRect(50, 50, 600, 600);				// clear existing shapes
		
		for (int i = 0; i < 6; i++) {			// for each of the 6 shapes...
			list.get(i).paintComponent(g);					// draw shape
		}
			
	}
	
	// Main method to start entire software project:
	public static void main(String[] args) { new displayShapes(); }	

}
