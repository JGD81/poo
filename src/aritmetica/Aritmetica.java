package aritmetica;
public class Aritmetica {
    
    private int operando1; 
    private int operando2; 

    public Aritmetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    // Método que suma los dos operandos y muestra el resultado.
    public void sumar(){
        int resultado = this.operando1 + this.operando2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    // Método que resta el segundo operando al primero.
    public void restar(){
        var resultado = this.operando1 - this.operando2; // 'var' infiere tipo int
        System.out.println("Resultado Resta: " + resultado);
    }

    public int getOperando1(){
        return this.operando1;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }


}