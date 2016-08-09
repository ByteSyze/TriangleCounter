/**
 * 
 * Copyright (C) Tyler Hackett 2016
 * 
 * Triangle Counter Project
 * 
 * A quickly-written program to determine all possible combinations of
 * valid triangles from a grid, allowing for certain coordinates of the
 * grid to be marked as unusable.
 * 
 * */
package trianglecounter;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Main 
{

	public static void main(String[] args)
	{

		ArrayList<Point> invalidPoints = new ArrayList<Point>();
		
		//Add any invalid coordinates on the grid.
		//In this case, all corners are unallowed.
		invalidPoints.add(new Point(0,0));
		invalidPoints.add(new Point(0,3));
		invalidPoints.add(new Point(3,0));
		invalidPoints.add(new Point(3,3));
		
		new Counter(8, 8, invalidPoints);
		
		/*TriangleShower ts = new TriangleShower(new Counter());
		
		JFrame f = new JFrame("Triangle Combination Counter");
		
		f.add(ts);
		f.pack();
		
		f.setVisible(true);*/
	}
	
}
