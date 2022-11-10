/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Estudiante;
import Modelo.Carrera;

  
public class Principal_Vista_01_02 {

    public static void main(String[] args) {

        var mario = new Estudiante("543625716617", "Mario");
        var juanito = new Estudiante("257715676364", "Juanito");

        var tele = new Carrera("Ingenieria en telecomunicaciones", 8);
        tele.agregarEstudiante(mario);
        tele.agregarEstudiante(juanito);

        var elec = new Carrera("Ingenieria electronica", 8);
        elec.agregarEstudiante(mario);
        elec.agregarEstudiante(juanito);

        System.out.println(tele.toString());
        System.out.println(elec.toString());

    }

}
