package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import view.SeccionCRUDArte;

public class controlObrasArtistasExposicion {
	
	private ArrayList<obra> listaObras;
	private ArrayList<artista> listaArtistas;
	private ArrayList<exposicion> listaExposicion;
        
        public controlObrasArtistasExposicion(){
   
    }
        
        public void llenarListas(){
        
          listaObras = leerArchivoObras();
            listaArtistas = leerArchivoArtistas();
            leerArchivoAsociacion();
       
    }
        
                public artista buscarArtista(String nombre){
            for(artista a: listaArtistas){
                if(nombre.equalsIgnoreCase(a.getNombre()+" "+a.getApellido())){
                    return a;
                }
            }
            return null;
        }
      
                    public ArrayList<String> listaTituloObras(){
        ArrayList<String> titulos = new ArrayList<>(); 
        for(obra o:listaObras){
            titulos.add(o.getTitulo());
        }
        return titulos;
    }
	
	
    public void ArchivoObras() throws IOException{
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ListaObras.txt", true))) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            for (obra o : listaObras) {
                if (o instanceof cuadro) {
                    cuadro c = (cuadro) o;
                    writer.write("Cuadro:");
                    writer.newLine();
                    writer.write("Titulo:" + c.getTitulo());
                    writer.newLine();
                    writer.write("FechaCreacion:" + sdf.format(c.getFechaCreacion()));
                    writer.newLine();
                    writer.write("Precio:" + c.getPrecio());
                    writer.newLine();
                    writer.write("Dimensiones Cuadro:" + c.getDimensiones());
                    writer.newLine();
                    writer.write("Tecnica:" + c.getTecnica());
                    writer.newLine();
                    writer.write("Tema:" + c.getTema());
                    writer.newLine();
                    writer.write("Clasificacion:" + c.getClasificacion());
                    writer.newLine();
                    // Datos de la imagen
                    writer.write("Imagen:");
                    writer.newLine();
                    writer.write("Resolucion:" + c.getImagen().getResolucion());
                    writer.newLine();
                    writer.write("Formato Imagen:" + c.getImagen().getFormatoArchivo());
                    writer.newLine();
                    writer.write("Dimensiones Imagen:" + c.getImagen().getDimensiones());
                    writer.newLine();
                } else if (o instanceof escultura) {
                    escultura e = (escultura) o;
                    writer.write("Escultura:");
                    writer.newLine();
                    writer.write("Titulo:" + e.getTitulo());
                    writer.newLine();
                    writer.write("FechaCreacion:" + sdf.format(e.getFechaCreacion()));
                    writer.newLine();
                    writer.write("Precio:" + e.getPrecio());
                    writer.newLine();
                    writer.write("Material:" + e.getMaterial());
                    writer.newLine();
                    writer.write("Peso:" + e.getPeso());
                    writer.newLine();
                    writer.write("Tamaño:" + e.getTamaño());
                    writer.newLine();
                    // Datos del video
                    writer.write("Video:");
                    writer.newLine();
                    writer.write("Duracion:" + e.getVideo().getDuracion());
                    writer.newLine();
                    writer.write("Formato Video:" + e.getVideo().getFormato());
                    writer.newLine();
                    writer.write("Color:" + e.getVideo().getColor());
                    writer.newLine();
                } else if (o instanceof instalacion) {
                    instalacion i = (instalacion) o;
                    writer.write("Instalacion:");
                    writer.newLine();
                    writer.write("Titulo:" + i.getTitulo());
                    writer.newLine();
                    writer.write("FechaCreacion:" + sdf.format(i.getFechaCreacion()));
                    writer.newLine();
                    writer.write("Precio:" + i.getPrecio());
                    writer.newLine();
                    writer.write("Descripcion:" + i.getDescripcion());
                    writer.newLine();
                    // Datos de los materiales
                    for (material m : i.getMateriales()) {
                        writer.write("Material:");
                        writer.newLine();
                        writer.write("Nombre:" + m.getNombre());
                        writer.newLine();
                        writer.write("Precio Material:" + m.getPrecio());
                        writer.newLine();
                    }
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void SobreEscribirArchivoObras() throws IOException{
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ListaObras.txt"))) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            for (obra o : listaObras) {
                if (o instanceof cuadro) {
                    cuadro c = (cuadro) o;
                    writer.write("Cuadro:");
                    writer.newLine();
                    writer.write("Titulo:" + c.getTitulo());
                    writer.newLine();
                    writer.write("FechaCreacion:" + sdf.format(c.getFechaCreacion()));
                    writer.newLine();
                    writer.write("Precio:" + c.getPrecio());
                    writer.newLine();
                    writer.write("Dimensiones Cuadro:" + c.getDimensiones());
                    writer.newLine();
                    writer.write("Tecnica:" + c.getTecnica());
                    writer.newLine();
                    writer.write("Tema:" + c.getTema());
                    writer.newLine();
                    writer.write("Clasificacion:" + c.getClasificacion());
                    writer.newLine();
                    // Datos de la imagen
                    writer.write("Imagen:");
                    writer.newLine();
                    writer.write("Resolucion:" + c.getImagen().getResolucion());
                    writer.newLine();
                    writer.write("Formato Imagen:" + c.getImagen().getFormatoArchivo());
                    writer.newLine();
                    writer.write("Dimensiones Imagen:" + c.getImagen().getDimensiones());
                    writer.newLine();
                } else if (o instanceof escultura) {
                    escultura e = (escultura) o;
                    writer.write("Escultura:");
                    writer.newLine();
                    writer.write("Titulo:" + e.getTitulo());
                    writer.newLine();
                    writer.write("FechaCreacion:" + sdf.format(e.getFechaCreacion()));
                    writer.newLine();
                    writer.write("Precio:" + e.getPrecio());
                    writer.newLine();
                    writer.write("Material:" + e.getMaterial());
                    writer.newLine();
                    writer.write("Peso:" + e.getPeso());
                    writer.newLine();
                    writer.write("Tamaño:" + e.getTamaño());
                    writer.newLine();
                    // Datos del video
                    writer.write("Video:");
                    writer.newLine();
                    writer.write("Duracion:" + e.getVideo().getDuracion());
                    writer.newLine();
                    writer.write("Formato Video:" + e.getVideo().getFormato());
                    writer.newLine();
                    writer.write("Color:" + e.getVideo().getColor());
                    writer.newLine();
                } else if (o instanceof instalacion) {
                    instalacion i = (instalacion) o;
                    writer.write("Instalacion:");
                    writer.newLine();
                    writer.write("Titulo:" + i.getTitulo());
                    writer.newLine();
                    writer.write("FechaCreacion:" + sdf.format(i.getFechaCreacion()));
                    writer.newLine();
                    writer.write("Precio:" + i.getPrecio());
                    writer.newLine();
                    writer.write("Descripcion:" + i.getDescripcion());
                    writer.newLine();
                    // Datos de los materiales
                    for (material m : i.getMateriales()) {
                        writer.write("Material:");
                        writer.newLine();
                        writer.write("Nombre:" + m.getNombre());
                        writer.newLine();
                        writer.write("Precio Material:" + m.getPrecio());
                        writer.newLine();
                    }
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
     public void SobreEscribirArchivoArtistas() throws IOException{
        
      try (BufferedWriter writer = new BufferedWriter(new FileWriter("ListaArtistas.txt"))) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            for (artista a : listaArtistas) {
                writer.write("Artista:");
                writer.newLine();
                writer.write("Nombre:" + a.getNombre());
                writer.newLine();
                writer.write("Apellido:" + a.getApellido());
                writer.newLine();
                writer.write("FechaNacimiento:" + sdf.format(a.getFechaNacimiento()));
                writer.newLine();
                writer.write("Biografia:" + a.getBiografia());
                writer.newLine();
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        
        }

      
    }
    
    
    public ArrayList<obra> leerArchivoObras() {
         ArrayList<obra> listaObras = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try (BufferedReader reader = new BufferedReader(new FileReader("ListaObras.txt"))) {
            String line;
            obra obraActual = null;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Cuadro:")) {
                    obraActual = new cuadro();
                    listaObras.add(obraActual);
                } else if (line.startsWith("Escultura:")) {
                    obraActual = new escultura();
                    listaObras.add(obraActual);
                } else if (line.startsWith("Instalacion:")) {
                    obraActual = new instalacion();
                    listaObras.add(obraActual);
                } else if (obraActual != null) {
                    if (line.startsWith("Titulo:")) {
                        obraActual.setTitulo(line.split(":")[1]);
                    } else if (line.startsWith("FechaCreacion:")) {
                        Date fecha = sdf.parse(line.split(":")[1]);
                        obraActual.setFechaCreacion(fecha);
                    } else if (line.startsWith("Precio:")) {
                        obraActual.setPrecio(Float.valueOf(line.split(":")[1]));
                    } else if (obraActual instanceof cuadro) {
                        cuadro c = (cuadro) obraActual;
                        if (line.startsWith("Dimensiones Cuadro:")) {
                            c.setDimensiones(Integer.parseInt(line.split(":")[1]));
                        } else if (line.startsWith("Tecnica:")) {
                            c.setTecnica(line.split(":")[1]);
                        } else if (line.startsWith("Tema:")) {
                            c.setTema(line.split(":")[1]);
                        } else if (line.startsWith("Clasificacion:")) {
                            c.setClasificacion(line.split(":")[1]);
                        } else if (line.startsWith("Resolucion:")) {
                            if (c.getImagen() == null) c.setImagen(new imagen());
                            c.getImagen().setResolucion(Integer.parseInt(line.split(":")[1]));
                        } else if (line.startsWith("Formato Imagen:")) {
                            c.getImagen().setFormatoArchivo(line.split(":")[1]);
                        } else if (line.startsWith("Dimensiones Imagen:")) {
                            c.getImagen().setDimensiones(Integer.parseInt(line.split(":")[1]));
                        }
                    } else if (obraActual instanceof escultura) {
                        escultura e = (escultura) obraActual;
                        if (line.startsWith("Material:")) {
                            e.setMaterial(line.split(":")[1]);
                        } else if (line.startsWith("Peso:")) {
                            e.setPeso(Integer.parseInt(line.split(":")[1]));
                        } else if (line.startsWith("Tamaño:")) {
                            e.setTamaño(line.split(":")[1]);
                        } else if (line.startsWith("Duracion:")) {
                            if (e.getVideo() == null) e.setVideo(new video());
                            e.getVideo().setDuracion(Integer.parseInt(line.split(":")[1]));
                        } else if (line.startsWith("Formato Video:")) {
                            e.getVideo().setFormato(line.split(":")[1]);
                        } else if (line.startsWith("Color:")) {
                            e.getVideo().setColor(line.split(":")[1]);
                        }
                    } else if (obraActual instanceof instalacion) {
                        instalacion i = (instalacion) obraActual;
                        if (line.startsWith("Descripcion:")) {
                            i.setDescripcion(line.split(":")[1]);
                        } else if (line.startsWith("Material:")) {
                            material m = new material();
                            m.setNombre(reader.readLine().split(":")[1]);
                            m.setPrecio(Integer.parseInt(reader.readLine().split(":")[1]));
                            if (i.getMateriales() == null) i.setMateriales(new ArrayList<>());
                            i.getMateriales().add(m);
                        }
                    }
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
           
        }

        return listaObras;
    }
    
    public void ArchivoArtistas()  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ListaArtistas.txt", true))) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            for (artista a : listaArtistas) {
                writer.write("Artista:");
                writer.newLine();
                writer.write("Nombre:" + a.getNombre());
                writer.newLine();
                writer.write("Apellido:" + a.getApellido());
                writer.newLine();
                writer.write("FechaNacimiento:" + sdf.format(a.getFechaNacimiento()));
                writer.newLine();
                writer.write("Biografia:" + a.getBiografia());
                writer.newLine();
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        
        }
    }
    
    public ArrayList<artista> leerArchivoArtistas()  {
        ArrayList<artista> listaArtistas = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try (BufferedReader reader = new BufferedReader(new FileReader("ListaArtistas.txt"))) {
            String line;
            artista artistaActual = null;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Artista:")) {
                    if (artistaActual != null) {
                        listaArtistas.add(artistaActual);
                    }
                    artistaActual = new artista();
                } else if (line.startsWith("Nombre:")) {
                    if (artistaActual != null) {
                        artistaActual.setNombre(line.split(":")[1].trim());
                    }
                } else if (line.startsWith("Apellido:")) {
                    if (artistaActual != null) {
                        artistaActual.setApellido(line.split(":")[1].trim());
                    }
                } else if (line.startsWith("FechaNacimiento:")) {
                    if (artistaActual != null) {
                        Date fecha = sdf.parse(line.split(":")[1].trim());
                        artistaActual.setFechaNacimiento(fecha);
                    }
                } else if (line.startsWith("Biografia:")) {
                    if (artistaActual != null) {
                        artistaActual.setBiografia(line.split(":")[1].trim());
                    }
                }
            }

            // Agregar el último artista leído a la lista
            if (artistaActual != null) {
                listaArtistas.add(artistaActual);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return listaArtistas;
    }
    
 
    
    
  
public void leerArchivoAsociacion() {
try (BufferedReader br = new BufferedReader(new FileReader("Asociacion.txt"))) {
            String linea;
            artista artistaActual = null;

            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }

                if (!linea.equals("#")) {
                    if (linea.contains(",")) {
                        String[] datosArtista = linea.split(",");
                        String nombre = datosArtista[0].trim();
                        String apellido = datosArtista[1].trim();

                        for (artista a : listaArtistas) {
                            if (a.getNombre().equalsIgnoreCase(nombre) && a.getApellido().equalsIgnoreCase(apellido)) {
                                artistaActual = a;
                                break;
                            }
                        }
                    } else {
                        if (artistaActual != null) {
                            String tituloObra = linea.trim();

                            for (int i=0; i<listaObras.size();i++) {
                                if (listaObras.get(i).getTitulo().equals(tituloObra)) {
                                    listaObras.get(i).setAutor(artistaActual); 
                                    artistaActual.getObras().add(listaObras.get(i));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    artistaActual = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
       public void escribirArchivoAsociacion(artista a, ArrayList<obra> obras) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Asociacion.txt", true))) {
            bw.write(a.getNombre() + ", " + a.getApellido());
            bw.newLine();
            bw.write("Obras:");
            bw.newLine();
            for (obra o : obras) {
                bw.write(o.getTitulo());
                bw.newLine();
            }
            bw.write("#");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
       
            public void SobreEscribirArchivoAsociacion() {
                
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Asociacion.txt"))) {
            for (artista a : listaArtistas) {
                bw.write(a.getNombre() + ", " + a.getApellido());
                bw.newLine();
                bw.write("Obras:");
                bw.newLine();
                for (obra o : a.getObras()) {
                    bw.write(o.getTitulo());
                    bw.newLine();
                }
                bw.write("#");
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
            
            
            
             
       
       
          public void crearExposicion(String nombre, String tipo, String descripcion, Date fechaInicio, Date fechaFin, String horario, ArrayList<String> obras){
        ArrayList<obra> obrasExpo = new ArrayList<>();
        for(int i =0; i<obras.size(); i++){
            for(obra o: listaObras){
                if(obras.get(i).equalsIgnoreCase(o.getTitulo())){
                    obrasExpo.add(o);
                }
            }
        }
        exposicion e = new exposicion(nombre, tipo, descripcion, fechaInicio, fechaFin, horario, obrasExpo);
        listaExposicion.add(e);
        e.Archivoexposicion();
    }
    
    public void crearCuadro(int dimensiones, String tecnica, String tema, String clasificacion, int resolucion, String formatoArchivo, int dimensionesImagen, Float precio, String titulo, Date fechaCreacion){
        cuadro c = new cuadro(dimensiones,tecnica, tema, clasificacion, resolucion, formatoArchivo, dimensionesImagen, precio, titulo, fechaCreacion);
        listaObras.add(c);
            try {
                   SobreEscribirArchivoObras();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(controlObrasArtistasExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }

    public void crearInstalacion(String descripcion, List<String> materiales, Float precio, String titulo, Date fechaCreacion){
        instalacion i = new instalacion(descripcion, materiales, precio, titulo, fechaCreacion);
        listaObras.add(i);
            try {
                SobreEscribirArchivoObras();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(controlObrasArtistasExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }

    public void crearEscultura(String material, int peso, String tamaño, int duracion, String formato, String color, Float precio, String titulo, Date fechaCreacion){
        escultura e = new escultura(material, peso, tamaño, duracion, formato, color, precio, titulo, fechaCreacion);
        listaObras.add(e);
            try {
                  SobreEscribirArchivoObras();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(controlObrasArtistasExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }

    public ArrayList<obra> getListaObras() {
        return listaObras;
    }

    public void setListaObras(ArrayList<obra> listaObras) {
        this.listaObras = listaObras;
    }

    public ArrayList<artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    public ArrayList<exposicion> getListaExposicion() {
        return listaExposicion;
    }

    public void setListaExposicion(ArrayList<exposicion> listaExposicion) {
        this.listaExposicion = listaExposicion;
    }
    
    public void mostrarObra(String titulo, String nombre, SeccionCRUDArte sc){
        
        boolean encontrado = false;

        for (obra o :listaObras) {
            if (o.getTitulo().equals(titulo)){
                
                encontrado = true;
                sc.setinfoconsulta(o.toString().replace("\n", "<br>"));
                
            }
            for(artista a:listaArtistas){
                if(a.getNombre().equals(nombre) && o.getAutor().getNombre().equals(nombre)){
                      encontrado = true;
                      sc.setinfoconsulta(o.toString().replace("\n", "<br>"));
                }
                
            }
        }

        if (!encontrado) {
            sc.setinfoconsulta("No se encontro ninguna obra con estas especificaciones");
           
        }
    }
    
    
     public void mostrarArtista( String nombre,SeccionCRUDArte sc){
        
        boolean encontrado = false;

            for(artista a:listaArtistas){
                if(nombre.equalsIgnoreCase(a.getNombre()+ " " + a.getApellido())){
                      encontrado = true;
                      sc.setinfoconsulta(a.toString().replace("\n", "<br>"));
                }
                
            }
        

        if (!encontrado) {
            sc.setinfoconsulta("No se encontro ningun artista con estas especificaciones");
           
        }
    }
    
        public obra buscarObra(String titulo){
        
        boolean encontrado = false;

        for (obra o :listaObras) {
            if (o.getTitulo().equals(titulo)){
                
                encontrado = true;
                return o;
                
            }
                  }

        if (!encontrado) {
            return null;
           
        }
            return null;
        
    }
    
    public void modificarObra(String titulo, Float precio,  String tituloViejo){
        for(obra o : listaObras){
            if(o.getTitulo().equals(tituloViejo)){
                o.setTitulo(titulo);
                o.setPrecio(precio);
              
                try {
                   SobreEscribirArchivoObras();
                   
                 SobreEscribirArchivoAsociacion();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(controlObrasArtistasExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void eliminarObra(String titulo){
            try {
                for(obra o : listaObras){
                    if(o.getTitulo().equals(titulo.trim())){
                        listaObras.remove(o);
                    }
                     SobreEscribirArchivoObras();
               SobreEscribirArchivoAsociacion();
                }
              

            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(controlObrasArtistasExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }
    
        public void crearArtista(String nombre, String apellido, Date fechaNacimiento, String biografia, ArrayList<String> obras){
        ArrayList<obra> obrasArt = new ArrayList<>();
        for(int i =0; i<obras.size(); i++){
            for(obra o: listaObras){
                if(obras.get(i).equalsIgnoreCase(o.getTitulo())){
                    obrasArt.add(o);
                }
            }
        }
        artista a = new artista(nombre,apellido,fechaNacimiento,biografia);
        listaArtistas.add(a);
        escribirArchivoAsociacion(a, obrasArt);
            try {
                SobreEscribirArchivoArtistas();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(controlObrasArtistasExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        leerArchivoAsociacion();
        
    }
    
   public void modificarArtista(String nombre, String apellido, Date fechaNacimiento, String biografia, ArrayList<String> obras, String nombreViejo){
        artista a = buscarArtista(nombreViejo);
        ArrayList<obra> obrasArt = new ArrayList<>();
        for(int i =0; i<obras.size(); i++){
            for(obra o: listaObras){
                if(obras.get(i).equalsIgnoreCase(o.getTitulo())){
                    obrasArt.add(o);
                }
            }
        }
        for(int i=0; i<a.getObras().size();i++){
            obrasArt.add(a.getObras().get(i));
        }
        a.setNombre(nombre);
        a.setApellido(apellido);
        a.setFechaNacimiento(fechaNacimiento);
        a.setBiografia(biografia);
        a.setObras(obrasArt);
        for(int i=0; i<listaArtistas.size(); i++){
            if(nombreViejo.equalsIgnoreCase(a.getNombre()+" "+a.getApellido())){
                listaArtistas.set(i, a);
            }
            
        }
            try {
                SobreEscribirArchivoArtistas();
                SobreEscribirArchivoAsociacion();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(controlObrasArtistasExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }
    
    public void eliminarArtista(String nombreC){
       String[] partes = nombreC.split(" ");

        String nombre = partes[0]; 
        String apellido = partes[1]; 
        for(artista a: listaArtistas){
            if(a.getNombre().equals(nombre.trim()) && a.getApellido().equals(apellido.trim())){
                try {
                    System.out.println(a.getApellido());
                    listaArtistas.remove(a);
                    SobreEscribirArchivoArtistas();
                   SobreEscribirArchivoAsociacion();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(controlObrasArtistasExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
 

 

 

   

}
