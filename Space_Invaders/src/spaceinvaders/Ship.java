package spaceinvaders;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import java.util.ArrayList;



public class Ship {
  private Image imagen;
  private int x,y,dx;
  private final int SPEED = 2;
  private ArrayList lasers;
  private boolean shot;
  
  public Ship(){ // caracterúisticas NAve
	ImageIcon i = new ImageIcon(this.getClass().getResource("imagenes/Nave.png"));  
  imagen = i.getImage();
	y= 250;
	x = 150-imagen.getWidth(null)/2;
	dx=0;
	lasers = new ArrayList();
	shot = true;
  }
  
  public int getX() {
	  return x;
  }
  public int getY() {
	  return y;
  }
  public Image getImage() {
	  return imagen;
  }
  
  public ArrayList getLasers() {
	  return lasers;
  }
  
  public void keyPressed(KeyEvent e) {
	  int key = e.getKeyCode();
	  
	  if(key == KeyEvent.VK_RIGHT) dx= SPEED;
	  if(key == KeyEvent.VK_LEFT) dx= SPEED*-1;
	  if(key == KeyEvent.VK_SPACE && shot) {
		 // lasers.add(new Laser(x + imagen.getWidth(null)/2, y));
		  shot = false;
	  }

  }
  
  public void keyReleased(KeyEvent e) {
	  int key = e.getKeyCode();
	  
	  //if(key == KeyEvent.VK_LEFT && dx < dx = " 0;" key ="="> 0)
	//	  dx=0;
	  if(key == KeyEvent.VK_SPACE) shot = true;
	  
  }
  
  public Rectangle getBounds(){
	  return new Rectangle (x,y,imagen.getWidth(null),imagen.getHeight(null));
  }
	
}
