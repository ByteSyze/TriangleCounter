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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class TriangleShower extends JPanel
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Counter counter; 
	
	public int scale = 100;
	
	public TriangleShower(Counter c)
	{
		counter = c;
		
		int windowSize = (counter.gridSize-1)*scale + 10;
		this.setPreferredSize(new Dimension(windowSize, windowSize));
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g2d.setColor(Color.BLACK);

		
		for(Triangle t : counter.triangles)
		{
			g2d.drawLine(t.p1.x*scale, t.p1.y*scale, t.p2.x*scale, t.p2.y*scale);
			g2d.drawLine(t.p2.x*scale, t.p2.y*scale, t.p3.x*scale, t.p3.y*scale);
			g2d.drawLine(t.p3.x*scale, t.p3.y*scale, t.p1.x*scale, t.p1.y*scale);
		}
	}

}
