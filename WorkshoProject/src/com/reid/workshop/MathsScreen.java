package com.reid.workshop;


//Make sure all UI imports are coming from badlogic
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MathsScreen implements Screen
{

	private Game game;
	private Stage stage;
	
	private Label question, feedback;
	private TextField answer;
	private TextButton check;
	
	int num1, num2, ans;
	
	public MathsScreen(Game g)
	{
		game = g; 
		stage = new Stage();
		Gdx.input.setInputProcessor(stage); //get input from our stage
		
		
		num1 = MathUtils.random(10, 100); //libgdx easy random numbers :)
		num2 = MathUtils.random(10, 100); 
		ans = num1 * num2;
		
		
		Skin skin = new Skin(Gdx.files.internal("uiskin.json")); //set what the UI elements are going to look like, libgdx provides file abstraction to make it easy to access files on any platform
		
		question = new Label("What is the area of a rectangle of   " + num1 + "    by    " + num2, skin); //Create a label element
		question.setPosition(100, 500); //Position it
		stage.addActor(question); //Add the lable to the stage
		
		
		answer = new TextField("", skin); //Create a textfield element
		answer.setPosition(300, 340); //Position it
		stage.addActor(answer); //Add it to the stage
		
		feedback = new Label("", skin); //Create a label element
		feedback.setPosition(300, 150); //Position it
		stage.addActor(feedback); //Add the lable to the stage
		
		check = new TextButton("Check your answer", skin);
		check.setPosition(300, 200);
		check.addListener(new ClickListener() //add the listener as an anonymous? method, inline method
		{
			//autocomplete the code below by typing clicked and then ctrl + space, modify to add our own btClicked method
			public void clicked(InputEvent e, float x, float y)
			{
				btnClicked();
			}
		});
		stage.addActor(check);
	}
	
	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(255, 0, 0, 0); //we're going to clear  to red!
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); //Todo: lookup what this buffer bit does???
		
		stage.act(delta); //do an action
		stage.draw(); //draw the action
	}
	
	public void btnClicked()
	{
		if (ans == Integer.parseInt(answer.getText()))
		{
			feedback.setText("Correct");
		}
		else
		{
			feedback.setText("Incorrect");
		}
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	

}
