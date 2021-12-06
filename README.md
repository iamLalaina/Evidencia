# Evidencia
Aquí se subirá los avances de la evidencia y su final.

o	Instalación y configuración.
o	Uso del programa.
o	Créditos.
o	Licencia.

Primero se debe instalar JDK en su version más reciente. Se puede obtener desde la siguiente liga: https://www.oracle.com/java/technologies/downloads/ depende de nuestro sistema operativo la instalación.
Para realizar el programa podemos instalar IntelliJ IDEA desde el siguiente link: https://www.jetbrains.com/ o tenemos la segunda opcion de usar el IDE NetBeans desde el siguiente link: https://netbeans.apache.org/download/nb122/nb122.html 
Seguimos con la instalacion del sistema de control de versiones Git: https://git-scm.com/download este tiene un GitBash donde lo utilizamos con comandos.
Después creamos una cuenta en GitHub: https://github.com/ que es la aplicacion donde se sube el programa y los cambios cuando se hacen.

Diagrama de flujo:
![diagramadeflujo](https://user-images.githubusercontent.com/77597847/144775439-3dfb2359-4eaa-41bb-bfd3-3fb2403f616f.jpg)

Diseño del programa en diagrama de clases:
![diagramadeclases](https://user-images.githubusercontent.com/77597847/144775565-f983eca0-55f4-4f6f-9900-adf490783609.jpg)

Pseudocódigo:
INICIO
Imprimir “Bienvenido al sistema. Ingresar datos: “
LEER Usuario
LEER Contraseña
SI (usuario = id_doctor and contraseña = id_doctor)
 IMPRIMIR “Bienvenido Doctor” + nombre_doctor
+ Datos_doctor
+ “Que desea realizar? 1. Agendar cita, 2. Agregar paciente”
LEER op
SI (op = 1)
IMPRIMIR “Ingresar datos de cita”
FIN SI (op = 2)
IMPRIMIR “Ingresar datos de paciente”
SINO 
IMPRIMIR “Opción invalida” 
FIN SI (usuario = id_paciente and contraseña = id_paciente) 
IMPRIMIR “Bienvenido paciente “ + id + “ “ + nombre
+ Datos_paciente
+ “Que desea realizar? 1. Agendar cita, 2. Ir por medicinas ”
LEER op
SI (op = 1)
IMPRIMIR “Ingresar datos de cita”
FIN SI (op = 2)
IMPRIMIR “Ingresar datos de medicinas ”
SINO 
IMPRIMIR “Opción invalida” 
FIN SI

FIN

Explicación:
La aplicacion esta creada con la clase Main donde se ejecuta y depende de las instrucciones que le des realiza las tareas. 
Una clase Book, donde se guarda los datos de los usuarios, medicos, pacientes. 
Una clase Cita, donde se guardan los datos sobre las citas, id, nombre, fecha, medico, paciente.
Una clase medico, donde se almacenan las variables a utilizar en este caso, id, nombre, especialidad. 
Una clase paciente, donde se almacenan las variables a utilizar en este caso, id, nombre. 
Una clase usuario, donde se almacenan las variables a utilizar en este caso, id, nombre, contraseña (acceso).

En el programa se inicia con una bienvenida donde los usuarios que ya estan registrados son los unicos que pueden acceder, ya que esta colocado para validar los datos ingresados como usuario y contraeña, si estos no ecisten no pueden hacer nada y sale un "no existe usuario".
Fue creado con un if.
Cuando pueden ingresar que se validan sus datos, se desplega un menu donde hay 8 opciones a elegir:
1.-Dar de alta a medico\n"
+ "2.-Dar de alta a un paciente\n"
+ "3.Crear una cita\n"
+ "4.Ver las citas de todos los medicos\n"
+ "5.-Ver las citas por nombre del medico\n"
+ "6.-Ver las citas por nombre del paciente\n"
+ "7.-Guardar cita\n"
+ "8. Salir");
El usuario puede elegir, esta seccion de menu esta creada con un switch case, adentro de un while.
En 1 se pide el nombre, el id y la especialidad.
En el 2 se pide los datos del paciente, como nombre, id.
En la opcion 3 se pide los datos de la cita a crear, id, nombre (motivo), fecha, paciente, medico.
En la opcion 4 vemos todas las citas.
En la opcion 5 vemos las citas por el nombre del medido.
En la opcion 6 debemos ver las citas por el nombre del paciente.
En la opcion 7 debe guardar la cita ´para poder convertirla en json.



El programa fue realizado en la aplicación NetBeans con lenguaje Java
java version "1.8.0_311"
Java(TM) SE Runtime Environment (build 1.8.0_311-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.311-b11, mixed mode)
