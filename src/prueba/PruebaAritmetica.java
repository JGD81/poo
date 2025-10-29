package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
        // ============================
    // MÉTODO PRINCIPAL (main)
    // ============================
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var aritmetica1 = new Aritmetica(5,7);
       
        aritmetica1.sumar();  
        aritmetica1.restar(); 
        System.out.println(); 
    }
}
