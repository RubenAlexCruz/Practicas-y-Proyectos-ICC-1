/**
 * Clase para los nodos de una lista ligada
 * @author Rubén Cruz
 */
public class Nodo {

    private int elemento;
    private Nodo siguiente;

    /**
     * Metodo constructor para los nodos con elementos de tipo int
     * 
     * @param elemento
     */
    public Nodo (int elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }
    
    /**
     * Metodo para obtener el elemento de un nodo
     * 
     * @return elemento el elemento actual del nodo
     */
    public int getElemento() {
        return elemento;
    }

    /**
     * Metodo para cambiar el elemeneto de un nodo
     * 
     * @param elemento el nuevo elemento del nodo
     */
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    /**
     * Metodo para obtener el nodo siguiente respecto al actual.
     * 
     * @return siguiente el siguiente nodo
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Metodo para cambiar el nodo siguiente respecto al actual.
     * 
     * @param siguiente el nuevo nodo siguiente
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
