package spaceinvaders;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Invaders {

	public static final int WIDTH= 800;
	public static final int HEIGHT= 600;
	
	public Invaders() {
		JFrame ventana= new JFrame("SPACE INVADERS");
		JPanel panel = (JPanel)ventana.getContentPane();
		panel.setBounds(0,0,WIDTH, HEIGHT);
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		panel.setLayout(null);
		// panel.add(this);
		
		ventana.setBounds(0,0,WIDTH,HEIGHT);
		ventana.setVisible(true);
		
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(WIDTH/2-10, HEIGHT/2-10, 20, 20);
	}
	
	public static void main(String[] args) {
		new Invaders();

	}
}
