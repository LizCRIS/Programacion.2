
//import java.util.ArrayList;
import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.WindowConstants;

/*import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;*/
class Board {

    public static void main(String arg[]) {
        double angle = Math.PI / 4;
        Point p = new Point(50, 50);
        JFrame window = new JFrame("Swing");
        Canvas canvas = new Canvas();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.add(canvas);
        window.pack();
        window.setSize(400, 300);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        Spacecraft spacecraft = new Spacecraft(Config.SPEED_P, Config.ANGLE_P1, Config.SPEED_UP, Config.COLOR_P1,
                Config.XP1, Config.YP1, Config.live);
        for (int i = 0; i < 500; i++) {
            spacecraft.setAngle(angle);
            spacecraft.setP(p);
            spacecraft.print();
            canvas.setPoints(spacecraft.getPointsT());
            angle += 0.1;
            p.setX(p.getX() + 1);
            p.setY(p.getY() + 1);

            try {

                Thread.sleep(100);

            } catch (InterruptedException e) {

            }
        }

    }

}