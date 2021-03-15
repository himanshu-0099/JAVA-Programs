package radio;

import java.awt.*;
import java.awt.event.*;
public class RadioButtons extends Frame implements ItemListener{
	String msg="";
	CheckboxGroup cbg;
	Checkbox cb1,cb2;
	RadioButtons(){
		addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e) {			
			System.exit(0);
		}				
   });		
		setLayout(new FlowLayout());
        cbg=new CheckboxGroup();
        cb1=new Checkbox("Red",cbg,true);
        cb2=new Checkbox("Black",cbg,true);
        add(cb1);
        add(cb2);
        cb1.addItemListener(this);
        cb2.addItemListener(this);    
	}
	public void itemStateChanged(ItemEvent ie) {		
		repaint();
	}
	public void paint(Graphics g) {
		msg="Colour:";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,150, 100);		
	}
	public static void main(String[] args) {
		RadioButtons rb=new RadioButtons();
		rb.setTitle("radio button");
		rb.setVisible(true);
		rb.setSize(400,400);
	}
}