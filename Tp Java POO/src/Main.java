public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado(1, "Juan Pérez", "Desarrollador", 45000);
        Empleado emp2 = new Empleado("Ana Gómez", "Diseñadora");

        emp1.aumentarSalarioPorCantidad(10);
        emp2.aumentarSalarioPorPorcentaje(5000);

        System.out.println(emp1);
        System.out.println(emp2);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
