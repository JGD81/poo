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

        //Añadimos salas a la biblioteca (Ejercicio 4.2)
        biblioteca.AddSala(sala1);
        biblioteca.AddSala(sala2);
        biblioteca.AddSala(sala3);

        //Eliminamos sala
        biblioteca.removeSala(sala2);

        //Mostrar contenido de las listas (Ejercicio 4.2)
        biblioteca.mostrarLibros();
        biblioteca.mostrarSalas();

        //Buscar un libro concreto
        biblioteca.buscarLibroPorTitulo("El Quijote");
    }
}
