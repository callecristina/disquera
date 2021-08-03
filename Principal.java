
package com.disquera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yo
 */
public class Principal {
    public static void main(String[] args) {
        
    ArrayList<Cantante> listacantantes;
    listacantantes = new ArrayList<>();
    
     System.out.println("Bienvenido");
     System.out.println("presione cualquier número diferente a cero para comenzar");
    Scanner scn = new Scanner(System.in);
    int opcion =scn.nextInt();
        
    while (opcion!=0){
    System.out.println("Para crear un cantante presione 1");
    System.out.println("Para crear un disco presinone 2");
    System.out.println("Para gregar un disco a un cantante presione 3");
    System.out.println("Para salir presione 0");
    
    int opcion =scn.nextInt();

    //Scanner scn1 = new Scanner(System.in);
    switch (opcion){
        case 1:
        System.out.println("Escriba el nombre del cantante");
        String nombre=scn.next();
        System.out.println("Escriba el id del cantante");
        String id=scn.next();
        Cantante cantante;
        cantante=new Cantante(nombre,id);
        listacantantes.add(cantante);
        System.out.println("se creo el cantante " + nombre + " con el id " + id); 
        break;
        
        case 2:
        System.out.println("Escriba el nombre del disco");
        String nombredisco=scn.next();
        System.out.println("Escriba el id del disco");
        String iddisco=scn.next();
        System.out.println("Escriba el numero de ventas");
        int ventas=scn.nextInt();
        Disco disco=new Disco(nombredisco,iddisco,ventas);
        System.out.println("se creo el disco " + nombredisco + " con el id " + iddisco);
        break;
        
        case 3:
        System.out.println("Escriba el nombre del cantante");
        String nombre1=scn.next();
        System.out.println("Escriba el id del cantante");
        String id1=scn.next();
        Cantante cantante1;
        cantante1=new Cantante(nombre1,id1);
        listacantantes.add(cantante1);
        System.out.println("Escriba el nombre del disco");
        String nombredisco1=scn.next();
        System.out.println("Escriba el id del disco");
        String iddisco1=scn.next();
        System.out.println("Escriba el numero de ventas");
        int ventas1=scn.nextInt();
        Disco disco1=new Disco(nombredisco1,iddisco1,ventas1);
        cantante1.agregardisco(disco1);
        System.out.println("se agrego " + disco1.nombre + " al cantante" + cantante1.nombre); 
        break;
        
        
        
                      }}
    
    
    
    
    
        

    
   /* Disco disco1;
        disco1 = new Disco("exitos de Juan","id001Jd",10);
    
    Disco disco2;
    disco2 = new Disco("Disco de Juan","id001Jd2",5);
    
    Disco disco3;
    disco3=new Disco("Disco de Juan2", "id001J2d",8);
    
    juan.agregardisco(disco1);
    juan.agregardisco(disco2);
    juan2.agregardisco(disco3);
    
    int sjuan=juan.contarventas();
    System.out.println(sjuan);
*/

    
    
}
}



