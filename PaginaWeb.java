import java.time.LocalDateTime;

public class PaginaWeb {
    private String url;
    private String titulo;
    private LocalDateTime fechaAcceso;

    public PaginaWeb(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
        this.fechaAcceso = LocalDateTime.now();
    }

    public String getUrl() {
        return url;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getFechaAcceso() {
        return fechaAcceso;
    }

    public String mostrar() {
        return "Título: " + titulo + " | URL: " + url + " | Fecha: " + fechaAcceso;
    }
}