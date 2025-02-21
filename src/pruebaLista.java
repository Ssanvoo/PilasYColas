
import java.util.*;

public class pruebaLista {

    static Scanner sc = new Scanner(System.in);
    static Lista l = new Lista();

    public static void main(String[] args) {

        l.insertarFinal(4);
        l.insertarFinal(7);
        l.insertarPrincipio(8);
        l.insertar(2, 5);
        l.insertar(3, 9);
        l.insertar(5, 19);
        l.mostrarLista();

        Integer t[] = {1, 2, 3, 4, 5, 6};
        l.insertarArray(t);
        l.mostrarLista();

        l.eliminarElemento(3);
        l.mostrarLista();
        l.obtenerElemento(10);
        l.buscarNum(234);
    }

    public static void encolarNum() {
        int num = 0;
        while (num != -1) {
            System.out.println("Introduzca el numero: ");
            Integer n = sc.nextInt();
            l.encolar(n);
        }

        for (int i = 0; i < l.getNumElementos(); i++) {
            System.out.println(l.getNumElementos(i));
            l.desencolar();

        }

    }

}
