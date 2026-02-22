package model;

public class video {

	private int duracion;
	private String formato;
	private String color;
	
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

    public video(int duracion, String formato, String color) {
        this.duracion = duracion;
        this.formato = formato;
        this.color = color;
    }
    
    public video(){
        
    }
        
        
	
}