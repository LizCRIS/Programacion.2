import java.util.ArrayList;
//import javax.swing.JFrame;
import javax.swing.JPanel;
//mport javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Polygon;

public class Canvas extends JPanel {
    ArrayList<Point> points = new ArrayList<>();

    public Canvas() {

        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.GRAY);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        Polygon polygon = new Polygon();
        for (int i = 0; i < points.size(); i++) {
            polygon.addPoint((int) Math.round(points.get(i).getX()), (int) Math.round(points.get(i).getY()));
        }
        g.fillPolygon(polygon);
        g.fillOval((int) points.get(0).getX(), (int) points.get(0).getY(), 5, 5);
        repaint();
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }
}