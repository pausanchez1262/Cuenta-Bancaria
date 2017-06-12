package cuenta.bancaria;

public class CDT {
    private double SaldoCDT;
    private double montoInicial;
    private double Interes;
    
    public CDT(double montoInicial){
        this.montoInicial = montoInicial;
    }

    public double cerrarCdt( )
    {
        double saldo = SaldoCDT;
        SaldoCDT = 0;
        Interes = 0;
        
        return saldo;
    }
    
}
