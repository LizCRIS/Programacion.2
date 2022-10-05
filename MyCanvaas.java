import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.plaf.DimensionUIResource;

public class MyCanvaas extends JPanel {
    Point pSun = new Point(Confiig.WINDOW_W / 2, Confiig.WINDOW_H / 2);

    public MyCanvaas() {
        setPreferredSize(new DimensionUIResource(Confiig.WINDOW_W, Confiig.WINDOW_H));
        setBackground(Confiig.COLOR_BG);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Paintbruush paintBruush = new Paintbruush(g);
        paintBruush.drawSky();
        paintBruush.drawMountains();
        paintBruush.drawLake();
        paintBruush.drawTree(190, 50);
        paintBruush.drawTree(110, 50);
        paintBruush.drawTree(270, 50);
        paintBruush.drawTree(30, 50);
        // paintBruush.drawSun(pSun);
        paintBruush.drawOvni();
        paintBruush.drawPlane();
    }

}
