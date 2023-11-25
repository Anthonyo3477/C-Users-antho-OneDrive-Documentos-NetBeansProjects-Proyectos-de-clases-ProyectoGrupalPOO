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
public class Admin {

    private String nombre;
    private String rutAdmin;
    private LocalDate fechaNacimiento;
    private String direccion;
    private int telefono;

    public Admin() {
    }

    public Admin(String nombre, String rutAdmin, LocalDate fechaNacimiento, String direccion, int telefono) {
        this.nombre = nombre;
        this.rutAdmin = rutAdmin;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutAdmin() {
        return rutAdmin;
    }

    public void setRutAdmin(String rutAdmin) {
        this.rutAdmin = rutAdmin;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
        return "Admin{" + "nombre=" + nombre + ", rutAdmin=" + rutAdmin + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.rutAdmin);
        hash = 67 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 67 * hash + Objects.hashCode(this.direccion);
        hash = 67 * hash + this.telefono;
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
        final Admin other = (Admin) obj;
        if (this.telefono != other.telefono) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.rutAdmin, other.rutAdmin)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return Objects.equals(this.fechaNacimiento, other.fechaNacimiento);
    }

}
