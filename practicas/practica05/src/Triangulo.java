public class Triangulo extends FiguraGeometrica {

//Asumir que el triángulo es equilatero hasta que se indique lo contrario.
    private double altura;

    /**
     * Metodo constructor de un triángulo equilatero.
     * El perímetro, la altura y el area se calculan con el valor de la base. 
     * El permíetro siendo la suma de los 3 lados
     * La altura siendo el resultado de la ecuación h^2=(b/2)^2 + a^2
     * El area siendo b*a/2.
     *
     * @param base
     */
    public Triangulo(int base) {
        this.base = base;
        this.perimetro = base*3;
        this.altura = (Math.sqrt(3)/2) * base; //Simplificación de la ecuación de la altura de un triángulo equilatero dado que la hipotenusa y la base son iguales.
        this.area = (base * altura)/2;
    }

    /**
     * Metodo para conseguir la altura del triángulo
     * 
     * @return altura
     */
    public double getAltura () {
        return this.altura;
    }

    /**
     * Metodo para cambiar la base de un triángulo. Al cambiar la base se cambian todos los otros atributos.
     * 
     * @param base
     */
    public void setBase(int base){
        this.base = base;
        this.perimetro = base*3;
        this.altura = (Math.sqrt(3)/2) * base;
        this.area = (base * altura)/2;
    }


    /**
     * Metodo que imprime en la consola un triángulo con * donde cada * representa una unidad.
     * 
     * @return un String arbitrario dado que de lo contrario da un error porque un metodo toString no puede ser de tipo void.
     */
    public String toString() {
        String resp = "";
        //Iteración para el número de filas que se necesita.
        for (int i = 1; i <= this.base; i++) { 

            //iteración para cuantos espacios se necesitan antes de *.
            for (int j = this.base; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            //Iteración de cuantas * se necesitan.
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
            //Cambio de linea
            System.out.println(); 
        } 
        return resp;
    }

    

}
