public class ListaLigada {
    
    private Nodo cabeza;
    private int tamaño;
    
    /**
     * Metodo constructor para una lista vacía
     */
    public ListaLigada () {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public Nodo getCabeza () {
        return this.cabeza;
    }

    public int getTamaño(){
        return this.tamaño;
    }

    /**
     * Metodo para agregar un elemento a la lista
     * 
     * @param n el elemento que se quiere agregar a la lista
     */
    public void insertar (Carta n) {
        Nodo nuevoNodo = new Nodo(n);

        //Caso si la lista esta vacía
        if (this.cabeza == null) {
            this.cabeza = nuevoNodo;
            return;

        } 
        //Caso si la lísta no es vacía
        else {
            Nodo aux = this.cabeza; 
            while(aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevoNodo);
            this.tamaño += 1;
            return;
        }
    }

    /**
     * Metodo para eliminar la primer instancia de un nodo con algun elemento especifico. 
     * 
     * @param n el elemento a eliminar
     */
    public void eliminar (Carta n) {
        Nodo nodoActual = this.cabeza;
        Nodo nodoAnterior =null;
        // Caso si la lista es vacía.
        if (nodoActual == null){
            return;
        }
        // Caso si la lista tiene un solo elemento.
        else if (nodoActual.getSiguiente() == null && nodoActual.getElemento() == n){
            this.cabeza = null;
            this.tamaño -= 1;
            return;
        }
        // Caso si la lista tiene más de un elemento.
        else {
            // La iteración while checa cada nodo de la lista y se detiene cunado el nodo actual
            // contiene el elemento n ó cuando la lista ya no tiene elementos.
            while (nodoActual != null && nodoActual.getElemento() != n) {
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getSiguiente();
            }
            // Caso en el cual el primer elemento contiene el elemento n.
            if (this.cabeza == nodoActual && nodoActual != null) {
                this.cabeza = nodoActual.getSiguiente();
                this.tamaño -= 1;
            }
            //Si el noto actual no es vacío significa que el nodo actual contiene al elemento n. 
            else if (nodoActual != null) {
                nodoAnterior.setSiguiente(nodoActual.getSiguiente());
                this.tamaño -= 1;
            }
        }
        return;
    }

     

    /**
     * Metodo para agregar un elemento en un índice específico
     * 
     * @param i el índice en el cual se quiere agregar.
     * @param n el elemento que se va a agregar.
     * 
     */
    public void insertarIndice (int i, Carta n){
        //se le quita 1 para que así el nuevo elemento se convierta en el elmento i de la lista es deicr
        //si i es 1 el nuevo elemento ahora es la cabeza de la lista, si i es 2 el nuevo elemento es el segudno elemento de la lista. 
        i--;
        int m = this.tamaño;
        Nodo nodoActual = this.cabeza;
        Nodo nodoAnterior = null;
        Nodo nuevNodo = new Nodo(n);
        //Si i esta fuera del rango no se hace nada
        if (i > m) {
            return;
        } 
        //Si i es 1 (0 despues de restado 1) se coloca como la cabeza
        else if(i == 0) {
            this.cabeza = nuevNodo;
            this.cabeza.setSiguiente(nodoActual);
            this.tamaño += 1;
        }
        //Caso en el que i esta dentro del rango y no es 1
        else {
            for (int j = 0; j < i; j++){
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getSiguiente();
            }

            nodoAnterior.setSiguiente(nuevNodo);
            nuevNodo.setSiguiente(nodoActual);
            this.tamaño += 1;
        }

    }

}
