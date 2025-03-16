import java.util.Scanner;

public class Main {

    private static double Sumar(double a, double b){
        return a+b;
    }
    private static double Multiplicar(double a, double b){
        return a*b;
    }
    private static double Dividir(double a, double b){
        return a/b;
    }


    public static void Main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("Para Sumar Presione 1" + "\n" + "Para Multiplicar Presione 2" + "\n" + "Para Dividir persione 3" + "\n" + "Para jugar verdadero o falso persione 4");
        
        int respuestaInt = scanner.nextInt();

        if (respuestaInt == 1){
            System.out.println("Ingrese el primer numero");
            
            double PrimerNumero = scanner.nextDouble();

            System.out.println("Ingrese el segundo numero");

            double SegundoNumero = scanner.nextDouble();

            System.out.println("El resultado de " + PrimerNumero + " + " + SegundoNumero + " es " + Sumar(PrimerNumero, SegundoNumero));
            System.exit(0);

        } else if (respuestaInt == 2) {
            System.out.println("Ingrese el primer numero");
            
            double PrimerNumero = scanner.nextDouble();

            System.out.println("Ingrese el segundo numero");

            double SegundoNumero = scanner.nextDouble();

            System.out.println("El resultado de " + PrimerNumero + " * " + SegundoNumero + " es " + Multiplicar(PrimerNumero, SegundoNumero));
            System.exit(0);

        } else if (respuestaInt == 3){
            System.out.println("Ingrese el primer numero");
            
            double PrimerNumero = scanner.nextDouble();

            System.out.println("Ingrese el segundo numero");

            double SegundoNumero = scanner.nextDouble();

            System.out.println("El resultado de " + PrimerNumero + " / " + SegundoNumero + " es " + Dividir(PrimerNumero, SegundoNumero));
            System.exit(0);

        } else if (respuestaInt == 4){
            int randomInt = (int)(Math.random() * 2);
            System.out.println("Se ha elegido un numero aleatorio entre 0 y 1" + "\n" + "Escriba 'false' si cree que el numero es 0 o 'true' si cree que el numero es 1");
            boolean respuestaJuego = scanner.nextBoolean();
            if (respuestaJuego && (randomInt == 1)){
                System.out.println("Felicidades ha ganado el juego");
                System.exit(0);
            } else if (!respuestaJuego && (randomInt == 0)) {
                System.out.println("Felicidades ha ganado el juego");
                System.exit(0);

            } else {
                System.out.println("Lo lamento ha perdido el juego");
                System.exit(0);
            }

        } else {
            System.out.println("Error detectado porfavor vuelva a ejecutar el programa e ingrese unicamente 1, 2, 3 o 4");
            System.exit(0);
        }
    }
}
