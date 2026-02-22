package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controlNoticia {
    
     private List<noticia> noticias;
    controlObrasArtistasExposicion co;
    
    
   


    public controlNoticia() {    
        co = new controlObrasArtistasExposicion();
        co.llenarListas();
        
        noticias = new ArrayList<>();
       
        noticias = leerNoticias();

        
    }  

    public void crearNoticia(String titulo, Date fechaPublicacion, String descripcion, List<obra> obras) {
       noticia n = new noticia(titulo, fechaPublicacion, descripcion);
       n.setObras(obras);
        
      noticias.add(n);  
         
      crearArchivoNoticias();
        
    }
   
    

    public List<noticia> getNoticias() {
        return noticias;
    }
    
      public void crearArchivoNoticias() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Noticias.txt"))) {
            for (noticia noticia : noticias) {
                bw.write("Titulo: " + noticia.getTitulo());
                bw.newLine();
                bw.write("Fecha de Publicacion: " + dateFormat.format(noticia.getFechaPublicacion()));
                bw.newLine();
                bw.write("Descripcion: " + noticia.getDescripcion());
                bw.newLine();
                bw.write("Obras: ");
                List<obra> obras = noticia.getObras();
                for (int i = 0; i < obras.size(); i++) {
                    bw.write(obras.get(i).getTitulo());
                    if (i < obras.size() - 1) {
                        bw.write(", ");
                    }
                }
                bw.newLine();
                bw.newLine(); // Añadir una línea en blanco entre noticias
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
      


      
  
      
   /*       public  List<noticia> leerNoticias() {
        List<noticia> noticias = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Noticias.txt"))) {
            String line;
            String titulo = null;
            Date fechaPublicacion = null;
            String descripcion = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Titulo:")) {
                    titulo = line.substring("Titulo: ".length());
                } else if (line.startsWith("Fecha de Publicacion:")) {
                    try {
                        fechaPublicacion = dateFormat.parse(line.substring("Fecha de Publicacion: ".length()));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                } else if (line.startsWith("Descripcion:")) {
                    descripcion = line.substring("Descripcion: ".length());
                } else if (line.trim().isEmpty()) {
                    if (titulo != null && fechaPublicacion != null && descripcion != null) {
                        noticias.add(new noticia(titulo, fechaPublicacion, descripcion,null));
                        titulo = null;
                        fechaPublicacion = null;
                        descripcion = null;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return noticias;
    }*/
      
   private List<noticia> leerNoticias() {
 
        List<noticia> noticias = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try (BufferedReader br = new BufferedReader(new FileReader("noticias.txt"))) {
            String line;
            noticia noticia = null;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Titulo:")) {
                    // Agregar la noticia anterior a la lista
                    if (noticia != null) {
                        noticias.add(noticia);
                    }
                    // Crear una nueva noticia
                    String titulo = line.substring(7).trim();
                    line = br.readLine();
                    Date fechaPublicacion = dateFormat.parse(line.substring("Fecha de Publicacion: ".length()).trim());
                    line = br.readLine();
                    String descripcion = line.substring("Descripcion: ".length()).trim();
                    noticia = new noticia(titulo, fechaPublicacion, descripcion);
                } else if (line.startsWith("Obras:")) {
                    // Agregar las obras a la noticia actual
                    String[] obras = line.substring(6).trim().split(",");
                    for (String obraTitulo : obras) {
                        
                        obra obra = buscarObra(obraTitulo.trim());
                        if (obra != null) {
                            noticia.setObra(obra);
                        }
                    }
                }
            }
            // Agregar la última noticia leída
            if (noticia != null) {
                noticias.add(noticia);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return noticias;
    }

    private obra buscarObra(String titulo) {
  

        for (obra obra : co.getListaObras()) {
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                return obra;
            }
        }
        System.out.println("Obra no encontrada: " + titulo);
        return null;
    }

 

    
}