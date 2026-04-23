import java.util.Scanner;

public class MenuNavegador {

    private Navegador nav;
    private Scanner sc;

    public MenuNavegador() {
        nav = new Navegador();
        sc = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;

        do {
            System.out.println("\n--- NAVEGADOR ---");
            System.out.println("1. Visitar página");
            System.out.println("2. Retroceder");
            System.out.println("3. Ver página actual");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Avanzar");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            procesarOpcion(opcion);

        } while (opcion != 0);
    }

    private void procesarOpcion(int opcion) {

        switch (opcion) {

            case 1:
                System.out.print("URL: ");
                String url = sc.nextLine();

                System.out.print("Título: ");
                String titulo = sc.nextLine();

                if (nav.visitarPagina(url, titulo)) {
                    System.out.println("Página agregada");
                } else {
                    System.out.println("Datos inválidos");
                }
                break;

            case 2:
                PaginaWeb anterior = nav.retroceder();
                if (anterior != null) {
                    System.out.println(anterior.mostrar());
                } else {
                    System.out.println("No se puede retroceder");
                }
                break;

            case 3:
                PaginaWeb actual = nav.paginaActual();
                if (actual != null) {
                    System.out.println(actual.mostrar());
                } else {
                    System.out.println("No hay páginas");
                }
                break;

            case 4:
                nav.mostrarHistorial();
                break;

            case 0:
                System.out.println("Saliendo...");
                break;

            case 5:
                PaginaWeb siguiente = nav.avanzar();
                if (siguiente != null) {
                    System.out.println("Página actual:");
                    System.out.println(siguiente.mostrar());
                } else {
                    System.out.println("No hay página adelante");
                }
                break;

            default:
                System.out.println("Opción inválida");
        }
    }
}