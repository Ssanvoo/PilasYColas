


public class pruebaLista {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.insertarFinal(4);
        l.insertarFinal(7);
        l.insertarPrincipio(8);
        l.insertar(2, 5);
        l.insertar(3,9);
        l.insertar(5,19);
        l.mostrarLista();
        
        Integer t[] = {1,2,3,4,5,6};
        l.insertarArray(t);
        l.mostrarLista();
        
        l.eliminarElemento(3);
        l.mostrarLista();
        l.obtenerElemento(10);
        l.buscarNum(234);
    }
}
