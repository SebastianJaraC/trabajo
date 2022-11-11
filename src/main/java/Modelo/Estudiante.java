/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author LAB-2
 */
public class Estudiante {

    private String cedula;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Estudiante(String cedula, String nombre, LocalDate fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

       private int calcularEdad(){
        var yearActual= LocalDate.now().getYear();
        var mesActual= LocalDate.now().getMonthValue();
        var diaActual= LocalDate.now().getDayOfMonth();
        
        
        return yearActual-this.fechaNacimiento.getYear()+
                mesActual-this.fechaNacimiento.getMonthValue()+
                diaActual-this.fechaNacimiento.getDayOfMonth();
        
        
    }
       
       
       
    @Override
    public String toString() {
        return "Estudiante{" + "cedula=" + cedula + ", nombre=" + nombre + '}';
    }
    
    
}

