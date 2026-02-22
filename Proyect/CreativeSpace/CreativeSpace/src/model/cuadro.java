package model;

import java.util.Date;

public class cuadro extends obra{
	
	private int dimensiones;
	private String tecnica;
	private String tema;
	private String clasificacion;
	private imagen imagen;
	
	public int getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(int dimensiones) {
		this.dimensiones = dimensiones;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public imagen getImagen() {
		return imagen;
	}
	public void setImagen(imagen imagen) {
		this.imagen = imagen;
	}

    public cuadro(int dimensiones, String tecnica, String tema, String clasificacion, int resolucion, String formatoArchivo, int dimensionesImagen, Float precio, String titulo, Date fechaCreacion) {
        super(precio,titulo,fechaCreacion);
        this.dimensiones = dimensiones;
        this.tecnica = tecnica;
        this.tema = tema;
        this.clasificacion = clasificacion;
        this.imagen = new imagen(resolucion,formatoArchivo,dimensionesImagen);
    }
    
    public cuadro(){
     super();   
    }
    
    @Override
    public String toString() {
        if(getAutor() != null){
        return "\n" +
                "Titulo: '" + getTitulo() + '\'' + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "FechaCreacion: " + getFechaCreacion() + "\n" +
                "Autor: " + getAutor().getNombre() + getAutor().getApellido() + "\n" +
                "Dimensiones: " + dimensiones + "\n" +
                "Tecnica: " + tecnica + "\n" +
                "Tema: " + tema + "\n" +
                "Clasificacion: " + clasificacion + "\n";
        }
        else{
            return "\n" +
                "Titulo: '" + getTitulo() + '\'' + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "FechaCreacion: " + getFechaCreacion() + "\n" +
                "Autor: " + "Se necesita emparejamiento" + "\n" +
                "Dimensiones: " + dimensiones + "\n" +
                "Tecnica: " + tecnica + "\n" +
                "Tema: " + tema + "\n" +
                "Clasificacion: " + clasificacion + "\n";
        
    }
    }
        
        
	
}