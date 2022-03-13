
package guia9_ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Guia9_Ej2 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingresar los datos de la lavadora: ");
//        Lavadora lavadora = new Lavadora();
//        lavadora.crearlavadora();
//        lavadora.precioFinalLav();
//        
//        System.out.println(lavadora);
//        
//        System.out.println("Ingrese los datos de la televisión: ");
//        Televisor televisor = new Televisor();
//        televisor.crearTelevisor();
//        televisor.precioFinalTv();
//        
//        System.out.println("El precio final de la lavadora es: $"+lavadora.getPrecio());
//        System.out.println("El precio final del televisor es: $"+televisor.getPrecio());
        
        List <Electrodomesticos> electrodomesticos = new ArrayList();
        
        Lavadora l1 = new Lavadora (10, 1000d, "Blanco", "A", 50d);
        Lavadora l2 = new Lavadora (15, 1000d, "Azul", "C", 60d);
        Televisor t1 = new Televisor (32d, 1000d, "Gris", "D", 10d);
        Televisor t2 = new Televisor (43d, 1000d, "Negro", "F", 15d);
        
        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        electrodomesticos.add(t1);
        electrodomesticos.add(t2);
        
        double sumaTotal = 0;
        double sumaLav = 0;
        double sumaTv = 0;
        
        
        //   Clase              aux                  lista
        for (Electrodomesticos electrodomestico : electrodomesticos) {
           
            if (electrodomestico instanceof Lavadora){
                ((Lavadora) electrodomestico).precioFinalLav();
                sumaLav += electrodomestico.getPrecio();
            }
            if (electrodomestico instanceof Televisor){
                ((Televisor) electrodomestico).precioFinalTv();
                sumaTv += electrodomestico.getPrecio();
            }
            
            sumaTotal += electrodomestico.getPrecio();  
        }
        System.out.println("El precio final de las Lavadoras es: " + sumaLav);    
        System.out.println("El precio final de los Televisores es: " + sumaTv);
        System.out.println("El precio total de los electrodomésticos es: " + sumaTotal);
           
       
        
        
       
        
        
    }            
}
