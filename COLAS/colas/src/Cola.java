public class Cola {
    private static Nodo first;
    public Cola(){
        first = null;
    }
    public static boolean vacio(){
        return first == null;
    }
    public static void insertar(Object dato){
        if (vacio()){
            Nodo nuevo = new Nodo(dato, null);
            first = nuevo;
        }
        else{
            Nodo ultimo = first;
            while (ultimo.getSiguiente()!=null){
                ultimo = ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo(dato,null);
            ultimo.setSiguiente(nuevo);
        }
    }
    public void eliminar(){
        if (!vacio()){
            first = first.getSiguiente();
        }
    }
    public void mostrar(){
        Nodo temporal = first;
        while (temporal != null){
            System.out.println(temporal.getValor()+ "     ");
            temporal = temporal.getSiguiente();
        }
        System.out.println();
    }
}
