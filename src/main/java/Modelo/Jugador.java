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
public class Jugador {

    private String nombre;
    private double peso;
    private int estatura;
    private LocalDate fechaNacimiento;
  
    
    public Jugador(String nombre, double peso, int estatura, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.fechaNacimiento = fechaNacimiento;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private int calcularEdad() {
        
        var yearActual = LocalDate.now().getYear();
        var mesActual = LocalDate.now().getMonthValue();
        var diaActual = LocalDate.now().getDayOfMonth();

        
                
        return yearActual - this.fechaNacimiento.getYear()
                + mesActual - this.fechaNacimiento.getMonthValue()
                + diaActual - this.fechaNacimiento.getDayOfMonth();
        
    
    }
    private LocalDate edad = calcularEdad{

}
            
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", peso=" + peso
                + ", estatura=" + estatura + ", fechaNacimiento="
                + fechaNacimiento + ", edad=" + calcularEdad +'}';
    }

}
