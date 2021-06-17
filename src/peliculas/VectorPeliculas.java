package src.peliculas;
import src.tienda.*;
import java.util.Scanner;

public class VectorPeliculas {
    private Pelicula[] listadoPeliculas = new Pelicula[50];
    private int siguienteCodigo;
    String peliculasComoCadenas = "";
    
    Scanner escaner = new Scanner(System.in);

    //Constructor
    public VectorPeliculas() {
        siguienteCodigo = listadoPeliculas.length;
    }

    //Metodo para agregar pelicula
    public boolean agregarPelicula(String textoID, String nombre, String cadenaFecha, String categoria) {
        
        int ID = Integer.parseInt(textoID);
        if (!(revisarSiYaIDPeliculas(ID))) {
            for (int i = 0; i < listadoPeliculas.length; i++) {
                if ((listadoPeliculas[i] == null)) {

                    int fecha = Integer.parseInt(cadenaFecha);
                    listadoPeliculas[i] = new Pelicula(i, nombre, fecha, categoria);
                    peliculasComoCadenas = peliculasComoCadenas + "," + nombre;
                    return true;
                }
            }
            
        }
        return false;
    }
    
    //Metodo para Revisar si ya esta ese ID de Pelicula
    public boolean revisarSiYaIDPeliculas(int ID) {
        for (int i = 0; i < listadoPeliculas.length; i++) {
            if ((listadoPeliculas[i] != null) && (listadoPeliculas[i].ID == ID)) {
                return true;
            }
        }
        return false;
    }

   //Metodo para registrar pelicula
   public void realizarRegistroPelicula() {
        
        System.out.println("Ingresar el Nombre de la Pelicula");
        String nombre = escaner.next();
       
        //System.out.println("Ingresar el ID de Pelicula, solo numeros");
        //String ID = escaner.next();
        String ID = "10";
        System.out.println("Ingresar el Anio de la Pelicula, en numeros");
        String fecha = escaner.next();
        System.out.println("Ingresar la categoria o genero de la pelicula");
        System.out.println("accion, comedia, infantil, terror u otro, ficcion, drama, historia...");
        String categoria = escaner.next();
       
        
        if (agregarPelicula(ID, nombre, fecha, categoria)) {

            System.out.println("Pelicula agregada");

        } else {

            System.out.println("Oh no, ya hay una pelicula con ese IDE, no pueden repetirse");

        }
    }

   //Metodo para agrandar catalogo
    public void agrandarEspacio() {
        Pelicula[] nuevo = new Pelicula[(siguienteCodigo + 1)];
        for (int i = 0; i < listadoPeliculas.length; i++) {
            nuevo[i] = listadoPeliculas[i];
        }
        listadoPeliculas = null;
        listadoPeliculas = nuevo;
    }

    //Metodo para ver catalogo
    public void verCatalogoPeliculas() {
        for (int i = 0; i < listadoPeliculas.length; i++) {
            if (listadoPeliculas[i] != null) {
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("ID = " + listadoPeliculas[i].ID + "  Nombre de la Pelicula = " + listadoPeliculas[i].nombre);
                System.out.println("Anio = " + listadoPeliculas[i].anio + "    Categoria = " + listadoPeliculas[i].categoria);
                System.out.println("Disponibilidad: " + verDisponibilidad(listadoPeliculas[i].disponible));
                System.out.println(" ");
            } else {
                i = listadoPeliculas.length;
            }
        }
    }
 
    //Metodo para ver disponibilidad
    public String verDisponibilidad(boolean disponible) {
        if (!disponible) {
        return "Disponible";
        } else {
            return "No Disponible";
        }

    }

    // Metodos de ordenar

    public void ordenarPeliculasPorNombreAscendente(){
           
                String separador = ",";
                System.out.println("    ");
                String[] peliculasComoArreglo = peliculasComoCadenas.split(separador);
                for (String pelicula : peliculasComoArreglo) {
                    System.out.println(pelicula);
                }
                
                ordenarAscendentePeliculas(peliculasComoArreglo);  
    }
    
    public void ordenarAscendentePeliculas(String[] palabrasAOrdenar) {
       
        System.out.println("Ordenando... ");
        for (int x = 0; x < palabrasAOrdenar.length; x++) {
            
            for (int y = 0; y < palabrasAOrdenar.length - 1; y++) {
                String elementoActual = palabrasAOrdenar[y],
                        elementoSiguiente = palabrasAOrdenar[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {
                   
                    palabrasAOrdenar[y] = elementoSiguiente;
                    palabrasAOrdenar[y + 1] = elementoActual;
                }
            }
        }
        System.out.println("Peliculas ordenadas de A a Z:");
        for (int i = 0; i < palabrasAOrdenar.length; i++) {
            System.out.println("    " + palabrasAOrdenar[i]);
        }
            
}
    
    public void ordenarPeliculasPorNombreDescendente(){
           
                String separador = ",";
                System.out.println("    ");
                String[] peliculasComoArreglo = peliculasComoCadenas.split(separador);
                for (String pelicula : peliculasComoArreglo) {
                    System.out.println(pelicula);
                }
                
                ordenarDescendentePeliculas(peliculasComoArreglo);  
    }
    
    public void ordenarDescendentePeliculas(String[] palabrasAOrdenar) {
       
        System.out.println("Ordenando... ");
        for (int x = 0; x < palabrasAOrdenar.length; x++) {
            
            for (int y = 0; y < palabrasAOrdenar.length - 1; y++) {
                String elementoActual = palabrasAOrdenar[y],
                        elementoSiguiente = palabrasAOrdenar[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) < 0) {
                   
                    palabrasAOrdenar[y] = elementoSiguiente;
                    palabrasAOrdenar[y + 1] = elementoActual;
                }
            }
        }
        System.out.println("Peliculas ordenadas de Z a A:");
        for (int i = 0; i < palabrasAOrdenar.length; i++) {
            System.out.println("    " + palabrasAOrdenar[i]);
        }
            
}
      

    public void ordenarPeliculasPorID(boolean ascendente) {
       for (int i = 0; i < listadoPeliculas.length; i++) {
            if (listadoPeliculas[i] != null) {
                System.out.println(" ");
                System.out.println("ID = " + listadoPeliculas[i].ID + "  Pelicula: " + listadoPeliculas[i].nombre);
                System.out.println(" ");
            } else {
                i = listadoPeliculas.length;
            }
        }
       
    }
    
}

