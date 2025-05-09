public abstract class FiguraGeometrica {

    /**
     * Parametros en comun de todas las figuars.
     */
    protected double area;
    protected int perimetro;
    protected int base;

    /**
     * Metodo para conseguir la base de cualquier figura.
     * @return base
     */
    public int getBase(){
        return this.base;
    }
    /**
     * Metodo para conseguir el are de cualquier figura
     * Se calcula el area en cada figura individualmente dado que es diferente dependiendo de la figura.
     * @return area
     */
    public double getArea(){
        return this.area;
    }

    /**
     * Metodo para conseguir el permietro de cualquier figura
     * Se calcula el perimetro en cada figura individualmente dado que es diferente dependiendo de la figura.
     * @return perimetro
     */
    public int getPerimetro (){
        return this.perimetro;
    }

    /**
     * Metodo abstracto para modificar la base de cada figura.
     * Se mantiene abstracto este metodo dado que la modificación del area y el perimetro es diferente para cada figura.
     * 
     * @param base
     */
    public abstract void setBase(int base);

    /**
     * Metodo abstracto para imprimir en la consola la figura con *.
     */
    public abstract String toString();

}
