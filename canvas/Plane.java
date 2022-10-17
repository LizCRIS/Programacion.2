import java.awt.Color;
import java.awt.Graphics;

public class Plane extends Vehicles {

    public Plane(int x, int y, int speedX, int speedY, Color color) {
        super(x, y, speedX, speedY, color);

    }

    public void drawPlane(Graphics g) {
        double xp1 = 0.2, yp1 = 0.6, xp2 = 0.1, yp2 = 0.2, xp3 = 0.3, yp3 = 0.05;
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(getDot().getX() + (int) xp1, getDot().getX() + (int) yp1, Confiig.SIZE_PLANE_CABINA_W,
                Confiig.SIZE_PLANE_CABINA_H);
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(getDot().getX() + (int) xp2 + 50, getDot().getX() + (int) yp2 - 30, Confiig.SIZE_PLANE_ALA_W,
                Confiig.SIZE_PLANE_ALA_H);
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(getDot().getX() + (int) xp3, getDot().getX() + (int) yp3, Confiig.SIZE_PLANE_BASE_W,
                Confiig.SIZE_PLANE_BASE_H);
        // g.setColor(Confiig.COLOR_PLANE);
        // g.fillOval(getDot().getX()+(int)xp1, getDot().getX()+(int)yp1,
        // Confiig.SIZE_PLANE_CABINA_W, Confiig.SIZE_PLANE_CABINA_H);
    }
}