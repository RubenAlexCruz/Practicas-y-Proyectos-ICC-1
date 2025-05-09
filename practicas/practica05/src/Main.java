public class Main {
    public static void main(String[] args) throws Exception {

        Cuadrado c1 = new Cuadrado(2);
        Cuadrado c2 = new Cuadrado(5);
        Triangulo t1 = new Triangulo(6);
        Rectangulo r1 = new Rectangulo(2, 5);

        System.out.println("Perimetro y area de c1.");
        System.out.println("Perimetro de c1: " + c1.getPerimetro());
        System.out.println("Area de c1: " + c1.getArea() + "\n");

        System.out.println("Perimetro y area de c2.");
        System.out.println("Perimetro de c2: " + c2.getPerimetro());
        System.out.println("Area de c2: " + c2.getArea() + "\n");

        System.out.println("Perimetro y area de t1.");
        System.out.println("Perimetro de t1: " + t1.getPerimetro());
        System.out.println("Area de t1: " + t1.getArea() + "\n");

        System.out.println("Perimetro y area de r1.");
        System.out.println("Perimetro de r1: " + r1.getPerimetro());
        System.out.println("Area de r1: " + r1.getArea() + "\n");

        System.out.println("t1 toString: ");
        t1.toString();
        System.out.println();
        
        System.out.println("r1 toString: ");
        r1.toString();
        System.out.println();

        System.out.println("c1 toString: ");
        c1.toString();
        System.out.println();

        System.out.println("c2 toString: ");
        c2.toString();

    }
}
