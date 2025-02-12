import java.util.Scanner;

public class main {

    private static double Sumar(double a, double b){
        return a+b;
    }
    private static double Multiplicar(double a, double b){
        return a*b;
    }
    private static double Dividir(double a, double b){
        return a/b;
    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("Para Sumar Presione 1" + "\n" + "Para Multiplicar Presione 2" + "\n" + "para Dividir persione 3");
        
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

        }else {
            System.out.println("Error detectado porfavor ingrese 1, 2 o 3");
            System.exit(0);
        }
    }
}
