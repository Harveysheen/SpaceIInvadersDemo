package spaceinvadersdemo;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	public int screenWidth= 520;
	public int screenHeight = 520;
	public Dimension screenSize = new Dimension(screenWidth,screenHeight);
	GamePanel panel;
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("SpaceInvadersDemo");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(screenSize);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GameFrame();
	}
	
	
	
}
