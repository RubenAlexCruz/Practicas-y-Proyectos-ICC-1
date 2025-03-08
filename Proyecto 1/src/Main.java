public class Main {
    public static void main(String[] args) throws Exception {
        Recipiente R1test = new Recipiente(5, 2,0);
        Recipiente R2test = new Recipiente(1, 1, 10);
        Recipiente R3test= new Recipiente(10, 4, 18);
        
        System.out.println("Muestras de los 3 contenedores creados: ");
        System.out.println();
        System.out.println(R1test.muestra());
        System.out.println(R2test.muestra());
        System.out.println(R3test.muestra());
        System.out.println();

        System.out.println("Muestra de creación de un contenedor justo de R3:");
        Recipiente R4test = R3test.creaContenedorJusto();
        System.out.println(R4test.muestra());
        System.out.println();

        System.out.println("Prueba del método vierte de R3 a R1");
        R3test.vierte(R1test);
        System.out.println("Liquido actual de R3: " + R3test.getLiquido());
        System.out.println("Liquido actual de R1: " + R1test.getLiquido());
        System.out.println();

        System.out.println("Pruebas para conteineMas:");
        System.out.println(R3test.contieneMas(R2test));
        System.out.println(R2test.contieneMas(R3test));
        System.out.println();

        System.out.println("Pruebas para cabeMas:");
        System.out.println(R2test.cabeMas(R3test));
        System.out.println(R3test.cabeMas(R2test));
        System.out.println();

        System.out.println("Pruebas para estaLleno:");
        System.out.println(R3test.estaLleno());
        System.out.println(R2test.estaLleno());
        System.out.println();

        System.out.println("Pruebas para estaVacio:");
        System.out.println(R3test.estaVacio());
        System.out.println(R2test.estaVacio());
        System.out.println();

        System.out.println("Pruebas para capacidad");
        System.out.println(R4test.capacidad());
        System.out.println(R2test.capacidad());
        System.out.println();

        System.out.println("Prueba para capacidadRestante");
        System.out.println(R4test.capacidadRestante());
        System.out.println(R2test.capacidadRestante());
        System.out.println();

        System.out.println("Prueba para rellena: ");
        System.out.println(R2test.rellena(5));
        System.out.println(R4test.rellena(15));
        System.out.println();

        Recipiente R5test = new Recipiente(1, 1, 0);
        System.out.println("Prueba para mismasDimensiones: ");
        System.out.println(R3test.mismasDimensiones(R4test));
        System.out.println(R2test.mismasDimensiones(R5test));
        System.out.println();

        Recipiente R6test = new Recipiente(40, 2, 0);
        System.out.println("Prueba para mismaCapacidad: ");
        System.out.println(R1test.mismaCapacidad(R4test));
        System.out.println(R6test.mismaCapacidad(R3test));
        
        
    }
}
