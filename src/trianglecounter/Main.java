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

import javax.swing.JFrame;

public class Main 
{

	public static void main(String[] args)
	{
		TriangleShower ts = new TriangleShower(new Counter());
		
		JFrame f = new JFrame("Triangle Combination Counter");
		
		f.add(ts);
		f.pack();
		
		f.setVisible(true);
	}
	
}
