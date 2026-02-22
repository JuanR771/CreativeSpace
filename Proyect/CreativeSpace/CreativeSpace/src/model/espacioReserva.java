package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class espacioReserva {
    
	private String horario;
	private int cantidadDias;
	private String objetivo;
	private String estado;
	private double tarifa = 1000;
        private exposicion exposicion;
	
public espacioReserva(String nombreExpo, String tipo, String descripcion, String estado, Date fechaInicio, Date fechaFin, String horario, String objetivo, ArrayList<obra> obras) {
		this.horario = horario;
                this.estado = estado;
		cantidadDias = calcularCantidadDias(fechaInicio, fechaFin);
		this.objetivo = objetivo;
		exposicion expo = new exposicion(nombreExpo, tipo, descripcion, fechaInicio, fechaFin,horario, obras);
                this.exposicion = expo;
		
	}

        public espacioReserva() {
        }
	
	public int calcularCantidadDias(Date fechaInicio, Date fechaFin) {
		LocalDate inicio = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fin = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		long diasEntre = ChronoUnit.DAYS.between(inicio, fin);
		return (int)diasEntre;
	}

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setExposicion(exposicion exposicion) {
        this.exposicion = exposicion;
    }
        
    public static ArrayList<espacioReserva> leerEspaciosReserva() throws ParseException {
        ArrayList<espacioReserva> espaciosReserva = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try (BufferedReader reader = new BufferedReader(new FileReader("Solicitudes.txt"))) {
            String line;
            espacioReserva espacio = null;
            ArrayList<obra>obras = new ArrayList<>();
            ArrayList<material>materiales = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("EspacioReserva:")) {
                    espacio = new espacioReserva();
                } else if (line.startsWith("Estado:")) {
                    espacio.setEstado(line.substring("Estado:".length()));
                } else if (line.startsWith("Horario:")) {
                    espacio.setHorario(line.substring("Horario:".length()));
                } else if (line.startsWith("CantidadDias:")) {
                    espacio.setCantidadDias(Integer.parseInt(line.substring("CantidadDias:".length())));
                } else if (line.startsWith("Objetivo:")) {
                    espacio.setObjetivo(line.substring("Objetivo:".length()));
                } else if (line.startsWith("Tarifa:")) {
                    espacio.setTarifa(Double.parseDouble(line.substring("Tarifa:".length())));
                } else if (line.startsWith("Exposicion:")) {
                    exposicion exposicion = new exposicion();
                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                        if (line.startsWith("Nombre:")) {
                            exposicion.setNombre(line.substring("Nombre:".length()));
                        } else if (line.startsWith("Tipo:")) {
                            exposicion.setTipo(line.substring("Tipo:".length()));
                        } else if (line.startsWith("Descripcion:")) {
                            exposicion.setDescripcion(line.substring("Descripcion:".length()));
                        } else if (line.startsWith("FechaInicio:")) {
                            exposicion.setFechaInicio(sdf.parse(line.substring("FechaInicio:".length())));
                        } else if (line.startsWith("FechaFin:")) {
                            exposicion.setFechaFin(sdf.parse(line.substring("FechaFin:".length())));
                        } else if (line.startsWith("Cuadro:")) {
                            cuadro cuadro = new cuadro();
                            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                                if (line.startsWith("Titulo:")) {
                                    cuadro.setTitulo(line.substring("Titulo:".length()));
                                } else if (line.startsWith("FechaCreacion:")) {
                                    cuadro.setFechaCreacion(sdf.parse(line.substring("FechaCreacion:".length())));
                                } else if (line.startsWith("Precio:")) {
                                    cuadro.setPrecio(Float.parseFloat(line.substring("Precio:".length())));
                                } else if (line.startsWith("Dimensiones:")) {
                                    cuadro.setDimensiones(Integer.parseInt(line.substring("Dimensiones:".length())));
                                } else if (line.startsWith("Tecnica:")) {
                                    cuadro.setTecnica(line.substring("Tecnica:".length()));
                                } else if (line.startsWith("Tema:")) {
                                    cuadro.setTema(line.substring("Tema:".length()));
                                } else if (line.startsWith("Clasificacion:")) {
                                    cuadro.setClasificacion(line.substring("Clasificacion:".length()));
                                } else if (line.startsWith("Imagen:")) {
                                    imagen imagen = new imagen();
                                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                                        if (line.startsWith("Resolucion:")) {
                                            imagen.setResolucion(Integer.parseInt(line.substring("Resolucion:".length())));
                                        } else if (line.startsWith("FormatoArchivo:")) {
                                            imagen.setFormatoArchivo(line.substring("FormatoArchivo:".length()));
                                        } else if (line.startsWith("Dimensiones:")) {
                                            imagen.setDimensiones(Integer.parseInt(line.substring("Dimensiones:".length())));
                                        }
                                    }
                                    cuadro.setImagen(imagen);
                                }
                            }
                            obras.add(cuadro);
                        } else if (line.startsWith("Escultura:")) {
                            escultura escultura = new escultura();
                            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                                if (line.startsWith("Titulo:")) {
                                    escultura.setTitulo(line.substring("Titulo:".length()));
                                } else if (line.startsWith("FechaCreacion:")) {
                                    escultura.setFechaCreacion(sdf.parse(line.substring("FechaCreacion:".length())));
                                } else if (line.startsWith("Precio:")) {
                                    escultura.setPrecio(Float.parseFloat(line.substring("Precio:".length())));
                                } else if (line.startsWith("Material:")) {
                                    escultura.setMaterial(line.substring("Material:".length()));
                                } else if (line.startsWith("Peso:")) {
                                    escultura.setPeso(Integer.parseInt(line.substring("Peso:".length())));
                                } else if (line.startsWith("Tamaño:")) {
                                    escultura.setTamaño(line.substring("Tamaño:".length()));
                                } else if (line.startsWith("Video:")) {
                                    video video = new video();
                                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                                        if (line.startsWith("Duracion:")) {
                                            video.setDuracion(Integer.parseInt(line.substring("Duracion:".length())));
                                        } else if (line.startsWith("Formato:")) {
                                            video.setFormato(line.substring("Formato:".length()));
                                        } else if (line.startsWith("Color:")) {
                                            video.setColor(line.substring("Color:".length()));
                                        }
                                    }
                                    escultura.setVideo(video);
                                }
                            }
                            obras.add(escultura);
                        } else if (line.startsWith("Instalacion:")) {
                            instalacion instalacion = new instalacion();
                            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                                if (line.startsWith("Titulo:")) {
                                    instalacion.setTitulo(line.substring("Titulo:".length()));
                                } else if (line.startsWith("FechaCreacion:")) {
                                    instalacion.setFechaCreacion(sdf.parse(line.substring("FechaCreacion:".length())));
                                } else if (line.startsWith("Precio:")) {
                                    instalacion.setPrecio(Float.parseFloat(line.substring("Precio:".length())));
                                } else if (line.startsWith("Descripcion:")) {
                                    instalacion.setDescripcion(line.substring("Descripcion:".length()));
                                } else if (line.startsWith("Material:")) {
                                    material material = new material();
                                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                                        if (line.startsWith("Nombre:")) {
                                            material.setNombre(line.substring("Nombre:".length()));
                                        } else if (line.startsWith("Precio:")) {
                                            material.setPrecio(Integer.parseInt(line.substring("Precio:".length())));
                                        }
                                    }
                                    materiales.add(material);
                                }
                            }
                            obras.add(instalacion);
                        }
                    }
                    exposicion.setObras(obras);
                    espacio.setExposicion(exposicion);
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return espaciosReserva;
    }


        public void guardarEspacioReserva() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Solicitudes.txt", true))) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            writer.write("EspacioReserva:");
            writer.newLine();
            writer.write("Estado:" + estado);
            writer.newLine();
            writer.write("FechaInicio:" + sdf.format(exposicion.getFechaInicio()));
            writer.newLine();
            writer.write("FechaFin:" + sdf.format(exposicion.getFechaFin()));
            writer.newLine();
            writer.write("Horario:" + horario);
            writer.newLine();
            writer.write("CantidadDias:" + cantidadDias);
            writer.newLine();
            writer.write("Objetivo:" + objetivo);
            writer.newLine();
            writer.write("Tarifa:" + tarifa);
            writer.newLine();
            exposicion.Archivoexposicion();
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
    public String getHorario() {
        return horario;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getEstado() {
        return estado;
    }

    public double getTarifa() {
        return tarifa;
    }

    public exposicion getExposicion() {
        return exposicion;
    }

    public void setExp(exposicion exp) {
        this.exposicion = exp;
    }

}