package programas.activi.grupal;

import java.util.Random;

public class CODIFICACION {
    
    private String[] frases = {
        "La programación es el arte de hacer que un ordenador haga lo que tú quieres.",
        "El código es poesía.",
        "Un buen programador es un artista; el código es su lienzo.",
        "El mal software de una persona es el trabajo fijo de otra.",
        "No es importante que salga bien la primera vez. Es vital que salga bien la última vez.",
        "que dolor decabeza da esto"
    };

    private Random Ran;
    public CODIFICACION(){
        this.Ran = new Random();
    }
    public String obtenerFrase(){
        int posicion = Ran.nextInt(frases.length);
        return frases[posicion];
    }

}
