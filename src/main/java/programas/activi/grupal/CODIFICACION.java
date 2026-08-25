package programas.activi.grupal;

// Importamos la clase Random para poder generar números aleatorios.
import java.util.Random;

public class CODIFICACION {

    // Arreglo de tipo String que almacena diferentes frases.
    // \n se utiliza para realizar un salto de línea.
    private String[] frases = {

        "La programación es el arte de \n"
            + "hacer que un \n"
            + "ordenador haga lo que tú quieres.",

        "El código es poesía.",

        "Un buen programador es un "
            + "artista; el código es su lienzo.\n",

        "El mal software de una persona \n"
            + "es el trabajo fijo de otra.",

        "No es importante que salga "
            + "bien la primera vez. Es vital \n"
            + "que salga bien la última vez."
    };

    // Declaramos una variable de tipo Random.
    // Se utilizará para seleccionar una frase de forma aleatoria.
    private Random Ran;

    // Constructor de la clase CODIFICACION.
    public CODIFICACION() {

        // Creamos un nuevo objeto Random.
        // Esto permite generar números aleatorios.
        this.Ran = new Random();
    }

    // Método que obtiene y devuelve una frase aleatoria.
    public String obtenerFrase() {

        // Generamos un número aleatorio entre 0 y frases.length - 1.
        // Ese número representa la posición de una frase dentro del arreglo.
        int posicion = Ran.nextInt(frases.length);

        // Devolvemos la frase que se encuentra en la posición seleccionada.
        return frases[posicion];
    }
}