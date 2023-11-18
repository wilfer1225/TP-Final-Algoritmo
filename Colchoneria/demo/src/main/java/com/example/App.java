package com.example;

import org.json.simple.parser.JSONParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class App {

    public static boolean disponible;
    public static int eleccion;
    public static String eleccionArchivo, RutaGeneral, nombreArchivo, nombreProducto, marcaProducto, tipoProducto, descripcionProducto;
    public static Scanner sc = new Scanner(System.in);
    public static Archivos biblioteca = new Archivos();
    static File Raiz = new File("C:\\Users\\Wilfer\\Documents\\Proyecto de Java\\Colchoneria1.0\\Ele\\");
    static File Productos = new File("C:\\Users\\Wilfer\\Documents\\Proyecto de Java\\Colchoneria1.0\\Ele\\Productos\\");
    static File Colchones = new File("C:\\Users\\Wilfer\\Documents\\Proyecto de Java\\Colchoneria1.0\\Ele\\Productos\\Colchones\\");
    public static File Almohadas = new File("C:\\Users\\Wilfer\\Documents\\Proyecto de Java\\Colchoneria1.0\\Ele\\Productos\\Almohadas\\");
    public static File Sabanas = new File("C:\\Users\\Wilfer\\Documents\\Proyecto de Java\\tpAlgoritmo1.0\\Nueva carpeta\\Ele\\Productos\\Sabanas\\");
    public static File otros = new File("C:\\Users\\Wilfer\\Documents\\Proyecto de Java\\Colchoneria1.0\\Ele\\Productos\\Otros\\");
    public static File vendido = new File("C:\\Users\\Wilfer\\Documents\\Proyecto de Java\\Colchoneria1.0\\Ele\\Vendido");
    public static Scanner eleccionAr = new Scanner(System.in);
    public static Scanner eleccionLeer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("\r\n" + //
                "  ____  _                           _     _                                   _             \r\n" + //
                " |  _ \\(_)                         (_)   | |                                 | |            \r\n" + //
                " | |_) |_  ___ _ ____   _____ _ __  _  __| | ___     __ _  __ _  __ _  __ _  | | __ _  __ _ \r\n" + //
                " |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\   / _` |/ _` |/ _` |/ _` | | |/ _` |/ _` |\r\n" + //
                " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) | | (_| | (_| | (_| | (_| | | | (_| | (_| |\r\n" + //
                " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/   \\__,_|\\__,_|\\__,_|\\__,_| |_|\\__,_|\\__,_|\r\n" + //
                "                                                                                            \r\n" + //
                "                                                                                            \r\n" + //
                "");
        System.out.println(".................................................................................");
        System.out.println("\r\n" + //
                "         )  (            )    )     )     (   (                              )  \r\n" + //
                "   (  ( /(  )\\ )  (   ( /( ( /(  ( /(     )\\ ))\\ )   (              *   ) ( /(  \r\n" + //
                "   )\\ )\\())(()/(  )\\  )\\()))\\()) )\\())(  (()/(()/(   )\\         ( ` )  /( )\\()) \r\n" + //
                " (((_|(_)\\  /(_)|((_)((_)\\((_)\\ ((_)\\ )\\  /(_))(_)|(((_)(       )\\ ( )(_)|(_)\\  \r\n" + //
                " )\\___ ((_)(_)) )\\___ _((_) ((_) _((_|(_)(_))(_))  )\\ _ )\\   _ ((_|_(_()) _((_) \r\n" + //
                "((/ __/ _ \\| | ((/ __| || |/ _ \\| \\| | __| _ \\_ _| (_)_\\(_) | | | |_   _|| \\| | \r\n" + //
                " | (_| (_) | |__| (__| __ | (_) | .` | _||   /| |   / _ \\   | |_| | | |  | .` | \r\n" + //
                "  \\___\\___/|____|\\___|_||_|\\___/|_|\\_|___|_|_\\___| /_/ \\_\\   \\___/  |_|  |_|\\_| \r\n" + //
                "                                                                                \r\n" + //
                "");
        System.out.println(
                ".................................................................................");

        Presentar();        
    }
    

    public static void Presentar() {
        System.out.println("Presione:");
        System.out.println("* 1.Ver catalogo\n" +
                "* 2.Agregar un Producto\n" +
                "* 0.Salir");
        eleccion = sc.nextInt();
        switch (eleccion) {

            case 1:
                VerCatalogo();
                break;

            case 2:
                AgregarProducto();

            case 0:
                break;

        }
       
    }

    public static void VerCatalogo() {

        System.out.println("Ingrese \n" +
                "* 1.Mostrar todo el catalogo\n" +
                "* 2.Mostrar los Productos disponibles\n" +
                "* 3.Mostrar los Productos vendidos\n" + 
                "* 4.Menu Principal");
                
        eleccion = sc.nextInt();

        switch (eleccion) {

            case 1:
                Archivos.MostrarArchivos(Raiz);
                break;

            case 2:
                ProductosDisponibles();
                break;

            case 3:
                Mostrarvendidos(vendido);
                break;

            // case 4:
            //     Presentar();
            //     break;

        }
        Presentar();

    }

    public static void ProductosDisponibles() {

        System.out.println("Ingrese\n" +
                "* 1.Colchones\n" +
                "* 2.Almohadas\n" +
                "* 3.Sabanas\n" +
                "* 4.Ver otros Productos\n" +
                "* 5.Volver atras\n" +
                "* 6.Menu Principal");

        eleccion = sc.nextInt();

        switch (eleccion) {

            case 1:
                MostrarArchivos(Colchones);
                break;

            case 2:
                MostrarArchivos(Almohadas);
                break;

            case 3:
                MostrarArchivos(Sabanas);
                break;

            case 4:
                MostrarArchivos(otros);
                break;

            case 5:
                VerCatalogo();
                break;
            
            case 6:
                Presentar();
                break; 
        }

    }

    public static void MostrarDisponibles() {
        MostrarArchivos(Productos);
    }

    public static void VerProducto(String RutaGeneral) {

        System.out.println("Ingrese el nombre del Producto que desea ver");
        nombreArchivo = eleccionLeer.nextLine();

        File aaa = new File(RutaGeneral + "\\" + nombreArchivo + ".txt");

        try {
            FileReader visor = new FileReader(aaa);
            int caracter;
            while ((caracter = visor.read()) != -1) {
                System.out.print((char) caracter);

            }
        } catch (IOException e) {
            System.out.println("No existe!");
        }

    }

    public static void MostrarArchivos(File Ruta) {

        RutaGeneral = Ruta.getAbsolutePath();
        if (Ruta.exists()) {
            for (File ArchDire : Ruta.listFiles()) {

                if (ArchDire.isFile()) {

                    biblioteca.SacarTXT(ArchDire.getName());
                }

                else if (ArchDire.isDirectory()) {
                    System.out.println(ArchDire.getName() + ": ");
                    MostrarArchivos(ArchDire);
                }
            }
        }

        if (Ruta == otros) {
            System.out.println("* 1.Ver el producto\n" + 
                    "* 2.Retirar el Producto");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    VerJson();
                    break;
                case 2:
                    RetirarProductoJson(RutaGeneral);
            }
        } else {
            System.out.println("* 1.Ver el producto\n" +
            "* 2.Retirar el Producto\n" +
             "* 3.Volver atras\n" + 
             "* 4.Menu Principal");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    VerProducto(RutaGeneral);
                    break;
                case 2:
                    RetirarProducto(RutaGeneral);
                    break;

                case 3:
                    VerCatalogo();
                    break;
            
                case 4:
                    Presentar();
                    break;
            }
        }
    }

    public static void RetirarProducto(String RutaGeneral) {

        System.out.println("Ingrese el producto retirado");
        eleccionArchivo = eleccionAr.nextLine();
        Path origen = Paths.get(RutaGeneral + "\\" + eleccionArchivo + ".txt");
        Path destino = Paths.get(vendido.getAbsolutePath());
        try {

            Files.move(origen, destino.resolve(origen.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("\"" + eleccionArchivo + "\"" + marcaProducto);

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public static void Mostrarvendidos(File vendidos) {
        for (File cadena : vendidos.listFiles()) {

            Archivos.SacarTXT(cadena.getName());
        }

    }

    public static void AgregarProducto(){

        System.out.print("Ingrese el nombre del Producto: ");
        nombreProducto = eleccionAr.nextLine();
        System.out.print("Ingrese la marca del Producto: ");
        marcaProducto = eleccionAr.nextLine();
        System.out.print("Ingrese el tipo: ");
        tipoProducto = eleccionAr.nextLine(); 
        System.out.print("Ingrese una descripcion del Producto: ");
        descripcionProducto = eleccionAr.nextLine();
        try {
            Archivos.CrearProducto(nombreProducto, marcaProducto, tipoProducto, descripcionProducto);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void VerJson() {
        System.out.println("Ingrese el nombre del Producto");
        nombreArchivo = eleccionLeer.nextLine();
        String RutaArchivo = RutaGeneral + "\\" + nombreArchivo + ".json";

        JSONParser jsonParser = new JSONParser();
        try (FileReader fileReader = new FileReader(RutaArchivo)) {

            Object objetoJSON = jsonParser.parse(fileReader);

            String jsonFormateado = objetoJSON.toString();

            System.out.println(jsonFormateado);
        }

        catch (FileNotFoundException e) {
            System.err.println("El Producto no existe, vuelva a intentar");
        } catch (IOException e) {

            System.err.println("No se pudo");
        } catch (org.json.simple.parser.ParseException e) {

            System.err.println("Hubo un problema, intente nuevamente");
        }

    }

    public static void RetirarProductoJson(String RutaGeneral) {

        System.out.println("Ingrese el nombre del Producto que desee dar de baja");
        eleccionArchivo = eleccionAr.nextLine();
        Path origen = Paths.get(RutaGeneral + "\\" + eleccionArchivo + ".json");
        Path destino = Paths.get(vendido.getAbsolutePath());
        try {

            Path mover = Files.move(origen, destino.resolve(origen.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("\"" + eleccionArchivo + "\"" + " Se dio de baja con exito");

        } catch (Exception e) {

            System.out.println(e);

        }

    }
}
