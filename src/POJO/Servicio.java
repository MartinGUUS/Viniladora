
package POJO;

public class Servicio {
    private int idservicio;
    private int empleado_idempleado;
    private  int vinil_idvinil;
    private  int carro_idcarro;
    private String descripcion;
    private double precio;

    public Servicio() {
    }

    public Servicio(int idservicio, int empleado_idempleado, int vinil_idvinil, int carro_idcarro, String descripcion, double precio) {
        this.idservicio = idservicio;
        this.empleado_idempleado = empleado_idempleado;
        this.vinil_idvinil = vinil_idvinil;
        this.carro_idcarro = carro_idcarro;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public int getEmpleado_idempleado() {
        return empleado_idempleado;
    }

    public void setEmpleado_idempleado(int empleado_idempleado) {
        this.empleado_idempleado = empleado_idempleado;
    }

    public int getVinil_idvinil() {
        return vinil_idvinil;
    }

    public void setVinil_idvinil(int vinil_idvinil) {
        this.vinil_idvinil = vinil_idvinil;
    }

    public int getCarro_idcarro() {
        return carro_idcarro;
    }

    public void setCarro_idcarro(int carro_idcarro) {
        this.carro_idcarro = carro_idcarro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
