package POO;

public class Empleado extends PersonaPoo {

    private String puesto;
    private double sueldo;

    //Constructor

    public Empleado (String nombre, String apellido, int edad, String direccion, String puesto, double sueldo){
        super (nombre, apellido, edad, direccion);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    //Getters
    public String getPuesto(){
        return puesto;
    }

    public double getSueldo(){
        return sueldo;
    }

    //Setters

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    //Sobreescritura de mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Puesto: " + puesto + ", Sueldo: " + sueldo + " €.");
    }
}
