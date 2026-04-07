import java.security.PublicKey;

public class EmpleadoVentas extends EMPLEADO {

    private double totalVentas;
    private int comicion;


    public EmpleadoVentas() {
    }


    public EmpleadoVentas(double totalVentas, int comicion) {
        this.totalVentas = totalVentas;
        this.comicion = comicion;
    }

    //geters -setters

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public int getComicion() {
        return comicion;
    }

    public void setComicion(int comicion) {
        this.comicion = comicion;
    }

    //TO STRING


    @Override
    public String toString() {
        return super.toString()+"EmpleadoVentas{" +
                "totalVentas=" + totalVentas +
                ", comicion=" + comicion +
                '}';
    }

    private void mostrarinfomacion(){

        System.out.println("identificacion"+identificacion);
        System.out.println("nombre"+nombre);
        System.out.println("edad"+edad);
        System.out.println("salario base"+salarioBase);
        System.out.println("Total de Ventas"+totalVentas);
        System.out.println("Total de comicion"+ comicion);

    }


}
