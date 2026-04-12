# Taqueria-Administracion-

# Sistema de Administracion para taqueria 

## Descripcion 

Este proyecto consiste en el desarrollo de un sitema web para la administracion de una taqueria el cual permite gestionar usuarios, ventas, inventario y pedidos. 

## Problema identificado 

El negocio de la taquería actualmente no registra ventas de manera formal, no lleva un control de inventario, no tiene seguimiento de pedidos, todo se realiza de manera manual, lo cual provoca que se tengan pérdidas económicas, falta de control, no exista organización y que los tiempos de atención sean cada vez mas lentos. 

## Solucion 

Lo que se desea lograr con este proyecto es desarrollar un sistema web de administración para la taquería que le permita registrar ventas, controlar el inventario, gestionar pedidos, y administrar usuarios. 

## Arquitectura 

El sistema desarrolla una arquitectura MVC. Lo cual nos permitirá una mejor organización, así como también la facilidad de mantenimiento y una separación de responsabilidades dentro de la aplicación. 
- Vista: interfaz del usuario
- Controlador: logica del sistema.
- Modelo: acceso a datos.

## Tabla de contenidos 

- Requerimientos (#requerimientos) 
- Instalacion (#instacion)
- Configuracion (#configuracion)
- Uso (#uso)
- Contribucion (#contribucion)
- Roadmap (#roadmap)

## Requerimientos 
- Java JDK 17
- Apache Maven 
- MySQL
- Netbeans IDE 
- Git

## Instalacion 

1. Clonar repositorio
2. Abrir el proyecto en NetBeans
3. Ejecutar el proyecto: mvn clean install
## Pruebas 
Para ejecutar pruebas: mvn test

## Configuracion 

El sistema no requiere de configuraciones complejas para su funcionamiento.
En caso de requerirse ampliacion del sistema se puede configurar conexion a base de datos mediante JDBC, tambien se puede ajustar variables en archivos de configuracion de acuerdo al entorno. 
Actualmente el sistema utiliza Maven para gestion de dependencias y JUnit para pruebas automatizadas. 

## Uso 

- Usuario:
* Ejecutar el sistema desde Netbeans.
* Realizar pruebas de funcionalidades basicas.

- Adminitrador:
* Gestionar el codigo desde GitHub.
* Administrar tareas en Zube.
* Validar funcionamiento mediante Travis CI.

El sistema actualmente funciona como base para administracion de una taqueria con logica de calculo y validacion mediante pruebas. 

## Contribucion 

Para contribuir al proyecto:
1. Clonar el repositorio
git clone: https://github.com/8119750272tadeo-gif/Taqueria-Administracion-.git

2. Crear una nueva rama:
git checkout -b feature/nueva-funcionalidad

3. Realizar cambios y guardar:
git add .
git commit -m "nueva funcionalidad"

4. Subir cambios
git push origin feature/nueva-funcionalidad

5. Crear Pull Request en GitHub y esperar revision 

## Roadmap 

Futuras mejoras del sistema: 
-Implementacion de la base de datos MySQL.
- Desarrollo de intefaz web completa
- Modulo de reportes
- Sistema de autenticacion de usuarios.
- Implementacion en la nube.



