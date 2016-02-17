
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import javax.swing.JComponent;
 import java.awt.geom.Ellipse2D;
 import java.awt.geom.Line2D;
 /**
  * This component displays a rectangle that can be moved.
  */
public class TriangleComponent extends JComponent
 {
    private Ellipse2D one;
    private Ellipse2D two;
    private Ellipse2D three;
    
    int counter = 0;
     
     
    public void oneDot(int x, int y)
    {
        this.one = new Ellipse2D.Double(10, 10 , x , y);
    
    }
     public void paintComponent(Graphics g)
    {
     Graphics2D g2 = (Graphics2D) g;
     g2.draw(one);
    }
     
     //public void TriangleTo(int x, int y)
     //{
     //    one.setLocation(x, y);
     //     repaint();
     //}
     
}
