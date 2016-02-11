
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class Triangle
{
  private static final int FRAME_WIDTH = 200;
  private static final int FRAME_HEIGHT = 200;

  
  private JFrame frame;
  private JPanel panel;
  public Triangle()
  {
     this.frame = new JFrame();
     this.panel = new JPanel();
        
    
 
    
    
    }
    
    
    
    
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event )
        {
            //label.setText( "Button " + event.getMouseCommand() + " was clicked!");
            System.out.println( "Button " + event.getActionCommand() + " was clicked!");
        }
}
}
