package POO;

//Librerías para el uso de list (Ejercicio 4.2)
import java.util.*;

public class Biblioteca {
    //Atributos de la clase
    private String nombre;
    private String direccion;
    private int horaApertura;
    private int horaCierre;
    //Atributos para añadir colecciones de objetos (Ejercicio 4.2)
    private List<Libro> libros; 
    private List<Sala> salas;

    //Constructor sin parámetros
    public Biblioteca() {
        System.out.println("Se ha creado una biblioteca sin datos.");
    }
    
    //Constructor con los parámetros (Horas ya definidas)
    public Biblioteca (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = 9;
        this.horaCierre = 22;
        //Inicializar listas en el constructor (Ejercicio 4.2)
        this.libros = new ArrayList<>();
        this.salas = new ArrayList<>();

    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public int getHoraApertura(){
        return horaApertura;
    }

    public int getHoraCierre (){
        return horaCierre;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setHoraApertura(int horaApertura){
        this.horaApertura = horaApertura;
    }

    public void setHoraCierre(int horaCierre){
        this.horaCierre = horaCierre;
    }

    //Métodos
    public void estaAbierta(int hora){
        if (hora >= this.horaApertura && hora <= this.horaCierre){
            System.out.println("La biblioteca está abierta");
        }else{
            System.out.println("La biblioteca está cerrada");
        }
    }

    public void esExtranjero(Libro libro){
        System.out.println("Comprobando el idioma del libro...");
        libro.esExtranjero();
    }

    public void mostrarInfo(){
        System.out.println("Biblioteca: "+ nombre + " - " + direccion + ". Abierto de " + horaApertura + " a " + horaCierre);
    }

    //Métodos para añadir y eliminar (Ejercicio 4.2)
    //Añadir libros
    public void addLibro(Libro libro){
        libros.add(libro);
        System.out.println("Se ha añadido el siguiente libro: " + libro.getTitulo());
    }

    //Eliminar libros
    public void removeLibro(Libro libro){
        if(libros.remove(libro)){
            System.out.println("Se ha eliminado el siguiente libro: " + libro.getTitulo());
        }else{
            System.out.println("El libro no estaba en la biblioteca");
        }
    }

    //Añadir salas (También en el ejercicio 4.4)
    public void addSala(Sala sala){
        salas.add(sala);
        System.out.println("Se ha añadido la siguiente sala: " + sala.getNombre());
    }

    //Eliminar salas
    public void removeSala(Sala sala){
        if(salas.remove(sala)){
            System.out.println("Se ha eliminado la siguiente sala: " + sala.getNombre());
        }else{
            System.out.println("La sala no se encontraba en la biblioteca");
        }
    }

    //Mostrar libros y salas disponibles (Ejercicio 4.2)
    //Libros
    public void mostrarLibros(){
        
        if (libros.isEmpty()){
            System.out.println("No se encuentran libros en la biblioteca");
        }else{
            System.out.println("Libros que se encuentran en la biblioteca: ");
            for (Libro libro : libros) {
                libro.mostrarInfo(); //Se aprovecha el método que ya está en la clase libro
            }
        }   
    }

    //Salas
    public void mostrarSalas(){
        if (salas.isEmpty()){
            System.out.println("No se encuentran salas en la biblioteca");
        }else{
            System.out.println("Salas que se encuentran en la biblioteca: ");
            for (Sala sala : salas) {
                sala.mostrarInfo();
            }
        }
    }

    //Buscar libro por título (Ejercicio 4.2)
    public Libro buscarLibroPorTitulo(String titulo){
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Se ha encontrado el libro: ");
                libro.mostrarInfo();
                return libro;
            }   
        }
        //El return null va fuera del if, para que el for 
        //recorra todos los libros. Si va dentro, comprueba
        //sólo el primer libro y si no es el buscado, sale
        //por el else y no busca más
        System.out.println("No se encontro el libro: " + titulo);
        return null; 
    }

    //Mostrar solo las salas que tienen 0 personas (Ejercicio 4.4.3)
    public void mostrarSalasDisponibles(){
        boolean esVacia = false;
        for (Sala sala : salas){
            if (sala.getNumeroPersonas() == 0){
                sala.mostrarInfo();
                esVacia = true;
            }
        }
        if (!esVacia){
            System.out.println("No hay salas disponibles");
        }
    }

    //Mostrar el total de personas de todas las salas (Ejercicio 5)
    public void mostrarTotalPersonas() {
    int totalPersonas = 0;
    for (Sala sala : salas) {
        totalPersonas += sala.getNumeroPersonas(); // Sumamos las personas de cada sala
    }
    System.out.println("Número total de personas en todas las salas: " + totalPersonas);
}





}
