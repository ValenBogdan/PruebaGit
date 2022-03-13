
package guia9_ej2;


public class Televisor extends Electrodomesticos {
   private Double resolucion;
   private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Double resolucion, Double precio, String color, String ConsumoEnergetico, Double peso) {
        super(precio, color, ConsumoEnergetico, peso);
        this.resolucion = resolucion;
        
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor (){
      
        System.out.println("Ingrese datos del Televisor: ");
        crearElectrodomestico();
        System.out.println("Ingrase el tamaño en pulgadas: ");
        resolucion = leer.nextDouble(); 
        System.out.println("¿El televisor tiene sintonizador?");
        if ((leer.next().toUpperCase().equals("S"))) {
            sintonizadorTDT = true;
        } 
    }
    
    @Override
    public String toString() {
        return "Electrodomestico Televisor: " + "\nResolucion= " + resolucion +
                "\nSintonizador TDT = " + sintonizadorTDT + "\nPrecio $" + 
                precio + "\nColor=" + color + "\nConsumo Energia=" + 
                ConsumoEnergetico + "\nPeso de televisor=" + peso;
    }
    
    public void precioFinalTv(){
        precioFinal();
        
        if (resolucion > 40) {
            precio = precio *1.3;
        }
        if (sintonizadorTDT) {
          precio = precio +200;  
        }
        
        
    }

}
