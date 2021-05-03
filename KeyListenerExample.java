import java.awt.*;  
import java.awt.event.*;  
class KeyListenerExample extends Frame implements KeyListener
{  
    Label l;  
    TextArea area;  
    KeyListenerExample()
	{  
          
        l=new Label();  
        l.setBounds(30,50,100,20);  
        area=new TextArea();  
        area.setBounds(30,80,300, 300);  
        area.addKeyListener(this);  
          
        add(l);add(area);  
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
    }   
	public void keyPressed(KeyEvent e) 
	{  
        l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) 
	{  
        l.setText("Key Released");  
    }  
    
    public void keyTyped(KeyEvent e) 
	{  
        l.setText("Key Typed");  
    }  
  
    public static void main(String[] args) 
	{  
        new KeyListenerExample();  
    }  
}  