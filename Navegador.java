public class Navegador {

    private PilaPaginas atras;
    private PilaPaginas adelante;

    public Navegador() {
        atras = new PilaPaginas();
        adelante = new PilaPaginas();
    }

    public boolean visitarPagina(String url, String titulo) {
        if (!Validaciones.validarPagina(url, titulo)) {
            return false;
        }

        PaginaWeb p = new PaginaWeb(url, titulo);
        adelante = new PilaPaginas(); // limpiar adelante

        return atras.apilar(p);
    }

    public PaginaWeb retroceder() {
        if (atras.tamaño() > 1) {
            PaginaWeb actual = atras.desapilar();
            adelante.apilar(actual);
            return atras.cima();
        }
        return null;
    }

    public PaginaWeb avanzar() {
        if (!adelante.estaVacia()) {
            PaginaWeb p = adelante.desapilar();
            atras.apilar(p);
            return p;
        }
        return null;
    }

    public PaginaWeb paginaActual() {
        return atras.cima();
    }

    public void mostrarHistorial() {
        atras.mostrar();
    }
}