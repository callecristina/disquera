
package com.disquera;

import java.util.ArrayList;

/**
 * @author yo
 */
public class Cantante {
    
    public String nombre;
    public String id;
    public ArrayList<Disco> listadiscos=new ArrayList<>();
    
    

    
    public Cantante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public void agregardisco(Disco disco){
        this.listadiscos.add(disco);
    }
    
    public int contarventas(){
        int s=0;
        for(Disco disco : listadiscos){
            s+=disco.ventas;          
        }
    return s;
           
    }
    
    
}
