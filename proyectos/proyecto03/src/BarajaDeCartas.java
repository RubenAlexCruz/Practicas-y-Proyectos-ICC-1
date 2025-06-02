import java.util.ArrayList;
import java.util.Collections;

/**
     * Clase para una baraja de cartas
     * 
     */
    public class BarajaDeCartas {
    private ArrayList<Carta> baraja; 

    /**
     * Metodo constructor de una baraja utilizando un ArrayList de cartas
     * @param baraja
     */
    public BarajaDeCartas (ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public int getTamaño() {
        return this.baraja.size();
    }

    /**
     * Meotdo para obtener la baraja actual 
     * @return baraja
     */
    public ArrayList<Carta> getBaraja() {
        return this.baraja;
    }

    /**
     * Metodo para cambiar la baraja actual
     * @param baraja
     */
    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    /**
     * Metodo para barajear las cartas utilizando la clase Collections dado que esta es 
     */
    public void barajear() {
        Collections.shuffle(this.baraja);
    }

    /**
     * Metodo que regresa la primera carta de la baraja y la elimina de ella.
     * @return primera carta
     */
    public Carta repartirCarta(){
        if (this.baraja.size() > 0) {
            Carta carta = baraja.get(0);
            baraja.remove(0);
            return carta;
        }else{
            return null;
            }

        }

    }
