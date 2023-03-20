package com.example.users.respuestaTecnica

//nombre
/**Johan Mauricio Peñuela Hidalgo*/
//Cedula
/** 1074417200*/
//Profesión
/**Android Developer*/


//¿Cuál es la mejor descripción que define el concepto de clase en la POO?
/**

a. Es un concepto similar al de un arreglo da datos
b. Es una variable de tipo particular
c. Es un modelo o plantilla a partir de la cual creamos objetos
d. Es una colección de datos ordenada secuencialmente.
*
* R/Es un modelo o plantilla a partir de la cual creamos objetos
* */


//¿Cuáles son los elementos que definen un objeto?
/**
a. Cardinalidad y tipo
b. Atributos y métodos
c. La manera en que intercambian información y establecen comunicación
d. La interfaz y los eventos asociados

R/Atributos y métodos
* */

//¿Señale cuál de los siguientes fragmentos de código emplea el concepto de herencia?
/**

a. public class Componente extends Producto
b. public class Componente inherit Producto
c. public class Componente implements Producto
d. public class Componente belong to Producto
*
* R/public class Componente extends Producto
* */


//¿Qué es instanciar una clase?
/**.
a. Eliminar una clase
b. Conectar dos clases entre si
c. Duplicar una clase
d. Crear un objeto a partir de una clase
*
* R/Crear un objeto a partir de una clase
* */

class Persona(nombre: String, apellido: String, altura: Double, peso: Double) {

    var nombre: String = nombre
    var apellido: String = apellido
    var altura: Double = altura
    var peso: Double = peso

    fun comer(comida: String) {
        // Aumentar el peso según la cantidad y tipo de comida ingerida
        peso += calcularAumentoPeso(comida)
    }

    fun crecer(cantidad: Double) {
        // Aumentar la altura según la cantidad de centímetros recibida
        altura += cantidad
    }

    private fun calcularAumentoPeso(comida: String): Double {
        // Implementación para calcular el aumento de peso según la cantidad y tipo de comida ingerida
        val valoresComida = mapOf(
            "carne" to 100.0,
            "frutas" to 50.0,
            "verduras" to 30.0,
            "dulces" to 200.0
        )
        return valoresComida[comida.toLowerCase()] ?: 0.0
    // Valor temporal para el ejemplo
        println(valoresComida)
    }

}

//¿Qué es una arquitectura de aplicaciones?

/**
* Una arquitectura de aplicaciones es un conjunto de patrones, prácticas y directrices que se utilizan
para diseñar y desarrollar aplicaciones de software. Se trata de un enfoque sistemático para diseñar
la estructura y los componentes de una aplicación, que permite a los desarrolladores construir aplicaciones escalables,
sostenibles y fáciles de mantener.

Una buena arquitectura de aplicaciones debe considerar aspectos como la modularidad, la escalabilidad,
la seguridad, el rendimiento y la mantenibilidad, entre otros.
Para lograr estos objetivos, se pueden utilizar diferentes patrones arquitectónicos,
como MVC (Modelo Vista Controlador), MVVM (Modelo Vista Vista Modelo), arquitectura hexagonal, microservicios, entre otros.

Además, una buena arquitectura de aplicaciones también debe considerar las necesidades específicas del negocio,
los usuarios y el entorno en el que se va a utilizar la aplicación. Por lo tanto, es importante diseñar
una arquitectura que sea adecuada para el caso de uso específico y que pueda evolucionar con los cambios
del negocio y de los requisitos.

En resumen, una arquitectura de aplicaciones es un marco de referencia que se utiliza para diseñar
aplicaciones de software y que proporciona un conjunto de principios, patrones y prácticas
que permiten construir aplicaciones escalables, sostenibles y fáciles de mantener.
 */


//¿Con qué arquitecturas está familiarizado y cuál prefiere?

/**
* Estoy familiarizado con los modelos MVC que es con el que inicie, pero en este momento prefiero usar
* MVVC  que es el que mas he utilizado ultimamente y siento que puedo realizar mejor.
* */

//¿Cómo funcionan los hilos de programación?

/**
* Los hilos son unidades de ejecución concurrentes dentro de un programa de computadora o movil que permiten
*  realizar varias tareas al mismo tiempo. Para utilizar hilos de manera efectiva, es necesario tener
*  en cuenta los recursos compartidos y utilizar técnicas de sincronización para evitar problemas de concurrencia.
* */


//¿Qué procesos se pueden realizar y cuales no en una tarea de segundo plano en un dispositivo
//móvil?

