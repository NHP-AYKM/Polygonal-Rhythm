import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuideFrame extends JFrame implements ActionListener {

    public static GuidePanel guide = new GuidePanel();
    Timer timer = new Timer(1000/60, this);


    public GuideFrame() {
        super("Guide");
        timer = new Timer(1000/60, this);
        timer.start();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Globals.SCREEN_WIDTH, Globals.SCREEN_HEIGHT);

        add(guide); // adding the panel

        // Add mouse listener to the Guidepanel
        guide.addMouseListener(new GuideMouseListener());

        setIconImage(Globals.windowIcon.getImage()); // window icon lol
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        guide.repaint();
    }


    class GuideMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
        }
    }
}
