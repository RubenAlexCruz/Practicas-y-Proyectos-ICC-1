public interface ServiciosRecipiente {

    public double capacidad();
    public double capacidadRestante();
    public boolean estaVacio();
    public boolean estaLleno();
    public double rellena(double cantidad);
    public double vacia();
    public void vierte(Recipiente otro);
    public boolean mismasDimensiones(Recipiente otro);
    public boolean mismaCapacidad(Recipiente otro);
    public boolean contieneMas(Recipiente otro);
    public boolean cabeMas(Recipiente otro);
    public Recipiente creaContenedorJusto();
    public String muestra();
}
