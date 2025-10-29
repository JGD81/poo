public class PersonaPoo {
    /**
     * Definición de atributos de la persona
    */
    
    String nombre;
    int edad;
    String direccion;
    String apellidos;
    String dni;
    String telefono;
    String profesion;
    int añosExperiencia;

    /**
     * Definición del comportamiento de la persona
     */

    public PersonaPoo (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + " y edad: " + this.edad + ", y la dirección es " + this.direccion);
    }

    public void setDireccion (String direccion){
        this.direccion = direccion;
    }

    public int getEdad() {
        return this.edad;
    }
}

