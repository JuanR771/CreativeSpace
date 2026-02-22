package model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class compra {

	private String comprador;
        private double coeficienteM;
	private Date fechaCompra;
	private double precioFinal;
	private String formaPago;
	private String metodoEnvio;
        private String tituloObra;
        

    public compra(String comprador, String tituloObra, Date fechaCompra, double coeficienteM, double precioFinal, String metodoEnvio) {
        this.coeficienteM = coeficienteM;
        this.fechaCompra = fechaCompra;
        this.precioFinal = precioFinal;
        this.formaPago = "Online";
        this.metodoEnvio = metodoEnvio;
        this.tituloObra = tituloObra;
        this.comprador = comprador;
    }

    public double getCoeficienteM() {
        return coeficienteM;
    }

    public void setCoeficienteM(double coeficienteM) {
        this.coeficienteM = coeficienteM;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    public void setMetodoEnvio(String metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public String getComprador() {
        return comprador;
    }

    public String getTituloObra() {
        return tituloObra;
    }
    
    
}