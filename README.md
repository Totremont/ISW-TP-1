# ISW-TP-1
TP Integrador "Sistemas de Gestión de la Configuración"
v1.0.1

## Integrantes
- Argañaras, Irina
- Assenza, Tomás
- Fontana, Valentín 
- Izaguirre, Ezequiel

Grupo : **1**

## Incisos

##### 2B

> ¿Cómo hacemos para no subir cambios de configuraciones locales?

Creando un archivo **.gitignore** es posible especificar qué archivos o grupos de archivos no
deben ser subidos al repositorio externo.
En este proyecto estos incluyen archivos de configuración locales del IDE, propiedades locales, cachés, etc.

##### 2G

> Llevar al entorno productivo Release 1. ¿Cómo lo hace siguiendo Gitflow?

De acuerdo con el [blog original de GitFlow](https://nvie.com/posts/a-successful-git-branching-model/); la rama **Release 1** debe ser *mergeada* con **master**, nuestra rama base. Al nuevo *commit* en **master** se le debe agregar un *tag* para futuras referencias. Finalmente, también debemos *mergear* los cambios de **Release 1** a **develop**. Al finalizar, podemos borrar la rama **Release 1** de forma segura.


##### 2K

> Llevar los cambios de una rama feature a producción. ¿Cómo lo hace siguiendo Gitflow?

Los cambios producidos en la rama **feature** deben ser *mergeados* a **develop** una vez finalizado su desarrollo, para agregarlos de forma definitiva en la nueva versión de producción. Al finalizar este paso, la rama **feature** debe ser borrada.
Luego, para llevar el desarrollo desde **develop** a **master**, se debe crear una rama auxiliar **release-x** con el cometido de arreglar bugs y definir meta-datos (número de build, versión, etc).
Finalizado el trabajo en **release-x**, se deben seguir los pasos descritos en **2G** para llevar esta rama al entorno productivo.

##### 3A

> ¿Qué documentarían en un README?

El **readme** debe incluir:

- **Título del proyecto**
- **Descripción**          (¿Que hace este proyecto?, ¿Por qué es útil?)
- **Instrucciones de uso** (¿Cómo puede un usuario empezar a usarlo?)
- **Créditos y licencias** (¿Quién/es mantiene el proyecto?, ¿Cómo se puede contribuir en él?)

Es importante además que se contenga la documentación necesaria para poder aportar al proyecto (como instrucciones para realizar *pull requests*).

##### 3B

> ¿Qué datos le pediría a una persona que desee hacer un pull request?

Se le pediría:
- Explicar el porqué de los cambios.
- Que los commits sean claros y concisos para poder entender los cambios producidos.
- Breve descripción de los cambios introducidos en la descripción de la pr.
- Breve descripción de las pruebas efectuadas para demostrar que los cambios no provocan nuevos problemas en el software.
- Explicación de la documentación a la que se adhiere / modifica estos cambios.

El objetivo es no solo entender el cómo sino también el porqué la persona cree que es importante
realizar los cambios propuestos.