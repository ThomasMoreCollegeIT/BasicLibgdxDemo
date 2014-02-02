package com.reid.workshop;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;

public class GameGestureListener implements GestureListener
{

	private GameScreen ownerScreen;
	//private Vector3 touchVec;
	
	GameGestureListener(GameScreen scr)
	{
		ownerScreen = scr;
	}
	
	@Override
	public boolean touchDown(float x, float y, int pointer, int button) {
		
		/*
		touchVec = new Vector3(x,y,0);
		ownerScreen.camera.unproject(touchVec);
		ownerScreen.pointerx = touchVec.x;
		ownerScreen.pointery = touchVec.y;
		ownerScreen.player.setPosition(x-64,-y-64+600);
		return false;
		*/
		ownerScreen.player.setPosition(x-64,-y-64+480);
		return false;
	}

	@Override
	public boolean tap(float x, float y, int count, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean longPress(float x, float y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fling(float velocityX, float velocityY, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pan(float x, float y, float deltaX, float deltaY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean panStop(float x, float y, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean zoom(float initialDistance, float distance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2,
			Vector2 pointer1, Vector2 pointer2) {
		// TODO Auto-generated method stub
		return false;
	}
	

}