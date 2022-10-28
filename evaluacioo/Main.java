import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Graphics;

class Main extends JPanel {

    public static void main(String arg[]) {
        Main b = new Main();

    }

    public Main() {
        setPreferredSize(new Dimension(Config.SIZE_WIN_W, Config.SIZE_WIN_H));
        setBackground(Color.BLACK);

        JFrame f = new JFrame("Uber Liz");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(Config.SIZE_WIN_W, Config.SIZE_WIN_H);
        f.add(this);
        f.pack();
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(false);
        f.add(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < Config.SIZE_WIN_W; i += Config.SIZE_SEG) {
            g.drawLine(i, 0, i, Config.SIZE_WIN_H);
        }
        for (int j = 0; j < Config.SIZE_WIN_H; j += Config.SIZE_SEG) {
            g.drawLine(0, j, Config.SIZE_WIN_W, j);
        }

    }

}

/*
 * Profe si tengo la idea para hacerlo, pero la verdad me bloquie para pasarlo
 * aqui, mire le platico la idea
 * según yo es la clase vehiculo que le va a heredar a la clase cars, en la
 * clase cars se hacen los dos vehículos moto y carro,
 * seria una clase persona la cual tiene atributos como posición, nombre, edad,
 * esa va a heredar a cliente y conductor
 * ya tenemos los carros la poscion de conductor y la posición de usuario
 * en el main se llaman todas estas clases y creo en el main o mas bien en
 * cliente pondríamos el punto de destino
 * creo igual seria con un método, de allí se calcularía la cantidad de
 * cuadritos recorridos, no se se podría sacar
 * la pendiente para saber la distancia de un punto a otro y esa distancia
 * saldría en
 * pixeles solo seria cuestión de dividirlo entre el tamaño del segmento
 */