import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.plaf.DimensionUIResource;

public class MyCanvaas extends JPanel {
    public MyCanvaas() {
        setPreferredSize(new DimensionUIResource(400, 300));
        setBackground(Color.GREEN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Paintbruush paintBruush = new Paintbruush(g);
        paintBruush.drawSky();
        paintBruush.drawMountains();
        paintBruush.drawTree();
        paintBruush.drawLake();

    }
}
