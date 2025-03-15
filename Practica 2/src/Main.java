public class Main {
    public static void main(String[] args) throws Exception {
        Reloj reloj = new Reloj();
        //Pruebas de la funcionalidad de los metodos de la clase reloj borre el comentario para accionarlos

        System.out.println("Prueba del metodo mostrarAnalogo en ceros");
        System.out.println(reloj.mostrarAnalogo());
        System.out.println();
        reloj.setHoras(2);
        reloj.setMinutos(30);
        reloj.setSegundos(48);
        System.out.println("\nPruebas set reloj a la hora 2:30:48");
        System.out.println(reloj.mostrarAnalogo());
        System.out.println("\nPrueba agregarSegundos agregando 12 segundos");
        reloj.agregarSegundos(12);
        System.out.println(reloj.mostrarAnalogo());
        System.out.println("\nPrueba agregarminutos agregando 30 minutos");
        reloj.agregarMinutos(30);
        System.out.println(reloj.mostrarAnalogo());
        System.out.println("\nPrueba agregarhoras agregando 10 horas");
        reloj.agregarHoras(10);
        System.out.println(reloj.mostrarAnalogo());
        System.out.println("\nPrueba para gets de hora, minutos y segundos");
        System.out.println("Hora actual: " + reloj.getHora());
        System.out.println("Minuto actual: " + reloj.getMinutos());
        System.out.println("Segundo actual: " + reloj.getSegundos());

    }
}
