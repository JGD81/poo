package POO;

import java.util.*;

public class Sala {
    
    //Atributos
    private String nombre;
    private int capacidad;
    private boolean pizarra;
    private String tipo;
    private boolean disponibleReserva;
    //Atributo para añadir colecciones de objetos(Ejercicio 4.3)
    private List<PersonaPoo> personas;
    //Nuevos atributos (Ejercicio 5.1)
    private int aforoMaximo;
    private int numActualPersonas;
    private int tipoSala;

    //Constructor vacío
    public Sala(){
        System.out.println("Se ha creado una sala sin datos");
    }

    //Constructor con datos
    //Cambiamos el acceso al constructor (eliminamos el public), para que sea la clase Biblioteca
    //la que controle la creación de salas (Ejercicio 5.2)
    Sala (String nombre, int capacidad, boolean pizarra, String tipo, boolean disponibleReserva){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pizarra = pizarra;
        this.tipo = tipo;
        this.disponibleReserva = disponibleReserva;
        //Inicializar listas en el constructor (Ejercicio 4.3)
        this.personas = new ArrayList<>();
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public boolean getPizarra(){
        return pizarra;
    }

    public String getTipo(){
        return tipo;
    }

    public boolean getDisponibleReserva(){
        return disponibleReserva;
    }

    //Getter para saber el número de personas en sala necesario
    //para implementarlo en el método mostrarSalasDisponibles()
    //(Ejercicio 4.4.3)
    public int getNumeroPersonas(){
        return personas.size();
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public void setPizarra(boolean pizarra){
        this.pizarra = pizarra;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setDisponibleReserva(boolean disponibleReserva){
        this.disponibleReserva = disponibleReserva;
    }

    //Métodos
    public void estaDisponible(){
        if (disponibleReserva){
            System.out.println("La sala está disponible para su reserva");
        }else{
            System.out.println("La sala no está disponible para su reserva");
        }
    }

    public void tienePizarra(){
        if (pizarra){
            System.out.println("La sala dispone de pizarra");
        }else{
            System.out.println("La sala no dispone de pizarra");
        }
    }

    public void mostrarInfo(){
        System.out.println("Sala: " + nombre + " - " + capacidad + ". Se utiliza para " + tipo + ". Dispone de pizarra: " + pizarra + ". Está disponible: " + disponibleReserva);
        //Añadido para el punto 4.4.2
        System.out.println("Número de personas en la sala: " + personas.size());
    }

    //Añadir personas a la sala (Ejercicio 4.3)
    public void entrarPersona(PersonaPoo p){
        if(personas.size() < capacidad){//Comprueba cuánta gente hay en la sala
            personas.add(p);
            System.out.println(p.getNombre() + " entró en la sala " + nombre + ".");
        }else{
            System.out.println("La sala " + nombre + " está llena. No puede entrar más gente.");
        }
    }

    public void salirPersona(PersonaPoo p){
        if (personas.isEmpty()){//Comprueba si la sala está vacía
            System.out.println("No hay personas dentro de la sala para salir");
        }else if (personas.remove(p)){//Si no está vacía, elimina a la persona
            System.out.println(p.getNombre() + " se fue de la sala " + nombre);
        }else{
            System.out.println(p.getNombre() + " no se encontraba en la sala " + nombre);
        }
    }

    public void mostrarPersonas(){
        if(personas.isEmpty()){
            System.out.println("No hay personas en la sala " + nombre + ".");
        }else{
            System.out.println("Personas en la sala " + nombre + ":");
            for (PersonaPoo p : personas){
                p.mostrarInfo();
            }
        }
    }

}
