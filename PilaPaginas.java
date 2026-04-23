import java.util.Stack;

public class PilaPaginas {
    private Stack<PaginaWeb> pila;

    public PilaPaginas() {
        pila = new Stack<>();
    }

    public boolean apilar(PaginaWeb p) {
        if (p != null) {
            pila.push(p);
            return true;
        }
        return false;
    }

    public PaginaWeb desapilar() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }

    public PaginaWeb cima() {
        if (!pila.isEmpty()) {
            return pila.peek();
        }
        return null;
    }

    public int tamaño() {
        return pila.size();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public void mostrar() {
        if (pila.isEmpty()) {
            System.out.println("Historial vacío");
            return;
        }

        for (PaginaWeb p : pila) {
            System.out.println(p.mostrar());
        }
    }
}