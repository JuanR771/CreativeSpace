package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class exposicion {
	
	private String nombre;
	private String tipo;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private String horario;
	private ArrayList<obra> obras;

    public exposicion() {
       
    }
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public ArrayList<obra> getObras() {
		return obras;
	}
	public void setObras(ArrayList<obra> obras) {
		this.obras = obras;
	}

    public exposicion(String nombre, String tipo, String descripcion, Date fechaInicio, Date fechaFin, String horario, ArrayList<obra> obras) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horario = horario;
        this.obras = obras;
    }
    
    public void Archivoexposicion(){
        
        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter("listaExposicion.txt", true))) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            writer.write("Exposicion:");
            writer.newLine();
            writer.write("Nombre:" + nombre);
            writer.newLine();
            writer.write("Tipo:" + tipo);
            writer.newLine();
            writer.write("Descripcion:" + descripcion);
            writer.newLine();
            writer.write("FechaInicio:" + sdf.format(fechaInicio));
            writer.newLine();
            writer.write("FechaFin:" + sdf.format(fechaFin));
            writer.newLine();
            for (obra o : obras) {
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
                    writer.write("Dimensiones:" + c.getDimensiones());
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
                    writer.write("FormatoArchivo:" + c.getImagen().getFormatoArchivo());
                    writer.newLine();
                    writer.write("Dimensiones:" + c.getImagen().getDimensiones());
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
                    writer.write("Formato:" + e.getVideo().getFormato());
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
                        writer.write("Precio:" + m.getPrecio());
                        writer.newLine();
                    }
                }
            }
        }   catch (IOException ex) {
                Logger.getLogger(exposicion.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public static exposicion leerArchivoExposicion(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String nombre = null;
        String tipo = null;
        String descripcion = null;
        Date fechaInicio = null;
        Date fechaFin = null;
        String horario = null;
        ArrayList<obra> obras = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("listaExposicion.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Exposicion:")) {
                    // Skip this line
                } else if (line.startsWith("Nombre:")) {
                    nombre = line.split(":")[1];
                } else if (line.startsWith("Tipo:")) {
                    tipo = line.split(":")[1];
                } else if (line.startsWith("Descripcion:")) {
                    descripcion = line.split(":")[1];
                } else if (line.startsWith("FechaInicio:")) {
                    fechaInicio = sdf.parse(line.split(":")[1]);
                } else if (line.startsWith("FechaFin:")) {
                    fechaFin = sdf.parse(line.split(":")[1]);
                } else if (line.startsWith("Cuadro:")) {
                    cuadro c = new cuadro();
                    while (!(line = reader.readLine()).startsWith("Imagen:")) {
                        if (line.startsWith("Titulo:")) {
                            c.setTitulo(line.split(":")[1]);
                        } else if (line.startsWith("FechaCreacion:")) {
                            c.setFechaCreacion(sdf.parse(line.split(":")[1]));
                        } else if (line.startsWith("Precio:")) {
                            c.setPrecio(Float.parseFloat(line.split(":")[1]));
                        } else if (line.startsWith("Dimensiones:")) {
                            c.setDimensiones(Integer.parseInt(line.split(":")[1]));
                        } else if (line.startsWith("Tecnica:")) {
                            c.setTecnica(line.split(":")[1]);
                        } else if (line.startsWith("Tema:")) {
                            c.setTema(line.split(":")[1]);
                        } else if (line.startsWith("Clasificacion:")) {
                            c.setClasificacion(line.split(":")[1]);
                        }
                    }
                    imagen img = new imagen();
                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                        if (line.startsWith("Resolucion:")) {
                            img.setResolucion(Integer.parseInt(line.split(":")[1]));
                        } else if (line.startsWith("FormatoArchivo:")) {
                            img.setFormatoArchivo(line.split(":")[1]);
                        } else if (line.startsWith("Dimensiones:")) {
                            img.setDimensiones(Integer.parseInt(line.split(":")[1]));
                        }
                    }
                    c.setImagen(img);
                    obras.add(c);
                } else if (line.startsWith("Escultura:")) {
                    escultura e = new escultura();
                    while (!(line = reader.readLine()).startsWith("Video:")) {
                        if (line.startsWith("Titulo:")) {
                            e.setTitulo(line.split(":")[1]);
                        } else if (line.startsWith("FechaCreacion:")) {
                            e.setFechaCreacion(sdf.parse(line.split(":")[1]));
                        } else if (line.startsWith("Precio:")) {
                            e.setPrecio(Float.parseFloat(line.split(":")[1]));
                        } else if (line.startsWith("Material:")) {
                            e.setMaterial(line.split(":")[1]);
                        } else if (line.startsWith("Peso:")) {
                            e.setPeso(Integer.parseInt(line.split(":")[1]));
                        } else if (line.startsWith("Tamaño:")) {
                            e.setTamaño(line.split(":")[1]);
                        }
                    }
                    video vid = new video();
                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                        if (line.startsWith("Duracion:")) {
                            vid.setDuracion(Integer.parseInt(line.split(":")[1]));
                        } else if (line.startsWith("Formato:")) {
                            vid.setFormato(line.split(":")[1]);
                        } else if (line.startsWith("Color:")) {
                            vid.setColor(line.split(":")[1]);
                        }
                    }
                    e.setVideo(vid);
                    obras.add(e);
                } else if (line.startsWith("Instalacion:")) {
                    instalacion i = new instalacion();
                    while ((line = reader.readLine()) != null && !line.startsWith("Material:")) {
                        if (line.startsWith("Titulo:")) {
                            i.setTitulo(line.split(":")[1]);
                        } else if (line.startsWith("FechaCreacion:")) {
                            i.setFechaCreacion(sdf.parse(line.split(":")[1]));
                        } else if (line.startsWith("Precio:")) {
                            i.setPrecio(Float.parseFloat(line.split(":")[1]));
                        } else if (line.startsWith("Descripcion:")) {
                            i.setDescripcion(line.split(":")[1]);
                        }
                    }
                    ArrayList<material> materiales = new ArrayList<>();
                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                        material m = new material();
                        if (line.startsWith("Nombre:")) {
                            m.setNombre(line.split(":")[1]);
                        } else if (line.startsWith("Precio:")) {
                            m.setPrecio(Integer.parseInt(line.split(":")[1]));
                        }
                        materiales.add(m);
                    }
                    i.setMateriales(materiales);
                    obras.add(i);
                }
            }
        }   catch (FileNotFoundException ex) {
                Logger.getLogger(exposicion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(exposicion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(exposicion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return new exposicion(nombre, tipo, descripcion, fechaInicio, fechaFin, horario, obras);
    }
}