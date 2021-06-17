package src.peliculas;


public class Pelicula {
   
    int ID;
    String nombre;
    int anio;
    String categoria;
    boolean disponible;

    public Pelicula(int ID, String nombre, int anio, String categoria, boolean disponible) {
        this.ID = ID;
        this.nombre = nombre;
        this.anio = anio;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public Pelicula(int ID, String nombre, int anio, String categoria) {
        this.ID = ID;
        this.nombre = nombre;
        this.anio = anio;
        this.categoria = categoria;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getDisponible() {
        return disponible;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
         
     public String getInformacion(){
        String resultado = "ID = " + this.getID() + "  Nombre de la Pelicula = " + this.getNombre();
        return resultado;
    }
}

