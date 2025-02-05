package spaceinvaders;
import javax.swing.JFrame;


public class Main extends JFrame {
	
	public Main() {
		//add(new Board());
		setTitle("SPACE INVADERS");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
