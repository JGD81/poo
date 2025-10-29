package persona;

public class PruebaPersona {

    public static void main(String[] args) {

        System.out.println("*** Creación de Clase y Objetos Persona ***");

        Persona objeto1 = new Persona("Layla", "Acosta");
        
        objeto1.setNombre("Antonia");
        System.out.println(objeto1.getNombre());

        objeto1.mostrarPersona();   
    }
}
