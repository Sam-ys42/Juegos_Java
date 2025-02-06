package spaceinvaders;
/*http://javapragmatico.blogspot.com/2009/04/space-invaders_18.html*/
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

//temporizador
import javax.swing.Timer;
import java.awt.Toolkit;

//teclas y temporizador(?
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//teclas
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Font;

public  class Board_Engloba_Todo extends JPanel implements ActionListener {

	private Timer tiempo;
	private Ship nave;
	private Aliens alien[][];
	private final int FilasAlien, ColumnasAlien, ALIEN_STARTX, ALIEN_STARTY,ALIEN_PADDING;
	private Font font; //??
	private String msg;
	private int aliensLeft;
	private boolean gameEnded;
	
	
	public Board_Engloba_Todo(){
		setDoubleBuffered(true);
		setBackground(Color.blue);
		setFocusable(true);
		addKeyListener(new Listener());
		
		nave = new Ship();
		
		//---PARTE DE LOS ALIENS---
		FilasAlien = 6;
        ColumnasAlien = 3;
        ALIEN_STARTX = 20;
        ALIEN_STARTY = 20;
        ALIEN_PADDING = 3;
        
        alien = new Aliens[FilasAlien][ColumnasAlien];
        for (int i = 0; i < FilasAlien; i++) {
			for (int j = 0; j < ColumnasAlien; j++) {
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
