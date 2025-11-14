package POO;

import java.util.*;

public class Sala {
    
    //Atributos
    private String nombre;
    //private int capacidad; Para evitar confusiones, eliminamos este atributo y
    //añadimos aforoMaximo (Ejercicio 5.1)
    private boolean pizarra;
    //private String tipo; Mismo motivo que capacidad, pero con tipoSala (Ejercicio 5.1)
    private boolean disponibleReserva;
    //Atributo para añadir colecciones de objetos(Ejercicio 4.3)
    private List<PersonaPoo> personas;
    //Nuevos atributos (Ejercicio 5.1)
    private int aforoMaximo;
    private int numActualPersonas;
    private String tipoSala;

    //Constructor vacío
    public Sala(){
        System.out.println("Se ha creado una sala sin datos");
        this.personas = new ArrayList<>();
        this. numActualPersonas = 0;
    }

    //Constructor con datos
    //Cambiamos el acceso al constructor (eliminamos el public), para que sea la clase Biblioteca
    //la que controle la creación de salas y añadimos nuevos atributos (Ejercicio 5.2)
    Sala (String nombre, boolean pizarra, boolean disponibleReserva, int aforoMaximo, String tipoSala){
        this.nombre = nombre;
        //this.capacidad = capacidad; Eliminado por aforoMaximo
        this.pizarra = pizarra;
        //this.tipo = tipo; Eliminado por tipoSala
        this.disponibleReserva = disponibleReserva;
        //Añadidos nuevos atributos (Ejercicio 5.1)
        this.aforoMaximo = aforoMaximo;
        this.tipoSala = tipoSala;
        //Añadimos en el constructor, numActualPersonas, que se inicializa en 0.
        //Esto ocurre porque cada vez que se cree una sala, se crea vacía.
        this.numActualPersonas= 0;
        //Inicializar listas en el constructor (Ejercicio 4.3)
        this.personas = new ArrayList<>();
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    /*public int getCapacidad(){
        return capacidad;
    } Este atributo ya no existe (Ejercicio 5.1)*/ 

    //Getter con nuevo atributo (Ejercicio 5.1)
    public int getAforoMaximo(){
        return aforoMaximo;
    }

    public boolean getPizarra(){
        return pizarra;
    }

    /*public String getTipo(){
        return tipo;
    } Este atributo ya no existe (Ejercicio 5.1)*/

    //Getter con nuevo atributo (Ejercicio 5.1)
    public String getTipoSala(){
        return tipoSala;
    }

    public boolean getDisponibleReserva(){
        return disponibleReserva;
    }

    //Getter para saber el número de personas en sala necesario
    //para implementarlo en el método mostrarSalasDisponibles()
    //(Ejercicio 4.4.3)
    //Eliminamos este getter, ya que ahora quién va a controlar
    //el número de personas es la variable numActualPersonas (Ejercicio 5.1)
    /*public int getNumeroPersonas(){
        return personas.size();
    }*/
    //Añadimos Getter sustitutivo
    public int getNumActualPersonas(){
        return numActualPersonas;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /*public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    } Este atributo ya no existe (Ejercicio 5.1)*/
    //Setter con nuevo atributo (Ejercicio 5.1) 
    public void setAforoMaximo(int aforoMaximo){
        this.aforoMaximo = aforoMaximo;
     }

    public void setPizarra(boolean pizarra){
        this.pizarra = pizarra;
    }

    /*public void setTipo(String tipo){
        this.tipo = tipo;
    } Este atributo ya no existe*/
    //Setter con nuevo atributo
    public void setTipoSala(String tipoSala){
        this.tipoSala = tipoSala;
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
    //Modificado el método con nuevos atributos aforoMaximo y tipoSala (Ejercicio 5.1)
    public void mostrarInfo(){
        System.out.println("Sala: " + nombre + " - " + "Aforo máximo: " + aforoMaximo + ". Se utiliza para " + tipoSala + ". Dispone de pizarra: " + pizarra + ". Está disponible: " + disponibleReserva);
        //Añadido para el punto 4.4.2
        //Cambiamos por la nueva variable que controla el número de personas (Ejercicio 5.1)
        System.out.println("Número de personas en la sala: " + numActualPersonas);
    }

    //Añadir personas a la sala (Ejercicio 4.3)
    //Cambiado capacidad por aforoMaximo y personas.size() por numactualPersonas (Ejercicio 5.1)
    public void entrarPersona(PersonaPoo p){
        if(numActualPersonas < aforoMaximo){//Comprueba cuánta gente hay en la sala
            personas.add(p);
            numActualPersonas++;
            System.out.println(p.getNombre() + " entró en la sala " + nombre + ".");
        }else{
            System.out.println("La sala " + nombre + " está llena. No puede entrar más gente.");
        }
    }
    //Cambiamos isEmpty() por numActualPersonas, el nuevo controlador (Ejercicio 5.1)
    public void salirPersona(PersonaPoo p){
        if (numActualPersonas == 0){//Comprueba si la sala está vacía
            System.out.println("No hay personas dentro de la sala para salir");
        }else if (personas.remove(p)){//Si no está vacía, elimina a la persona
            System.out.println(p.getNombre() + " se fue de la sala " + nombre);
            numActualPersonas--;
        }else{
            System.out.println(p.getNombre() + " no se encontraba en la sala " + nombre);
        }
    }

    public void mostrarPersonas(){
        if(numActualPersonas == 0){
            System.out.println("No hay personas en la sala " + nombre + ".");
        }else{
            System.out.println("Personas en la sala " + nombre + ":");
            for (PersonaPoo p : personas){
                p.mostrarInfo();
            }
        }
    }

}
