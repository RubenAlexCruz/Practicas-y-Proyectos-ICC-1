/**
* Los servicios que debe ofrecer un Recipiente .
*/
public interface ServiciosRecipiente {

    /**
    * Calcula y devuelve la cantidad m ́a xima de l ́ı quido que cabe en
    * el recipiente .
    *
    * @return La capacidad total .
    */
    public double capacidad ();


    /**
    * Calcula y devuelve la diferencia entre la capacidad total y
    * la cantidad actual del recipiente .
    *
    * @return La capacidad restante .
    */
    public double capacidadRestante ();


    /**
    * Indica si el recipiente est  ́a vac  ́ıo, es decir , la cantidad
    * de l ́ı quido que contiene es cero .
    *
    * @return true si est  ́a vac  ́ıo, false en otro caso .
    */
    public boolean estaVacio ();


    /**
    * Indica si el recipiente est  ́a lleno , es decir , la cantidad
    * de l ́ı quido que contiene es igual a la de su capacidad .
    *
    * @return true si est  ́a lleno , false en otro caso .
    */
    public boolean estaLleno ();


    /**
    * Agrega una nueva cantidad de l ́ı quido al recipiente , respetando
    * la capacidad m ́a xima del mismo . En caso de que no quepa todo
    * el l ́ıquido , deber  ́a devolver la cantidad excedente .
    * Por ejemplo , si un recipiente tiene cantidad actual 15 y
    * capacidad total 20 , al rellenarlo con 10 deber  ́ıa actualizar
    * la cantidad actual a 20 y devolver un excedente de 5.
    *
    * @param cantidad La cantidad de l ́ı quido a agregar .
    * @return La cantidad excedente . Puede ser cero si cab  ́ıa todo .
    */
    public double rellena ( double cantidad );


    /**
    * Resetea la cantidad actual a cero .
    *
    * @return La cantidad de l ́ı quido que pose  ́ıa.
    */
    public double vacia ();


    /**
    * Vierte el contenido del recipiente en otro respetando su
    * capacidad m ́a xima . En caso de haber excedente , se debe guardar
    * en el recipiente invocante .
    * Por ejemplo , si un recipiente A tiene cantidad actual 10 y
    * vertemos su contenido en un recipiente B con cantidad actual 3
    * y capacidad total 5 , entonces debe dar como resultado que el
    * recipiente A quede con cantidad actual 8 y el recipiente B con
    * cantidad actual 5.
    *
    * @param otro El recipiente donde se vertir  ́a el l ́ı quido actual .
    */
    public void vierte ( Recipiente otro );


    /**
    * Indica si el recipiente tiene exactamente las mismas
    * dimensiones que otro . Solo revisamos las dimensiones , la
    * cantidad de l ́ı quido puede variar .
    *
    * @param otro El recipiente con que se comparar  ́a.
    * @return true si tienen las mismas dimensiones , false en otro
    * caso .
    */
    public boolean mismasDimensiones ( Recipiente otro );


    /**
    * Indica si el recipiente tiene exactamente la misma
    * capacidad total que otro . Solo revisamos la capacidad total ,
    * las dimensiones pueden variar .
    *
    * @param otro El recipiente con que se comparar  ́a.
    * @return true si tienen la misma capacidad total , false en otro
    * caso .
    */
    public boolean mismaCapacidad ( Recipiente otro );


    /**
    * Indica si el recipiente tiene mayor cantidad actual que otro .
    *
    * @param otro El recipiente con que se comparar  ́a.
    * @return true si tiene mayor cantidad , false en otro caso .
    */
    public boolean contieneMas ( Recipiente otro );


    /**
    * Indica si el recipiente tiene mayor capacidad restante que
    * otro .
    *
    * @param otro El recipiente con que se comparar  ́a.
    * @return true si tiene mayor capacidad restante , false en otro
    * caso .
    */
    public boolean cabeMas ( Recipiente otro );


    /**
    * Crea un nuevo recipiente vac  ́ıo cuya capacidad total es igual
    * a la cantidad actual del recipiente invocante .
    * Por ejemplo , a partir de un recipiente A de altura h y radio
    * de su base r que est  ́a lleno solo hasta la mitad , se podr  ́ıa
    * generar un recipiente vac  ́ıo B de altura
    h
    2
    y radio de su base r.

    *
    * @return Un nuevo recipiente vac  ́ıo con capacidad total igual a
    * la cantidad actual del recipiente invocante .
    */
    public Recipiente creaContenedorJusto ();


    /**
    * Devuelve una cadena que exhiba con buen formato las
    * dimensiones , capacidad y cantidad actual del recipiente .
    *
    * @return La cadena correspondiente al recipiente .
    */
    public String muestra ();
}
