package POJO;

public class Empleado {

    private int idempleado;
    private String nombre;
    private double salario;
    private String numero;
    private String correo;
    private String contrase;

    public Empleado() {
    }

    public Empleado(int idempleado, String nombre, double salario, String numero, String correo, String contrase) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.salario = salario;
        this.numero = numero;
        this.correo = correo;
        this.contrase = contrase;
    }

    public Empleado(String nombre, double salario, String numero, String correo, int idempleado) {
        this.nombre = nombre;
        this.salario = salario;
        this.numero = numero;
        this.correo = correo;
        this.idempleado = idempleado;
    }

    public Empleado(String nombre, double salario, String numero, String correo, String contrase) {
        this.nombre = nombre;
        this.salario = salario;
        this.numero = numero;
        this.correo = correo;
        this.contrase = contrase;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrase() {
        return contrase;
    }

    public void setContrase(String contrase) {
        this.contrase = contrase;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
