package button;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Buttons extends Frame  implements ActionListener {
  Buttons(){
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Button b1,b2;
        b1=new Button("black");
        b2=new Button("red");


        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
    }
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand();
        if(str.equals("black"))this.setBackground(Color.black) ;

        if(str.equals("red"))this.setBackground(Color.red);
    }
    public static void main(String[] args) {
        Buttons f=new Buttons();

        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }
}