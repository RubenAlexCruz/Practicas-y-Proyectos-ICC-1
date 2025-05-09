public class Rectangulo extends FiguraGeometrica{

    private int altura;

    /**
     * Metodo constructor de un rectangulo con cierta altura y base.
     * Se calcula el perimetro del rectuangulo como dos veces la suma de su base y su altura.
     * Se cualcula el area como la base multiplicado por la altura.
     * 
     * @param base
     * @param altura
     */
    public Rectangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
        this.perimetro = 2*base + 2*altura;
        this.area = base * altura;
    }

    /**
     * Metodo para conseguir la altura del rectangulo 
     * 
     * @return altura
     */
    public int getAltura(){
        return this.altura;
    }


    /**
     * Metodo para modificar la altura del rectangulo.
     * Se vuelve a calcular los valores del perimetro y de area.
     * 
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
        this.perimetro = 2*altura + this.base*2;
        this.area = this.base * altura;
    }

    /**
     * Metodo para modifical la base del rectangulo.
     * Se vuelve a calcular los valores del perimetro y del area.
     * 
     * @param base
     */
    public void setBase (int base){
        this.base = base;
        this.perimetro = 2*base + this.altura*2;
        this.area = this.altura * base;
    }

    /**
     * Metodo que imprime en la consola un rectangulo con * donde cada * representa una unidad.
     * 
     * @return un String arbitrario dado que de lo contrario da un error porque un metodo toString no puede ser de tipo void.
     * 
     */
    public String toString() {
       String resp = "";

       int a, b;
 
       //Iteración para las filas
       for (a = 1; a <= this.altura; a++) {
            //Iteración para las columnas
           for (b = 1; b <= this.base; b++) {
               //Condicional para agregar * si se esta en el perimetro del rectangulo.
               if (a == 1 || a == this.altura|| b == 1 || b == this.base)
                   System.out.print("*");
               else   
                   System.out.print(" ");
           }

          
           System.out.println();
       }

       return resp;
    }



}
