import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
public class ControlPanel extends JPanel
{
    private JButton AddCircle;
    private JButton AddSquare;
    private JButton PickColor;
    private JPanel panel;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel()
    {

        JButton AddCircle = new JButton ("Circle");
        JButton AddSquare = new JButton ("Square");
        JButton PickColor = new JButton ("Pick Colour");
        this.panel = new JPanel();
        Color background = this.getBackground();
        panel.setBackground(background);
        
        this.add(PickColor);
        this.add(this.panel);
        this.add(AddCircle);
        this.add(AddSquare);
        
        ClickListener listener = new ClickListener();
        this.AddCircle.addActionListener(listener);
        this.AddSquare.addActionListener(listener);
        this.PickColor.addActionListener(listener);
       
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

    public void PickColor()
    {

    }
    //     public class ColorListener implements ColorListener
    //     {
    //         public void actionPerformed(ActionEvent event)
    //         {
    //             canvas.pickColor();
    //             Color currentColor = canvas.getColor();
    //             getColorPanel.setBackground(currentColor);
    //         }
    //     }
     public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event )
        {
            label.setText( "Button " + event.getActionCommand() + " was clicked!");
            System.out.println( "Button " + event.getActionCommand() + " was clicked!");
        }
    }
}
