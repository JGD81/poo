package POO;

public class Libro {
    //Atributos
    private String titulo;
    private String isbn;
    private String editorial;
    private String idioma;
    private int numeroPaginas;
    private int anno;
    private boolean estaDisponible;
    
    //Contructores
    //Constructor vacío para que Java no de error al compilar
    //cuando se quieran introducir los valores con setters y se dejen
    //los valores vacíos en la creación del objeto
    public Libro() { 
        System.out.println("Se ha creado un libro sin datos.");
    }
    //Constructor con todos los parámetros
    public Libro(String titulo, String isbn, String editorial, String idioma,int numeroPaginas, int anno, boolean estaDisponible){
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        this.idioma = idioma;
        this.numeroPaginas = numeroPaginas;
        this.anno = anno;
        this.estaDisponible = estaDisponible;
             }

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getEditorial(){
        return editorial;
    }

    public String getIdioma(){
        return idioma;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public int getAnno(){
        return anno;
    }

    public boolean getEstaDisponible(){
        return estaDisponible;
    }

    //Setters
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public void setIsbn (String isbn){
        this.isbn = isbn;
    }

    public void setEditorial (String editorial){
        this.editorial = editorial;
    }

    public void setIdioma (String idioma){
        this.idioma = idioma;
    }

    public void setNumeroPaginas (int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    public void setAnno (int anno){
        this.anno = anno;
    }

    public void setEstaDisponible (boolean estaDisponible){
        this.estaDisponible = estaDisponible;
        
    }

    //Métodos
    public void estaDisponible(){
        if (estaDisponible){
            System.out.println("El libro está disponible para su reserva");
        }else{
            System.out.println("El libro no está disponible para su reserva");
        }
    }

    public void esExtranjero(){
        if (!idioma.equalsIgnoreCase("espanol")){
            System.out.println("El idioma del libro no es es espanol, es " + idioma);
        }else{
            System.out.println("El idioma del libro es espanol");
        }
    }

    public void informacion(){
        System.out.println(" Libro: " + titulo + " - " + editorial + "(" + anno + "). " + idioma + ", "
         + numeroPaginas + ". Está disponible: " + estaDisponible);
    }

}
