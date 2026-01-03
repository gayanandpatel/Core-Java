import java.awt.*;
import java.awt.event.*;

class MyFrame14 extends Frame
{
    TextField tf;
    Button b;
    int count=0;
    
    MyFrame14()
    {
        super("Event Demo");
        
        tf=new TextField("0",20);
        b=new Button("Click");
        
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        
        b.addActionListener((ActionEvent ae)-> {count++;tf.setText(String.valueOf(count));});
            
            
        
        
    }
        
}

public class WayOfHandlingDemo
{
    public static void main(String[] args) 
    {
        MyFrame14 f=new MyFrame14();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}