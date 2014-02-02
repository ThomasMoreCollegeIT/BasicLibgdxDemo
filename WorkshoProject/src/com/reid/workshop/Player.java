package com.reid.workshop;

import com.badlogic.gdx.math.Rectangle;

public class Player
{
	float x, y;
	Rectangle rect;
	
	public Player(int xcoord, int ycoord)
	{
		x = xcoord;
		y = ycoord;
		rect = new Rectangle(x, y, 64, 64);
	}

	public float getX()
	{
		return x;
	}

	public float getY()
	{
		return y;
	}

	public Rectangle getRect()
	{
		return rect;
	}
	
	public void changePosition(int xChange, int yChange)
	{
		x = x + xChange;
		y = y + yChange;
		rect.setX(x);
		rect.setY(y);
		
	}
	
	public void setPosition(float xpos, float ypos)
	{
		x = xpos;
		y = ypos;
	}


}
