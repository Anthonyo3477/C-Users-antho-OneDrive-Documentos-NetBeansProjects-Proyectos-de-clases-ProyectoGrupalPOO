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
public class autoNoMotorizado extends Vehiculo{

    private int tipoAuto;
    private String patente;

    public autoNoMotorizado(int tipoAuto, String patente) {
        this.tipoAuto = tipoAuto;
        this.patente = patente;
    }

    public autoNoMotorizado() {
    }

    public int getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(int tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "autoNoMotorizado{" + "tipoAuto=" + tipoAuto + ", patente=" + patente + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.tipoAuto;
        hash = 59 * hash + Objects.hashCode(this.patente);
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
        final autoNoMotorizado other = (autoNoMotorizado) obj;
        if (this.tipoAuto != other.tipoAuto) {
            return false;
        }
        return Objects.equals(this.patente, other.patente);
    }

}
