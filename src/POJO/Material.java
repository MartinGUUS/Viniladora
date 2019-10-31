
package POJO;

public class Material {
    private int idmaterial;
    private  String nombre;
    private String descripcion;
    private  double precio;
    private  int cantidad;

    public Material() {
    }

    public Material(int idmaterial, String nombre, String descripcion, double precio, int cantidad) {
        this.idmaterial = idmaterial;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Material(String nombre, String descripcion, double precio, int cantidad) {
         this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
      public Material(String nombre, String descripcion, double precio, int cantidad,int idmaterial) {
         this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
          this.idmaterial = idmaterial;
    }
    

    public int getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(int idmaterial) {
        this.idmaterial = idmaterial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre;
        
    }
    
    
    
   

    
    
}
