import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ControlPanel extends JPanel
{
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton AddCircle;
    private JButton AddSquare;
    private JButton PickColour;
    
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel()
    {
        //this.label = new JLabel();
        //this.panel.add( this.label );
        
        JButton AddCircle = new JButton ("Circle");
        JButton AddSquare = new JButton ("Square");
        JButton PickColour = new JButton ("Pick Colour");
        this.add(AddCircle);
        this.add(AddSquare);
        this.add(PickColour);
        getColourPanel = new JPanel();
        this.add(getColourPanel.setBackGroundColor(BLACK));
        
        //frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //DrawingPanel canvas = new DrawingPanel();
        //ControlPanel controls = new ControlPanel(canvas);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        ControlPanel view = new ControlPanel();
        
    }

}
