/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author antho
 */
public class autoMotorizado extends Vehiculo{

    private String patente;
    private int tipoAuto;

    public autoMotorizado(String patente, int tipoAuto) {
        this.patente = patente;
        this.tipoAuto = tipoAuto;
    }

    public autoMotorizado() {
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(int tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    @Override
    public String toString() {
        return "autoMotorizado{" + "patente=" + patente + ", tipoAuto=" + tipoAuto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.patente);
        hash = 47 * hash + this.tipoAuto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final autoMotorizado other = (autoMotorizado) obj;
        if (this.tipoAuto != other.tipoAuto) {
            return false;
        }
        return Objects.equals(this.patente, other.patente);
    }

}