/**
 * //Procesos que se pueden realizar en un segundo plano
 *
 * Descarga de archivos o actualizaciones de aplicaciones: Es común que las aplicaciones realicen descargas
  en segundo plano para actualizar su contenido o para descargar archivos como imágenes, videos, documentos, etc.

* Reproducción de música o videos: Es posible reproducir música o videos en segundo plano mientras se
utiliza otra aplicación o se bloquea la pantalla.

* Envío de notificaciones: Las aplicaciones pueden enviar notificaciones en segundo plano para informar
al usuario sobre eventos importantes o nuevas actualizaciones.

* Actualización de la ubicación: Las aplicaciones pueden actualizar la ubicación en segundo plano utilizando
  el GPS del dispositivo, lo que permite ofrecer servicios basados en la ubicación.

* Descarga de datos de redes sociales: Las aplicaciones de redes sociales pueden descargar datos
 en segundo plano, como nuevos mensajes, comentarios, actualizaciones de estado, etc.
 * */
//Procesos que no se pueden realizar en segundo plano
/**
 *Acceso a información confidencial: Los procesos que involucren el acceso a información confidencial
  del usuario, como contraseñas, datos bancarios, información de identidad, etc., generalmente están
  restringidos y solo se pueden realizar cuando el usuario da su consentimiento explícito.

 * Ejecución de código malicioso: Los procesos que intenten ejecutar código malicioso o intenten realizar
 acciones dañinas en el dispositivo o en la red no están permitidos y pueden ser detectados y
 bloqueados por el sistema operativo.

 *Uso excesivo de recursos: Los procesos que consumen demasiados recursos del dispositivo, como CPU,
memoria o ancho de banda, pueden ser limitados por el sistema operativo para evitar que afecten el
rendimiento general del dispositivo o de otras aplicaciones.
 */

//¿Una notificación es un elemento que comúnmente se ejecuta en una tarea de primer plano o
//segundo plano? Justifique su respuesta

/**
 * Las notificaciones se generan y se envían por la aplicación en segundo plano, y pueden aparecer en
 la pantalla de bloqueo, en la barra de estado o en la bandeja de notificaciones del dispositivo. Además,
 las notificaciones pueden incluir opciones para que el usuario pueda interactuar con ellas sin tener
 que abrir la aplicación en primer plano, como por ejemplo, responder un mensaje, aceptar una
 solicitud de amistad, etc.
 * */

//¿Qué es una API Rest?

/**
 *Una API Rest (Representational State Transfer) es un conjunto de reglas y protocolos que se utilizan
 para la creación de servicios web que permiten la comunicación entre diferentes aplicaciones.
 Es una arquitectura de software que se basa en el protocolo HTTP (Hypertext Transfer Protocol)
 * */

//¿Mencione y explique los principales métodos que componen una API Rest?

/**
 * Los principales métodos que componen una API REST son los siguientes:

* GET: Es el método más común utilizado en una API REST. Este método se utiliza para recuperar información
 de un recurso especificado. Cuando se realiza una solicitud GET, el servidor devuelve una representación
del recurso solicitado en el cuerpo de la respuesta.

* POST: El método POST se utiliza para enviar información a un servidor para su procesamiento.
 Este método se utiliza comúnmente para crear nuevos recursos o para enviar datos que se utilizarán
para realizar operaciones en el servidor.

* PUT: El método PUT se utiliza para actualizar un recurso existente en el servidor. Cuando se realiza
 una solicitud PUT, se envía una representación completa del recurso actualizado.

* DELETE: Como su nombre lo indica, el método DELETE se utiliza para eliminar un recurso en el servidor.

* PATCH: El método PATCH se utiliza para actualizar parcialmente un recurso existente en el servidor.
A diferencia del método PUT, que actualiza todo el recurso, el método PATCH permite actualizar
solo una parte del recurso.

Estos son los principales métodos que componen una API REST. Cada uno de ellos tiene una función
específica y se utiliza según las necesidades del cliente y del servidor. Es importante
tener en cuenta que cada método se debe utilizar correctamente y siguiendo las convenciones
de la API REST para garantizar una buena comunicación entre el cliente y el servidor.
 * */

//¿Ventajas de usar JSON?

/**
 *Algunas de las ventajas de usar JSON (JavaScript Object Notation) son las siguientes:

* Ligero y fácil de leer: JSON es un formato de datos muy ligero y fácil de leer para los humanos,
 ya que utiliza una sintaxis simple basada en pares de clave-valor.

* Amplia compatibilidad: JSON es compatible con una amplia gama de lenguajes de programación,
 incluyendo JavaScript, Python, PHP, Java, C#, entre otros.

* Fácil de procesar: JSON es fácil de procesar y analizar para las aplicaciones, ya que está basado en
texto plano y no requiere de procesamiento pesado para ser manipulado.

*Soporte para estructuras complejas de datos: JSON permite la definición de estructuras de datos
 complejas y anidadas, lo que permite la representación de datos complejos de una manera organizada
 y fácil de entender.

*Interoperabilidad: JSON es ampliamente utilizado en la comunicación entre sistemas y en la
 integración de aplicaciones, ya que es un formato de datos estándar y bien definido.

* Soporte para la transmisión de datos en tiempo real: JSON se puede utilizar en la transmisión
 de datos en tiempo real, lo que lo hace muy útil para aplicaciones web y móviles que requieren
 actualizaciones constantes de datos.
 * */

