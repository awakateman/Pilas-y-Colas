import java.util.Scanner;

public class MenuBanco {

    private Banco banco;
    private Scanner sc;
    private int turno;

    public MenuBanco() {
        banco = new Banco();
        sc = new Scanner(System.in);
        turno = 1;
    }

    public void iniciar() {
        int opcion;

        do {
            System.out.println("\n--- BANCO ---");
            System.out.println("1. Llegada de cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver siguiente cliente");
            System.out.println("4. Mostrar cola");
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
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                String servicio = seleccionarServicio();

                System.out.print("Hora: ");
                String hora = sc.nextLine();

                Cliente c = new Cliente(turno++, nombre, servicio, hora);

                if (banco.llegadaCliente(c)) {
                    System.out.println("Cliente agregado");
                } else {
                    System.out.println("Datos inválidos");
                }
                break;

            case 2:
                Cliente atendido = banco.atenderCliente();
                if (atendido != null) {
                    System.out.println("Atendido:");
                    System.out.println(atendido.mostrar());
                } else {
                    System.out.println("No hay clientes");
                }
                break;

            case 3:
                Cliente siguiente = banco.verSiguiente();
                if (siguiente != null) {
                    System.out.println("Siguiente:");
                    System.out.println(siguiente.mostrar());
                } else {
                    System.out.println("Cola vacía");
                }
                break;

            case 4:
                banco.mostrarCola();
                break;

            case 0:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción inválida");
        }
    }
    private String seleccionarServicio() {

        int opcion;
        String servicio = "";

        do {
            System.out.println("Seleccione tipo de servicio:");
            System.out.println("1. Retiro");
            System.out.println("2. Consignación");
            System.out.println("3. Asesoría");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    servicio = "Retiro";
                    break;
                case 2:
                    servicio = "Consignación";
                    break;
                case 3:
                    servicio = "Asesoría";
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (servicio.isEmpty());

        return servicio;
    }
}