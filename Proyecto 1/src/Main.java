public class Main {
    public static void main(String[] args) throws Exception {
        Recipiente r1 = new Recipiente(5, 2,0);
        Recipiente r2 = new Recipiente(1, 1, 10);
        Recipiente r3= new Recipiente(10, 4, 18);
        
        //Prueba muestra
        System.out.println("Muestras de los 3 contenedores creados: ");
        System.out.println();
        System.out.println(r1.muestra());
        System.out.println(r2.muestra());
        System.out.println(r3.muestra());
        System.out.println();

        //Prueba creContenedorJusto
        System.out.println("Muestra de creación de un contenedor justo de R3:" + "\n");
        Recipiente r4 = r3.creaContenedorJusto();
        System.out.println(r4.muestra());
        System.out.println();

        //Prueba vierte
        System.out.println("Prueba para vierte" + "\n");
        System.out.println("Liquido antes de vertir de R1: " + r1.getLiquido() + "\n" + "Liquido antes de vertir de R3: " + r3.getLiquido());
        r3.vierte(r1);
        System.out.println("Liquido actual de R3: " + r3.getLiquido());
        System.out.println("Liquido actual de R1: " + r1.getLiquido());
        System.out.println();

        //Prueba contieneMas
        System.out.println("Pruebas para conteineMas:" + "\n");
        System.out.println("\n" + "Contenido de R2: " + r2.getLiquido() + "\n" + "Contenido de R3: " + r3.getLiquido());
        System.out.println("Resultado R3 contiene mas que R2: " + r3.contieneMas(r2));
        System.out.println("Resultado R2 contiene mas que R3: " + r2.contieneMas(r3));
        System.out.println();

        //Prueba cabeMas
        System.out.println("Pruebas para cabeMas:" + "\n");
        System.out.println("Capacidad Restante de R2: " + r2.capacidadRestante() + "\n" + "Capacidad Restante de R3: " + r3.capacidadRestante());
        System.out.println("Resultado cabeMas de R2 a R3: " + r2.cabeMas(r3));
        System.out.println("Resultado cabeMas de R3 a R2: " + r3.cabeMas(r2));
        System.out.println();

        //Prueba estaLleno
        System.out.println("Pruebas para estaLleno:" + "\n");
        System.out.println("Capacidad restante de R3: " + r3.capacidadRestante() + "\n" + "Capacidad restante de R2: " + r2.capacidadRestante());
        System.out.println("Resultado estaLleno de R3: " + r3.estaLleno());
        System.out.println("Resultado estaLleno de R2: " + r2.estaLleno());
        System.out.println();

        //Prueba estaVacio
        System.out.println("Pruebas para estaVacio:" + "\n");
        System.out.println("Capacidad de R3: " + r3.capacidad() + " Capacidad Restante de R3: " + r3.capacidadRestante());
        System.out.println("Resultado de estaVacio R3: " + r3.estaVacio());
        System.out.println("Capacidad de R2: " + r2.capacidad() + " Capacidad Restante de R2: " + r2.capacidadRestante());
        System.out.println("Resultado de estaVacio R2: " + r2.estaVacio());
        System.out.println();

        //Prueba capacidad
        System.out.println("Pruebas para capacidad" + "\n");
        System.out.println("Volumen de R4: " + (r4.getAltura() * r4.getRadio() * r4.getRadio() * Math.PI)); //Ecuación del volumen de un cilindro
        System.out.println("Resultado capacidad de R4: " + r4.capacidad());
        System.out.println("Volumen de R2: " + (r2.getAltura() * r2.getRadio() * r2.getRadio() * Math.PI));
        System.out.println("Resultado capacidad de R2: " + r2.capacidad());
        System.out.println();

        //Prueba capacidadRestante
        System.out.println("Prueba para capacidadRestante: " + "\n");
        System.out.println("Capacidad de R4: " + r4.capacidad() + " Liquido de R4: " + r4.getLiquido());
        System.out.println("Resultado capacidadRestante de R4: " + r4.capacidadRestante());
        System.out.println("Capacidad de R2 " + r2.capacidad() + " Liquido de R2: " + r2.getLiquido());
        System.out.println(r2.capacidadRestante());
        System.out.println();

        //Prueba rellena
        System.out.println("Prueba para rellena: " + "\n");
        System.out.println("Cotenido de R2 antes de rellenar : " + r2.getLiquido());
        System.out.println( "Resultado de rellena: " + r2.rellena(5));
        System.out.println("Contenido de R2 despues de rellenar: " + r2.getLiquido());
        System.out.println("\n" + "Contenido de R4 antes de rellenar: " + r4.getLiquido());
        System.out.println("Reultado de rellena: " + r4.rellena(15));
        System.out.println("Contenido de R4 despues de rellenar: " + r4.getLiquido());
        System.out.println();

        //Prueba mismasDimensiones
        Recipiente r5 = new Recipiente(1, 1, 0);
        System.out.println("Prueba para mismasDimensiones: " + "\n");
        System.out.println("Dimensiones de R3. Altura: " + r3.getAltura() + " Radio: " + r3.getRadio());
        System.out.println("Dimensiones de R4. Altura: " + r4.getAltura() + " Radio: " + r4.getRadio());
        System.out.println("Resultado de mismasDimensiones: " + r3.mismasDimensiones(r4) + "\n");
        System.out.println("Dimensiones de R2. Altura: " + r2.getAltura() + " Radio: " + r2.getRadio());
        System.out.println("Dimensiones de R5. Altura: " + r5.getAltura() + " Radio: " + r5.getRadio());
        System.out.println("Resultado de mismasDimensiones: " + r2.mismasDimensiones(r5));
        System.out.println();

        //Prueba mismaCapacidad
        Recipiente r6 = new Recipiente(40, 2, 0);
        System.out.println("Prueba para mismaCapacidad: " + "\n");
        System.out.println("Capacidad de R1: " + r1.capacidad() + "\n" + "Capacidad de R4: " + r4.capacidad() + "\n" + "Resultado: ");
        System.out.println(r1.mismaCapacidad(r4));
        System.out.println();
        System.out.println("Capacidad de R6: " + r6.capacidad() + "\n" + "Capacidad de R3: " + r3.capacidad() + "\n" + "Resultado: ");
        System.out.println(r6.mismaCapacidad(r3));
    }
}
