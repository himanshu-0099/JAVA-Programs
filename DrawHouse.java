package home;

import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class DrawHouse extends Frame {

	private static final long serialVersionUID = 1L;

	DrawHouse(){
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(260,280,790,380);
		g.setColor(Color.red);
		g.drawLine(260,280,370,180);
		g.drawLine(370,180,470,280);
		g.drawLine(370,180,1050,180);
		g.drawLine(1050,180,1050,280);
		g.drawLine(470,280,470,660);
		g.drawRect(550,510,90,150);
	}
	
	public static void main(String[] args) {
		DrawHouse h=new DrawHouse();
		h.setSize(1920,1900);
		h.setVisible(true);
	}
}  