
package POJO;

public class Usario {
    private int idusuario;
    private String usuario;
    private String contraseña;
   

    public Usario() {
    }

    public Usario(int idusuario, String usuario, String contraseña) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
      
    }
    
      public Usario( String usuario, String contraseña,int idusuario) {
        
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.idusuario = idusuario;
      
    }
    
    public Usario(String usuario, String contraseña) {
        
        this.usuario = usuario;
        this.contraseña = contraseña;
      
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

  

    
    
}
