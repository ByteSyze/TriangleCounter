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

public class Point
{

	public int x,y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public boolean isCoplanar(Point p)
	{
		return (p.x == x) || (p.y == y);
	}

	public boolean isSameAs(Point p)
	{
		return ((p.x == x) && (p.y == y)); //|| ((p.x == y) && (p.y == x));
	}
	
	public String toString()
	{
		return "'"+x+","+y+"'";
	}
}
