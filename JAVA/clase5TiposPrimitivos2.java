package clase5;

public class clase5TiposPrimitivos2 {
    
    public static void main(String[] args) {

        //CLASE5 TIPOS PRIMITIVOS
        //Inferencia tipo var y tipo primitivo
        /* var numEntero = 20; //las literales sin punto son por default int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F;// colocamos "F" para que reconozca como float
        System.out.println("numFloat = " + numFloat);
        //ejecutamos paso a paso 
        var numDouble = 10.0; 
        System.out.println("numDouble = " + numDouble);*/
        //TIPOS char
        char miVariableChar = 'a'; //tipo char es con comolla simple '' solo un caracter
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter1 = '\u0024'; //indicamos a java la signacion con cod unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        char varCaracterDecimal1 = 36; //val decimal del juego de car unicode
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        char varCaracterSimbolo1 = '$'; //caracter especial copy-paste desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        var varCaracter = '\u0024'; //indicamos a java la signacion con cod unicode
        System.out.println("varCaracter = " + varCaracter);
        var varCaracterDecimal = (char) 36; //val como entero y asigna int con (char) lo convertimos
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        var varCaracterSimbolo = '$'; //caracter especial copy-paste desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);//muestra el valor decimal asociado al simbolo
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
        
    }
    
}
