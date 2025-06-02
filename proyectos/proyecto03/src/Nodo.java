/**
 * Clase para los nodos de una lista ligada
 * @author Rubén Cruz
 */
public class Nodo {

    private Carta elemento;
    private Nodo siguiente;

    /**
     * Metodo constructor para los nodos con elementos de tipo Carta
     * 
     * @param elemento
     */
    public Nodo (Carta elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }
    
    /**
     * Metodo para obtener el elemento de un nodo
     * 
     * @return elemento el elemento actual del nodo
     */
    public Carta getElemento() {
        return this.elemento;
    }

    /**
     * Metodo para cambiar el elemeneto de un nodo
     * 
     * @param elemento el nuevo elemento del nodo
     */
    public void setElemento(Carta elemento) {
        this.elemento = elemento;
    }

    /**
     * Metodo para obtener el nodo siguiente respecto al actual.
     * 
     * @return siguiente el siguiente nodo
     */
    public Nodo getSiguiente() {
        return this.siguiente;
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
