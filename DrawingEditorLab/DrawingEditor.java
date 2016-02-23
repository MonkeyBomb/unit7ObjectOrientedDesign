import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 this fram will contain the Frame and the canvas and will alos contain panel
 */
public class DrawingEditor extends JFrame
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 400;

    private JFrame frame;
    private JPanel panel;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
       this.frame = new JFrame();
       this.panel = new JPanel();
       this.frame.add(this.panel);
       
       
       this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        DrawingEditor view = new DrawingEditor();
        
    }
   
    public void canvas()
    {
        
    }
    
    public controls()
    {
    
    }

}
