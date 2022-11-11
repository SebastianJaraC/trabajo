/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB-2
 */
public class JugadorService {
    
     private List<Jugador> jugadorList;

    public JugadorService() {
        this.jugadorList= new ArrayList<>();
    }
    
    public void crear(Jugador jugador){
        this.jugadorList.add(jugador);
    }
    public List<Jugador> listar(){
        return this.jugadorList;
    }
    
    public void eliminarPorPosicion(int posicion){
        this.jugadorList.remove(posicion);
    }
    
    
    
    
    

}
