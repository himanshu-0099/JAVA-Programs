import javax.swing.*;

import java.awt.*;

public class Tabbed_pane extends JFrame {

    Tabbed_pane(){



        Container c=getContentPane();

        JTabbedPane jt=new JTabbedPane();

        jt.add("Section",new Section());

        jt.add("RollNo",new RollNo());

        c.add(jt);

    }

public class Section extends JPanel

{

    Section(){

    JButton b1=new JButton("A");

    JButton b2=new JButton("B");

    JButton b3=new JButton("C");

    JButton b4=new JButton("D");

    add(b1);

    add(b2);

    add(b3);

    add(b4);

}

}

public class RollNo extends JPanel{

       RollNo(){

        JCheckBox c1=new JCheckBox("01");

    JCheckBox c2=new JCheckBox("02");

    JCheckBox c3=new JCheckBox("03");

    JCheckBox c4=new JCheckBox("04");

    add(c1);

    add(c2);

    add(c3);

    add(c4);

}

}

    public static void main(String[] args) {

Tabbed_pane t=new Tabbed_pane();

t.setSize(500,500);

t.setVisible(true);

t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}