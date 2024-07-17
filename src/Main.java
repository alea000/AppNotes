import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroTareas = 0; //para contar numero de tareas
        boolean ejecutar = true; //para control de bucle func.pred.
        String[] tareas = new String[10];//almacena las tareas
        Scanner teclado = new Scanner(System.in); //IO

        while (ejecutar){
            System.out.println("\n");
            System.out.println("1.Add"+"\n");
            System.out.println("2.Search"+"\n");
            System.out.println("3.Edit" + "\n");
            System.out.println("4.Delete"+"\n");
            System.out.println("5.Show tasks"+"\n");
            System.out.println("6.Exit app"+"\n");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion){
                case 1:
                    if(numeroTareas<tareas.length){
                        System.out.println("¿Cual es la descripcion de tu tarea?");
                        String descripcion = teclado.nextLine();
                        tareas[numeroTareas] = descripcion;
                        numeroTareas++;//numeroTareas +1
                        System.out.println("Tarea añadida con éxito: "+ tareas[0]);
                    }else{
                        System.out.println("Espacio para tareas lleno");
                    }
                    break;
                case 2:
                    System.out.println("Prueba para commit, borrar esto luego");
                case 3:

                case 4:

                case 5:

                case 6:
                    ejecutar = false;
                    System.out.println("Gracias por usar la aplicación");
                    break;
                default:
                    System.out.println("La opción no es válida, introduzca otro número");
                    break;


            }

        }

    }
}