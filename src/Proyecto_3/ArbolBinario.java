
// Clase para manejar un Árbol Binario.

package Proyecto_3;

public class ArbolBinario {
    //Nodo raíz del árbol.
    private Nodo raiz;

    //Constructor que inicializa el árbol vacío.
    public ArbolBinario() {
        this.raiz = null;
    }

    //Getter y Setter para la raíz.
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    // - - - - - - - - - - - - - - - - - - - - Métodos - - - - - - - - - - - - - - - - - - - - //
    //Inserta una nueva impresora en el árbol.
    public void insertar(Impresora impresora) {
        if (raiz == null) {
            raiz = new Nodo(impresora); //Inserta como raíz si está vacío.
        } else {
            insertarRecursivamente(raiz, impresora); //Inserta recursivamente.
        }
    }

    //Inserción recursiva de un nuevo nodo.
    private void insertarRecursivamente(Nodo nodoActual, Impresora impresora) {
        if (impresora.getId() < nodoActual.getImpresora().getId()) {
            if (nodoActual.getIzquierda() == null) {
                nodoActual.setIzquierda(new Nodo(impresora)); //Inserta a la izquierda.
            } else {
                insertarRecursivamente(nodoActual.getIzquierda(), impresora); //Recursión izquierda.
            }
        } else if (impresora.getId() > nodoActual.getImpresora().getId()) {
            if (nodoActual.getDerecha() == null) {
                nodoActual.setDerecha(new Nodo(impresora)); //Inserta a la derecha.
            } else {
                insertarRecursivamente(nodoActual.getDerecha(), impresora); //Recursión derecha.
            }
        } 
    }

    //Imprime los nodos hoja del árbol.
    public void mostrarHojas() {
        listarHojas(raiz); //Llama al método para listar hojas.
    }

    //Lista los nodos hoja de manera recursiva.
    private void listarHojas(Nodo nodo) {
        if (nodo != null) {
            listarHojas(nodo.getIzquierda()); //Recursión izquierda.
            listarHojas(nodo.getDerecha()); //Recursión derecha.
            if (esHoja(nodo)) {
                System.out.println(nodo.getImpresora().getId()); //Imprime hoja.
            }
        }
    }

    //Verifica si un nodo es una hoja.
    private boolean esHoja(Nodo nodo) {
        return nodo.getIzquierda() == null && nodo.getDerecha() == null; //Nodo sin hijos.
    }

    //Busca una impresora por su ID.
    public Impresora buscarPorId(int id) {
        Nodo resultado = buscarNodo(raiz, id); //Busca el nodo.
        if (resultado != null && resultado.getImpresora() != null) {
            return resultado.getImpresora(); //Retorna la impresora.
        }
        return null; //Retorna null si no se encuentra.
    }

    //Busca un nodo por su ID.
    private Nodo buscarNodo(Nodo nodo, int id) {
        if (nodo == null || nodo.getImpresora().getId() == id) {
            return nodo; //Retorna el nodo si se encuentra o es nulo.
        }
        if (id < nodo.getImpresora().getId()) {
            return buscarNodo(nodo.getIzquierda(), id); //Busca a la izquierda.
        } else {
            return buscarNodo(nodo.getDerecha(), id); //Busca a la derecha.
        }
    }

    //Elimina un nodo por su ID.
    public boolean eliminarPorId(int id) {
        Nodo nodoAEliminar = buscarNodo(raiz, id); //Busca el nodo a eliminar.
        if (nodoAEliminar == null) {
            return false; //Retorna false si no se encuentra.
        }
        raiz = eliminarNodoPorId(raiz, id); // Elimina el nodo.
        return true; //Retorna true si se elimina.
    }

    //Elimina un nodo en el árbol y retorna el árbol actualizado.
    private Nodo eliminarNodoPorId(Nodo nodoRaiz, int id) {
        if (nodoRaiz == null) {
            return null; //Retorna null si el nodo es nulo.
        }
        if (id < nodoRaiz.getImpresora().getId()) {
            nodoRaiz.setIzquierda(eliminarNodoPorId(nodoRaiz.getIzquierda(), id)); //Elimina a la izquierda.
        } else if (id > nodoRaiz.getImpresora().getId()) {
            nodoRaiz.setDerecha(eliminarNodoPorId(nodoRaiz.getDerecha(), id)); //Elimina a la derecha.
        } else {
            if (nodoRaiz.getIzquierda() == null) {
                return nodoRaiz.getDerecha(); //Retorna hijo derecho.
            } else if (nodoRaiz.getDerecha() == null) {
                return nodoRaiz.getIzquierda(); //Retorna hijo izquierdo.
            }
            Nodo minimo = encontrarNodoMinimo(nodoRaiz.getDerecha()); //Encuentra mínimo.
            nodoRaiz.setImpresora(minimo.getImpresora()); //Reemplaza con mínimo.
            nodoRaiz.setDerecha(eliminarNodoPorId(nodoRaiz.getDerecha(), nodoRaiz.getImpresora().getId())); //Elimina el mínimo.
        }
        return nodoRaiz; //Retorna el árbol actualizado.
    }

    //Encuentra el nodo con el valor mínimo en un subárbol.
    private Nodo encontrarNodoMinimo(Nodo nodo) {
        Nodo actual = nodo; //Comienza en el nodo dado.
        while (actual.getIzquierda() != null) {
            actual = actual.getIzquierda(); //Recorre a la izquierda.
        }
        return actual; //Retorna el nodo mínimo.
    }
}
