package com.reid.workshop;

import com.badlogic.gdx.math.Rectangle;

public class Coin
{
	int x, y;
	Rectangle rect;
	
	public Coin(int xcoord, int ycoord)
	{
		x = xcoord;
		y = ycoord;
		rect = new Rectangle(x, y, 32, 32);
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public Rectangle getRect()
	{
		return rect;
	}
}
