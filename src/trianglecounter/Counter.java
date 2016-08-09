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

public class Counter 
{
	private int gridWidth, gridHeight;
	
	public ArrayList<Point> invalidPoints = new ArrayList<Point>();
	public ArrayList<Point> validPoints = new ArrayList<Point>();
	
	public ArrayList<Triangle> triangles = new ArrayList<Triangle>();
	
	public Counter(int gridWidth, int gridHeight, ArrayList<Point> invalidPoints)
	{	
		this.gridWidth = gridWidth;
		this.gridHeight = gridHeight;
		
		this.invalidPoints = invalidPoints;
		
		//Generate valid points (any coordinate not in invalidPoints.)
		for(int x = 0; x < gridWidth; x++)
		{
			for(int y = 0; y < gridHeight; y++)
			{
				Point p = new Point(x,y);
				
				if(!isInvalidPoint(p))
				{
					validPoints.add(p);
				}
			}
		}
		
		Point xPoint, yPoint;

		for(int x = 0; x < validPoints.size(); x++)
		{
			xPoint = validPoints.get(x);
			for(int y = 0; y < validPoints.size(); y++)
			{
				yPoint = validPoints.get(y);
				for(int z = 0; z < validPoints.size(); z++)
				{
					Triangle t = new Triangle(xPoint, yPoint, validPoints.get(z));
					
					if(t.isValid())
					{
						if(!hasTriangle(t, triangles))
						{
							triangles.add(t);
						}
					}
				}
			}
		}
		
		System.out.println(triangles.size() + " valid triangles found.");
		
	}
	
	public boolean hasTriangle(Triangle t, ArrayList<Triangle> triangles)
	{
		for(Triangle triangle : triangles)
		{
			if(triangle.isSameAs(t))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isInvalidPoint(Point p)
	{
		for(Point point : invalidPoints)
		{
			if(point.isSameAs(p))
				return true;
		}
		return false;
	}
	
	public int getGridWidth()
	{
		return gridWidth;
	}
	
	public int getGridHeight()
	{
		return gridHeight;
	}
	
}
