import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    
    MyFrame4()
    {
        super("TextArea Demo");
        
        l=new Label("No Text Entered ");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        b=new Button("Click");
        
        setLayout(new FlowLayout());
        
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        ta.insert(tf.getText(), ta.getCaretPosition());
        
    }
    
    
}

public class TextAreaDemo 
{
    public static void main(String[] args) 
    {
        MyFrame4 f=new MyFrame4();
        f.setSize(500,500);
        f.setVisible(true);
        
              
    }
}