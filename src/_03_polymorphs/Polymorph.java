package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(){
   	 
    }
    
    public int getX() {
    		return x;
    }
    public void setX(int newX) {
    		x = newX;
    }
    
    public int getY() {
    		return y;
    }
    public void setY(int newY) {
    		y = newY;
    }
    
    public int getWidth() {
    		return width;
    }
    public void setWidth(int newW) {
    		width = newW;
    }
    
    public int getHeight() {
    		return height;
    }
    public void setHeight(int newH) {
    		height = newH;
    }
    public abstract void draw(Graphics g);
}
