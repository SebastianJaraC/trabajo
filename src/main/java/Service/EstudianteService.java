/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB-2
 */
public class EstudianteService {
    private List<Estudiante> estudianteList;

    public EstudianteService() {
        this.estudianteList= new ArrayList<>();
    }
    
    public void crear(Estudiante jugador){
        this.estudianteList.add(jugador);
    }
    public List<Estudiante> listar(){
        return this.estudianteList;
    }
    
    public void eliminarPorPosicion(int posicion){
        this.estudianteList.remove(posicion);
    }
    
    
    
}
