public class Validaciones {

    public static boolean validarTexto(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean validarPagina(String url, String titulo) {
        return validarTexto(url) && validarTexto(titulo);
    }

    public static boolean validarCliente(Cliente c) {
        return c != null &&
                validarTexto(c.getNombre()) &&
                validarTexto(c.getTipoServicio()) &&
                validarTexto(c.getHoraLlegada());
    }
}