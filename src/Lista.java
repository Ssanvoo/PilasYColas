
import java.util.Arrays;

public class Lista {

    Integer lista[];

    public Lista() {
        lista = new Integer[0];
    }

    public int getNumElementos() {
        return lista.length;
    }

    public void insertarFinal(Integer num) {

        Integer t[] = Arrays.copyOf(lista, lista.length + 1);
        t[t.length - 1] = num;
        lista = t;
    }

    public void insertarPrincipio(Integer num) {
        Integer t[] = new Integer[lista.length + 1];
        System.arraycopy(lista, 0, t, 1, lista.length);
        t[0] = num;
        lista = t;
    }

    public void insertar(int pos, Integer num) {
        if (pos > lista.length || pos < 0) {
            System.out.println("No se puede insertar en esa posicion");
        } else {
            Integer t[] = new Integer[lista.length + 1];
            System.arraycopy(lista, 0, t, 0, pos);
            System.arraycopy(lista, pos, t, pos + 1, lista.length - pos);
            t[pos] = num;
            lista = t;
        }
    }

    public void insertarArray(Integer t1[]) {
        Integer t2[] = new Integer[lista.length + t1.length];
        System.arraycopy(lista, 0, t2, 0, lista.length);
        System.arraycopy(t1, 0, t2, lista.length, t1.length);
        lista = t2;
    }

    public void eliminarElemento(int pos) { //TODO: Arreglar el ultimo arrayCopy que no va.
        Integer t[] = new Integer[lista.length - 1];
        System.arraycopy(lista, 0, t, 0, pos);
        System.out.println(Arrays.toString(t));
        System.arraycopy(lista, pos + 1, t, pos, lista.length - pos - 1);
        lista = t;
    }

    public void mostrarLista() {
        System.out.println(Arrays.toString(lista));
    }

    public void obtenerElemento(int pos) {
        if (pos < 0 || pos >= lista.length) {
            System.out.println("No existe elemento en esa posicion");
        } else {
            System.out.println(lista[pos]);
        }
    }

    public void buscarNum(Integer num) {
        int pos = Arrays.binarySearch(lista, num);
        if (pos < 0) {
            pos = -1;
        }
        System.out.println(pos);
    }
    
    
}
