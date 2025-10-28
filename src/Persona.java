// Definición de la clase Persona
// Una clase es una plantilla que describe las características y 
// comportamientos de un tipo de objeto.

public class Persona {

    // Atributos (propiedades) de la clase Persona
    // Guardan la información que define a cada objeto Persona.
    String nombre;
    String apellido;

    // Método de la clase (comportamiento)
    // Este método muestra por pantalla los valores de los atributos del objeto.
    void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    // Método principal main
    // Es el punto de entrada del programa: el primero que se ejecuta al iniciar el programa.
    public static void main(String[] args) {
        
        // Muestra un mensaje inicial en la consola
        System.out.println("***Creación de Clase y Objetos Persona***");

        // Crea un nuevo objeto de tipo Persona llamado 'objeto1'
        // 'var' permite que Java deduzca automáticamente el tipo (en este caso, Persona)
        var objeto1 = new Persona();

        // Asigna valores a los atributos del objeto
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";

        // Llama al método mostrarPersona() para imprimir los datos del objeto
        objeto1.mostrarPersona();
    }
}
