public class Main {
    public static void main(String[] args) throws Exception {

        //Declarar nueva lista
        ListaLigada  lista = new ListaLigada();
        System.out.println("toString de la lista vacía: ");
        System.out.println(lista.toString() + "\n");

        //Instertar 5 elementos
        lista.insertar(0);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        System.out.println("toString de la lista con 5 elementos: ");
        System.out.println(lista.toString() + "\n");

        //Eliminar la cabeza
        lista.eliminar(0);
        System.out.println("toString de la lista despues de eliminar la cabeza: ");
        System.out.println(lista.toString()+ "\n" );

        //Eliminar el nodo con elemento 3
        lista.eliminar(3);
        System.out.println("toString de la lista despues de eliminar el elemento 3: ");
        System.out.println(lista.toString() + "\n");

        //Insertar 0 en la posición 2
        lista.insertarIndice(2, 0);
        System.out.println("toString de la lista despues de agregar 0 en la posición 2: ");
        System.out.println(lista.toString() + "\n");

        //Insertar 8 en la posición 8
        lista.insertarIndice(8, 8);
        System.out.println("toString de la lista despues de intentar agregar 8 en la posición 8: ");
        System.out.println(lista.toString() + "\n");


    }
}
