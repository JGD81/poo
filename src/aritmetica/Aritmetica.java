package aritmetica;
public class Aritmetica {
    // Campos (atributos) del objeto: representan su estado interno
    int operando1; // primer número
    int operando2; // segundo número

    // ============================
    // CONSTRUCTOR VACÍO (sin parámetros)
    // ============================
    // Este constructor permite crear un objeto sin pasar valores iniciales.
    // Java asignará valores por defecto: 0 para los int.
    // Luego, el programador podrá asignar valores manualmente.
    public Aritmetica() {
        // No hace nada especial, pero permite la sobrecarga de constructores.
        // (Si no lo tuviéramos, solo podríamos crear objetos pasando dos números.)
    }

    // ============================
    // CONSTRUCTOR CON PARÁMETROS
    // ============================
    // Sobrecarga del constructor anterior.
    // Se ejecuta automáticamente al crear el objeto con dos valores enteros.
    public Aritmetica(int operando1, int operando2){
        System.out.println("Ejecutando constructor");

        // Asignamos los valores recibidos a los atributos del objeto.
        // Podríamos usar 'this.operando1 = op1;' para mayor claridad.
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


}