/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean Paul Mosquera Arevalo
 */
public class CuentaGrupo implements Cuentas{
    InforCuenta datos;
    public List<Cuentas> children;
    @Override
    public Cuentas add(Cuentas cuenta) {
        this.children.add(cuenta);
        return this.children.get(this.children.size()-1);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cuentas getChild(int index) {
        return this.children.get(index);
    }

    @Override
    public double getSaldo() {
        return this.datos.getSaldo();
    }

    @Override
    public void remove(Cuentas cuenta) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CuentaGrupo(InforCuenta datos) {
        this.datos = datos;
        this.children = new ArrayList<>();
    }
    
    
    
}
