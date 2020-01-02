/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.entities;

/**
 *
 * @author Jean Paul Mosquera Arevalo
 */
public class CuentaIndividual implements Cuentas{
    InforCuenta datos;


    @Override
    public double getSaldo() {
        return this.datos.getSaldo();
    }

    @Override
    public Cuentas add(Cuentas cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cuentas getChild(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Cuentas cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CuentaIndividual(InforCuenta datos) {
        this.datos = datos;
    }

    
    
}
