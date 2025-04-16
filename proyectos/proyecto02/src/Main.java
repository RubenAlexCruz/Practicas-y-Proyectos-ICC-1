import java.util.Scanner;
public class Main {

    /**
    * Toma la n-ésima letra de cada palabra para obtener el mensaje
    * oculto.
    *
    * @param original El mensaje original.
    * @param n El índice que se tiene que tomar de cada palabra.
    * @return El mensaje oculto, sin espacios.
    *
    * @author Rubén Cruz
    */
    public static String descifraNulo ( String original , int n ){
        String resp = "";
        int i = 0;
        int m = 1;
        //Se emplea un algoritmo que busca el inicio de cada palabra del mensaje y agrega el índice n de la palabra al resultado
        // i se utiliza como el contador de indices del mensaje total y m como contador de los indices de las palabras.
        while ( i< original.length()){
            char c = original.charAt(i);
            //Si el caracter es un espacio esto se toma como el final de la palabra y m se reinicia a 1.
            if (c == ' '){
                i ++;
                m = 1;
            } else {
                // Si el contador de letras es igual al parametro n se agrega al resultado y continua con el algoritmo de busqueda
                // De lo contrario continua con el algoritmo.
                if (m == n) {
                resp += c;
                m++;
                i++;
                } else {
                    i++;
                    m++;
                }
            }
        }
        //En todo caso i se incrementa por 1. m se incremente solo si el caracter actual no es un espacio.
            return resp;

    }
    /**
    * Toma la n-ésima letra de cada palabra para obtener el mensaje
    * oculto.
    *
    * @param original El mensaje original con n espacios al final.
    * @return El mensaje oculto, sin espacios.
    *
    * @author Rubén Cruz
    */
    public static String descifraNulo ( String original ){
        String modificacion = original;
        int n = 0;
        // n sirve como un contador de los espacios al final del mensaje que se utiliz como el parametro n del metodo descifraNulo.
        while (modificacion.endsWith( " ")){
            int i = modificacion.length();
            n ++;
            modificacion = modificacion.substring(0, i -1);
        }
        //Se utiliza el metodo descifrarNulo habiendo eliminado los espacios extra del final del mensaje.
        return descifraNulo(modificacion, n);

    }
    /**
    * Busca un nombre oculto en un texto arbitrario ignorando
    * espacios, signos de puntuación y sin hacer distinciones
    * entre mayúsculas y minúsculas.
    *
    * @param mensaje Una cadena arbitraria donde se hará la
    * búsqueda.
    * @param nombre El nombre que se buscará en el texto.
    * @return true si el mensaje está contenido, false en otro
    * caso.
    *
    * @author Rubén Cruz
    */
    public static boolean contieneNombre ( String mensaje , String nombre ){
        //Elimina todo lo que no sea un caracter de tipo letra del mensaje original.
        String str = mensaje.replaceAll("\\W", "");
        nombre = nombre.toLowerCase();
        str = str.toLowerCase();
        //convierte todo lo restante en minusculas para unicamente buscar el nombre que tambien se convierte a minusculas.
        return str.contains(nombre);

    }
    /**
    * Reconstruye el mensaje oculto a partir de las palabras
    * especiales que se obtienen al comparar dos textos.
    *
    * @param m Un texto arbitrario.
    * @param e Un texto similar al primero, pero con algunas
    * palabras especiales.
    * @return El mensaje oculto.
    *
    * @author Rubén Cruz
    */
    public static String descifraPalabrasMarcadas ( String m , String e ){
        // Se utilizan 4 contadores: i y j como los contadores de los indices totales de los mensajes m y e respectivamente
        // n y o como los contadores de los indices de las palabras de los mensajes m y e respectivamente.
        int i = 0;
        int n = 0;
        int j = 0;
        int o = 0;
        String resp = "";
        boolean exit = false;
        //Se utiliza una condicion exit para salir de los loops si ya no hay caracteres por leer.
        while (!exit){
            //Para cada palabra en los mensajes se crea una copia contando el numero de indices en ella y creando un substring que sea únicamente la palabra.
            while (m.charAt(i) != ' '){
                n++;
                i++;
                if (i == m.length()){
                    exit = true;
                    break;
                }
            }
            String palabraM = m.substring(i-n, i);

            //Se utiliza el mismo algoritmo para ambos mensajes
            while (e.charAt(j) != ' '){
                o++;
                j++;
                if(j == e.length()){
                    exit = true;
                    break;
                }
            }
            String palabraE = e.substring(j-o, j);
    
            //Si las palabras no son iguales se agrega la no alterada al resultado del mensaje
            if (!palabraE.equals(palabraM)){
                resp += (palabraM + " ");
            }
            i++;
            j++;
            n = 0;  
            o = 0;
            //Si no se ha cumplido la condicion de salida vuelve a iniciar el algoritmo en la siguiente palabra de cada mensaje.
        }
        return resp; 

    }
    /**
    * Reconstruye el mensaje oculto a partir de las letras
    * especiales que se obtienen al comparar dos textos.
    *
    * @param m Un texto arbitrario.
    * @param e Un texto similar al primero, pero con algunas
    * letras especiales.
    * @return El mensaje oculto.
    *
    * @author Rubén Cruz
    */
    public static String descifraLetrasMarcadas ( String m , String e ){
        //Como la diferencia entre letras es lo único que importa se eliminan los espacios de ambos mensajes.
        String nuevoE = e.replaceAll("\\s", "");
        String nuevoM = m.replaceAll("\\s", "");
        String resp = "";
        //Para cada caracter en los mensajes se agrega únicamente aquellos que no sean iguales al resultado.
        //Se agregan los caracteres del mensaje m dado que esos son los que no tiene modificaciones.
        for (int i = 0 ; i < nuevoE.length(); i++){
            if (nuevoE.charAt(i) != nuevoM.charAt(i)){
                resp += nuevoM.charAt(i);
            }
        }
        
        
        return resp;

        
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Pruebas de los metodos con los ejemplos dados en el documento del proyecto. Borre el comentario para accionarlas.
        /* 
        System.out.println(descifraNulo("President's Embargo Ruling Should Have Immediate Notice. Grave Situation Affecting Inernational Law. Statement Foreshadow Ruin Of Many Neutrals. Yellow Journals Unifying National Excitment Immensley." , 1));
        System.out.println(descifraNulo("LAS TROPAS PASAN   "));
        System.out.println(contieneNombre("Y en ti de tal guisa beldad pues se asienta, No seas cruel en así dar afrenta", "Elena"));
        System.out.println(descifraPalabrasMarcadas("Mañana tal vez nos preocupemos por cómo nos vemos.", "mañana tal vez noz preocupemos por cómo nos vennos."));
        System.out.println(descifraLetrasMarcadas("No puedo coser porque no tengo hílo.", "No puedo cocer porque no tengo h!lo."));
        
        */

        System.out.println("Ingrese 1 para el metodo decifrar nulo \n Ingrese 2 para el metodo encontrar nombres escondidos \n ingrese 3 para decifrar palabras marcadas \n Ingrese 4 para decifrar letras marcadas.");
        int a = scanner.nextInt();
        scanner.nextLine();
        switch (a) {
            case 1:
                System.out.println("Ingrese 1 para utilizar el metodo donde usted ingresa que letra se debe de leer. \n Ingrese 2 para utilizar el metodo dodnde se lee el número de espacios al final del mensaje.");
                int b = scanner.nextInt();
                scanner.nextLine();
                if (b == 1) {

                    System.out.println( "Ingrese el mensaje original.");
                    String mensajeNulo1 = scanner.nextLine();
                    System.out.println("Ingrese el número de letra que se tiene que leer de cada palabra.");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Resultado: " + descifraNulo(mensajeNulo1, n));

                } else if (b == 2) {
                    System.out.println( "Ingrese el mensaje original.");
                    String mensajeNulo2 = scanner.nextLine();
                    System.out.println("Resultado: " + descifraNulo(mensajeNulo2));
                } else {
                    System.out.println("Error. únicamente ingrese el número 1 o 2.");
                }
                
                break;
        
            case 2:
                System.out.println("porfavor ingrese el mensaje en el cual se buscara el nombre.");
                String mensajeNombre = scanner.nextLine();
                System.out.println("Ingrese el nombre que se buscara en el mensaje.");
                String nombre = scanner.nextLine();
                System.out.println("Resultado: " + contieneNombre(mensajeNombre, nombre));
                break;
            
            case 3:

                System.out.println("Porfavor ingrese la versión sin modificaciones del mensaje.");
                String mensaje1Palabra = scanner.nextLine();
                System.out.println("Porfavor ingrese la versión con modificaciones del mensaje.");
                String mensaje2Palabra = scanner.nextLine();
                System.out.println("Resultado: " + descifraPalabrasMarcadas(mensaje1Palabra, mensaje2Palabra));
                break;
                
            
            case 4:

                System.out.println("Porfavor ingrese la versión sin modificaciones del mesnaje.");
                String mensaje1Letras = scanner.nextLine();
                System.out.println("Porfavor ingrese la versión con modificaciones del mensaje.");
                String mensaje2Letras = scanner.nextLine();
                System.out.println("Resultado: " + descifraLetrasMarcadas(mensaje1Letras, mensaje2Letras));
                break;

            default:
                System.out.println("Error, únicamente ingrese los numeros 1 2 3 o 4");
                break;
        }


    }
}
