package POO;

public class SalaEstudio extends Sala {
    private int numMesas;

    //Constructor
    public SalaEstudio(String nombre, boolean pizarra, boolean disponibleReserva, int aforoMaximo, String tipoSala, int numMesas){
    super(nombre, pizarra, disponibleReserva, aforoMaximo, tipoSala);
    this.numMesas = numMesas;
    }

    //Getters y setters
    public int getNumMesas() {
    return numMesas;
    }

    public void setNumMesas(int numMesas) {
    this.numMesas = numMesas;
    }

    //Sobreescritura de mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Número de mesas: " + numMesas);
    }
}






