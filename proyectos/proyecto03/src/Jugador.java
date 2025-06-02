/**
 * Clase para un jugador del juego Pick-a-Perro
 */
public class Jugador {
    private ListaLigada lista = new ListaLigada();
    private int puntos = 0;
    /**
     * Metodo que agrega una carta a la lista actual del jugador
     * @param carta
     */
    public void agregarLista(Carta carta) {
        this.lista.insertar(carta);
    }
    /**
     * Metodo que verifica si la lista actual del jugador es valida o no.
     * @return
     */
    public Boolean validarLista () {
        if(this.lista.getTamaño() < 2) {
            return true;
        }
        Nodo nodoActual = this.lista.getCabeza();
        Carta cartaActual = nodoActual.getElemento();
        Nodo nodosiguiente = nodoActual.getSiguiente();
        Carta cartaSiguiente = nodosiguiente.getElemento();
        Boolean condicion = true;

        while(cartaSiguiente != null && condicion) {
            int n = 0;
            if (cartaActual.getBrazos() == cartaSiguiente.getBrazos()) {
                n++;
            }
            if (cartaActual.getColor() == cartaSiguiente.getColor()) {
                n++;
            }
            if (cartaActual.getLentes() == cartaSiguiente.getLentes()){
                n++;
            }
            if (cartaActual.getPalomitas() == cartaSiguiente.getPalomitas()){
                n++;
            }
            if(cartaActual.getTamaño() == cartaSiguiente.getTamaño()) {
                n++;
            }

            if (n < 4) {
                condicion = false;
            }

            nodoActual = nodoActual.getSiguiente();
            nodosiguiente = nodosiguiente.getSiguiente();
            cartaActual = nodoActual.getElemento();
            cartaSiguiente = nodosiguiente.getElemento();


        }


        return condicion;
    }

    /**
     * Metodo para ver cada carta en la lista actual del jugador
     * 
     * @return 
     */
    public String verLista(){
        String resp = "Lista Actual:";
        Nodo nodoActual = this.lista.getCabeza();
        while (nodoActual != null) {
            resp += "\n";
            Carta cartaActual = nodoActual.getElemento();
            resp += cartaActual.toString();
            nodoActual = nodoActual.getSiguiente();
        }
        return resp;
    }

    /**
     * Metodo para obtener los puntos del jugador
     * @return puntos
     */
    public int getPuntos(){
        return this.puntos;
    }

    /**
     * Metodo para modificar los puntos del jugador
     * @param puntos
     */
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }

    /**
     * Metodo para obtener la lista de un jugador
     * @return Lista
     */
    public ListaLigada getLista() {
        return this.lista;
    }

    public void borrarLista(){
        this.lista= new ListaLigada();
    }

    /**
     * Metodo para verificar si una carta es valida para agregar al final de la lista actual.
     * 
     * @param carta
     * @return
     */
    public boolean checarCarta(Carta carta) {
        boolean resp = false;
        Nodo nodo = this.lista.getCabeza();
        while (nodo.getSiguiente() != null){
            nodo = nodo.getSiguiente();
        }
        Carta cartaOriginal = nodo.getElemento();
        int n = 0;

        if (cartaOriginal.getBrazos() == carta.getBrazos()) {
                n++;
            }
            if (cartaOriginal.getColor() == carta.getColor()) {
                n++;
            }
            if (cartaOriginal.getLentes() == carta.getLentes()){
                n++;
            }
            if (cartaOriginal.getPalomitas() == carta.getPalomitas()){
                n++;
            }
            if(cartaOriginal.getTamaño() == carta.getTamaño()) {
                n++;
            }

            if (n >= 4) {
                resp = true;
            }

        return resp;
    }

}
