import java.util.Scanner;
public class Main {
    Scanner teclado = new Scanner(System.in);
    int op;


        do

    {

        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1. Registrar Empleados Administrativo");
        System.out.println("2. Registrar Empleados Ventas");
        System.out.println("3. Registrar Empleados por Horas");
        System.out.println("4. Mostrar todos los Empleados ");
        System.out.println("5. Mostrar Empleado por Tipo");
        System.out.print("Seleccione una opción: ");
        System.out.println();

        op = teclado.nextInt();

        switch (op) {

            case 1:
                System.out.println("digite el numero de Identificacion");
                String numeroIdentificacion = teclado.next();
                System.out.println("Digite el Nombre del empleado ");
                String nombre = teclado.next();
                System.out.println("Digite la Edad del empleado");
                int edad = teclado.nextInt();
                System.out.println("digite el Salario Base");
                int Salario = teclado.nextInt();
                System.out.println("Digite la Bonificacion del empleado");
                int Bonificacion = teclado.nextInt();

                break;


            case 2:
                System.out.println("digite el numero de Identificacion");
                numeroIdentificacion = teclado.next();
                System.out.println("Digite el Nombre del empleado ");
                nombre = teclado.next();
                System.out.println("Digite la Edad del empleado");
                edad = teclado.nextInt();
                System.out.println("digite el Salario Base");
                Salario = teclado.nextInt();
                System.out.println("Digite el Total de ventas ");
                int ventas = teclado.nextInt();
                System.out.println("Digite el Total de comicion ");
                int comicion = teclado.nextInt();

            case 3:
                System.out.println("digite el numero de Identificacion");
                numeroIdentificacion = teclado.next();
                System.out.println("Digite el Nombre del empleado ");
                nombre = teclado.next();
                System.out.println("Digite la Edad del empleado");
                edad = teclado.nextInt();
                System.out.println("digite el Salario Base");
                Salario = teclado.nextInt();
                System.out.println("Digite el Total de Horas Trabajadas");
                double horasTrabajadas = teclado.nextInt();
                System.out.println("Digite el Valor de Hora");
                int valorHora = teclado.nextInt();

            case 4:










                EMPLEADO c1 = new EMPLEADO("c120456569", "padre", 35, 15000000);
                EMPLEADO c2 = new EMPLEADO("c120456569", "padre", 35, 15000000);
                EMPLEADO c3 = new EMPLEADO("c120456569", "padre", 35, 15000000);

                EmpleadoAdministrativo ea1 = new EmpleadoAdministrativo("ea107540596", "gabriela", 26, 1000000, 500000);
                EmpleadoAdministrativo ea2 = new EmpleadoAdministrativo("ea107540596", "gabriela", 26, 1000000, 500000);
                EmpleadoAdministrativo ea3 = new EmpleadoAdministrativo("ea107540596", "gabriela", 26, 1000000, 500000);

                EmpleadoVentas ev1 = new EmpleadoVentas(52, 70);
                EmpleadoVentas ev2 = new EmpleadoVentas(63, 80);
                EmpleadoVentas ev3 = new EmpleadoVentas(52, 70);

                EmpleadoPorhoras eh1 = new EmpleadoPorhoras("1072640593", "maikol", 22, 20000000, 8, 9000);
                ;
                EmpleadoPorhoras eh2 = new EmpleadoPorhoras("1072640593", "maikol", 22, 20000000, 8, 9000);
                ;
                EmpleadoPorhoras eh3 = new EmpleadoPorhoras("1072640593", "maikol", 22, 20000000, 8, 9000);
                ;


                System.out.println();
                System.out.println();
                System.out.println();
        }
    }

}