public class Empleado {
    private String nombre;
    private double salario;
    private int edad;

    public Empleado() {};

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    // set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // get

    public String getNombre() {
        return this.nombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getEdad() {
        return this.edad;
    }

    public String toString() {
        return String.format("Nombre: %s"
        +"\nSalario: %.2f"
        +"\nEdad: %d"
        , this.getNombre(), this.getSalario(), this.getEdad());
    }

}
