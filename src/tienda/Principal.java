package src.tienda;

import src.clientes.VectorClientes;
import src.peliculas.VectorPeliculas;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private VectorPeliculas listadoPelicula = new VectorPeliculas();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("\n\nBienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascendente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Ingreso de Peliculas");
            System.out.println("6) Mostrar Peliculas");
            System.out.println("7) Ordenar Peliculas Ascendente por nombre");
            System.out.println("8) Ordenar Peliculas Descendente por nombre");
            System.out.println("9) Ordenar Peliculas por ID");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
            
            if (menu == 5){
                //registrar pelicula
                listadoPelicula.realizarRegistroPelicula();
            }
            if (menu == 6){
                //mostrar las peliculas
                listadoPelicula.verCatalogoPeliculas();
            }
            if (menu == 7){
                //ordenar peliculas Ascendente por Nombre
                listadoPelicula.ordenarPeliculasPorNombreAscendente();
            }
            if (menu == 8){
                //ordenar peliculas Descendente por Nombre
                listadoPelicula.ordenarPeliculasPorNombreDescendente();
            }
            if (menu == 9){
                //ordenar peliculas por ID
                listadoPelicula.ordenarPeliculasPorID(true);
            }
            
        }

    }

    
}

