package guia3.ej2;

import java.time.LocalDate;

public class Empleado {

    private String nombre;
    private String apellido;
    private LocalDate fechaIngreso;
    private int dni;

    public Empleado(String nombre, String apellido, LocalDate fechaIngreso, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
