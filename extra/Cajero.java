public class Cajero extends Cuenta{
    String historial;

    System.out.println("Bienvenido al cajero automatico de Liz  /n Menu");
    System.out.println("1;Realizar deposito /n 2; Realizar retiro /n ");

    @Override
    public void CrearCuenta(String idTarjeta, String saldo) {
        // TODO Auto-generated method stub
        super.CrearCuenta(idTarjeta, saldo);

    }

    @Override
    public void CrearPin(String idTarjeta, String nip) {
        // TODO Auto-generated method stub
        super.CrearPin(idTarjeta, nip);
    }
    
}
// esta vez si me falto tiempo profe, perdon :c, creo esta vez si iba bien