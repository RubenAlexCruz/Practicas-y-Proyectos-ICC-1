public class Cuadrado extends FiguraGeometrica{

    /**
     * Metodo constructor de un cuadrado.
     * Se calcula el perímetro como la suma de la base 4 veces.
     * Se calcula el area como la base al cuadrado.
     * 
     * @param base
     */
    public Cuadrado (int base) {
        this.base = base;
        this.area = base*base;
        this.perimetro = 4*base;
    }

    /**
     * Metodo para cambiar la base de un cuadrado.
     * Al modificarse la base se vuelve a calcular el area y el perímetro igual que en el metodo constructor.
     * 
     * @param base
     */
    public void setBase(int base) {
        this.base = base;
        this.area = base*base;
        this.perimetro = 4*base;
    }

    /**
     * Metodo que imprime en la consola un cuadrado con * donde cada * representa una unidad.
     * 
     * @return un String arbitrario dado que de lo contrario da un error porque un metodo toString no puede ser de tipo void.
     * 
     */
    public String toString() {
        int i,j;
        String resp = "";
        //Iteración para las filas
        for (i = 1; i <= this.base; i++) {
            //Iteración para las columnas
            for (j = 1; j <= this.base; j++) {
                //Condicional para agregar * si se esta en el perimetro del cuadrado.
                if (i == 1 || i == this.base|| j == 1 || j == this.base){
 
                    
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            // Cambio de linea 
            System.out.println();
        
    }   
    return resp;
    }
}
