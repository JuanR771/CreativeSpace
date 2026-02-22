    package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class controlRegistro {

	private ArrayList<propietario> propietarios;
	private ArrayList<comprador> compradores;

    public controlRegistro( ) {
        this.propietarios = new ArrayList<>();
        this.compradores = new ArrayList<>();
    }
        
	public void crearPropietario(String nombreCompleto, String CuentaBancaria, String password) {
		propietario p = new propietario(nombreCompleto,CuentaBancaria,password);
                propietarios.add(p);
                
	}
        
        	public void crearComprador(String nombreCompleto, String correo, Integer telefono, String dirección, String password) {
		comprador c = new comprador(nombreCompleto, correo,  telefono,  dirección,  password);
                compradores.add(c);
                    System.out.println("c");
                    System.out.println(c.getNombreCompleto() + "contra" + c.getPassword());
                    guardarCompradores("compradores.txt", compradores);

                
                   
	}
                
                 public List<comprador> cargarCompradores(String archivo) {
        List<comprador> compradores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombreCompleto = partes[0];
                String correo = partes[1];
                Integer telefono = Integer.parseInt(partes[2]);
                String dirección = partes[3];
                String password = partes[4];
                compradores.add(new comprador(nombreCompleto, correo, telefono, dirección, password));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return compradores;
    }

    public void guardarCompradores(String archivo, List<comprador> compradores) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo,true))) {
            for (comprador c : compradores) {
                pw.println(c.getNombreCompleto() + "," + c.getCorreo() + "," + c.getTelefono() + "," + c.getDirección() + "," + c.getPassword());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(ArrayList<propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public ArrayList<comprador> getCompradores() {
        return compradores;
    }

    public void setCompradores(ArrayList<comprador> compradores) {
        this.compradores = compradores;
    }

    @Override
    public String toString() {
        return "controlRegistro{" + "propietarios=" + propietarios + ", compradores=" + compradores + '}' + "";
    }
	
	
	
}