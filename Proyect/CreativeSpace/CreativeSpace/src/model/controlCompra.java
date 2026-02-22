package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class controlCompra {
    
    public ArrayList<compra> ventas;

    public controlCompra(){
        setVentas(leerComprasDeArchivo());
    }
    
        public void crearVenta(String Usuario, String tituloObra, Date fechaCompra, double coeficienteM, double precioFinal, String metodoEnvio) {
            compra c = new compra(Usuario, tituloObra, fechaCompra, coeficienteM, precioFinal, metodoEnvio);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("compras.txt", true))) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fechaCompraStr = sdf.format(fechaCompra);
                writer.write(Usuario + "," + tituloObra + "," + fechaCompraStr + "," + coeficienteM + "," + precioFinal + "," + "Online" + "," + metodoEnvio);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
	}
        
        public ArrayList<compra> leerComprasDeArchivo() {
            ArrayList<compra> compras = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            try (BufferedReader reader = new BufferedReader(new FileReader("compras.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] partes = line.split(",");
                    if (partes.length == 7) {
                        String comprador = partes[0];
                        String tituloObra = partes[1];
                        Date fechaCompra = sdf.parse(partes[2]);
                        double coeficienteM = Double.parseDouble(partes[3]);
                        double precioFinal = Double.parseDouble(partes[4]);
                        String formaPago = partes[5];
                        String metodoEnvio = partes[6];

                        compra compra = new compra(comprador, tituloObra, fechaCompra, coeficienteM, precioFinal, metodoEnvio);
                        compras.add(compra);
                    }
                }
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
            return compras;
        }
        
	public double calcularCoeficienteModa(Date fecha) {
            Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        int mes = calendar.get(Calendar.MONTH);

        switch (mes) {
            case Calendar.JANUARY:
                return 0.4;
            case Calendar.FEBRUARY:
                return 0.1;
            case Calendar.MARCH:
                return 0.3;
            case Calendar.APRIL:
                return 0.2;
            case Calendar.MAY:
                return 0.1;
            case Calendar.JUNE:
                return 0.1;
            case Calendar.JULY:
                return -0.2;
            case Calendar.AUGUST:
                return -0.3;
            case Calendar.SEPTEMBER:
                return -0.1;
            case Calendar.OCTOBER:
                return 0.1;
            case Calendar.NOVEMBER:
                return 0.3;
            case Calendar.DECEMBER:
                return 0.2;
            default:
                throw new IllegalArgumentException("Mes no válido");
        }
	}
	
	public void crearInforme(String tipoInforme, ArrayList<compra> compras) {
            informe i = new informe(tipoInforme,compras);
		
	}
	
	public void crearInforme(String tipoInforme, Date fechaInicio, Date fechaFin) {
		
	}

    public void setVentas(ArrayList<compra> ventas) {
        this.ventas = ventas;
    }
        
}