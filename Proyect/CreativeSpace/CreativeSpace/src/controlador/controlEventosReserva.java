
package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import model.controlEspacioReserva;
import model.controlObrasArtistasExposicion;
import model.obra;

/**
 *
 * @author gabri
 */
public class controlEventosReserva{

   private controlEspacioReserva controlEspacio = new controlEspacioReserva();
    
    public void crearReserva(String nombre, String fechaInicio, String fechaFin, String objetivo, String tipo, String descripcion, String horario, ArrayList<String> tituloObras) throws IOException, ParseException {
        controlEspacio.crearReserva("Pendiente", nombre, fechaInicio, fechaFin, objetivo, tipo, descripcion, horario, tituloObras);
    }
}

