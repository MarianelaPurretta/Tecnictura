
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {


//tienda de libros
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("Digite el ID del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envío es gratis: ");
        boolean envioGratis = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreLibro+" #"+idLibro);
        System.out.println("Precio del libro: $" + precioLibro);
        System.out.println("Envío del libro gratis: "+envioGratis);
               
        
    }
    
}

    

