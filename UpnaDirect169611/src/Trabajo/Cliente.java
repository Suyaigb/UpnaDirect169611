package Trabajo;

public class Cliente {
    public String nombre;
    public int annoNacimiento;
    public float salario;

    public Cliente(String nombre, int annoNacimiento, float salario) {
        this.nombre = nombre;
        if (annoNacimiento <= 1900 || annoNacimiento > 2024) {
            throw new IllegalArgumentException("Año de nacimiento no válido.");
        }
        this.annoNacimiento = annoNacimiento;
        this.salario = salario;
    }
    
    public Cliente(){
    }
    
    
    
    
}
