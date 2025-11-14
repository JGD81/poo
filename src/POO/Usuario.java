package POO;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends PersonaPoo {
    private int numSocio;
    private List<Libro> librosPrestados;

    //Constructor
    public Usuario (String nombre, String apellido, int edad, String direccion, int numSocio){
        super(nombre, apellido, edad, direccion);
        this.numSocio = numSocio;
        this.librosPrestados = new ArrayList<>();
    }

    //Getters
    public int getNumSocio(){
        return numSocio;
    }

    //Setters
    public void setNumSocio(int numSocio){
        this.numSocio = numSocio;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Número de socio: " + numSocio + ", Libros prestados: " + librosPrestados.size());

        //Comprobar los libros que tiene prestados y mostrar su nombre
        if (librosPrestados.isEmpty()){
            System.out.println(" - No tiene libros prestados");
        }else{
            for (Libro libro : librosPrestados){
                System.out.println(" - " + libro.getTitulo());
            }
        }
    }

}
