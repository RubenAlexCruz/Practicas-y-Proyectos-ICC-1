import java.util.InputMismatchException;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws Exception {
    
        //Declaración de variables que continuamente se utilizarn en cada turno del juego
        Scanner scanner = new Scanner(System.in);
        Juego juego1 = new Juego();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        BarajaDeCartas baraja = juego1.getBaraja();
        int cartasTomadas;
        Carta nuevCarta;
 
        System.out.println("Empieza el juego");

        //Condición que se utilizara para terminar el loop del juego.
        boolean terminar = false;
        //Condición que se utilizara para terminar el loop de cada ronda.
        boolean ronda = false;
        // Condición que se utiliza para terminar el turno del usuario
        boolean avanzar = false;

        //Iteración de toda la secuencia de juego
        while (!terminar) {

            cartasTomadas = 0;
            System.out.println("Cada Jugador ha recibido su carta inicial");
            nuevCarta = baraja.repartirCarta();

            jugador1.agregarLista(nuevCarta);
            nuevCarta= baraja.repartirCarta();

            jugador2.agregarLista(nuevCarta);
            juego1.setBaraja(baraja);

            juego1.nuevoTablero();

            
            System.out.println("Turno del jugador 1");
            avanzar = false;
            
            if(!ronda) {
                while (!avanzar) {
                int z;
                System.out.println("Presione 1 para revisar su lista\npresione 2 para revisar una carta del tablero\npresione 3 si quiere terminar la ronda");
                z = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese únicamente números");   
                if (z==1) {
                    System.out.println(jugador1.verLista());

                } else if (z==2) {
                    if (!avanzar) {
                        System.out.println("Ingrese las coordenadas de la carta que quiere revisar");
                        int i = scanner.nextInt();
                        scanner.nextLine();
                        int j = scanner.nextInt();
                        scanner.nextLine();
                        //Se asume que el usuario eligira una coordada de (1,1) a (5,6) se resta uno para aliniar esta entrada con el array.
                        i--;
                        j--;
                        
                        try {  
                            juego1.getCarta(i, j);
                        }catch (IndexOutOfBoundsException e) {
                            System.out.println("Solo hay 30 cartas en el tablero, eliga enrte 1 y 5 para us primer coordenada y  1 y 6 para su segunda");
                        }

                        if (juego1.getCarta(i, j)==null){
                            System.out.println("Este espacio esta vació porfavor eliga otro");
                            break;
                        }

                        System.out.println(juego1.checarCarta(i, j));

                        System.out.println("Desea agregar esta carta a su lista? presione 1 para si 2 para no");
                        int k=scanner.nextInt();
                        scanner.nextLine();
                        if (k == 1) {
                            jugador1.agregarLista(juego1.getCarta(i, j));
                            cartasTomadas++;
                            avanzar = true;
                        }else if (k==2){

                        }else {
                            System.out.println("Algo salio mal por favor solo eliga entre 1 y 2");
                        }
                    }
                } else if (z==3) {
                    avanzar = true;
                    ronda = true;
                } 

                else {
                    System.out.println("Algo salio mal por favor eliga entre 1, 2 o 3");
                }
            }

            if (!ronda) {
                System.out.println("Turno del jugador 2");
                avanzar = false;
                checarCarta:
                for (int i =0; i < 5; i++){
                    for (int j = 0; j <6; j++){
                        if (juego1.getCarta(i, j) == null) {
                            continue;
                        }else if (jugador2.checarCarta(juego1.getCarta(i, j))) {
                            jugador2.agregarLista(juego1.getCarta(i, j));
                            cartasTomadas++;
                            avanzar = true;
                            break checarCarta;
                        }
                    }
                }

                if (avanzar = false){
                    ronda = true;
                    }
                    
                }


            }

            baraja= juego1.getBaraja();
            if (baraja.getTamaño() < cartasTomadas + 2){
                terminar = true;
            }

            if (jugador1.validarLista()) {
                ListaLigada lista = jugador1.getLista();
                int puntosActuales = jugador1.getPuntos();
                int puntosNuevos = lista.getTamaño();
                jugador1.setPuntos(puntosNuevos+puntosActuales);
            }

            if (jugador2.validarLista()) {
                ListaLigada lista = jugador2.getLista();
                int puntosActuales = jugador2.getPuntos();
                int puntosNuevos = lista.getTamaño();
                jugador2.setPuntos(puntosNuevos+puntosActuales);
            }

            jugador1.borrarLista();
            jugador2.borrarLista();
        }

        System.out.println("puntaje final del jugador 1: " + jugador1.getPuntos());
        System.out.println("puntaje final del jugador 2:" + jugador2.getPuntos());
        System.out.println();
        if (jugador1.getPuntos() < jugador2.getPuntos()){
            System.out.println("Ha ganado la computadora");
        } else if (jugador2.getPuntos() < jugador1.getPuntos()){
            System.out.println("Ha ganado el usuario");
        } else {
            System.out.println("El juego ha terminado en un empate");
        }
    }  
}
