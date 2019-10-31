package POJO;

public class Cliente {

    private int idcliente;
    private String nombre;
    private String correo;
    private String numero;

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, String correo, String numero) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
    }
    
        public Cliente( String nombre, String correo, String numero,int idcliente) {
        
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
        this.idcliente = idcliente;
    }

    public Cliente(String nombre, String correo, String numero) {
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
