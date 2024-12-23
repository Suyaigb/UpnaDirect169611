package Trabajo;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Bienvenidos a la web UpnaDirect, esperemos que encontreis una buena oferta!!!");
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        int anno=1;
        while(anno<= 1900 || anno > 2024){
            System.out.println("Introduce tu año de nacimiento: ");
            anno = teclado.nextInt();
        }
        teclado.nextLine();
        System.out.println("Introduce tu salario: ");
        float salario = teclado.nextFloat();
        teclado.nextLine();
        Cliente cliente=new Cliente(nombre,anno,salario);        
        String tipo="a";
        int a=2;
        while(a!=0 && a !=1){
            System.out.println( "Introduce tu tipo de bien: VEHICULO 0 ---- VIVIENDA 1 ");
            a =teclado.nextInt();
            switch (a){
                case 0:
                    tipo="VEHICULO";
                    break;
                case 1:
                    tipo="VIVIENDA";
                    break;
                default:
                    System.out.println("Numero incorrecto");
            }
        }
        int valor;
        if(a==0){
            valor=50001;
            while(valor>50000){
                System.out.println("Introduce el valor del bien:");
                valor=teclado.nextInt();
            }
        }else{
            valor=1;
            while(valor<50000){
                System.out.println("Introduce el valor del bien:");
                valor=teclado.nextInt();
            }
        }
        teclado.nextLine();
        Bien bien= new Bien(tipo,valor);
        Aseguradora aseguradoraM=new Mafro(cliente,bien);
        Aseguradora aseguradoraA=new Adasles(cliente,bien);
        Aseguradora aseguradoraL=new LineaIndirecta(cliente,bien);
        aseguradoraM.calcularOferta();
        aseguradoraA.calcularOferta();
        aseguradoraL.calcularOferta();
        
        Tecnico tecnico= new Tecnico(aseguradoraM.calcularOferta(), aseguradoraA.calcularOferta(), aseguradoraL.calcularOferta());
        System.out.println("La oferta más ventajosa es:");
        System.out.println(tecnico.seleccionarOfertaVentajosa().nombre+" | "+tecnico.seleccionarOfertaVentajosa().importe+" | "+tecnico.seleccionarOfertaVentajosa().comision);
    }
    
}
