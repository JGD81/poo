package POO;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Creamos el objeto biblioteca (Ejercicio 4.2)
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal", "Calle Paseo Marítimo S/N");

        //Creamos varios libros (Ejercicio 4.2)
        Libro libro1 = new Libro("El Quijote", "123ABC", "Anaya", "espanol", 800, 1605, true);
        Libro libro2 = new Libro("Harry Potter", "456DEF", "Bloomsbury", "ingles", 500, 1997, true);
        Libro libro3 = new Libro("Cien años de soledad", "789GHI", "Sudamericana", "espanol", 400, 1967, false);

        //Añadimos los libros a la biblioteca (Ejercicio 4.2)
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);

        //Eliminamos libros que ya existen (Ejercicio 4.2)
        biblioteca.removeLibro(libro2);

        //Probamos si podemos eliminar un libro que no estaba o ya no está (Ejercicio 4.2)
        biblioteca.removeLibro(libro2);

        //Creamos el objeto sala (Ejercicio 4.2)
        Sala sala = new Sala();

        //Creamos varias salas (Ejercicio 4.2)
        Sala sala1 = new Sala("Estudio", 15, true, "Estudio", true);
        Sala sala2 = new Sala("Lectura", 15, true, "Lectura", true);
        Sala sala3 = new Sala("Exposiciones", 15, true, "Exposiciones", true);
        //Creamos otra sala para comprobar el método entrarPersona() (Ejercicio 4.3)
        Sala sala4 = new Sala ("Presentaciones", 2, true, "Presentaciones", true);

        //Añadimos salas a la biblioteca (Ejercicio 4.2)
        biblioteca.addSala(sala1);
        biblioteca.addSala(sala2);
        biblioteca.addSala(sala3);
        biblioteca.addSala(sala4);

        //Eliminamos sala
        biblioteca.removeSala(sala2);

        //Mostrar contenido de las listas (Ejercicio 4.2)
        biblioteca.mostrarLibros();
        biblioteca.mostrarSalas();

        //Buscar un libro concreto (Ejercicio 4.2)
        biblioteca.buscarLibroPorTitulo("El Quijote");

        
        //Creamos personas
        PersonaPoo p1 = new PersonaPoo("Antonio", "Díaz", 25, "Ancha, 21");
        PersonaPoo p2 = new PersonaPoo("Lourdes", "Fernández", 21, "Andrómeda, 1" );
        PersonaPoo p3 = new PersonaPoo("Andrés", "Pacheco", 22, "Larga, 4");
        //Meter personas en la sala
        sala4.entrarPersona(p1);
        sala4.entrarPersona(p2);
        sala4.entrarPersona(p3);//La tercera no debería de entrar
        //Sacar persona de la sala
        sala4.salirPersona(p2);
        //Mostrar personas en la sala (Ejercicio 4.4.2)
        //biblioteca.mostrarSalas();
        //Mostrar las salas disponibles (Ejercicio 4.4.3)
        biblioteca.mostrarSalasDisponibles();
        //Mostrar el total de personas en todas las salas
        biblioteca.mostrarTotalPersonas();
    }   
}
