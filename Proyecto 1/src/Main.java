public class Main {
    public static void main(String[] args) throws Exception {
        Recipiente R1test = new Recipiente(5, 2,0);
        Recipiente R2test = new Recipiente(1, 1, 10);
        Recipiente R3test= new Recipiente(10, 4, 18);
        
        //Prueba muestra
        System.out.println("Muestras de los 3 contenedores creados: ");
        System.out.println();
        System.out.println(R1test.muestra());
        System.out.println(R2test.muestra());
        System.out.println(R3test.muestra());
        System.out.println();

        //Prueba creContenedorJusto
        System.out.println("Muestra de creación de un contenedor justo de R3:" + "\n");
        Recipiente R4test = R3test.creaContenedorJusto();
        System.out.println(R4test.muestra());
        System.out.println();

        //Prueba vierte
        System.out.println("Prueba para vierte" + "\n");
        System.out.println("Liquido antes de vertir de R1: " + R1test.getLiquido() + "\n" + "Liquido antes de vertir de R3: " + R3test.getLiquido());
        R3test.vierte(R1test);
        System.out.println("Liquido actual de R3: " + R3test.getLiquido());
        System.out.println("Liquido actual de R1: " + R1test.getLiquido());
        System.out.println();

        //Prueba contieneMas
        System.out.println("Pruebas para conteineMas:" + "\n");
        System.out.println("\n" + "Contenido de R2: " + R2test.getLiquido() + "\n" + "Contenido de R3: " + R3test.getLiquido());
        System.out.println("Resultado R3 contiene mas que R2: " + R3test.contieneMas(R2test));
        System.out.println("Resultado R2 contiene mas que R3: " + R2test.contieneMas(R3test));
        System.out.println();

        //Prueba cabeMas
        System.out.println("Pruebas para cabeMas:" + "\n");
        System.out.println("Capacidad Restante de R2: " + R2test.capacidadRestante() + "\n" + "Capacidad Restante de R3: " + R3test.capacidadRestante());
        System.out.println("Resultado cabeMas de R2 a R3: " + R2test.cabeMas(R3test));
        System.out.println("Resultado cabeMas de R3 a R2: " + R3test.cabeMas(R2test));
        System.out.println();

        //Prueba estaLleno
        System.out.println("Pruebas para estaLleno:" + "\n");
        System.out.println("Capacidad restante de R3: " + R3test.capacidadRestante() + "\n" + "Capacidad restante de R2: " + R2test.capacidadRestante());
        System.out.println("Resultado estaLleno de R3: " + R3test.estaLleno());
        System.out.println("Resultado estaLleno de R2: " + R2test.estaLleno());
        System.out.println();

        //Prueba estaVacio
        System.out.println("Pruebas para estaVacio:" + "\n");
        System.out.println("Capacidad de R3: " + R3test.capacidad() + " Capacidad Restante de R3: " + R3test.capacidadRestante());
        System.out.println("Resultado de estaVacio R3: " + R3test.estaVacio());
        System.out.println("Capacidad de R2: " + R2test.capacidad() + " Capacidad Restante de R2: " + R2test.capacidadRestante());
        System.out.println("Resultado de estaVacio R2: " + R2test.estaVacio());
        System.out.println();

        //Prueba capacidad
        System.out.println("Pruebas para capacidad" + "\n");
        System.out.println("Volumen de R4: " + (R4test.getAltura() * R4test.getRadio() * R4test.getRadio() * Math.PI)); //Ecuación del volumen de un cilindro
        System.out.println("Resultado capacidad de R4: " + R4test.capacidad());
        System.out.println("Volumen de R2: " + (R2test.getAltura() * R2test.getRadio() * R2test.getRadio() * Math.PI));
        System.out.println("Resultado capacidad de R2: " + R2test.capacidad());
        System.out.println();

        //Prueba capacidadRestante
        System.out.println("Prueba para capacidadRestante: " + "\n");
        System.out.println("Capacidad de R4: " + R4test.capacidad() + " Liquido de R4: " + R4test.getLiquido());
        System.out.println("Resultado capacidadRestante de R4: " + R4test.capacidadRestante());
        System.out.println("Capacidad de R2 " + R2test.capacidad() + " Liquido de R2: " + R2test.getLiquido());
        System.out.println(R2test.capacidadRestante());
        System.out.println();

        //Prueba rellena
        System.out.println("Prueba para rellena: " + "\n");
        System.out.println("Cotenido de R2 antes de rellenar : " + R2test.getLiquido());
        System.out.println( "Resultado de rellena: " + R2test.rellena(5));
        System.out.println("Contenido de R2 despues de rellenar: " + R2test.getLiquido());
        System.out.println("\n" + "Contenido de R4 antes de rellenar: " + R4test.getLiquido());
        System.out.println("Reultado de rellena: " + R4test.rellena(15));
        System.out.println("Contenido de R4 despues de rellenar: " + R4test.getLiquido());
        System.out.println();

        //Prueba mismasDimensiones
        Recipiente R5test = new Recipiente(1, 1, 0);
        System.out.println("Prueba para mismasDimensiones: " + "\n");
        System.out.println("Dimensiones de R3. Altura: " + R3test.getAltura() + " Radio: " + R3test.getRadio());
        System.out.println("Dimensiones de R4. Altura: " + R4test.getAltura() + " Radio: " + R4test.getRadio());
        System.out.println("Resultado de mismasDimensiones: " + R3test.mismasDimensiones(R4test) + "\n");
        System.out.println("Dimensiones de R2. Altura: " + R2test.getAltura() + " Radio: " + R2test.getRadio());
        System.out.println("Dimensiones de R5. Altura: " + R5test.getAltura() + " Radio: " + R5test.getRadio());
        System.out.println("Resultado de mismasDimensiones: " + R2test.mismasDimensiones(R5test));
        System.out.println();

        //Prueba mismaCapacidad
        Recipiente R6test = new Recipiente(40, 2, 0);
        System.out.println("Prueba para mismaCapacidad: " + "\n");
        System.out.println("Capacidad de R1: " + R1test.capacidad() + "\n" + "Capacidad de R4: " + R4test.capacidad() + "\n" + "Resultado: ");
        System.out.println(R1test.mismaCapacidad(R4test));
        System.out.println();
        System.out.println("Capacidad de R6: " + R6test.capacidad() + "\n" + "Capacidad de R3: " + R3test.capacidad() + "\n" + "Resultado: ");
        System.out.println(R6test.mismaCapacidad(R3test));
    }
}
