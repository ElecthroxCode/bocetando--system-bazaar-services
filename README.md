# "Bocetando" un Sistema de cita para un Spa de uñas (Proyecto personal)⚡
La idea es jugar un poco con java e ir haciendo un boceto de un sistema de cita para un spa de uñas. Lo que se busca es ir afianzado la idea del "por donde" empezar a construir el proyecto para luego ya de forma más seria y concreta emprezar a construir el proyecto utilizando tecnologías como Spring Boot en back-end y Angular en front-end. Durante este "jugueteo" se realizará los *diagrama E-R* y el *diagrama de clases* a pesar de que solo será código de consola del IDE.

## Planteamiento del problema
Se necesita diseñar un sistema de citas para un spa de uñas. El cliente podrá ver los servicios de belleza que ofrece el negocio o empresa y escoger el que le interese y agendar una cita. De la empresa se necesita conocer los datos personales, como nombre, direccion del local, descripción, los servicios que ofrece, entre otros. Del cliente, se necesita datos como: nombre y télefono principalmente pero opcionalmente también se puede necesitar su dirección y DNI. Y la cita debe contener la fecha del momento en que se solicita, la fecha en que se quiere realizar el servicio, la descripción del servicio, precio total que saldria el servicio, entre otros.

Cabe mencionar que este planteamiento del problema es "generalizado", ya que la persona o negocio que necesita el sistema mayormente da información escasa o muchas veces no sabe muy bien lo que realmente necesita. Lo que implica que, como  programador,"desmenuce" el problema e incorporemos algunos detalles, por ejemplo, si el Spa ofrece  un servicio de uñas, es lógico, que habrá un album de fotos o diseños y es posible que varíe el costo del servicio de acuerdo si el diseño es muy cargado de material o si se tarda más en realizarlo. Además, se tratará como un sistema más "general" en que se pueda registrar varios "spa de uñas".

## Analisis
#### Diagrama E-R
Aqui se plantea el posible de diagrama E-R:  
![Diagrama E-R](https://www.dropbox.com/scl/fi/fne5eor4w3wmajxe8cbtv/E-R-DIAGRAMA-BAZAAR.jpg?rlkey=36nu4lr2g1ouq1avt5kf8tumd&dl=0)

#### Diagrama de Clases
Planteamos el posible diagrama de clases:  
![Diagrama de clases](https://www.dropbox.com/scl/fi/909htw5deu6tev6kpd2dz/UML-DIAGRAM-CLASS.jpg?rlkey=1szwr7yezcm30e952ni6l1e7l&dl=0)

#### Solución
Una solución que vi posible es aplicar el patrón de diseño creacional Factory Method porque el usuario puede ser una empresa (spa de uñas) o un cliente, de tal modo que al registrarse decidirá que tipo de usuario ser y esto brinda flexibilidad. Claro, esto es propenso a modificación ya que solo estoy jugando un poco con el código.

Lo que he hecho es diseñar un menú donde un usuario elija unas de las siguientes opciones:  
![menu](https://www.dropbox.com/scl/fi/fkwhmz2y6zo60xzxwcvnr/menu-bazaar.jpg?rlkey=fj2bjbtzas8dpccbjzqcga9b3&dl=0)
#### Logros
A pesar de que aún estoy en proceso de construcción de este proyecto personal, el realizar este de ejercicio de "jugar" con el código previamente antes de empezar enserio con el proyecto me ha permitido 'aterrizar' mejor las ideas y afianzar mejor ciertos conceptos en ambito del desarrollo. Además, me ha ayudado a reflexionar en la evolución de este pequeños proyecto a futuro.  
Algo que me parece importante es el hecho de que también me la he pasado bien en el diseño y elaboración de este ejercicio. Por lo tanto, lo tomaré como un *hobbie* y a medida que le vaya metiendo mano, estaré añadiendo dichas actualizaciones😀

## 🚧 En construcción 🚧
###### Actualmente se está trabajando en como llevar este pequeño proyecto a un estado más tangible por medio del uso de Spring Boot y Angular... ¡pronto volveremos al ruedo!🐂