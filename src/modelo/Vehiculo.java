/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author antho
 */
public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private LocalDate añoAuto;
    private String descripcionAuto;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, LocalDate añoAuto, String descripcionAuto) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.añoAuto = añoAuto;
        this.descripcionAuto = descripcionAuto;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAñoAuto() {
        return añoAuto;
    }

    public void setAñoAuto(LocalDate añoAuto) {
        this.añoAuto = añoAuto;
    }

    public String getDescripcionAuto() {
        return descripcionAuto;
    }

    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.patente);
        hash = 97 * hash + Objects.hashCode(this.marca);
        hash = 97 * hash + Objects.hashCode(this.modelo);
        hash = 97 * hash + Objects.hashCode(this.añoAuto);
        hash = 97 * hash + Objects.hashCode(this.descripcionAuto);
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
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.patente, other.patente)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.descripcionAuto, other.descripcionAuto)) {
            return false;
        }
        return Objects.equals(this.añoAuto, other.añoAuto);
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1oAuto=" + añoAuto + ", descripcionAuto=" + descripcionAuto + '}';
    }

}
