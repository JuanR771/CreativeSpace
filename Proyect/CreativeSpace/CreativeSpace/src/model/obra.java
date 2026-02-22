package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class obra {

    private Float precio;
    private String titulo;
    private Date fechaCreacion;
    private artista autor;

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setAutor(artista autor) {
        this.autor = autor;
    }

    public artista getAutor() {
        return autor;
    }

 @Override
    public String toString() {
        
          return "\n" +
                "Titulo:'" + titulo + '\'' + "\n" +
                "Precio:" + precio + "\n" +
                "FechaCreacion:" + fechaCreacion + "\n" +
                "Autor:" +"\n";
    }
    
      
    
    public obra(Float precio, String titulo, Date fechaCreacion) { // error aca tener cuidado
        this.precio = precio;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.autor = autor;
    }
    
    public obra(){
        
    }

}
