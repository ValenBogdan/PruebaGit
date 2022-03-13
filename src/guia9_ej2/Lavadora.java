
package guia9_ej2;

import java.util.Scanner;


public class Lavadora extends Electrodomesticos{
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   private Integer carga;

    public Lavadora() {
    }

   public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Double precio, String color, String ConsumoEnergetico, Double peso) {
        super(precio, color, ConsumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

 

   @Override
    public String toString() {
        return "Electrodomestico Lavadora" + "\nCarga ropa KG = " + carga + "\nPrecio= $" + precio + "\nColor=" + color + "\nConsumo Energia=" + ConsumoEnergetico + "\nPeso de lavadora=" + peso;
    }


    
    public void crearlavadora(){
        System.out.println("Ingrese datos de la Lavadora: ");
        crearElectrodomestico();
        System.out.println("Ingrase la capacidad de carga en kilos");
        setCarga(leer.nextInt());
    }
    
    public void precioFinalLav(){
        if (carga > 30) {
            precio = precio +500; 
        }
        precioFinal();
        
    }
}
