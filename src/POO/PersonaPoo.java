package POO;

public class PersonaPoo {

    // Atributos
    private String nombre;
    private int edad;
    private String direccion;
    private String apellido;
    private String DNI;
    private String email;
    private String telefono;
    private String profesion;
    private String anios_experiencia;

    // Constructor vacío
    public PersonaPoo() {
        System.out.println("Se ha creado una persona sin datos.");
    }

    // Constructor con datos básicos
    public PersonaPoo(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Métodos getters y setters
    public String getNombre() {
         return nombre; 
        }

    public void setNombre(String nombre) {
         this.nombre = nombre; 
        }

    public int getEdad() {
         return edad; 
        }

    public void setEdad(int edad) {
         this.edad = edad; 
        }

    public String getDireccion() {
         return direccion; 
        }

    public void setDireccion(String direccion) {
         this.direccion = direccion; 
        }

    public String getApellido() {
         return apellido; 
        }

    public void setApellido(String apellido) {
         this.apellido = apellido; 
        }

    public String getDNI() {
         return DNI; 
        }

    public void setDNI(String DNI) {
         this.DNI = DNI; 
        }

    public String getEmail() {
         return email; 
        }

    public void setEmail(String email) {
         this.email = email; 
        }

    public String getTelefono() {
         return telefono; 
        }

    public void setTelefono(String telefono) {
         this.telefono = telefono; 
        }

    public String getProfesion() {
         return profesion; 
        }

    public void setProfesion(String profesion) {
         this.profesion = profesion; 
        }

    public String getAnios_experiencia() {
         return anios_experiencia; 
        }

    public void setAnios_experiencia(String anios_experiencia) {
         this.anios_experiencia = anios_experiencia; }

    // Método adicional
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido + ", Edad: " + edad + ", Dirección: " + direccion);
    }

    public boolean estaJubilado() {
        if (edad >= 65) {
            System.out.println("La persona está jubilada.");
            return true;
        } else if (edad >= 18) {
            System.out.println("La persona está en edad de trabajar.");
            return false;
        } else {
            System.out.println("La persona es menor de edad.");
            return false;
        }
    }
}