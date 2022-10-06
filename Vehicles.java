import java.awt.Graphics;

public class Vehicles {
    private Graphics g;

    public Vehicles(Graphics g) {
        this.g = g;

    }

    public void drawOvni(Point p) {
        g.setColor(Confiig.COLOR_OVNIB);
        g.fillOval(p.getX() - 20, p.getY(), Confiig.SIZE_OVNIB, Confiig.SIZE_OVNIB - Confiig.REST_SIZE_OVNIB);
        g.setColor(Confiig.COLOR_OVNI);
        g.fillOval(p.getX(), p.getY() - 10, Confiig.SIZE_OVNIA, Confiig.SIZE_OVNIA - Confiig.REST_SIZE_OVNIA);
    }

    public void drawPlane() {
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(150, 60, Confiig.SIZE_PLANE_CABINA_W, Confiig.SIZE_PLANE_CABINA_H);
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(200, 25, Confiig.SIZE_PLANE_ALA_W, Confiig.SIZE_PLANE_ALA_H);
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(170, 40, Confiig.SIZE_PLANE_BASE_W, Confiig.SIZE_PLANE_BASE_H);
        g.setColor(Confiig.COLOR_PLANE);
        g.fillOval(165, 40, Confiig.SIZE_PLANE_HELICE_W, Confiig.SIZE_PLANE_HELICE_H);

    }
    // 150,60;200,25;170,40;165,40

}
