package Trabajo;


public class Aseguradora {
    
    Cliente cliente=new Cliente();
    Bien bien=new Bien();
    
    public Aseguradora(){
    }

    public Aseguradora(Cliente cliente, Bien bien) {
        this.bien=bien;
        this.cliente=cliente;
    }
    
    public Oferta calcularOferta(){
        return new Oferta("",0,0);
    }
    
    

    
    

    
}
