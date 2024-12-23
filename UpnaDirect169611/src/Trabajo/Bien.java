package Trabajo;

public class Bien {

    String tipo;
    int valor;

    public Bien(String tipo, int valor) {
        if (tipo.equalsIgnoreCase("VEHICULO") && valor > 50000) {
            throw new IllegalArgumentException("El valor del vehículo no puede superar los 50,000€.");
        } else if (tipo.equalsIgnoreCase("VIVIENDA") && valor < 50000) {
            throw new IllegalArgumentException("El valor de la vivienda no puede ser inferior a 50,000€.");
        }
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public Bien(){
    }
    
    
}
