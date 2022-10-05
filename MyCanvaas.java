import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;

public class MyCanvaas extends JPanel implements KeyListener, ActionListener {
    Point pSun = new Point(Confiig.WINDOW_W / 2, Confiig.WINDOW_H / 2);

    public MyCanvaas() {
        setPreferredSize(new Dimension(Confiig.WINDOW_W, Confiig.WINDOW_H));
        setBackground(Confiig.COLOR_BG);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        PaintBruush paintBruush = new PaintBruush(g);
        paintBruush.drawSky();
        paintBruush.drawMountains();
        paintBruush.drawLake();
        paintBruush.drawTree(190, 50);
        paintBruush.drawTree(110, 50);
        paintBruush.drawTree(270, 50);
        paintBruush.drawTree(30, 50);
        paintBruush.drawSun(pSun);
        paintBruush.drawOvni();
        paintBruush.drawPlane();
    }

    @Override
    public void keyPressed(KeyEvent event) {

        int key = event.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            pSun.setY(pSun.getY() - Confiig.SUN_STEP);
        }
        if (key == KeyEvent.VK_DOWN) {
            pSun.setY(pSun.getY() + Confiig.SUN_STEP);
        }
        if (key == KeyEvent.VK_RIGHT) {
            pSun.setX(pSun.getX() + Confiig.SUN_STEP);
        }
        if (key == KeyEvent.VK_LEFT) {
            pSun.setX(pSun.getX() - Confiig.SUN_STEP);
        }
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
