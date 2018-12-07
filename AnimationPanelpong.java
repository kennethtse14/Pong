import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimationPanelpong extends JPanel{
	//Properties
	int intRectMouseX = 1150;
	int intRectMouseY = 210;
	
	int intRectKeyX = 50;
	int intRectKeyY = 210;
	
	int intBallX = 600;
	int intBallY = 300;
	
	boolean blnGoDown = false;
	boolean blnGoUp = false;
	
	boolean blnxdir = false;
	boolean blnydir = false;
	
	
	//Methods
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0,0,1280,720);
		
		// first rect
		// 50, 210
		g.setColor(Color.BLUE);
		g.fillRect(50, intRectKeyY, 50, 300);
		
		// second rect
		g.setColor(Color.RED);
		// 1150, 210
		g.fillRect(1150, intRectMouseY, 50, 300);
		
		// Ball
		g.setColor(Color.WHITE);
		//600, 300
		g.fillOval(intBallX, intBallY, 25, 25);
		
		if(blnGoDown){
			if(intRectKeyY <= 420){
				
			intRectKeyY = intRectKeyY + 2;
		}
	}
		if(blnGoUp){
			if(intRectKeyY >= 0){
			intRectKeyY = intRectKeyY - 2;
		}
	}

		if(blnxdir){
			if(intBallY <= 1280){
				intBallY = intBallY + 2;
			}
		}
	
		
		//---------------------------------------------------------
	
		intBallX = intBallX + 1;
		intBallY = intBallY - 1;
		
		
		
		
		
	}
	
	
	
	
	//Constructor
	public AnimationPanelpong(){
		super();
	}
}
