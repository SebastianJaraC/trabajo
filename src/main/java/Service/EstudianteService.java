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
public interface EstudianteService {
    public abstract void crear(Estudiante estudiante);

    public abstract void modificar(int codigo, Estudiante estudianteModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Estudiante> listar();
    
    
}
