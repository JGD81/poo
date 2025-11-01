package POO;

public class Biblioteca {
    //Atributos de la clase
    private String nombre;
    private String direccion;
    private int horaApertura;
    private int horaCierre;

    //Constructor sin parámetros
    public Biblioteca() {
        System.out.println("Se ha creado una biblioteca sin datos.");
    }
    
    //Constructor con los parámetros (Horas ya definidas)
    public Biblioteca (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = 9;
        this.horaCierre = 22;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public int getHoraApertura(){
        return horaApertura;
    }

    public int getHoraCierre (){
        return horaCierre;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setHoraApertura(int horaApertura){
        this.horaApertura = horaApertura;
    }

    public void setHoraCierre(int horaCierre){
        this.horaCierre = horaCierre;
    }

    public void estaAbierta(int hora) {
        if (hora > this.horaApertura && hora < this.horaCierre){
            System.out.println("La biblioteca está abierta");
        }else{
            System.out.println("La biblioteca está cerrada");
        }
    }

    public void esExtranjero(Libro libro) {
        System.out.println("Comprobando el idioma del libro...");
        libro.esExtranjero();
    }

    public void informacion(){
        System.out.println("Biblioteca: "+ nombre + " - " + direccion + ". Abierto de " + horaApertura + " a " + horaCierre);
    }

}
