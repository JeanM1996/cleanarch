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
public interface IAdministraconCuenta {
    public CuentaIndividual crearCuentaIndividual(InforCuenta cuenta);
    public CuentaGrupo crearCuentaGrupo(InforCuenta cuenta);
    public Cuentas asignarCuentas (CuentaGrupo padreCuenta,Cuentas hijoCuenta);
}
