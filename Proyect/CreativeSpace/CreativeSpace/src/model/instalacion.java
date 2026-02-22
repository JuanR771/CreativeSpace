package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class instalacion extends obra{
	
	private String descripcion;
	private ArrayList<material> materiales;

    public instalacion(String descripcion, List<String> materiales, Float precio, String titulo, Date fechaCreacion) {
 super(precio, titulo, fechaCreacion);
        this.descripcion = descripcion;
        ArrayList<material> listaMateriales = new ArrayList<>();
        
        for (String s : materiales) {
            String[] partes = s.split(","); // Eliminamos el espacio después de la coma
            if (partes.length == 2) {
                try {
                    String nombreMat = partes[0].trim();
                    int precioMat = Integer.parseInt(partes[1].trim());
                    listaMateriales.add(new material(nombreMat, precioMat));
                } catch (NumberFormatException e) {
                    System.err.println("Error al convertir el precio del material: " + partes[1]);
                }
            } else {
                System.err.println("Formato incorrecto para el material: " + s + ". Esperado: 'NombreMaterial, Precio'.");
            }
        }
        
        this.materiales = listaMateriales;
    }
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<material> getMateriales() {
		return materiales;
	}
	public void setMateriales(ArrayList<material> materiales) {
		this.materiales = materiales;
	}
        
        public instalacion(){
            
        }
        
     public String toString() {
            if(getAutor() != null){
        return "\n" +
                "Titulo: '" + getTitulo() + '\'' + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "FechaCreacion: " + getFechaCreacion() + "\n" +
                "Autor: " +  getAutor().getNombre() + getAutor().getApellido()+ "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Materiales: " + materiales.toString() + "\n";
            }else{
                return "\n" +
                "Titulo: '" + getTitulo() + '\'' + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "FechaCreacion: " + getFechaCreacion() + "\n" +
                "Autor: " +  "Se necesita asociación"+ "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Materiales: " + materiales.toString() + "\n";
                
            }
    }
}
		
