package EjerciciosRefuerzo;

public class MCoche {
    public static void main(String[] args) {
        //Creamos los objetos usando el constructor
        coche coche1 = new coche("Fiat","Stylo");
        coche coche2 = new coche("Toyota","Yaris");
        coche coche3 = new coche();//Constructor vacío
        //Mostramos sus datos con getters
        System.out.println("Coche 1: " + coche1.getMarca() + " " + coche1.getModelo());
        System.out.println("Coche 2: " + coche2.getMarca() + " " + coche2.getModelo());
        //Modificamos los datos con setters
        coche2.setModelo("Corolla");
        System.out.println("Mostrar coche con nuevo modelo: " + coche2.getMarca() + " " + coche2.getModelo());
    }
}
