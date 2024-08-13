package spaceinvadersdemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	public int screenWidth= 520;
	public int screenHeight = 520;
	public Dimension screenSize = new Dimension(screenWidth,screenHeight);
	public int aliensPerColumn = 5;
	public int aliensPerRow = 6;
	Image image;
	Graphics graphics;
	SpaceShip spaceship;
	UFO ufo;
	ArrayList <Alien> aliens = new ArrayList<Alien>();
	Rocket rocket;
	
	
    public GamePanel() {
    	newSpaceShip();
    	newUFO();
    	newRocket();
    	newAlien();
    	this.setFocusable(true);
        this.setPreferredSize(screenSize);
        this.setBackground(Color.black);
        
    }
    public void newSpaceShip() {
    	spaceship = new SpaceShip(240,460,40,40);
    }
    public void newAlien() {
    	for(int i=0;i<aliensPerRow;i++) {
    		for(int j=0;j<aliensPerColumn;j++) {
                aliens.add(new Alien(((i+1)*30),((j+1)*30),20,20));
                
            }
    	}
    }
    public void newRocket() {
    	
    }
    public void newUFO() {
    	
    }
    public void paint(Graphics g) {
    	image = createImage(getWidth(),getHeight());
    	graphics = image.getGraphics();
    	draw(graphics);
    	g.drawImage(image, 0, 0, this);
    }
    public void draw(Graphics g) {
    	spaceship.draw(g);
    	for(Alien alien : aliens) {
            alien.draw(g);
        }
    }
    
}
