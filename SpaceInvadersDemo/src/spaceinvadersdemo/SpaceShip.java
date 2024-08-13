package spaceinvadersdemo;

import java.awt.Color;
import java.awt.Graphics;

public class SpaceShip extends Sprite{

	SpaceShip(int x,int y, int width,int height){
		super(x,y,width,height);
	}
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(x, y, width, height);
	}
	
}
