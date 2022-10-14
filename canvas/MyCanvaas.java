import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.Timer;
import java.awt.Color;

public class MyCanvaas extends JPanel implements KeyListener, ActionListener {
    // Point pSun = new Point(Confiig.WINDOW_W / 3, Confiig.WINDOW_H / 3);
    // Point pOvni = new Point(Confiig.WINDOW_W / 6, Confiig.WINDOW_H / 6);
    ArrayList<Car> cars = new ArrayList<Car>();

    public MyCanvaas() {
        setPreferredSize(new Dimension(Confiig.WINDOW_W, Confiig.WINDOW_H));
        setBackground(Confiig.COLOR_BG);
        Timer timer = new Timer(80, this);
        timer.start();
        cars.add(new Car(10, 250, 2, 0, Color.RED, 60, 30));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Paintbruush paintBruush = new Paintbruush(g);
        // Vehicles vehicles = new Vehicles(g);
        paintBruush.drawSky();
        paintBruush.drawMountains();
        paintBruush.drawLake();
        paintBruush.drawTree(190, 50);
        paintBruush.drawTree(110, 50);
        paintBruush.drawTree(270, 50);
        paintBruush.drawTree(30, 50);
        for (Car c : cars) {
            c.move();
            c.draw(g);
        }
        // paintBruush.drawSun(pSun);
        // vehicles.drawPlane();
        // vehicles.drawOvni(pOvni);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    // @Override
    /*
     * public void keyPressed(KeyEvent event) {
     * 
     * int key = event.getKeyCode();
     * if (key == KeyEvent.VK_UP) {
     * pSun.setY(pSun.getY() - Confiig.SUN_STEP);
     * }
     * if (key == KeyEvent.VK_DOWN) {
     * pSun.setY(pSun.getY() + Confiig.SUN_STEP);
     * }
     * if (key == KeyEvent.VK_RIGHT) {
     * pSun.setX(pSun.getX() + Confiig.SUN_STEP);
     * }
     * if (key == KeyEvent.VK_LEFT) {
     * pSun.setX(pSun.getX() - Confiig.SUN_STEP);
     * }
     * repaint();
     * 
     * // ovni
     * int key_a = event.getKeyCode();
     * if (key_a == KeyEvent.VK_RIGHT) {
     * pOvni.setX(pOvni.getX() + Confiig.OVNI_STEP);
     * }
     * if (key_a == KeyEvent.VK_LEFT) {
     * pOvni.setX(pOvni.getX() - Confiig.OVNI_STEP);
     * }
     * repaint();
     * 
     * }
     */

}