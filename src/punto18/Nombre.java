/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto18;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Nombre {
    String  nombre;
    private String primer_apellido,segundo_apellido;
    Scanner lector;
    public Nombre(String n/*,String p,String s*/){
        nombre = n;
        //primer_apellido = p;
        //segundo_apellido = s;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void Leer_nombre(){
        lector = new Scanner(System.in);
        System.out.println("Ingrese el primer apellido: ");
        primer_apellido = lector.next();
        System.out.println("Ingrese el segundo apellido: ");
        segundo_apellido = lector.next();       
    }
    
    public void Mostrar_nombre(){
        System.out.println("El nombre completo es: "+nombre+" "+primer_apellido+" "+segundo_apellido);
    }
    //Nombre persona = new Nombre("Sebas");
}
