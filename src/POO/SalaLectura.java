package POO;

import java.util.ArrayList;
import java.util.List;

public class SalaLectura extends Sala {
    private List<Libro> listaLibros;

    //Constructor
    public SalaLectura(String nombre, boolean pizarra, boolean disponibleReserva, int aforoMaximo, String tipoSala){
        super(nombre, pizarra, disponibleReserva, aforoMaximo, tipoSala);
        this.listaLibros = new ArrayList<>();
    }

    //Sobreescritura de mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Libros disponibles en sala: ");
        
        if (listaLibros.isEmpty()){
            System.out.println(" - No hay libros en la sala");
        }else{
            for (Libro libro : listaLibros){
                System.out.println(" - " + libro.getTitulo());
            }
        }
    }
}
