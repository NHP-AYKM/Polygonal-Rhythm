import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class GuidePanel extends JPanel implements KeyListener, ActionListener, MouseListener, MouseMotionListener {

    public static String screen = "guide";

    BufferedImage backgroundImg = Util.loadBuffImage("assets/background/stereoBG.png");
    BufferedImage groundImg = Util.loadBuffImage("assets/ground/ground1.png");
    BufferedImage guideImg = Util.resize(Util.loadBuffImage("assets/background/guide.png"), 1200, 750);

    public GuidePanel() {
        super();
        setLayout(null);
        setPreferredSize(new Dimension(Globals.SCREEN_WIDTH, Globals.SCREEN_HEIGHT));
        setFocusable(true);
        requestFocus();

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    boolean[] keys = new boolean[KeyEvent.KEY_LAST + 1];
    public Font fontLocal, fontSys, fontScores, lvlNameFont;

    Background bg1 = new Background(backgroundImg, groundImg); // background object. used to draw the background
    Timer timer = new Timer(1000/60, this); // timer

    public void guideDraw(Graphics g) {
        bg1.mainMenuDraw(g);
        g.drawImage(guideImg, Globals.SCREEN_WIDTH/2 - guideImg.getWidth()/2, 10, null);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_ESCAPE) {
            ControlCenter.toMainMenu();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}
}
