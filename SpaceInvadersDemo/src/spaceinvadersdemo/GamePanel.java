package spaceinvadersdemo;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	public int screenWidth= 520;
	public int screenHeight = 520;
	public Dimension screenSize = new Dimension(screenWidth,screenHeight);
	
	
    public GamePanel() {
    	this.setFocusable(true);
        this.setPreferredSize(screenSize);
        this.setBackground(Color.black);
    }
}
