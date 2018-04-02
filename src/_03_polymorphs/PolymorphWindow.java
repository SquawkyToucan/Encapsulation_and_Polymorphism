package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener {
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph m;
    
     
    ArrayList<Polymorph> polys = new ArrayList<>();
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("who needs cosine and sine");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 polys.add(new BluePolymorph(50, 50, 10, 10));
   	 polys.add(new RedPolymorph(54, 143, 10, 10));
   	 for(int i = 0; i < 250; i++) {
   		 polys.add(new MovingPolymorph(250, 250, 10, 10));
   	 }
   	 for(int t = 0; t < 500; t = t + 5) {
   		 polys.add(new CirclePolymorph(t, t, 10, 10));
   	 }
   	 m = new MousePolymorph(10, 10, 10, 10);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(Polymorph e: polys) {
   		 e.draw(g);
   	 }
   	 m.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for(Polymorph g: polys) {
   		 g.update();
   	 }
   	 m.update();
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		m.setX(e.getX());
		m.setY(e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		m.setX(e.getX());
		m.setY(e.getY());
	}
}
