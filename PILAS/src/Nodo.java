public class Nodo {
private Object valor;
private Nodo Siguiente;
    public Nodo(Object valor, Nodo siguiente) {
        this.setValor(valor);
          setSiguiente(siguiente);
    }
    public Object getValor() {
        return valor;
    }
    public void setValor(Object valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() {
        return Siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        Siguiente = siguiente;
    }
}
