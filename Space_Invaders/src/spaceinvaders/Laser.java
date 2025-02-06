package spaceinvaders;


import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

public class Laser {
	protected int x,y;
	protected Image image;
	private final int SPEED =5;
	private boolean visible;
	
	public Laser(int x, int y) {
		ImageIcon i= new ImageIcon(this.getClass().getResource("imagenes/laser.png"));
		image = i.getImage();
		visible= true;
		this.x =x;
		this.y =y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public Image getImage() {
		return image;
	}
	public Rectangle getBounds() {
		return new Rectangle(x,y,image.getWidth(null), image.getHeight(null));
	}
	public boolean isVisible() {
		return visible;
	}
	
	public void setVisible(boolean resultado) {
		this.visible= resultado;
	}
	
	public void update() {
		y -= SPEED;
		if(y<0) visible = false;
	}
	
	
	
}
