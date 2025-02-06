package spaceinvaders;
import java.awt.Image;
import javax.swing.ImageIcon;

import java.awt.Rectangle;

import java.util.Random;

public class Aliens {
	private Image image;
	private int x,y,speed, direccion, movedX, movedY, wentDown;
	private final int RANGE;
	private boolean visible, goDown;
	
	public Aliens(int x, int y){
		 ImageIcon ii = new ImageIcon(this.getClass().getResource("imagenes/alien.png"));
	     image = ii.getImage();
	     this.x = x;
	     this.y = y;
	     speed = 1;
	     RANGE = 100;
	     movedX = 0;
	     direccion= 1; // 1= der, -1= izq
	     visible = true;
	     goDown= false;
	     movedY=0;
	     wentDown=0;
	     
	}
	
	public int getx() {
		return x;
	}
	 public int getY(){
	        return y;
	    }

	    public void setX(int x){
	        this.x = x;
	    }

	    public void setY(int y){
	        this.y = y;
	    }

	    public Image getImage(){
	        return image;
	    }

	    public int getSpeed(){
	        return speed;
	    }

	    public void setSpeed(int speed){
	        this.speed = speed;
	    }

	    public void setVisible(boolean visible){
	        this.visible = visible;
	    }
	    
	    public boolean isVisible(){
	        return visible;
	    }

	    public Rectangle getBounds(){
	        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
	    }
	
}
