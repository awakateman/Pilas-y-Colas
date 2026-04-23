import java.util.LinkedList;
import java.util.Queue;

public class ColaClientes {
    private Queue<Cliente> cola;

    public ColaClientes() {
        cola = new LinkedList<>();
    }

    public boolean encolar(Cliente c) {
        if (c != null) {
            cola.add(c);
            return true;
        }
        return false;
    }

    public Cliente desencolar() {
        if (!cola.isEmpty()) {
            return cola.poll();
        }
        return null;
    }

    public Cliente verPrimero() {
        return cola.peek();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void mostrar() {
        if (cola.isEmpty()) {
            System.out.println("No hay clientes en espera");
            return;
        }

        for (Cliente c : cola) {
            System.out.println(c.mostrar());
        }
    }
}