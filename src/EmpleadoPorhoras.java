public class EmpleadoPorhoras extends EMPLEADO{


    private double horasTrabajadas;
    private int valorHora;


    public EmpleadoPorhoras() {
    }

    public EmpleadoPorhoras(String identificacion, String nombre, int edad, double salarioBase, double horasTrabajadas, int valorHora) {
        super(identificacion, nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }


    //GETERS-SETTERS

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    //TO STRING


    @Override
    public String toString() {
        return super.toString()+"EmpleadoPorhoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                '}';
    }

    private void mostrarinfomacion() {

        System.out.println("identificacion" + identificacion);
        System.out.println("nombre" + nombre);
        System.out.println("edad" + edad);
        System.out.println("salario base" + salarioBase);
        System.out.println("horas trabajadas"+ horasTrabajadas);
        System.out.println("valor Hora"+ valorHora);
    }

}
