import java.util.Queue;

public class Banco {
    private ColaClientes cola;

    public Banco() {
        cola = new ColaClientes();
    }

    public boolean llegadaCliente(Cliente c) {
        if (!Validaciones.validarCliente(c)) {
            return false;
        }
        return cola.encolar(c);
    }

    public Cliente atenderCliente() {
        Cliente c = cola.desencolar();
        if (c != null) {
            c.setAtendido(true);
        }
        return c;
    }

    public int contarCliente(Queue<Cliente> c) {
        int cont = 0;
        for (Cliente o : c) {
            if (o.isAtendido()) {
                cont++;
            }

        }
        return cont;
    }

    public void MostrarNOmbreCliente(Queue<Cliente> c) {

        for (Cliente o : c) {
            if (o.isAtendido()) {
                System.out.println(o.getNombre());
            }

        }

    }

    public Cliente verSiguiente() {
        return cola.verPrimero();
    }

    public void mostrarCola() {
        System.out.println("\nClientes en espera:");
        cola.mostrar();
    }
}