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

    public int getValor(){
        return this.valor;
    }

    //igual que al construir una manecilla se utiliza  un if para verificar que el valor no exceda el límite
    public void setValor(int valor){
        if (valor >= this.limite){
            this.valor = valor % this.limite;
        } else {
            this.valor = valor;
        }
    }

}
