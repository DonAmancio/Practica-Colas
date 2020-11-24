
public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        System.out.println(Pila.vacio());
        for (int i = 1; i <= 5; i++) {
            Pila.insertar(i);
        }
        System.out.println("MOSTRANDO LOS ELEMENTOS DE LA PILA");  pila.mostrar();
        System.out.println("ELIMINANDO 3 ELEMENTOS DE LA PILA");
        pila.eliminar();
        pila.eliminar();
        pila.eliminar();
        System.out.println("MOSTRANDO ELEMENTOS DE LA PILA CON EL METODO ELIMINAR");
        pila.mostrar();
        }
}
