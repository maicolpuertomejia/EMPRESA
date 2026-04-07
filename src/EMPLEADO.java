public class EMPLEADO {

    protected String identificacion;
    protected String nombre;
    protected int edad;
    protected double salarioBase;

//CONSTRUCTO VACIO
    public EMPLEADO() {
    }

//CONSTRUCTOR CON PARAMETROS

    public EMPLEADO(String identificacion, String nombre, int edad, double salarioBase) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }


    //GETERS SETTERS


    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    @Override
    public String toString() {
        return "EMPLEADO{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }



    //METODOS

    private void mostrarinfomacion(){

        System.out.println("identificacion"+identificacion);
        System.out.println("nombre"+nombre);
        System.out.println("edad"+edad);
        System.out.println("salario base"+salarioBase);

    }


}

