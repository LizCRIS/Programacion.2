import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.Timer;

public class MyCanvaas extends JPanel implements KeyListener, ActionListener {
    ArrayList<Cars> cars = new ArrayList<Cars>();
    ArrayList<Ovni> ovni = new ArrayList<Ovni>();
    ArrayList<Plane> plane = new ArrayList<Plane>();
    ArrayList<Boat> boat = new ArrayList<Boat>();

    public MyCanvaas() {
        setPreferredSize(new Dimension(Confiig.WINDOW_W, Confiig.WINDOW_H));
        setBackground(Confiig.COLOR_BG);
        Timer timer = new Timer(80, this);
        timer.start();
        // ovni
        ovni.add(new Ovni(10, 100, 2, 0, Confiig.COLOR_OVNIB, 60, 30));
        // Plane
        plane.add(new Plane(10, 0, 2, -3, Confiig.COLOR_PLANE));
        // Boat
        boat.add(new Boat(10, 190, 2, 0, Color.RED));
        // Cars
        cars.add(new Cars(10, 420, 2, 0, Color.PINK, 60, 30));
        cars.add(new Cars(890, 370, -2, 0, Color.RED, 60, 30));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Paintbruush paintBruush = new Paintbruush(g);
        // Vehicles vehicles = new Vehicles(g);
        paintBruush.drawSky();
        paintBruush.drawMountains();
        paintBruush.drawLake();
        paintBruush.drawCarretera();
        paintBruush.drawTree(850, 50);
        paintBruush.drawTree(770, 50);
        paintBruush.drawTree(690, 50);
        paintBruush.drawTree(590, 50);
        paintBruush.drawTree(490, 50);
        paintBruush.drawTree(400, 50);
        paintBruush.drawTree(330, 50);
        paintBruush.drawTree(190, 50);
        paintBruush.drawTree(110, 50);
        paintBruush.drawTree(270, 50);
        paintBruush.drawTree(30, 50);
        for (Ovni o : ovni) {
            o.move();
            o.drawOvni(g);
        }
        for (Boat b : boat) {
            b.move();
            b.drawCars(g);
        }
        for (Plane p : plane) {
            p.move();
            p.drawPlane(g);
        }
        for (Cars c : cars) {
            c.move();
            c.drawCars(g);
        }

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

}