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

    public Cliente verSiguiente() {
        return cola.verPrimero();
    }

    public void mostrarCola() {
        System.out.println("\nClientes en espera:");
        cola.mostrar();
    }
}