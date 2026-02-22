package model;
public class propietario {
    String nombreCompleto;String CuentaBancaria; String password;

    public propietario(String nombreCompleto, String CuentaBancaria, String password) {
        this.nombreCompleto = nombreCompleto;
        this.CuentaBancaria = CuentaBancaria;
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
