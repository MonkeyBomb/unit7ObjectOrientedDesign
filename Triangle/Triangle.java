
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
     
     this.frame(panel);
     
     Clicklistener listener = new Clicklistener();
     
     this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
     this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.frame.setVisible(true);
     
     
    
 
    
    
    }
    
    
    
    
    
    public class ClickListener implements MouseClickListener
    {
        public void Clicklistener(MouseEvent event) 
        {
            
            int x = event.getX();
            int y = event.getY();
          
        }
}
}
