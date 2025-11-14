package POO;

public class LibroFisico extends Libro {
    
    private int numPaginas;
    private String ubicacion;

    //Constructor
    public LibroFisico(String titulo, String isbn, String editorial, String idioma, int anno, boolean estaDisponible, int numPaginas, String ubicacion){
    super(titulo, isbn, editorial, idioma, anno, estaDisponible);
    this.numPaginas = numPaginas;
    this.ubicacion = ubicacion;
    }

    //Getters
    public int getNumPaginas(){
        return numPaginas;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    //Setters
    public void setNumeroPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    //Sobreescribir el método mostrarInfo() de Libro
    @Override
    public void mostrarInfo(){
        //Mostramos los atributos generales se Libro
        super.mostrarInfo();
        //Y añadimos los ateributos de LibroFisico
        System.out.println("Páginas: " + numPaginas + ", Ubicación:  " + ubicacion);
    }
}








