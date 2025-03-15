import java.util.Scanner; 
public class Main {

 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Reloj reloj = new Reloj();

        //Pruebas de la funcionalidad de los metodos de la clase reloj. borre el comentario para accionarlos
        /* 
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
        System.out.println("\nPrueba de que los metodos agregarSegundos y agregarMinutos suman minutos y horas apropiadamente");
        reloj.agregarSegundos(300); 
        System.out.println("\nSe agregan 300 segundos lo cual agrega 5 minutos al reloj:");
        System.out.println(reloj.mostrarAnalogo()+"\n");
        System.out.println("\nSe agregan 280 minutos lo cual agrega 4 horas y 40 minutos al reloj: ")
        reloj.agregarMinutos(280); 
        System.out.println(reloj.mostrarAnalogo());
        */

        System.out.println("Reloj");
        System.out.println("Ingrese 1 para accionar el reloj con un loop for \nIngrese 2 para accionar el reloj con un metodo while \nIngrese 3 para accionar el reloj con un metodo do while ");
        int resp = scanner.nextInt();
        
        switch (resp) {
            case 1:
                reloj.setHoras(11);
                reloj.setMinutos(55);
                reloj.setSegundos(30);
                for (int i = 0 ; i < 12 ; i++ ) {
                    System.out.println(reloj.mostrarAnalogo());
                    reloj.agregarSegundos(30);
                    Thread.sleep(1000); // Utilizo un segundo de pausa para que sea facil leer el progreso del metodo
                }
                break;
            case 2:
                int i = 0;
                reloj.setHoras(11);
                reloj.setMinutos(52);
                reloj.setSegundos(0);
                while (i <= 12 ) {
                    System.out.println(reloj.mostrarAnalogo());
                    reloj.agregarSegundos(5);
                    reloj.agregarMinutos(1);
                    i++;
                    Thread.sleep(1000);
                }
                break;
            case 3: 
                reloj.setHoras(7);
                reloj.setMinutos(2);
                reloj.setSegundos(20);
                int j = 0;
                do { 
                    System.out.println(reloj.mostrarAnalogo());
                    reloj.agregarHoras(1);
                    reloj.agregarMinutos(8);
                    reloj.agregarSegundos(20);
                    j++;
                    Thread.sleep(1000);
                } while (j < 8);
                
                break;
            default:
                System.out.println("Error porfavor ingrese únicamente 1, 2 o 3");
        }

 
    }
}
