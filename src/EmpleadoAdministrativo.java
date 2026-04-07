public class EmpleadoAdministrativo extends EMPLEADO {

    private double bonificacion;


    public EmpleadoAdministrativo() {
    }

//contructor con parametros

    public EmpleadoAdministrativo(String identificacion, String nombre, int edad, double salarioBase, double bonificacion) {
        super(identificacion, nombre, edad, salarioBase);
        this.bonificacion = bonificacion;
    }

    //geters-setters


    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    //to string


    @Override
    public String toString() {
        return super.toString()+"EmpleadoAdministrativo{" +
                "bonificacion=" + bonificacion +
                '}';
    }

//metodos

    private void mostrarinfomacion(){

        System.out.println("identificacion"+identificacion);
        System.out.println("nombre"+nombre);
        System.out.println("edad"+edad);
        System.out.println("salario base"+salarioBase);
        System.out.println("bonificacion"+bonificacion);
    }



}





