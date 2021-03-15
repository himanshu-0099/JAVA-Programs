package text;


import java.awt.*;
import java.awt.event.*;

public class Text extends Frame{
	Text(){
		this.addWindowListener(new WindowAdapter()

		{
		public void windowClosing(WindowEvent e){
		System.exit(0);
		}
		}
		);

		}
		   
		    public static void main(String[] args) {
		        Text t = new Text();
		        t.setSize(400,400);
		        t.setVisible(true);
		        t.setTitle("displaying text in frame");
		        
		    }
		    public void paint(Graphics g){
		    g.drawString("WELCOME",150,150);
		    g.setColor(Color.blue);
		    }
		    
		}

