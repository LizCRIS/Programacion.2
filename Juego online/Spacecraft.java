import java.io.Serializable;
import java.util.ArrayList;

class Spacecraft implements Serializable {
    private ArrayList<Point> points = new ArrayList<Point>();
    private ArrayList<Point> pointsT = new ArrayList<Point>();
    private double speed;
    private double angle;
    private double speedUP;
    private char color;
    private Point p;
    private int live;

    public Spacecraft(Double speed, double angle, double speedUP, char color, int x, int y, int live) {
        this.speed = speed;
        this.angle = angle;
        this.speedUP = speedUP;
        this.color = color;
        // this.p=p;
        this.live = live;
        points.add(new Point(0, 20));
        points.add(new Point(-10, -20));
        points.add(new Point(-5, -20));
        points.add(new Point(-3, -15));
        points.add(new Point(3, -15));
        points.add(new Point(5, -20));
        points.add(new Point(10, -20));
        for (int i = 0; i < points.size(); i++) {
            pointsT.add(new Point(0, 0));
        }
    }

    public void move() {
        speed += speedUP;
    }

    public void shoot(double angle, double speed, int x, int y, char color) {
        Bullet bullet = new Bullet(angle, speed, live, x, y, color);
        bullet.move(angle);

    }

    public void setP(Point p) {
        this.p = p;
    }

    public Point getP() {
        return p;
    }

    public double getSpeedUP() {
        return speedUP;
    }

    public double getAngle() {
        return angle;
    }

    public int getLive() {
        return live;
    }

    public char getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public ArrayList<Point> getPointsT() {
        return pointsT;
    }

    public void setPointsT(ArrayList<Point> pointsT) {
        this.pointsT = pointsT;
    }

    private void rotate() {
        for (int i = 0; i < points.size(); i++) {
            double xP;
            double yP;
            xP = points.get(i).getX() * Math.cos(angle) - points.get(i).getY() * Math.sin(angle);
            yP = points.get(i).getX() * Math.sin(angle) + points.get(i).getY() * Math.cos(angle);
            pointsT.get(i).setX(xP);
            pointsT.get(i).setY(yP);
        }
        System.out.println(angle);
    }

    private void translate() {
        for (int i = 0; i < points.size(); i++) {
            pointsT.get(i).setX(pointsT.get(i).getX() + p.getX());
            pointsT.get(i).setY(pointsT.get(i).getY() + p.getY());
        }
    }

    public void print() {
        rotate();
        translate();
    }

}