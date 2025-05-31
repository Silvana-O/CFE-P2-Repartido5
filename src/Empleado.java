public class Empleado {

    private String nombre;
    private String cargo;
    private double sueldoBase;

    public Empleado(String nombre, String cargo, double sueldoBase) {

        if (sueldoBase < 0) {
            System.out.println ("El sueldo base no puede ser negativo.");
        }
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoFinal() {
        if (cargo.equalsIgnoreCase("Jefe")) {
            return sueldoBase * 1.20;
        } else {
            return sueldoBase;
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCargo() {
        return this.cargo;
    }

    public double getSueldoBase() {
        return this.sueldoBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Susana", "Jefe", 50000);
        System.out.println("Empleado: " + e1.getNombre() + ", Sueldo final: $" + e1.getSueldoFinal());

        Empleado e2 = new Empleado("Juan", "EmpleadoComun", 40000);
        System.out.println("Empleado: " + e2.getNombre() + ", Sueldo final: $" + e2.getSueldoFinal());
    }
}

