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
public class InforCuenta {
    public int id;
    public String codigo;
    public String descripcion;
    public double saldo;

    public InforCuenta(int id, String codigo, String descripcion, double saldo) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.saldo=saldo;
    }

    public InforCuenta() {
                this.id = -1;
        this.codigo = "sn";
        this.descripcion = "sn";
        this.saldo=-1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
