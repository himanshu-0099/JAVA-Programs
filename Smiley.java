package smiley;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Smiley extends  Frame {
    Smiley(){
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics r) {
        r.setColor(Color.black);
        r.drawRect(80, 200, 0, 0);
        r.drawOval(90, 70, 80, 80);
        r.drawOval(110, 95, 5, 5);
        r.drawOval(145, 95, 5, 5);
        r.drawArc(113, 115, 35, 20, 0, -180);
    }
     public static void main(String[] args){
        Smiley y =  new Smiley();
        y.setSize(400,400);
        y.setTitle("smile");
        y.setVisible(true);   
     }
}
