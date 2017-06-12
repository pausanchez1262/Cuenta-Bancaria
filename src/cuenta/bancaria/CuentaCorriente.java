package cuenta.bancaria;

public class CuentaCorriente {
    private double saldoCorriente;
    
    public CuentaCorriente(){
        saldoCorriente = 0;
    }
    
    public void sumarSaldo(double cantidad){
        saldoCorriente += cantidad;
    }
    
    public void depositarSaldo(double cantidad){
        saldoCorriente += cantidad;
    }
    
    public void retirarSaldo(double cantidad){
        if(cantidad > saldoCorriente)
            System.out.println("No tiene saldo suficiente");
        else
            saldoCorriente = saldoCorriente -= cantidad; 
    }
}
