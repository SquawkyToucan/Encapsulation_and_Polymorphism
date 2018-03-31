package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolymorph extends Polymorph {

	MovingPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.ORANGE);
		g.fillRect((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
	}
	
	@Override
	public void update() {
		Random r = new Random();
		setX(getX() + r.nextInt(10));
		setY(getY() - r.nextInt(10));
		setX(getX() - r.nextInt(10));
		setY(getY() + r.nextInt(10));
	}
	
}
