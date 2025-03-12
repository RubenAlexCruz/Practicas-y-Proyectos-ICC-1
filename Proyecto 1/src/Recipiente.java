public class Recipiente implements ServiciosRecipiente {
    private double altura;
    private double radio;
    private double liquido;
    private double volumen;

    public Recipiente (double altura, double radio, double liquido){
        this.altura = altura;
        this.radio = radio;
        this.liquido =liquido;
        this.volumen = this.altura * this.radio * this.radio * Math.PI; // Ecuacion del volumen de un cilindro. altura * radio^2 * Pi
        //Utilizo el volumen como atributo para tener accesso facil a este

        // Manera de checar que el volumen de liquido no supere la capacidad máxima del recipiente y si si establecer el liquido como la capacidad máxima
        if (this.liquido > this.volumen){
            System.err.println("Error: Capacidad máxima excedida, cantidad establecida como el máximo" + "\n");
            this.liquido = this.volumen;
        }
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }

    public void setVolumen(double volumen){
        this.volumen = volumen;
    }

    public double getRadio() {
        return radio;
    }

    public double getLiquido() {
        return liquido;
    }

    public double getAltura(){
        return this.altura;
    }

    public double capacidad() {
        return this.volumen;

    }
 
    public double capacidadRestante() {
        return this.volumen - this.liquido;
    }

    
    public boolean estaVacio() {
        if (this.liquido == 0){
            return true;
        } else {
            return false;
        }
    }

    
    public boolean estaLleno() {
        if (this.capacidadRestante() == 0) {
            return true;
        } else{
            return false;
        }
    }

    
    public double rellena(double cantidad) {
        double exceso = 0;
        double nuevoLiquido = this.liquido + cantidad;
        if(nuevoLiquido > this.volumen){
            this.liquido = this.volumen;
            exceso = nuevoLiquido - this.volumen;
        }
        return exceso;
    }

    
    public double vacia() {
        double resp = this.liquido;
        this.liquido = 0;
        return resp;
    }

    
    public void vierte(Recipiente otro) {
        double nuevoLiquido = this.liquido + otro.liquido;
        if (nuevoLiquido > otro.volumen){
            otro.liquido = otro.volumen;
            this.liquido = nuevoLiquido - otro.volumen; // La nueva cantidad de liquido es el liquido que sobra al vertir.
        } else{
            otro.liquido = nuevoLiquido;
            this.liquido = 0;
        }
    }

    public boolean mismasDimensiones(Recipiente otro) {
        boolean resp = false;
        if (this.altura == otro.altura && this.radio == otro.radio){
            resp = true;
        }
        return resp;
    }

    public boolean mismaCapacidad(Recipiente otro) {
        boolean resp = false;
        if (this.volumen == otro.volumen){
            resp = true;
        }
        return resp;
    }

    
    public boolean contieneMas(Recipiente otro) {
        boolean resp = false;
        if (this.liquido > otro.liquido){
            resp = true;
        }
        return resp;
    }

    
    public boolean cabeMas(Recipiente otro) {
        boolean resp = false;
        if(this.capacidadRestante() > otro.capacidadRestante()){
            resp = true;
        } 
        return resp;
    }

    
    public Recipiente creaContenedorJusto() {
        // Utilizare un radio arbitrario de 2 y generare la altura acorde a eso
        double radio = 2;
        // Reordenando la ecuación del volumen de un cilindro, altura = volumen / (radio^2 * Pi). En este caso el Volumen es la cantidad de liquido del Recipiente invocante. 
        double altura = (this.liquido)/(radio*radio*Math.PI);
        Recipiente nuevo = new Recipiente(altura, radio, 0);
        return nuevo;
    }

    
    public String muestra() {
        String resp = "Las dimensiones del contenedor son" + "\n" + "Altura: " + this.altura + "cm" + "\n" + "Radio " + this.radio + "cm" + "\n" + "Capacidad: " 
        + this.volumen + "cm^3" + "\n" + "Y actualmente contiene " + this. liquido + "cm^3" + "\n";
        return resp;
    }



}
