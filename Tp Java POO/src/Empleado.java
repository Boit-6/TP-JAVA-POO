public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        System.out.println("Empleado creado: " + this.nombre + ", Total Empleados: " + totalEmpleados);
    }

    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0;
        totalEmpleados++;
        System.out.println("Empleado creado: " + this.nombre + ", Total Empleados: " + totalEmpleados);
    }

    public void aumentarSalarioPorPorcentaje(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void aumentarSalarioPorCantidad(double cantidad) {
        this.salario += cantidad;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', puesto='" + puesto + "', salario=" + salario + "}";
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
