import java.awt.*;

public class Vehicles1 {
    private int speedX, speedY;
    private Color color;
    private Dot dot;

    public Vehicles1(int x, int y, int speedX, int speedY, Color color) {
        dot = new Dot(x, y);
        this.speedX = speedX;
        this.speedY = speedY;
        this.color = color;
    }

    public Vehicles1(Dot d, int speedX, int speedY, Color color) {
        dot = new Dot(d.getX(), d.getY());
        this.speedX = speedX;
        this.speedY = speedY;
        this.color = color;
    }

    public void move() {
        dot.addX(speedX);
        dot.addY(speedY);
    }

    public void setSpeedX(int speed) {
        this.speedX = speed;
    }

    public void setSpeedY(int speed) {
        this.speedY = speed;
    }

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Dot getDot() {
        return dot;
    }
}
