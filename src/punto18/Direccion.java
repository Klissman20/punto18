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
public class Direccion extends Nombre{
    private String calle,ciudad,provincia,numpostal;
    Scanner lector;
    
    public Direccion (String nombre){
        super(nombre);
    }
    
    public void Nuevadireccion(){
        lector = new Scanner(System.in);
        System.out.println("Nueva direccion");
        System.out.println("Ingrese calle: ");
        calle=lector.next();
        System.out.println("Ingrese ciudad: ");
        ciudad=lector.next();
        System.out.println("Ingrese provincia: ");
        provincia=lector.next();
        System.out.println("Ingrese #postal: ");
        numpostal=lector.next();            
    }
    public void Nuevonombre(){
        System.out.println("Digite el nuevo nombre: ");
        nombre = lector.next();
    }
    public void Mostrar(){
        System.out.println("La direccion es: "+calle+" "+ciudad+" "+provincia+" "+numpostal);    
    }
}
