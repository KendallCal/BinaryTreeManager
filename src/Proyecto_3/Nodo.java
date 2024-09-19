
//Clase Nodo.

package Proyecto_3;

public class Nodo {
    //Variables.
    private Impresora impresora;
    private Nodo izquierda;
    private Nodo derecha;

    //Cosntructor.
    public Nodo(Impresora impresora) {
        this.impresora = impresora;
        this.izquierda = null;
        this.derecha = null;
    }

    //Getters and Setters.
    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
