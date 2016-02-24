import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
/**
 this fram will contain the Frame and the canvas and will alos contain panel
 */
public class DrawingEditor extends JFrame
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 400;

    private JFrame frame;
    private DrawingPanel canvas;
    private ControlPanel controls;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
      
       canvas = new DrawingPanel();
       controls = new ControlPanel();
       
       
       this.add(canvas, BorderLayout.CENTER);
       this.add(controls, BorderLayout.SOUTH);
       
       
       this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
       
       //DrawingPanel canvas = new DrawingPanel();
       //ControlPanel controls = new ControlPanel(canvas);
        
    }

    public static void main(String[] args)
    {
        DrawingEditor view = new DrawingEditor();
        
    }
   
    public void canvas()
    {
        
    }
    
    public void controls()
    {
    
    }

}
