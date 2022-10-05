import javax.swing.*;

class Swing01 {
    public static void main(String args[]) {
        JFrame window = new JFrame("Swing Liz");
        MyCanvaas canvaas = new MyCanvaas();

        window.add(canvaas);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(Confiig.WINDOW_W, Confiig.WINDOW_H);
        window.setVisible(true);
        window.addKeyListener(canvaas);
    }
}