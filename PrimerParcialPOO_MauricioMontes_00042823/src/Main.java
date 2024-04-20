import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Dispositivo> articulos = new ArrayList<Dispositivo>();

    public static void main(String[] args){
        int opcion = 0;
        Scanner reader = new Scanner(System.in);


        //This whole thing makes me puke, my day is ruined
        while (true){
            try{
                System.out.println("""
                ##### Bienvenido al sistema de inventario de ElectroMart TM ######
                Seleccione una opción para continuar:
                \t1. Nuevo artículo
                \t2. Modificar precio artículo
                \t3. Información artículo
                \t4. Lista de artículos
                \t5. Salir
                """);
                System.out.print("Opción: ");
                opcion = reader.nextInt();

                if (opcion != 5){ //I think there is a better way to do this, but my mind just went blank
                    switch (opcion){
                        case 1: //Crear nuevo objeto
                            agregarArticulo();
                            break;
                        case 2: //Modificar información objeto
                            modificarPrecioArticulo(); //not implemented I'm dumb
                            break;
                        case 3: //Mostrar información individual
                            mostrarInformacionArticulo();
                            break;
                        case 4: //Mostrar lista objetos
                            mostrarListaArticulo();
                            break;
                        default:
                            System.out.println("""
                            -------------------------------------
                            Ingrese una opción válida >:(
                            -------------------------------------
                            """);
                            break;
                    }
                }
                else {
                    System.out.println("bye bye");
                    break; //the loop
                }
            }
            catch (Exception exception){
                System.out.println("""
                        -------------------------------------
                        Ingrese una opción válida >:(
                        -------------------------------------
                        """);
            }
            finally {
                reader.nextLine();
            }

        }
    }

    private static void mostrarListaArticulo() {
        Scanner reader = new Scanner(System.in);
        int number = 0;

        for (Dispositivo articulo : articulos){
            System.out.println(++number);
            System.out.println("Nombre: "+articulo.getNombre());
            System.out.println("Modelo: "+articulo.getModelo());
            System.out.println("Descripción: "+articulo.getDescripcion());
            System.out.println("Precio: $"+articulo.getPrecio());
        }
    }

    private static void modificarPrecioArticulo() {

    }

    private static void mostrarInformacionArticulo() {
        String nombre;
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto a buscar: ");
        nombre = reader.nextLine();

        for (Dispositivo articulo : articulos){
            if (nombre == articulo.getNombre()){
                System.out.println(articulo.getNombre());
                System.out.println(articulo.getModelo());
                System.out.println(articulo.getDescripcion());
                System.out.println("$"+articulo.getPrecio());
            }
            else{
                System.out.println("No se encontró el artículo");
            }
        }
    }

    //I hate this thing, I forgot how to do this properly aaaaaaaahg
    private static void agregarArticulo() {
        int opcion = 0;
        String nombre, modelo, descripcion, procesador;
        int megapixeles, RAM;
        float pulgadas;
        double precio;

        Dispositivo articulo = null;
        Scanner reader = new Scanner(System.in);

        while (true){
            try{
                System.out.println("""
                ¿Qué desea agregar?
                1. Teléfono móvil
                2. Laptop
                """);
                opcion = reader.nextInt();
            }
            catch (Exception exception){
                System.out.println("Por favor, ingrese una opción válida");
            }
            finally {
                reader.nextLine();
            }
            System.out.print("Ingrese el nombre del artículo: ");
            nombre = (reader.nextLine());
            System.out.print("Ingrese el modelo del dispositivo: ");
            modelo = (reader.nextLine());
            System.out.print("Ingrese una breve descripción del dispositivo: ");
            descripcion = (reader.nextLine());
            System.out.print("Ingrese el precio del artículo: ");
            precio = (reader.nextFloat());

            if (opcion == 1){
                System.out.print("Ingrese los megapixeles de la cámara: ");
                megapixeles = (reader.nextInt());
                System.out.print("Ingrese las pulgadas de la pantalla: ");
                pulgadas = (reader.nextFloat());

                articulo = new Telefono(nombre, modelo, descripcion, precio, megapixeles, pulgadas);
            }
            else{
                System.out.print("Ingrese los GB de RAM: ");
                RAM = (reader.nextInt());
                reader.nextLine();
                System.out.print("Ingrese el procesador de la laptop: ");
                procesador = (reader.nextLine());

                articulo = new Laptop(nombre, modelo, descripcion, precio, RAM, procesador);
            }
            articulos.add(articulo);

            System.out.println("""
                -------------------------------------
                Artículo creado sin problemas!!
                -------------------------------------
                """);
            break;
        }
    }


}