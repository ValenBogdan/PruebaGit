
package guia9_ej2;

import java.util.Scanner;


public class Electrodomesticos {

 protected Double precio;
 protected String color;
 protected String ConsumoEnergetico;
 protected Double peso;

 Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, String ConsumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.ConsumoEnergetico = ConsumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public void setConsumoEnergetico(String ConsumoEnergetico) {
        this.ConsumoEnergetico = ConsumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
 
 
    //Método comprobarConsumoEnergetico(char letra): comprueba que la letra
    //es correcta, sino es correcta usara la letra F por defecto. Este método se debe
    //invocar al crear el objeto y no será visible.
    public void comprobarConsumoEnergetico(){
        String tipoConsumo = ("A"+"B"+"C"+"D"+"E");
        if (!tipoConsumo.contains(ConsumoEnergetico)) {
          ConsumoEnergetico = "F";
        }
        
    }
    public void comprobarColor(){
       String colorDisponible = ("NEGRO"+"ROJO"+"AZUL"+"GRIS");
        if (!colorDisponible.contains(color)) {
          color = "Blanco"; 
    }
    }
    public void crearElectrodomestico() {
        
        precio = 1000.0;
        System.out.println("Ingrese color: ");
        color = leer.next().toUpperCase();
        comprobarColor();
        System.out.println("Ingrese el consumo energético del electrodoméstico");
        System.out.println("Válidos: A-B-C-D-E-F ");
        ConsumoEnergetico = leer.next().toUpperCase();
        comprobarConsumoEnergetico();
        System.out.println("Ingrese peso del elctrodoméstico: ");
        peso = leer.nextDouble();
        
    }
    
    public void precioFinal(){
        
        switch (ConsumoEnergetico){
            case "A":
                precio = precio +1000;
                break;
            case "B":
                precio = precio +800;
                break;
            case "C":
                precio = precio +600;
                break;
            case "D":    
                precio = precio +500;
                break;
            case "E":
                precio = precio +300;
                break;
            case "F": 
                precio = precio +100;
                break;
        }
         if (peso > 79) {
            precio = precio + 200;
        }

        if (peso > 49) {
            precio = precio + 300;
        }
        if (peso > 19) {
            precio = precio + 400;
        }
        if (peso >= 1) {
            precio = precio + 100;
        }

    }
}
