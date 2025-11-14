package POO;

public class SalaInformatica extends Sala {
    private int numEquipos;

    //Constructor
    public SalaInformatica(String nombre, boolean pizarra, boolean disponibleReserva, int aforoMaximo, String tipoSala, int numEquipos){
        super(nombre, pizarra, disponibleReserva, aforoMaximo, tipoSala);
        this.numEquipos = numEquipos;
    }

    //Getters y setters
    public int getNumEquipos(){
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos){
        this.numEquipos = numEquipos;
    }

    //Sobreescribir mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Número de equipos en sala informática: " + numEquipos);
    }
}
