import java.awt.*;
import java.awt.event.*;


class MyFrame11 extends Frame implements WindowListener
{
    
    Label l;
    
    MyFrame11()
    {
        super("Window Event Demo");
        l=new Label("No Message from Window");
        
        setLayout(new FlowLayout());
        add(l);
        
        addWindowListener(this);
        
        
    }
    public void windowOpened(WindowEvent we)
    {
        l.setText("Window Opened");
        
    }
    
    public void windowClosing(WindowEvent e) 
    {
        l.setText("Window Closing");
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) 
    {
        l.setText("Window Closed");
    }

    public void windowIconified(WindowEvent e) 
    {
        l.setText("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) 
    {
        l.setText("Window Deiconified");
    }

    public void windowActivated(WindowEvent e) 
    {
        l.setText("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) 
    {
        l.setText("Window DeActivated");
    }
        
}

public class WindowEventDemo 
{
    public static void main(String[] args) 
    {
        MyFrame11 f=new MyFrame11();
        f.setSize(500,500);
        f.setVisible(true);
        
    }    
}








