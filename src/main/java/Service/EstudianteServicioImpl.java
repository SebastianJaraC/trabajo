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
public class EstudianteServicioImpl implements EstudianteService {
    
    private List<Estudiante> estudianteList;

    public EstudianteServicioImpl() {
        this.estudianteList= new ArrayList<>();
    }

    @Override
    public void crear(Estudiante estudiante) {
        this.estudianteList.add(estudiante);
    }

    @Override
    public void modificar(int codigo, Estudiante estudianteModificado) {
        var indice=0;
        
        this.estudianteList.set(indice, estudianteModificado);
    
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var estudiante:this.estudianteList){
            if(estudiante.getCodigo()==codigo){
                this.estudianteList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public List<Estudiante> listar() {
        return this.estudianteList;
    }
    
  
    
    
    
    
}