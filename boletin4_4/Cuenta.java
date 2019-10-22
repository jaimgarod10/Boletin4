
package boletin4_4;


public class Cuenta {
    
    String nombre, cuenta;
    double interes, saldo;

    public Cuenta(String nombre, String cuenta, double interes, double saldo) {
        
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConta(String couenta) {
        this.cuenta = cuenta;
    }

    public void setInterese(double interese) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double Ingreso(double ingreso){
    this.saldo = saldo + ingreso ;
    return saldo;    
    }
    public double Reintegro(double reintegro){
    this.saldo = saldo - reintegro;
    return saldo;
    }
   public void transferencia(Cuenta cuentaDestino, double importe){
        this.saldo = this.saldo - importe;
        cuentaDestino.setSaldo(cuentaDestino.getSaldo() + importe);

}

}
