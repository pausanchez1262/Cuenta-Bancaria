package cuenta.bancaria;

public class Cuenta {
    private String numeroCuenta;
    private double saldoTotal;
    private CuentaAhorros cuentaAhorros;
    private CuentaCorriente cuentaCorriente;
    private CDT CDT;
    
    public Cuenta( String nm ){
        numeroCuenta = nm;
        saldoTotal = 0;
    }
    
    public void crearCdt(double montoInicial){
        CDT = new CDT(montoInicial);
    }
    
    public void cerrarCdt(){
        cuentaCorriente.sumarSaldo( CDT.cerrarCdt( ) );
    }
    
    public void depositarCorriente(double cantidad){
        cuentaCorriente.sumarSaldo(cantidad);
    }
}
