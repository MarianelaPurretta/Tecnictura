package clase7;

public class clase7 {

    public static void main(String[] args) {
         int num1 = 5, num2 = 4;
         var solucion = num1 + num2;
         System.out.println("solucion suma= " + solucion);
         
         solucion = num1 - num2;
         System.out.println("solucion resta= " + solucion);
         
         solucion = num1 * num2;
         System.out.println("solucion multiplicacion= " + solucion);
         
         solucion = num1 / num2;
         System.out.println("solucion division= " + solucion);
         
         var solucion2 = 3.4D / num2;
         System.out.println("solucion2 resultado del la division= " + solucion2);
         
         solucion = num1 % num2; //residuo
         System.out.println("solucion = " + solucion);
         
         if (num1 % 2 == 0)
             System.out.println("Es un número par");
         else
             System.out.println("Es un numero impar");

        //OPERADOR DE ASIGNACION
         int varNum1 = 1, varNum2 = 4;
         int varNum3 = varNum1 + 6 - varNum2;
         System.out.println("varNum3 = " + varNum3);
         
         varNum1 += 1; //operador de composición para incrementar en 1
         System.out.println("varNum1 = " + varNum1);
         
         //-=, *=, /=, %=, para hacer nosotros
         
         // -=:
         varNum2 -= 1;
         System.out.println("varNum2 = " + varNum1);
         
        // *=:
        varNum3 *= 4;
        System.out.println("varNum3 = " + varNum3);
        
        // /=;
        varNum2 /= 1;
        System.out.println("varNum2 = " + varNum2);
        
        // %=:
        varNum2 %= 3;
        System.out.println("varNum2 = " + varNum3);
        //Clase8 OPERADORES UNARIOS
        
        
    }

}
