import java.awt.*;
import java.awt.event.*;

class MyFrame16 extends Frame
{
    int x=0,y=0;
    
    MyFrame16()
    {
        super("Painting Demo");
        
        addMouseMotionListener(new MouseAdapter(){
         public void mouseMoved(MouseEvent me)
         {
             x=me.getX();
             y=me.getY();
             repaint();
         }
    });
        
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Luminari",Font.BOLD,30));
        g.drawString("Hello", x, y);
    }
}
public class PaintingDemo {

    public static void main(String[] args) {
        MyFrame16 f=new MyFrame16();
        f.setSize(500,500);
        f.setVisible(true);
        }
    
}