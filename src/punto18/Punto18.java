/*
. Diseñar una clase Nombre que contenga tres atributos: nombre, primer_apellido y
segundo_apellido, un constructor y dos funciones miembro: Leer_nombre(), que obtiene
valores para los atributos de la clase, y Mostrar_nombre() que ofrece la visualización del
nombre completo.
Diseñar otra clase derivada llamada Dirección que tome la información de nombre y añada
calle, ciudad, provincia y código postal. Esta clase debe tener acceso a las funciones públicas
de la clase base, además, definir tres funciones miembro: Nueva_dirección, Nuevo_nombre()
y Mostrar(). Escribir un programa que cree un objeto de dirección, lea los datos y visualice
la información.
 */
package punto18;

/**
 *
 * @author Usuario
 */
public class Punto18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion address = new Direccion("Esteban");
        address.Leer_nombre();
        address.Mostrar_nombre();
        address.Nuevadireccion();
        address.Nuevonombre();
        address.Mostrar();
    }
    
}
