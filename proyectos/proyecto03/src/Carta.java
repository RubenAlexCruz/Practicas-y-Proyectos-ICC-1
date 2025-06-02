/**
 * Clase que crea las cartas del juego con 5 atributos con dos psibilidades
 * 
 */

public class Carta {

    private boolean tamaño;
    private boolean color;
    private boolean brazos;
    private boolean lentes;
    private boolean palomitas;

    /**
     * Metodo contructor que recibe 5 booleanos para crear los 5 parametros de la carta
     * 
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     */
    public Carta(boolean a, boolean b, boolean c, boolean d, boolean e) {
        this.brazos = a;
        this.color = b;
        this.lentes = c;
        this.palomitas = d;
        this.tamaño = e;
    }

    /**
     * Metodo para obtener el tamaño del perro
     * @return tamaño
     */
    public boolean getTamaño() {
        return this.tamaño;
    }

    /**
     * Metodo para obtener el color del perro
     * @return
     */
    public boolean getColor(){
        return this.color;
    }

    /**
     * Metodo para obtener si el perro tiene uno o dos brazos
     * @return
     */
    public boolean getBrazos(){
        return this.brazos;
    }

    /**
     * Metodo para obtener si el perro tiene o no lentes
     * @return
     */
    public boolean getLentes(){
        return this.lentes;
    }

    /**
     * Metodo apra obtener si el perro tiene o no palomitas
     * @return
     */
    public boolean getPalomitas(){
        return this.palomitas;
    }

    /**
     * Metodo que convierte los atributos de la carta en un string.
     */
    public String toString () {
        String resp = "";

        if (this.brazos) {
            resp += "Este perro tiene dos brazos \n";
        } else if (!this.brazos) {
            resp += "Este perro tiene un brazo \n";
        } 
        if (this.color) {
            resp += "Este perro es de color gris \n";
        } else if (!this.color){
            resp += "Este perro es de color blanco \n";
        } 
        if (this.lentes) {
            resp += "Este perro tiene lentes \n";
        } else if (!this.lentes){
            resp += "Este perro no tiene lentes \n";
        }
        if (this.palomitas) {
            resp += "Este perro tiene palomitas \n";
        } else if (!this.palomitas){
            resp += "Este perro no tiene palomitas \n";
        }
        if (this.tamaño) {
            resp += "Este perro es grande \n";
        } else if (!this.tamaño){
            resp += "Este perro es chico \n";
        }
        
        return resp;
    }

}
            