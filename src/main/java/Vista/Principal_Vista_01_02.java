/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Estudiante;
import Modelo.Carrera;
import Modelo.Jugador;
import Service.EstudianteService;
import Service.EstudianteServicioImpl;
import Service.JugadorService;
import Service.JugadorServicioImpl;
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

       var enner = new Jugador(10,"Enner Valencia",80,175,LocalDate.of(1998, 02, 01));
       var byron = new Jugador(20,"Byron Castillo",80,175,LocalDate.of(1997, 02, 01));
       var dominguez = new Jugador(30,"Dida Dominguez",80,175,LocalDate.of(1996, 02, 01));
       var galindez = new Jugador(40,"Ernan Galindez",80,175,LocalDate.of(1999, 02, 01));
       var galindezNuevo = new Jugador(40,"Hernán Galindez",80,175,LocalDate.of(1990, 02, 01));
       
       var martina = new Estudiante(10,"012376675","Martina Valencia",LocalDate.of(2002, 02, 01));
       var daniel = new Estudiante(20,"01231823913","Daniel Castillo",LocalDate.of(2000, 02, 01));
       var javier = new Estudiante(30,"01231867867","Javier Dominguez",LocalDate.of(1999, 02, 01));
       var sofia = new Estudiante(40,"012987789","Sophia Galindez",LocalDate.of(2000, 02, 01));
       var sofiaNuevo = new Estudiante(40,"012987789","Sofia Galindez",LocalDate.of(2001, 02, 01));
       
       var jugadorDB = new JugadorServicioImpl();
       jugadorDB.crear(enner);
       jugadorDB.crear(byron);
       jugadorDB.crear(dominguez);
       jugadorDB.crear(galindez);
       System.out.println(jugadorDB.listar());
       jugadorDB.eliminar(20);
       jugadorDB.eliminar(30);
       System.out.println(jugadorDB.listar());
       jugadorDB.modificar(40, galindezNuevo);
       System.out.println(jugadorDB.listar());
       
       var estudianteDB = new EstudianteServicioImpl();
       estudianteDB.crear(martina);
       estudianteDB.crear(daniel);
       estudianteDB.crear(javier);
       estudianteDB.crear(sofia);
       System.out.println(estudianteDB.listar());
       estudianteDB.eliminar(20);
       estudianteDB.eliminar(30);
       System.out.println(estudianteDB.listar());
       estudianteDB.modificar(40, sofiaNuevo);
       System.out.println(estudianteDB.listar());
       
        
       
       
       
        
        
    }

  
    
}