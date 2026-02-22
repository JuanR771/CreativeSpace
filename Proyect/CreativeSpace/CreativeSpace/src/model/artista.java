package model;

import java.util.ArrayList;
import java.util.Date;

public class artista {

	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String biografia;
	private ArrayList<obra> obras;
	private ArrayList<exposicion> exposiciones;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombreArtista) {
		this.nombre = nombreArtista;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellidoArtista) {
		this.apellido= apellidoArtista;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public ArrayList<obra> getObras() {
		return obras;
	}
	public void setObras(ArrayList<obra> obras) {
		this.obras = obras;
	}
	public ArrayList<exposicion> getExposiciones() {
		return exposiciones;
	}
	public void setExposiciones(ArrayList<exposicion> exposiciones) {
		this.exposiciones = exposiciones;
	}

    @Override
   public String toString() {
    return "Nombre: " + nombre + "\n" +
            "Apellido: " + apellido + "\n" +
            "FechaNacimiento: " + fechaNacimiento + "\n" +
            "Biografía: " + biografia + "\n" +
            "Obras: " + obras.toString()  + "\n" +
            "Exposiciones: " + exposiciones + "\n";
}

    public artista(String nombre, String apellido, Date fechaNacimiento, String biografia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.biografia = biografia;
        obras = new ArrayList<>();
        exposiciones = new ArrayList<>();
    }
    
    public artista(){
        
        obras = new ArrayList<>();
        exposiciones = new ArrayList<>();
        
    }
	
}