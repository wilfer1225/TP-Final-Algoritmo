package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {
	static String LosProductos;
	static Scanner sc = new Scanner(System.in);
	static File Raiz = new File("C:\\Ele\\");
	public static boolean estado;

	public static void CrearProducto(String NombreProducto, String Marca, String tipo, String descipcion) throws IOException {
		FileWriter Producto = null;
		try {
			Producto = new FileWriter("C:\\Users\\Wilfer\\Documents\\Proyecto de Java\\Colchoneria1.0\\Ele\\Productos\\Otros\\" + NombreProducto + ".json");
			

			Producto.write("{" + "\"Producto\"" + ": " + "\"" + Marca + "\"" + "," + "\n" + "\"Tipo\"" + ":" + "\""
					+ tipo + "\"" + "\n" + "\"Descripcion\"" + ":" + "\""
					+ descipcion + "\"" + "}");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			Producto.close();
		}
		System.out.println("Se a agregado el Producto con exito");

	}

	public static void MostrarArchivos(File Ruta) {

		for (File ArchDire : Ruta.listFiles()) {

			if (ArchDire.isFile()) {

				SacarTXT(ArchDire.getName());
			}

			else if (ArchDire.isDirectory()) {
				System.out.println(ArchDire.getName() + ": ");
				MostrarArchivos(ArchDire);
			}
		}
	}

	public static void SacarTXT(String Nombre) {
		int Longitud = Nombre.length();
		String Renombre = Nombre.substring(0, Longitud - 4);
		System.out.println("* " + Renombre);

	}

}
