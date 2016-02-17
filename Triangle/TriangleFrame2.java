
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class TriangleFrame2 extends JFrame
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 200;

    private JFrame frame;
    private JPanel panel;
    public TriangleFrame2()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.frame(panel);

        Clicklistener listener = new Clicklistener();

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);

    
    }

    class ClickListener implements MouseListener
    {
        public void Clicklistener(MouseEvent event) 
        {

            int x = event.getX();
            int y = event.getY();
            

        }
        // Do-nothing methods
        public void mouseReleased(MouseEvent event)
        {
        }

        public void mouseClicked(MouseEvent event)
        {
        }

        public void mouseEntered(MouseEvent event)
        {
        }

        public void mouseExited(MouseEvent event)
        {
        }
    }
}
