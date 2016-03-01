
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
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    
    private JColorChooser colors;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
       this.setBackground(Color.WHITE);  
    }
    public void setColor()
    {
    }
    public void addCircle()
    {
    
    
    }
  
    public void addSquare()
    {
    }
    
    public void pickColor()
    {
        //JColorChooser colors = new JColorChooser();
        Color color = color.BLUE;
        JColorChooser.showDialog(this,"Pick Colour", color);
        colors = colours;
        //show dialog
    }

}
