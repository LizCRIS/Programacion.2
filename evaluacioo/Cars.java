import java.awt.Color;
import java.awt.Graphics;

public class Cars extends Vehiculos {
    public Cars(int x, int y, Color color) {
        super(x, y, color);
    }

    public void drawCar(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(2, 24, Config.SIZE_CAR_W, Config.SIZE_MOTO_H);
    }

    public void drawMoto(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(7, 26, Config.SIZE_CAR_W, Config.SIZE_MOTO_H);
    }
}
