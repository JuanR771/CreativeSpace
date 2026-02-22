package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class noticia {

    private String titulo;
    private Date fechaPublicacion;
    private String descripcion;
    private List<obra> obras;

    public noticia(String titulo, Date fechaPublicacion, String descripcion) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.obras = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<obra> getObras() {
        return obras;
    }

    public void setObras(List<obra> obras) {
        this.obras = obras;
    }
    
     public void setObra (obra obra) {
       this.obras.add(obra);
    }

 @Override
public String toString() {
    return "\n" +
            "Titulo: '" + titulo + '\'' + "\n" +
            "Fecha de Publicación: " + fechaPublicacion + "\n" +
            "Descripción: " + descripcion + "\n" +
            "Obras relacionadas: " + obras.toString() + "\n";
}
    
    
        
        
	
}