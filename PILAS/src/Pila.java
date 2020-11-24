public class Pila {
    private static Nodo primero;
    public Pila(){
        primero = null;
    }
    public static boolean vacio(){
        return primero == null;
    }
    public static void insertar(Object dato){
        if (vacio()){
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        }
        else{
            Nodo ultimo = primero;
            while (ultimo.getSiguiente()!=null){
                ultimo = ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo(dato,null);
            ultimo.setSiguiente(nuevo);
        }
    }
    public void eliminar(){
        if (!vacio()){
           Nodo ultimo = primero;
           Nodo penultimo = null;
           while (ultimo.getSiguiente() != null){
               penultimo = ultimo;
               ultimo = ultimo.getSiguiente();
            }
           penultimo.setSiguiente(null);
        }
    }
    public void mostrar(){
        Nodo temporal = primero;
        while (temporal != null){
            System.out.println(temporal.getValor()+ "     ");
            temporal = temporal.getSiguiente();
        }
        System.out.println();
    }
}
