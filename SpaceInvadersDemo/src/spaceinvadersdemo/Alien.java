package spaceinvadersdemo;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends Sprite{

	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.drawOval(x, y, width, height);
	
		
	}
	
}
