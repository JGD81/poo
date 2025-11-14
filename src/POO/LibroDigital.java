package POO;

public class LibroDigital extends Libro {

    private String formato;
    private int tamanioMB;

    //Constructor
    public LibroDigital(String titulo, String isbn, String editorial, String idioma, int anno, boolean estaDisponible, String formato, int tamanioMB){
        super(titulo, isbn, editorial, idioma, anno, estaDisponible);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    //Getters
    public String getFormato(){
        return formato;
    }

    public int getTamanioMB(){
        return tamanioMB;
    }

    //Setters
    public void setFormato(String formato){
        this.formato = formato;
    }

    public void setTamanioMB(int tamanioMB){
        this.tamanioMB = tamanioMB;
    }

    //Anotación para indicar al compilador que este método sobreescribe un método
    //de la clase padre Libro
    @Override
    public void mostrarInfo(){
        //Llama al método heredado de libro
        super.mostrarInfo();
        //Pintamos los nuevos atributos
        System.out.println("Formato: " + formato + ", Tamaño: " + tamanioMB);
    }
    
}
