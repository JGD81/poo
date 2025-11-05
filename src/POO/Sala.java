package POO;

public class Sala {
    
    //Atributos
    private String nombre;
    private int capacidad;
    private boolean pizarra;
    private String tipo;
    private boolean disponibleReserva;

    //Constructor vacío
    public Sala(){
        System.out.println("Se ha creado una sala sin datos");
    }

    //Constructor con datos
    public Sala (String nombre, int capacidad, boolean pizarra, String tipo, boolean disponibleReserva){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pizarra = pizarra;
        this.tipo = tipo;
        this.disponibleReserva = disponibleReserva;
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
    }
}
