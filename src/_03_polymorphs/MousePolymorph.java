package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MousePolymorph extends Polymorph {

	MousePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(new Color(0, 153, 102));
		g.fillRect((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
	}
	
	@Override
	public void update() {
	}
	
}
