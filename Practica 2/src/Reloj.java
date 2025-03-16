/**
 * Clase para un reloj de manecillas 
 * @author Ruben Cruz
 */
public class Reloj {
    private Manecilla hora ;
    private Manecilla minutos ;
    private Manecilla segundos ;
    
    public Reloj (){
        this.hora = new Manecilla(0, 360);
        /* El límite de hora lo utilizo como 360 para simular más cercanamente a el funcionamiento de un reloj de manecillas normal. 
         * Cada hora sera dividia en intervalos de 30 significando que la hora 1 sera de los valores 30 - 59 con la hora 2 empezando en 60.
         * Esto se hace dado que la manecilla de horas avanza con la manecilla de los minutos, por ejemplo si la hora actual fueran 
         * la 01:50 la manecilla de la hora estara más cerca de la hora 2 que de la hora 1.
         * Usando 360 (los grados de un circulo) como el límite se tiene que el valor de hora incrementa por 1 cada 2 minutos
         * Usando el mismo ejemplo (01:50) la manecilla de minutos tendría valor 50 y la manecilla de hora tendría  valor 55 = 30 (1 hora) + 25 (minutos / 2)
         * Debido a esto cada vez que se utilize el valor de la manecilla hora se tendra que dividir o multiplicar por 30 (360/12)
         * dependiendo de la situación y si se llegan a modificar los minutos se tendra que modificar de igual manera el valor de la hora.
         */
        this.minutos = new Manecilla(0, 60);
        this.segundos = new Manecilla(0, 60);
    }


    /**
     * Get el valor de la manecilla de segundos
     * 
     * @return segundos
     */
    public int getSegundos(){
        return this.segundos.getValor();
    }

    /**
     * Get el valor de la manecilla de minutos
     * 
     * @return minutos
     */
    public int getMinutos(){
        return this.minutos.getValor();
    }

    /**
     * Get el valor de la manecilla de horas el cual se divide por 30 para dar el
     * resultado que espera el usario
     * 
     * @return horas
     */
    public int getHora(){
        int resp = this.hora.getValor() / 30;
        return resp;
    }

    /*
     * Como el metodo setValor de la clase Manecilla ya verificar que el valor de la manecilla no supere su limite
     * no es necesario volverlo a hacer para los metodos set de la clase Reloj
     */


    /**
     * Set para el valor de la manecilla de segundos
     * 
     * @param segundos
     */
    public void setSegundos(int segundos) {
        this.segundos.setValor(segundos);

    }

    /**
     * Set para el valor de la manecilla de minutos
     * Como el valor de las horas depende de los minutos se modifica igual el valor de la hora
     * 
     * @param minutos
     */
    public void setMinutos (int minutos) {
        int horaActual = this.hora.getValor();
        this.minutos.setValor(minutos);
        this.hora.setValor(horaActual + (minutos/2));
    }

    /**
     * Set para el valor de la manecilla de horas
     * Se múltiplica por 30 pensando que el usario ingresara el numero de la hora que quiere que sea
     * 
     * @param horas
     */
    public void setHoras (int horas) {
       this.hora.setValor(horas * 30);
    }

    //Al igual que los sets no es necesario saber si el nuevo valor es mayor al límite para los metodos agregar de la clase reloj

    /**
     * Agrega horas al reloj, se multiplica el parametro por 30 para modificar apropiadamente el valor de la manecilla de hora
     * 
     * @param hora
     */
    public void agregarHoras(int hora) {
        int horaNueva = this.hora.getValor() + (hora * 30);
        this.hora.setValor(horaNueva);
    }

    /**
     * Agrega minutos al reloj, si el valor del parametro es mayor que el límite agrega
     * las horas necesarias
     * 
     * @param minutos
     */
    public void agregarMinutos(int minutos){
        int minutoNuevo = this.minutos.getValor() + minutos;
        this.minutos.setValor(minutoNuevo);
        if (minutoNuevo >= 60) {
            this.agregarHoras(minutoNuevo / 60);
        }
    }

    /**
     * Agrega segundos al reloj, si el valor del parametro es mayor que el límite agrega
     * los minutos necesarios
     * 
     * @param segundos
     */
    public void agregarSegundos (int segundos){
        int segundoNuevo = this.segundos.getValor() + segundos;
        this.segundos.setValor(segundoNuevo);
        if (segundoNuevo >= 60) {
            this.agregarMinutos(segundoNuevo/60);
        }
    }

    /**
     * Muestra una version analoga del reloj con formato HH:MM:SS.
     * Se modifica la respuesta del metodo dependiendo de si la hora, los miuntos o los segundos son menores a 10
     * para siempre lograr el formato pedido.
     * 
     * @return un String que de la hora en formato analogo
     */
    public String mostrarAnalogo (){
        String resp = "" ;
        //Variables boolean para representar si los valores de horas, minutos y segundos son menores a 10
        boolean h = this.getHora() < 10;
        boolean m = this.getMinutos() < 10;
        boolean s = this.getSegundos() < 10;
        //Como el iterador switch no funicona correctamente con boolean se utilizan if  para representar los diferentes casos necesarios
        if (h & m & s){
            resp += "0" + this.getHora() + ":0" + this.getMinutos() + ":0" + this.getSegundos();

        } else if (h & m & !s) {
            resp += "0" + this.getHora() + ":0" + this.getMinutos() + ":" + this.getSegundos();

        } else if (h & !m & s){
            resp+= "0" + this.getHora() + ":" + this.getMinutos() + ":0" + this.getSegundos();

        } else if (h & !m & !s) {
            resp += "0" + this.getHora() + ":" + this.getMinutos() + ":" + this.getSegundos();

        } else if (!h & m & s) {
            resp += this.getHora() + ":0" + this.getMinutos() + ":0" + this.getSegundos();

        } else if (!h & m & !s) {
            resp += this.getHora() + ":0" + this.getMinutos() + ":" + this.getSegundos();

        } else if (!h & !m & s) {
            resp +=  this.getHora() + ":" + this.getMinutos() + ":0" + this.getSegundos();

        } else {
            resp += this.getHora() + ":" + this.getMinutos() + ":" + this.getSegundos();
        }
        return resp; 
    }

    

}
