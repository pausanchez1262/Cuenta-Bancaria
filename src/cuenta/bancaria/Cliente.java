/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.bancaria;

/**
 *
 * @author javier
 */
public class Cliente {
    private String nombre;
    private String cedula;
    private Cuenta cuenta;
    
    public Cliente(String nombre, String cedula ){
        this.nombre = nombre;
        this.cedula = cedula;
        cuenta = new Cuenta( cedula );
    }
}
