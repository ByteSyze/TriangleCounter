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

public class Triangle 
{

	public Point p1,p2,p3;
	
	public Triangle(){}
	
	public Triangle(Point p1, Point p2, Point p3)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public boolean isValid()
	{
		boolean samePoints = p1.isSameAs(p2) || p1.isSameAs(p3) || p2.isSameAs(p3);
		
		boolean coplanarPoints = p1.isCoplanar(p2) && p1.isCoplanar(p3) && p2.isCoplanar(p3);
		
		return (!samePoints) && (!coplanarPoints);
	}
	
	public boolean isSameAs(Triangle t)
	{
		boolean p1IsSame = (p1.isSameAs(t.p1)) || (p1.isSameAs(t.p2)) || (p1.isSameAs(t.p3));
		boolean p2IsSame = (p2.isSameAs(t.p1)) || (p2.isSameAs(t.p2)) || (p2.isSameAs(t.p3));
		boolean p3IsSame = (p3.isSameAs(t.p1)) || (p3.isSameAs(t.p2)) || (p3.isSameAs(t.p3));
		
		//System.out.println(t + " " +  this + " " + p1.isSameAs(t.p1) + " " + p1.isSameAs(t.p2) + " " + p1.isSameAs(t.p3) + " " + (p1IsSame && p2IsSame && p3IsSame));
		
		return p1IsSame && p2IsSame && p3IsSame;
	}
	
	@Override
	public String toString()
	{
		return p1.toString() + ", " + p2.toString() + ", " + p3.toString();
	}
}