//¿Cuándo se utiliza el método OPTIONS en las peticiones HTTP?

/**
 * El método OPTIONS en las peticiones HTTP se utiliza para obtener información sobre las opciones
 de comunicación disponibles para un recurso en particular en un servidor. Esta solicitud se utiliza
 para determinar qué métodos HTTP están permitidos para una URL específica y qué restricciones pueden
 estar en su lugar para cada uno de ellos.

El método OPTIONS es útil para una variedad de situaciones, incluyendo:

* Identificar las opciones de comunicación permitidas para un recurso en particular en un servidor.

* Determinar si un recurso en particular es accesible o no para un cliente determinado.

* Verificar la autenticación y los permisos necesarios para acceder a un recurso.

*Obtener información sobre los formatos de datos y los encabezados que se pueden utilizar para enviar
 y recibir información a través de un recurso en particular.
 * */

//¿Cuál es generalmente el código de respuesta exitosa de una API REST?

/**
 * El código de respuesta exitosa más comúnmente utilizado en una API REST es el 200 OK, pero también
 hay otros códigos de respuesta exitosos que se pueden utilizar según el contexto y
 la naturaleza de la solicitud.
 * */

//¿Qué es un recurso?

/**
 * Un recurso puede ser cualquier cosa que sea significativa para una aplicación, como una
 publicación de un blog, una foto, un usuario, una lista de tareas pendientes, etc.
Cada recurso debe tener una URI única que lo identifique de manera unívoca en la aplicación.*/

//

/**
 * Flexibilidad: Las API REST son altamente flexibles y escalables, lo que significa que pueden ser
  utilizadas para una variedad de aplicaciones y escenarios de uso.

 * Independencia de la plataforma: Las API REST pueden ser implementadas en cualquier plataforma,
 lo que las hace independientes del lenguaje de programación y del sistema operativo.

 * Separación entre cliente y servidor: Las API REST siguen un modelo cliente-servidor en el que
  el servidor proporciona una interfaz para que los clientes accedan a los recursos. Esto permite
  que los clientes sean independientes del servidor y no necesiten conocer su estructura interna.

 * Alta compatibilidad: Las API REST son compatibles con la mayoría de los navegadores y dispositivos,
 lo que permite un amplio alcance en la accesibilidad y utilización de los recursos.

 * Manejo de datos en formato JSON: Las API REST suelen manejar los datos en formato JSON, que
  es fácilmente interpretable tanto por humanos como por máquinas.

 * Facilita la integración con otras aplicaciones: Las API REST pueden utilizarse para integrar
  aplicaciones y servicios existentes, lo que facilita la colaboración y la creación de
 soluciones más complejas.
 * */

//¿Qué es SQLite?

/**
 *
 * SQLite es un sistema de gestión de bases de datos relacionales (RDBMS, por sus siglas en inglés)
 que se caracteriza por ser ligero, rápido y fácil de integrar en aplicaciones móviles,
 de escritorio y web. A diferencia de otros RDBMS, SQLite no funciona como un servidor de bases
 de datos independiente, sino que se integra directamente en la aplicación.*/

//¿Mencione algunas ventajas del uso de Sqlite?

/**
 * Portabilidad: SQLite es una biblioteca de software que se puede utilizar en múltiples plataformas,
  incluyendo sistemas operativos móviles, de escritorio y de servidor.

 * Bajo consumo de recursos: SQLite es una base de datos ligera y de bajo consumo de recursos,
 lo que significa que es ideal para dispositivos móviles y aplicaciones que requieren
 un almacenamiento de datos eficiente.

 * Implementación embebida: SQLite se integra directamente en la aplicación, lo que significa
   que no requiere un servidor de bases de datos independiente y reduce los costos de infraestructura.

 * Rendimiento rápido: SQLite es conocido por su rendimiento rápido en comparación con otras
   bases de datos embebidas.

 * Compatibilidad con SQL: SQLite utiliza el lenguaje SQL, lo que significa que los desarrolladores
  que conocen SQL pueden trabajar fácilmente con SQLite.

 * Base de datos sin servidor: SQLite es una base de datos sin servidor,
 lo que significa que no se requiere configurar y administrar un
servidor de bases de datos independiente.
 * */

//¿Sqlite maneja datos de tipo fecha de forma nativa?

/**
 *  SQLite maneja datos de tipo fecha de forma nativa y proporciona funciones útiles para
  trabajar con ellos, lo que lo hace una buena opción para aplicaciones que requieren almacenar
  y manipular datos de fecha y hora.*/