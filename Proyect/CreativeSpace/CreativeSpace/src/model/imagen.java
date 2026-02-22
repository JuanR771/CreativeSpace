package model;

public class imagen {

	private int resolucion;
	private String formatoArchivo;
	private int dimensiones;
	
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public String getFormatoArchivo() {
		return formatoArchivo;
	}
	public void setFormatoArchivo(String formatoArchivo) {
		this.formatoArchivo = formatoArchivo;
	}
	public int getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(int dimensiones) {
		this.dimensiones = dimensiones;
	}

    public imagen(int resolucion, String formatoArchivo, int dimensiones) {
        this.resolucion = resolucion;
        this.formatoArchivo = formatoArchivo;
        this.dimensiones = dimensiones;
    }
    
    public imagen(){
        
    }
	
}