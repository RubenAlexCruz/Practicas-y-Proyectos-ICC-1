import java.util.ArrayList;

/**
 * Clase para crear el juego de pick a perro.
 * 
 * 
 */
public class Juego {

    private ArrayList<Carta> cartas;
    private Carta[][] tablero = new Carta[5][6]; 
    private BarajaDeCartas baraja;

    /**
     * Metodo contructor del juego que crea la baraja de 96 cartas
     * 
     */
    public Juego(){
        Carta c1 = new Carta(false,false,false,false,false);
        Carta c2 = new Carta(false,false,false,false,true);
        Carta c3 = new Carta(false,false,false,true,false);
        Carta c4 = new Carta(false, false, false, true, true);
        Carta c5 = new Carta(false, false, true, false, false);
        Carta c6 = new Carta(false, false, true, false, true);
        Carta c7 = new Carta(false, false, true, true, false);
        Carta c8 = new Carta(false, false, true, true, true);
        Carta c9 = new Carta(false, true, false, false, false);
        Carta c10 = new Carta(false, true, false, false, true);
        Carta c11 = new Carta(false, true, false, true, false);
        Carta c12 = new Carta(false, true, false, true, true);
        Carta c13 = new Carta(false, true, true, false, false);
        Carta c14 = new Carta(false, true, true, false, true);
        Carta c15 = new Carta(false, true, true, true, false);
        Carta c16 = new Carta(false, true, true, true, true);
        Carta c17 = new Carta(true, false, false, false, false);
        Carta c18 = new Carta(true, false, false, false, true);
        Carta c19 = new Carta(true, false, false, true, false);
        Carta c20 = new Carta(true, false, false, true, true);
        Carta c21 = new Carta(true, false, true, false, false);
        Carta c22 = new Carta(true, false, true, false, true);
        Carta c23 = new Carta(true, false, true, true, false);
        Carta c24 = new Carta(true, false, true, true, true);
        Carta c25 = new Carta(true, true, false, false, false);
        Carta c26 = new Carta(true, true, false, false, true);
        Carta c27 = new Carta(true, true, false, true, false);
        Carta c28 = new Carta(true, true, false, true, true);
        Carta c29 = new Carta(true, true, true, false, false);
        Carta c30 = new Carta(true, true, true, false, true);
        Carta c31 = new Carta(true, true, true, true, false);
        Carta c32 = new Carta(true, true, true, true, true);

        this.cartas = new ArrayList<Carta>();
        // Agrego todas las cartas a fuerza burta de esta manera porque por alguna razon no funcionaba si utilizaba iteraciones
        this.cartas.add(c1);
        this.cartas.add(c2);
        this.cartas.add(c3);
        this.cartas.add(c4);
        this.cartas.add(c5);
        this.cartas.add(c6);
        this.cartas.add(c7);
        this.cartas.add(c8);
        this.cartas.add(c9);
        this.cartas.add(c10);
        this.cartas.add(c11);
        this.cartas.add(c12);
        this.cartas.add(c13);
        this.cartas.add(c14);
        this.cartas.add(c15);
        this.cartas.add(c16);
        this.cartas.add(c17);
        this.cartas.add(c18);
        this.cartas.add(c19);
        this.cartas.add(c20);
        this.cartas.add(c21);
        this.cartas.add(c22);
        this.cartas.add(c23);
        this.cartas.add(c24);
        this.cartas.add(c25);
        this.cartas.add(c26);
        this.cartas.add(c27);
        this.cartas.add(c28);
        this.cartas.add(c29);
        this.cartas.add(c30);
        this.cartas.add(c31);
        this.cartas.add(c32);
        this.cartas.add(c1);
        this.cartas.add(c2);
        this.cartas.add(c3);
        this.cartas.add(c4);
        this.cartas.add(c5);
        this.cartas.add(c6);
        this.cartas.add(c7);
        this.cartas.add(c8);
        this.cartas.add(c9);
        this.cartas.add(c10);
        this.cartas.add(c11);
        this.cartas.add(c12);
        this.cartas.add(c13);
        this.cartas.add(c14);
        this.cartas.add(c15);
        this.cartas.add(c16);
        this.cartas.add(c17);
        this.cartas.add(c18);
        this.cartas.add(c19);
        this.cartas.add(c20);
        this.cartas.add(c21);
        this.cartas.add(c22);
        this.cartas.add(c23);
        this.cartas.add(c24);
        this.cartas.add(c25);
        this.cartas.add(c26);
        this.cartas.add(c27);
        this.cartas.add(c28);
        this.cartas.add(c29);
        this.cartas.add(c30);
        this.cartas.add(c31);
        this.cartas.add(c32);
        this.cartas.add(c1);
        this.cartas.add(c2);
        this.cartas.add(c3);
        this.cartas.add(c4);
        this.cartas.add(c5);
        this.cartas.add(c6);
        this.cartas.add(c7);
        this.cartas.add(c8);
        this.cartas.add(c9);
        this.cartas.add(c10);
        this.cartas.add(c11);
        this.cartas.add(c12);
        this.cartas.add(c13);
        this.cartas.add(c14);
        this.cartas.add(c15);
        this.cartas.add(c16);
        this.cartas.add(c17);
        this.cartas.add(c18);
        this.cartas.add(c19);
        this.cartas.add(c20);
        this.cartas.add(c21);
        this.cartas.add(c22);
        this.cartas.add(c23);
        this.cartas.add(c24);
        this.cartas.add(c25);
        this.cartas.add(c26);
        this.cartas.add(c27);
        this.cartas.add(c28);
        this.cartas.add(c29);
        this.cartas.add(c30);
        this.cartas.add(c31);
        this.cartas.add(c32);
        this.baraja = new BarajaDeCartas(this.cartas);
        this.baraja.barajear();
    }

    

    /**
     * Metodo para crear el tablero con 36 cartas
     */
    public void nuevoTablero () {
        this.baraja.barajear();
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j< 6; j++){
                if (this.tablero[i][j] == null ){
                    this.tablero[i][j] = this.baraja.repartirCarta(); 
                }
            }
        }
    }
    /**
     * Metodo para obtener la baraja actual del juego
     * @return
     */
    public BarajaDeCartas getBaraja (){
        return this.baraja;
    }

    /**
     * metodo para modificar la baraja del juego
     * @param baraja
     */
    public void setBaraja (BarajaDeCartas barja) {
        this.baraja.setBaraja(baraja.getBaraja());
    }
    /**
     * Metodo para checar una carta del tablero
     * @param i
     * @param j
     * @return toString de la carta que se quiere checar
     */
    public String checarCarta (int i , int j) {
        return this.tablero[i][j].toString();
    }

    /**
     * Metodo para obtener una carta del tablero
     * 
     * @param i
     * @param j
     * @return
     */
    public Carta getCarta (int i, int j) {
        return this.tablero[i][j];
    }



}
