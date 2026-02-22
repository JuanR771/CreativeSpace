package model;

import java.util.Date;

public class escultura extends obra{

	private String material;
	private int peso;
	private String tamaño;
	private video video;

  

    public escultura(String material, int peso, String tamaño, int duracion, String formato, String color, Float precio, String titulo, Date fechaCreacion) {
        super(precio, titulo, fechaCreacion);
        this.material = material;
        this.peso = peso;
        this.tamaño = tamaño;
        this.video = new video(duracion,formato,color);
    }
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public video getVideo() {
		return video;
	}
	public void setVideo(video video) {
		this.video = video;
	}
        
        
        public escultura(){
            
        }
        
           @Override
    public String toString() {
                if(getAutor() != null){
        return "\n" +
                "Titulo: '" + getTitulo() + '\'' + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "FechaCreacion: " + getFechaCreacion() + "\n" +
                "Autor: " + getAutor().getNombre() + getAutor().getApellido() + "\n" +
                "Material: " + material + "\n" +
                "Peso: " + peso + "\n" +
                "Tamaño: " + tamaño + "\n";
                }
                else{
                     return "\n" +
                "Titulo: '" + getTitulo() + '\'' + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "FechaCreacion: " + getFechaCreacion() + "\n" +
                "Autor: " + "Se necesita asociación" + "\n" +
                "Material: " + material + "\n" +
                "Peso: " + peso + "\n" +
                "Tamaño: " + tamaño + "\n";
                }
                }
    
	
}