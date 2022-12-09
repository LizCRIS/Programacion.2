public class Usuarios extends Telefonia {
    int portabilidad;
    int saldo;
    int llamadas;
    int mensajeTexto;
    int[] numero = new int[10];
    char[] nombre = new char[50];

    public static int saldo(int saldo, int numero[]) {
        if (saldo % 10 >= 0) {
            System.out.println("No es posible realizar recarga");
        }
        switch (saldo) {
            case saldo == 100:
                Telefonia.Paquete1();
            case saldo == 150:
                Telefonia.Paquete2();
            case saldo == 200:
                Telefonia.Paquete3();
        }

        return saldo;

    }

}
