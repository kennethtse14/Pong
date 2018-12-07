// My frist swing animation game
// Using KeyListener, MouseMotionListener
// Created By: Kenneth
// Created on Dec 7 


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pongprogram implements ActionListener, MouseListener, KeyListener{

	//Properties
	JFrame theframe;
	AnimationPanelpong thepanel;
	Timer thetimer;
	
	
	//Methods
	public void mouseClicked(MouseEvent evt){
	
		
	}
	public void mouseEntered(MouseEvent evt){
		
	}
	
	public void mouseExited(MouseEvent evt){
	}
	
	public void mousePressed(MouseEvent evt){
	
		thepanel.intRectMouseY = evt.getY();
		if(thepanel.intRectMouseY >= 420){
			thepanel.intRectMouseY = 420;
		}
	}

	
	public void mouseReleased(MouseEvent evt){
		
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource()==thetimer){
			thepanel.repaint();
		}
	}
	
	public void keyReleased(KeyEvent evt){
		//System.out.println("Key released");
		if(evt.getKeyCode() == 38){
			thepanel.blnGoUp = false;
		}else if(evt.getKeyCode() == 40){
			thepanel.blnGoDown = false;
		}
		
	}
	public void keyPressed(KeyEvent evt){
		
	//System.out.println(evt.getKeyCode());
		if(evt.getKeyCode() == 38){
			thepanel.blnGoUp = true;
		}else if(evt.getKeyCode() == 40){
			thepanel.blnGoDown = true;
		}

		
	}
	public void keyTyped(KeyEvent evt){
	
	}
	
	
	//Constructor
	public pongprogram(){
		theframe = new JFrame("Pong");
		thepanel = new AnimationPanelpong();
		thepanel.setLayout(null);
		thepanel.setPreferredSize(new Dimension(1280, 720));
		thepanel.addMouseListener(this);
		theframe.addKeyListener(this);
		theframe.setContentPane(thepanel);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.pack();
		theframe.setVisible(true);
		
		thetimer = new Timer(1000/60, this);
		thetimer.start();
		
	}
	

	//Main Method
	public static void main(String[] args){
			new pongprogram();
		}
}
