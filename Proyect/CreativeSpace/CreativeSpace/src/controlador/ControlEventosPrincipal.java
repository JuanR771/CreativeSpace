
package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import model.controlCompra;
import model.controlEspacioReserva;
import model.controlNoticia;
import model.controlObrasArtistasExposicion;
import model.noticia;
import model.obra;
import view.SeccionCRUDArte;
import view.SeccionNoticia;

public class ControlEventosPrincipal {
    
   private controlObrasArtistasExposicion co = new controlObrasArtistasExposicion();
       private controlNoticia cn;
    private SeccionNoticia sn;
    private controlEspacioReserva cer = new controlEspacioReserva();

    public controlEspacioReserva getCer() {
        return cer;
    }
    private controlCompra cc = new controlCompra();

    public controlCompra getCc() {
        return cc;
    }
     public controlObrasArtistasExposicion getCo() {
        return co;
    }
    

    
    public void crearnoticias(String titulo, Date fechaPublicacion, String descripcion, String obras) {
        
        List<Integer> indices = Arrays.stream(obras.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        
        // Seleccionar las obras correspondientes de la lista original de obras
        List<obra> listaObras = new ArrayList<>();
        for (int indice : indices) {
            // Asumiendo que la lista de obras está disponible en algún lugar
            if (indice >= 0 && indice < co.getListaObras().size()) {
                listaObras.add(co.getListaObras().get(indice));
            }
        }
    
        // Crear la noticia con la lista de obras seleccionadas
        cn.crearNoticia(titulo, fechaPublicacion, descripcion, listaObras);
    
    }
    
  
        
        public String mostrarNoticias(){
            return "\n" +
               "Titulo: "+cn.getNoticias().get(0).getTitulo()  + "\n" +
                 "Fecha de Publicación: " + cn.getNoticias().get(0).getFechaPublicacion() + "\n" +
                   "Titulo de la obra: " + cn.getNoticias().get(0).getObras().get(0).getTitulo()+ "\n" +
                    "Autor de la obra: " + cn.getNoticias().get(0).getObras().get(0).getAutor().getNombre()+ " " + cn.getNoticias().get(0).getObras().get(0).getAutor().getApellido() +"\n" ;
                
         
            
        }    
       public SeccionNoticia getSeccionNoticia() {
        return sn;
    }

    public ControlEventosPrincipal() {
         cn = new controlNoticia();
    sn = new SeccionNoticia();
    co.llenarListas();
    
    }
     
    
    
    
    public void CrearObraInstalacion(Float precio, String titulo, Date fechaCreacion, String descripcion, List<String> materiales){
        co.llenarListas();
        co.crearInstalacion(descripcion, materiales, precio, titulo, fechaCreacion);
        
        
       
    }
       public void CrearObraCuadro  (Float precio, String titulo, Date fechaCreacion, int dimensiones, String tecnica, String tema, String clasificacion, int resolucion, String formatoArchivo, int dimensionesImagen){
           co.llenarListas();
           co.crearCuadro(dimensiones,tecnica, tema, clasificacion, resolucion, formatoArchivo, dimensionesImagen, precio, titulo, fechaCreacion);
        
        
       
    }
       
             public void CrearObraEscultura  (Float precio, String titulo, Date fechaCreacion, String material, int peso, String tamaño, int duracion, String formato, String color){
                co.llenarListas();
                co.crearEscultura(material, peso, tamaño, duracion, formato, color, precio, titulo, fechaCreacion);
        
        
        
       
    }
     
            
       public void CrearArtista(String nombre, String apellido, Date fechaNacimiento, String biografia, ArrayList<String> obras){
           co.llenarListas();
           co.crearArtista(nombre,apellido,fechaNacimiento,biografia, obras);
    }
       public void modificarArtista(String nombre, String apellido, Date fechaNacimiento, String biografia, ArrayList<String> obras, String nombreViejo){
           co.llenarListas();
           co.modificarArtista(nombre, apellido, fechaNacimiento, biografia, obras, nombreViejo);
       }
             
             
     public void consultaObra(String titulo, String nombre, SeccionCRUDArte sc){
         co.llenarListas();
         co.mostrarObra(titulo,nombre, sc);
     }
     
         public void consultaArtista(String nombre, SeccionCRUDArte sc){
             co.llenarListas();
             co.mostrarArtista(nombre, sc);
     }
     
     public void modificarObraEvento(String titulo, Float precio, String tituloViejo){
         co.llenarListas();
         co.modificarObra(titulo, precio,tituloViejo);
         
     }
     
         public void eliminarObraEvento(String titulo){
             co.llenarListas();
             co.eliminarObra(titulo);
         
     }
         
               public void eliminarArtistaEvento(String nombre){
                   co.llenarListas();
                   co.eliminarArtista(nombre);
         
     }
         
        public void RArteComprar(String metodoEnvio, String nombreUsuario, String tituloObra){
            co.llenarListas();
            obra o = co.buscarObra(tituloObra);
            Date fechaActual = new Date();
            controlCompra cc = new controlCompra();
            double coeficienteM = cc.calcularCoeficienteModa(fechaActual);
            double precioFinal = o.getPrecio()*(1+coeficienteM);
            cc.crearVenta(nombreUsuario, o.getTitulo(), fechaActual, coeficienteM, precioFinal, metodoEnvio);
            
        }
        
        public void CrearExposicion(String nombre, String tipo, String descripcion, Date fechaInicio, Date fechaFin, String horario, ArrayList<String> obras){
            co.llenarListas();
            co.crearExposicion(nombre, tipo, descripcion, fechaInicio, fechaFin, horario, obras);
    }
        
        public String obtenerObras(){
            List <obra> obras = co.getListaObras();{
            StringBuilder texto = new StringBuilder();
        for (int i = 0; i < obras.size(); i++) {
            obra noticia = obras.get(i);
            texto.append((i + 1)).append(". ").append(noticia.getTitulo());
            if (i < obras.size() - 1) {
                texto.append("\n"); // Agregar salto de línea entre cada título de noticia
            }
        }
        String textoHTML = texto.toString().replaceAll("\n", "<br>");
        return textoHTML;
        }  
        }
        
        public List<noticia> obtenerNoticias(){
           return cn.getNoticias();
            
        }
        
       
    
}
