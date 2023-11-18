# README del Repositorio

Este repositorio contiene un proyecto en Java que gestiona un catálogo de productos para una colchonería. La aplicación utiliza archivos JSON para almacenar la información de los productos y cuenta con dos clases principales: `App` y `Archivos`. A continuación, se proporciona una breve descripción de cada componente y su funcionalidad.

## Clase `App`

La clase principal `App` se encarga de la interacción con el usuario y la gestión del catálogo de productos. A continuación se detallan las principales características de la clase:

### Variables de Clase
- `disponible`: Variable que indica si un producto está disponible.
- `eleccion`: Variable que almacena la elección del usuario.
- `eleccionArchivo`, `RutaGeneral`, `nombreArchivo`, `nombreProducto`, `marcaProducto`, `tipoProducto`, `descripcionProducto`: Variables relacionadas con la gestión de archivos y productos.
- `sc`, `eleccionAr`, `eleccionLeer`: Objetos `Scanner` para la entrada de datos.

### Directorios Predeterminados
Se han definido directorios predeterminados para organizar los archivos de productos:
- `Raiz`: Directorio principal.
- `Productos`, `Colchones`, `Almohadas`, `Sabanas`, `otros`: Directorios específicos para cada tipo de producto.
- `vendido`: Directorio para productos vendidos.

### Métodos Principales
- `main`: Función principal que inicia la aplicación y presenta un menú al usuario.
- `Presentar`: Método para presentar el menú principal.
- `VerCatalogo`: Método para mostrar el catálogo de productos.
- `ProductosDisponibles`: Método para mostrar productos disponibles por categoría.
- `MostrarArchivos`, `Mostrarvendidos`: Métodos para mostrar archivos y productos vendidos.
- `AgregarProducto`: Método para agregar un nuevo producto.
- `VerJson`, `RetirarProductoJson`: Métodos relacionados con la gestión de archivos JSON.

## Clase `Archivos`

La clase `Archivos` se encarga de la manipulación de archivos y productos. A continuación se describen sus principales características:

### Variables de Clase
- `LosProductos`: Variable que almacena información sobre los productos.
- `sc`: Objeto `Scanner` para la entrada de datos.
- `Raiz`: Directorio principal.

### Métodos Principales
- `CrearProducto`: Método para crear un archivo JSON con la información del producto.
- `MostrarArchivos`: Método para mostrar archivos en un directorio dado.
- `SacarTXT`: Método para mostrar nombres de archivos sin la extensión ".txt".

## POM (pom.xml)

El archivo `pom.xml` contiene la configuración del proyecto Maven e incluye las dependencias necesarias para el manejo de archivos JSON.

```xml
<dependencies>
    <dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20230618</version>
    </dependency>
    <dependency>
        <groupId>com.googlecode.json-simple</groupId>
        <artifactId>json-simple</artifactId>
        <version>1.1.1</version>
    </dependency>
</dependencies>
```

Asegúrate de tener una versión de Java compatible con el código (1.8) y las dependencias necesarias para ejecutar el proyecto.

¡Gracias por utilizar este repositorio! Si tienes alguna pregunta o mejora, no dudes en contactar al desarrollador.
