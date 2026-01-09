package ConectionsDB;

import java.util.Scanner;

/**
 *
 * @author ryangt
 */
public class Major {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonalData data = null;
        int option;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Editar datos");
            System.out.println("4. Eliminar datos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            option = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (option) {

                case 1:
                    System.out.print("Nombre: ");
                    String name = sc.nextLine();

                    System.out.print("Edad: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("curp: ");
                    String curp = sc.nextLine();
                    
                    System.out.print("Fecha nacimiento: ");
                    String date = sc.nextLine();

                    data = new PersonalData(name, age, curp,date);
                    System.out.println("Datos insertados correctamente");
                    break;

                case 2:
                    if (data != null) {
                        data.mostrarDatos();
                    } else {
                        System.out.println("No hay datos registrados");
                    }
                    break;

                case 3:
                    if (data != null) {
                        System.out.print("Nuevo nombre: ");
                        data.setNombre(sc.nextLine());

                        System.out.print("Nueva edad: ");
                        data.setEdad(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Nuevo correo: ");
                        data.setCorreo(sc.nextLine());

                        System.out.println("Datos actualizados");
                    } else {
                        System.out.println("No hay datos para editar");
                    }
                    break;

                case 4:
                    data = null;
                    System.out.println("Datos eliminados")
                    break;

                case 5:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (option != 5);

        sc.close();
    }
}
        ConectionDB conn = new ConectionDB();
        conn.getConnection();
        
        QueriesDB con = new QueriesDB();
        con.insert();
        
        con.UpdateData();
        con.DeleteData();
    }
}
