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
public class Cliente {

    private String rutCliente;
    private String nombre;
    private LocalDate fecha_n;
    private String direccion;
    private int telefono;

    public Cliente() {
    }

    public Cliente(String rutCliente, String nombre, LocalDate fecha_n, String direccion, int telefono) {
        this.rutCliente = rutCliente;
        this.nombre = nombre;
        this.fecha_n = fecha_n;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(LocalDate fecha_n) {
        this.fecha_n = fecha_n;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rutCliente=" + rutCliente + ", nombre=" + nombre + ", fecha_n=" + fecha_n + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.rutCliente);
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.fecha_n);
        hash = 17 * hash + Objects.hashCode(this.direccion);
        hash = 17 * hash + this.telefono;
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
        final Cliente other = (Cliente) obj;
        if (this.telefono != other.telefono) {
            return false;
        }
        if (!Objects.equals(this.rutCliente, other.rutCliente)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return Objects.equals(this.fecha_n, other.fecha_n);
    }

}
