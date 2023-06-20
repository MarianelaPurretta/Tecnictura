package clase8;

public class clase8 {

    public static void main(String[] args) {

        //CLASE 8: OPRERADORES UNARIOS:
        //cambio de signo
//        var varA = 7;
//        var varB = -varA;
//        System.out.println("varA = " + varA);
//        System.out.println("varB = " + varB);
//        //op negacion
//        var varC = true;
//        var varD = !varC; //! INVIERTE EL VALOR DE LA LIT
//        System.out.println("varC = " + varC);
//        System.out.println("varD = " + varD);
//        //op de incremento: preimcremento
//        var varE = 9;
//        var varF = ++varE;
//        System.out.println("varE = " + varE);
//        System.out.println("varF = " + varF);
//        // postincremento:
//        var varG = 3;
//        var varH = varG++;
//        System.out.println("varG = " + varG);
//        System.out.println("varH = " + varH);
//
//        //op unarios de decremento: PREDECREMENTO
//        var varI = 4;
//        var varJ = --varI;
//        System.out.println("varI = " + varI);
//        System.out.println("varJ = " + varJ);
//
//        //POSTDECREMENTO
//        var varK = 8;
//        var varL = varK--;
//        System.out.println("varK = " + varK);
//        System.out.println("varL = " + varL);
//
//        //OPERADORES DE IGUALDAD Y RELACIONALES
//        var aNum = 5;
//        var bNum = 4;
//        var cNum = (aNum == bNum);
//        System.out.println("cNum = " + cNum);
//
//        var dNum = aNum != bNum;//comparacion booleana de diferente
//        System.out.println("dNum = " + dNum);
//        var cadenaA = "Hello";
//        var cadenaB = "Bye";
//        var cVar = cadenaA == cadenaB;//comparacion referencias booleana si es igual o no
//        System.out.println("cVar = " + cVar);
//
//        var fVar = cadenaA.equals(cadenaB);//.equals metodo de comparacion tipo bool
//        System.out.println("fVar = " + fVar);
//
//        //OPERADORES RELACIONALEs (<=,>=,==,>, <,!=,
//        var gVar = aNum >= bNum;
//        System.out.println("gVar = " + gVar);
//
//        if (aNum % 2 == 0) {
//            System.out.println("El numero es par");
//        }else{
//            System.out.println("El numero es impar");
//            
//        var edad = 30;
//        var adulto = 18;
//        if (edad >=adulto){
//            System.out.println("Es mayor de edad");
//        }
//        else{
//            System.out.println("Es menor de edad");
//                    }
//
//        }
        //OPERADORES CONDICIONALES AND(&&) Y OR (||)
//        var valorA = 7;
//        var valorMin = 0;//rango de 0 a 10
//        var valorMax = 10;
//        var respuesta = valorA >= 0 && valorA <= 10;
//        if (respuesta) {
//            System.out.println("Esta dentro del rango");
//        }
//        else{
//            System.out.println("Esta fuera del rango");
//        }
//        
//        var vacaciones = true;
//        var diaLibre = false;
//        if(vacaciones || diaLibre){
//            System.out.println("Puede asistir al juego");
//        }
//        else{
//            System.out.println("No puede asistir al juego");
//        }
        //OPRERADOR TERNARIO:1ra parte segun condicion 2da verdadero 3ra o falso
//        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
//        System.out.println("resultadoT = " + resultadoT);
//        
//        var numeroT = 7;
//        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
//        System.out.println("resultadoT = " + resultadoT);  
        //prioridad de operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var solucionAritmetica = 4 + 5 * 6 / 3; //14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        //prioridad de parentesis
        solucionAritmetica = (4 + 5) * 6 / 3;//18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        

    }

}
