package POO;

public class Biblioteca {
    String nombre;
    String direccion;
    int horaApertura;
    int horaCierre;

    public Biblioteca (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = 9;
        this.horaCierre = 22;
    }

    public void estaAbierta(int hora) {
        if (hora > this.horaApertura && hora < this.horaCierre){
            System.out.println("La biblioteca está abierta");
        }else{
            System.out.println("La biblioteca está cerrada");
        }
    }



}
