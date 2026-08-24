package programas.activi.grupal;

import java.util.Random;

public class CODIFICACION {
    
    private String[] frases = {
        "La programación es el arte de \nn"
            + "hacer que un \nn"
            + "ordenador haga lo que tú quieres.",
        "El código es poesía.",
        "Un buen programador es un "
            + "artista; el código es su lienzo.\nn",
        "El mal software de una persona \nn"
            + "es el trabajo fijo de otra.",
        "No es importante que salga "
            + "bien la primera vez. Es vital \nn"
            + "que salga bien la última vez." 
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
