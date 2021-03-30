
import javax.swing.*;
import java.awt.*;

public class box extends Frame{

  Button b1=new Button("Red");
    Button b2=new Button("Blue");
    Button b3=new Button("Black");
    Button b4=new Button("Green");

    box(){
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }

    public static void main(String[] args) {

      box b=new box();
      b.setSize(200,200);
      b.setVisible(true);
      b.setLayout(new BoxLayout(b,BoxLayout.Y_AXIS));

    }
}