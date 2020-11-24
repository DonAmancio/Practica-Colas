public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        System.out.println(cola.vacio());
        for (int i = 1; i <= 5; i++) {
            cola.insertar(i);
        }
        System.out.println("MOSTRANDO ELEMENTOS DE LA COLA: "); cola.mostrar();
        System.out.println("ELIMINANDO ELEMENTOS DE LA COLA:");
        cola.eliminar();
        cola.eliminar();
        cola.mostrar();
        }
}
