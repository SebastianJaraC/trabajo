/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.ariasjarajunes;
import java.time.LocalDate;
/**
 *
 * @author LAB-2
 */
public class Atencion {
    
    private LocalDate fecha;
    private String veterinario;
    private double costo;
    private Mascota mascota;
    private int cantidadRecetas;
    Receta[] recetaList;

    public Atencion(LocalDate fecha, String veterinario, double costo, Mascota mascota, int cantidadRecetas, Receta[] recetaList) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.costo = costo;
        this.mascota = mascota;
        this.cantidadRecetas = cantidadRecetas;
        this.recetaList = recetaList;
    }
    public void newReceta(String medicina, int cantidad, String indicacion, int posicion){
    
    var receta = new Receta(medicina, cantidad ,indicacion, posicion);
    this.recetaList[posicion]=receta;
    
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getCantidadRecetas() {
        return cantidadRecetas;
    }

    public void setCantidadRecetas(int cantidadRecetas) {
        this.cantidadRecetas = cantidadRecetas;
    }

    public Receta[] getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(Receta[] recetaList) {
        this.recetaList = recetaList;
    }

    
    @Override
    public String toString() {
        return "Atencion{" + "recetaList=" + recetaList + '}';
    }
    
    
}
