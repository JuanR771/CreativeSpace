
package model;

public class comprador {
    
    String nombreCompleto;
    String correo;
    Integer telefono;
    String dirección;
    String password;
    String canalCompra;

    public comprador(String nombreCompleto, String correo, Integer telefono, String dirección, String password) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.dirección = dirección;
        this.password = password;
        
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCanalCompra() {
        return canalCompra;
    }

    public void setCanalCompra(String canalCompra) {
        this.canalCompra = canalCompra;
    }
    
    
    
    
}
