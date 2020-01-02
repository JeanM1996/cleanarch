/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.usecase;

import domain.entities.CuentaGrupo;
import domain.entities.CuentaIndividual;
import domain.entities.Cuentas;
import domain.entities.InforCuenta;

/**
 *
 * @author Jean Paul Mosquera Arevalo
 */
public class AdministracionCuenta implements IAdministraconCuenta {


    @Override
    public Cuentas asignarCuentas(CuentaGrupo padreCuenta, Cuentas hijoCuenta) {
       padreCuenta.add(hijoCuenta);
       return padreCuenta;
    }

    @Override
    public CuentaIndividual crearCuentaIndividual(InforCuenta cuenta) {
       return new CuentaIndividual(cuenta);
    }

    @Override
    public CuentaGrupo crearCuentaGrupo(InforCuenta cuenta) {
        return new CuentaGrupo(cuenta);
    }

 
    
}
