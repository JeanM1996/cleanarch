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
public interface Cuentas {
    public Cuentas add(Cuentas cuenta);
    public Cuentas getChild(int index);
    public double getSaldo();
    public void remove(Cuentas cuenta);
}
