import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ControlPanel extends JPanel
{
    private JButton addCircle;
    private JButton addSquare;
    private JButton pickColor;
    private JPanel panel;
    private JLabel label;
    private DrawingPanel drawingPanel;
    //private Color panelColor;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel( DrawingPanel drawingPanel )
    {
        this.drawingPanel = drawingPanel;
        
        this.addCircle = new JButton ("Circle");
        this.addSquare = new JButton ("Square");
        this.pickColor = new JButton ("Pick Colour");
        this.panel = new JPanel();
        Color background = this.getBackground();
        panel.setBackground(background);
        //panelColor = drawingPanel.pickColor();
        // panel.setBackground(panelColor);
        this.add(pickColor);
        this.add(this.panel);
        this.add(addCircle);
        this.add(addSquare);
        
        ClickListener listener = new ClickListener();
        this.addCircle.addActionListener(listener);
        this.addSquare.addActionListener(listener);
        this.pickColor.addActionListener(listener);
       
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
            if (event.getActionCommand().equals("Circle"))
            {
                System.out.println("The Circle Button was pressed");
                drawingPanel.addCircle();
            }
            else if (event.getActionCommand().equals("Square"))
            {
                System.out.println("The Square Button was pressed");
                drawingPanel.addSquare();
            }
             else if (event.getActionCommand().equals("Pick Colour"))
            {
                System.out.println("The Pick Colour Button was pressed");
                drawingPanel.pickColor();
                panel.setBackground(drawingPanel.getColor());
                
            }
            else
            {
                System.out.println("Nothing was pressed");
            }
        }
    }
}
