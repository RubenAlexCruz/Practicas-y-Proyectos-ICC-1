/**
 * Clase para las manecillas de un reloj
 * @author Ruben Cruz
 */


public class Manecilla {
    private int valor;
    private int limite;

    public Manecilla (int valor, int limite){
        this.valor = valor;
        this.limite = limite;
        if (this.valor >= this.limite){
            this.valor = valor % limite;
        }
        // Se utiliza un if para verificar que el valor no exceda el límite y si sí simplemente resetea el mod del valor respecto al límite
    }

    /**
     * Get para el valor de una manecilla
     * @return el valor de la manecilla
     */
    public int getValor(){
        return this.valor;
    }

    /**
     * Set para el valor de una manecilla
     * Se utiliza un if para verificar que el valor no exceda el límite
     * 
     * @param valor el valor que al que se quiere set
     */
    public void setValor(int valor){
        if (valor >= this.limite){
            this.valor = valor % this.limite;
        } else {
            this.valor = valor;
        }
    }

}
