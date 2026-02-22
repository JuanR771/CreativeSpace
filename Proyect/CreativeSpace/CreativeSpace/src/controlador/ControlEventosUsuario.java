
package controlador;



import java.util.List;
import model.comprador;
import model.controlRegistro;

public class ControlEventosUsuario {
    
    public boolean clasificarUsuario(String nombrecompleto, List<comprador> compradores){
        for(comprador c : compradores){
            if(c.getNombreCompleto().equals(nombrecompleto)){
                return true;
            }
        }
        
        return false;
        
       
    }
    
    public void registrarComprador(String nombreCompleto, String correo, Integer telefono, String direccion, String password){
        controlRegistro cr = new controlRegistro();
        cr.crearComprador(nombreCompleto, correo, telefono, direccion, password);
   
        
    }
    
    
    public boolean verificarUsuario(String usuario, String contraseña, List<comprador> compradores){
        
                for(comprador c : compradores){
            if(c.getNombreCompleto().equals(usuario) && c.getPassword().equals(contraseña)){
                return true;
            }
        }
        
        return false;
        
    }
    
    
    
}
