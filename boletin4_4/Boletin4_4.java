
package boletin4_4;

public class Boletin4_4 {

    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta();
        cuenta.setSaldo(75);
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Reintegro: " + cuenta.Reintegro(30));

        Cuenta cuentaOrigen = new Cuenta();
        Cuenta cuentaDestino = new Cuenta();

        cuentaOrigen.setSaldo(200);
        cuentaDestino.setSaldo(90);
        System.out.println("Saldo Inicial Cuenta Origen: " + cuentaOrigen.getSaldo()
                + "\nSaldo Inicial Cuenta Destino: " + cuentaDestino.getSaldo());
        cuentaOrigen.transferencia(cuentaDestino, 30);
        System.out.println("Saldo Cuenta Origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo Cuenta Destino: " + cuentaDestino.getSaldo());
    }
    
}
    
