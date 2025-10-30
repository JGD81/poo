package EjerciciosRefuerzo;

public class coche {

    private String marca; //Mediante private hacemos privados
    private String modelo;//los atributos de la clase

    public coche(String marcaCoche, String modeloCoche){
        this.marca = marcaCoche;
        this.modelo = modeloCoche;
    }
    public coche (){
        System.out.println("Coche creado sin datos");
    }

    //Mostrar los datos con getters
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    //Modificar los datos con setters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }




}
