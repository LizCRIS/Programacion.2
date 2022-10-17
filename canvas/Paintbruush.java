import java.awt.Graphics;
import java.awt.Polygon;

public class Paintbruush {
    private Graphics g;

    public Paintbruush(Graphics g) {
        this.g = g;

    }

    // sky
    public void drawSky() {
        g.setColor(Confiig.COLOR_SKY);
        g.fillRect(Confiig.SKY_X, Confiig.SKY_Y, Confiig.SKY_W, Confiig.SKY_H);
        g.setColor(Confiig.COLOR_SUN);
        g.fillOval(10, 10, 30, 30);
    }

    // sun
    /*
     * public void drawSun(Point p) {
     * 
     * g.setColor(Confiig.COLOR_SUN);
     * g.fillOval(p.getX(), p.getY(), Confiig.SUN_SIZE, Confiig.SUN_SIZE);
     * }
     */
    // lake
    public void drawLake() {
        g.setColor(Confiig.COLOR_LAKE);
        g.fillRect(Confiig.LAKE_X, Confiig.LAKE_Y, Confiig.LAKE_W, Confiig.LAKE_H);
    }

    // carretera
    public void drawCarretera() {
        g.setColor(Confiig.COLOR_HIGHWAY);
        g.fillRect(Confiig.HIGHWAY_X, Confiig.HIGHWAY_Y, Confiig.HIGHWAY_W, Confiig.HIGHWAY_H);
        g.setColor(Confiig.COLOR_HIGHWAY_LINE);
        g.fillRect(Confiig.HIGHWAY_LINE_X, Confiig.HIGHWAY_LINE_Y, Confiig.HIGHWAY_LINE_W, Confiig.HIGHWAY_LINE_H);
    }

    // mountains
    public void drawMountains() {
        int start = 40;
        int top = 25;
        for (int i = 0; i < 12; i++) {
            Polygon triangle = new Polygon();
            int width = 90;
            int spacing = 70;

            triangle.addPoint(start + (spacing * i), top);
            triangle.addPoint((start - (width / 2)) + (spacing * i), top + width);
            triangle.addPoint((start + (width / 2)) + (spacing * i), top + width);

            g.setColor(Confiig.COLOR_BROWN);
            g.fillPolygon(triangle);
        }
    }

    // tree
    public void drawTree(int start, int top) {

        // draw trunk´s
        g.setColor(Confiig.COLOR_TRUNK_TREE);
        g.fillRect(start - 10, top + 110, 26, 40);
        // draw tree's

        g.setColor(Confiig.COLOR_TREE);
        for (int i = 0; i < 5; i++) {
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;

            triangle.addPoint(start, top + (spacing * i));
            triangle.addPoint(start - (width / 2), top + height + (spacing * i));
            triangle.addPoint(start + (width / 2), top + height + (spacing * i));

            g.fillPolygon(triangle);
        }

    }
}
