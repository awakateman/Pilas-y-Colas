public class Cliente {
    private int id;
    private String nombre;
    private String tipoServicio;
    private String horaLlegada;
    private boolean atendido;

    public Cliente(int id, String nombre, String tipoServicio, String horaLlegada) {
        this.id = id;
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.horaLlegada = horaLlegada;
        this.atendido = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public String mostrar() {
        return "Turno: " + id +" | Nombre: " + nombre +" | Servicio: " + tipoServicio +" | Hora: " + horaLlegada +" | Atendido: " + atendido;
    }
}