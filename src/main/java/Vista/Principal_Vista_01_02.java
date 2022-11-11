/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Estudiante;
import Modelo.Carrera;
import Modelo.Jugador;
import Service.EstudianteService;
import Service.JugadorService;
import java.time.LocalDate;

public class Principal_Vista_01_02 {

    public static void main(String[] args) {
        /*
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
        /*
        
         */

        var enner = new Jugador("Enner Valencia", 80, 175, LocalDate.of(1998, 02, 01));
        var byron = new Jugador("Byron Castillo", 80, 175, LocalDate.of(1998, 02, 01));
        var dominguez = new Jugador("Dida Dominguez", 80, 175, LocalDate.of(1998, 02, 01));
        var galindez = new Jugador("Hernán Galindez", 80, 175, LocalDate.of(1998, 02, 01));
        var baseDatosJugadores = new JugadorService();
        
      
       

        baseDatosJugadores.crear(enner);
        baseDatosJugadores.crear(byron);
        baseDatosJugadores.crear(dominguez);
        baseDatosJugadores.crear(galindez);
        System.out.println(baseDatosJugadores.listar());
        baseDatosJugadores.eliminarPorPosicion(1);
        System.out.println(baseDatosJugadores.listar());

        
        
        var sebastian = new Estudiante("0107339608", "Sebastian Jara ", LocalDate.of(2002, 11, 21));
        var juan = new Estudiante("0103453454", "Juan Arias", LocalDate.of(2003, 05, 10));
        var ricardo = new Estudiante("0123123124", "Ricardo Martinez", LocalDate.of(2000, 02, 01));
        var maria = new Estudiante("0123123132","Maria Galindez", LocalDate.of(2001, 02, 01));
        
        var baseDatosEstudiantes = new EstudianteService();
        baseDatosEstudiantes.crear(sebastian);
        baseDatosEstudiantes.crear(juan);
        baseDatosEstudiantes.crear(ricardo);
        baseDatosEstudiantes.crear(maria);
        
        
        System.out.println(baseDatosEstudiantes.listar());
        baseDatosEstudiantes.eliminarPorPosicion(1);
        System.out.println(baseDatosEstudiantes.listar());
        
        System.out.println();
    }

}
