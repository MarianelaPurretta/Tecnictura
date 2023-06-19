package clase6;

import java.util.Scanner;


public class clase62 {

    public static void main(String[] args) {
        //CLASE6 TIPOS PRIMITIVOS BOOLEANOS
        /*var varBool = true;
        System.out.println("varBool = " + varBool);
        
        if (varBool) {
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        
        //ALGORITMO MAYOR DE EDAD
        var edad = 19; //en la literar tener presente la inferencia de tipos
        //var adulto = edad >= 18;
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }*/
        //CONVERSION DE TIPOS
        //funcion para convertir cadena a tipo int
//        var edad = Integer.parseInt("20"); //clase"Integer" llama al método "parseInt"
//        System.out.println("edad = " + (edad + 1)); //al concatenar se crea una suma
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
//        //ahora con la clase Scanner
//        //pedir valor
       /* var entrada = new Scanner(System.in); //in indica que se trabajará con la consola
//        System.out.println("Digite su edad: ");
//        edad = Integer.parseInt(entrada.nextLine());//no cionciden los tipos entonces colocamos el método parseInt
//        System.out.println("edad = " + edad);

        //convertir entero a str
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        //como recuperar caracter de una cadena
        var fraseChar = "programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);

        
        
        
    }
    

}
