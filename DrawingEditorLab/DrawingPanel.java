
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
//import 
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    
    private JColorChooser color;
    private Color objectColor;
    private ArrayList<Shape> shapes;
    private Shape activeShape;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
       this.setBackground(Color.WHITE);
       objectColor = Color.BLUE;
       shapes = new ArrayList<Shape>();
    }
    public void getPrefferedSize()
    {
        
    }
    public Color getColor()
    {
        return objectColor;
    }
    public void addCircle()
    {
    
    }
    public void addSquare()
    {
        
    }
    public void pickColor()
    {
        Color color = Color.BLUE;
        objectColor = JColorChooser.showDialog(this,"Pick Colour", objectColor);
        
       
    }
    public void paintComponent(Graphics g)
    {
    }
}
