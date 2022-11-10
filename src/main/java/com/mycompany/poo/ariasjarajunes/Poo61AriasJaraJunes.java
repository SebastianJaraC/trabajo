/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo.ariasjarajunes;

/**
 *
 * @author LAB-2
 */
public class Poo61AriasJaraJunes {

    public static void main(String[] args) {
        
       var juan = new Dueño("0103667754","Juan Arias",3);
       
        juan.nuevoTelefono("0984357604", 0, "Móvil", "tuenti",0);
        juan.nuevoTelefono("074078385",2,"Casa","Etapa",1);
        juan.nuevoTelefono("074135250",1287,"Fijo IP","Etapa",2);
        
        System.out.println(juan.toString());
        
    }
    

}
