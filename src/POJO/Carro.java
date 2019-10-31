package POJO;

public class Carro {

    private int idcarro;
    private String modelo;
    private String color;
    private String marca;
    private String placas;
    private int cliente_idcliente;
    private String nombre;
    private Object id=idcarro;

    public Carro() {
    }

    public Carro(int idcarro, String modelo, String color, String marca, String placas, int cliente_idcliente, String nombre) {
        this.idcarro = idcarro;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.placas = placas;
        this.cliente_idcliente = cliente_idcliente;
        this.cliente_idcliente = cliente_idcliente;
    }

    public Carro(String modelo, String color, String marca, String placas, String color0, int cliente_idcliente) {
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.placas = placas;
        this.cliente_idcliente = cliente_idcliente;
    }

    public Carro(String modelo, String color, String marca, int idcarro) {
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
           this.idcarro = idcarro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdcarro() {
        return idcarro;
    }

    public void setIdcarro(int idcarro) {
        this.idcarro = idcarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getCliente_idcliente() {
        return cliente_idcliente;
    }

    public void setCliente_idcliente(int cliente_idcliente) {
        this.cliente_idcliente = cliente_idcliente;
    }

    

   




    

    
    
}
