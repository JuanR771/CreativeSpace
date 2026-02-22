package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class controlEspacioReserva {
    
    private espacioReserva espacio = new espacioReserva();
    
    public void crearReserva(String estado, String nombre, String fechaInicio, String fechaFin, String objetivo, String tipo, String descripcion, String horario, ArrayList<String> obras) {
        String dateFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        
        Date fInicio = null;
        Date fFin = null;
        
        try {
            fInicio = sdf.parse(fechaInicio);
            fFin = sdf.parse(fechaFin);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        controlObrasArtistasExposicion c = new controlObrasArtistasExposicion();
        c.llenarListas();

        ArrayList<obra> obrasExpo = new ArrayList<>();

        for(int i=0; i<obras.size();i++){        
            for(int j=0; j<c.getListaObras().size();j++){
                if(obras.get(i).equalsIgnoreCase(c.getListaObras().get(j).getTitulo())){
                    obrasExpo.add(c.getListaObras().get(j));
                    break;
                }
            }
        }
        espacio = new espacioReserva(nombre, tipo, descripcion, estado, fInicio, fFin, horario, objetivo, obrasExpo);
        espacio.guardarEspacioReserva();
    }
	
    public void actualizarTarifaArrendamiento(double tarifaNueva) {
        espacio.setTarifa(tarifaNueva);
    }

    public espacioReserva getEspacio() {
        return espacio;
    }

}