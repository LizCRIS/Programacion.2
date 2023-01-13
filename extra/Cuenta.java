public class Cuenta {
    private String idTarjeta;
    private String nip;
    private String saldo;

    public void CrearCuenta(String idTarjeta, String saldo) {
        this.idTarjeta = idTarjeta;
        this.saldo = saldo;
    }

    public String getidTarjeta() {
        return idTarjeta;
    }

    public String getsaldo() {
        return saldo;
    }

    public void setidTarjeta() {
        this.idTarjeta = idTarjeta;
    }

    public void setsaldo() {
        this.saldo = saldo;
    }

    public void CrearPin(String idTarjeta, String nip) {
        this.nip = nip;
    }

    public String getnip() {
        return nip;
    }

    public void setnip() {
        this.nip = nip;
    }

    double cantidad;
    String concepto;
    String fecha;

    public void Deposito(double cantidad, String concepto, String fecha) {
        if (cantidad >= 0) {
            saldo += cantidad;
        }
    }

    public void Retiro(double cantidad, String concepto, String fecha) {
        if (cantidad >= 0) {
            saldo -= cantidad;
        }
    }

    public void CancelarCuenta(String idCuenta, String nip) {
        System.out.println("CUENTA CANCELADA");
    }
}