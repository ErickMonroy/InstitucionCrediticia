<div align="center">
  <img src="https://github.com/ErickMonroy/InstitucionCrediticia/blob/main/IMG/LOGO.png?raw=true" alt="Logo del Proyecto">
</div><br>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue" alt="Java Version">
  <img src="https://img.shields.io/badge/NetBeans-IDE-orange" alt="NetBeans">
  <img src="https://img.shields.io/badge/Versión-1.0.0-green" alt="POO">
</p>

<p align="right">8 de enero de 2024</p>

## Descripción
**PRESTA AHORRO** es un sistema diseñado con el objetivo de registrar los datos de los clientes y a su vez de gestionar los prestamos solicitados.


  
## Interfaz del sistema
<div align="center">
<div style="display: flex; overflow-x: scroll; padding: 0px 0; gap: 10px; scrollbar-width: thin;">
  <div style="flex: 0 0 auto; width: 480px; text-align: center;">
    <img src="https://github.com/ErickMonroy/InstitucionCrediticia/blob/main/README_IMG/Login.png?raw=true" width="460" alt="Login">
    <p><em>Login: Pantalla de autenticación</em></p>
  </div>
  
  <div style="flex: 0 0 auto; width: 480px; text-align: center;">
    <img src="https://github.com/ErickMonroy/InstitucionCrediticia/blob/main/README_IMG/Inicio.png?raw=true" width="450" alt="Menú">
    <p><em>Menú Principal: Pantalla de inicio</em></p>
  </div>
  
  <div style="flex: 0 0 auto; width: 480px; text-align: center;">
    <img src="https://github.com/ErickMonroy/InstitucionCrediticia/blob/main/README_IMG/Registro_inicial.png?raw=true" width="410" alt="Registro">
    <p><em>Registro de Clientes: Formulario de nuevo cliente</em></p>
  </div>
  
  <div style="flex: 0 0 auto; width: 480px; text-align: center;">
    <img src="https://github.com/ErickMonroy/InstitucionCrediticia/blob/main/README_IMG/Registros.png?raw=true" width="370" alt="Clientes">
    <p><em>Gestión de Clientes: Consulta de datos de clientes </em></p>
  </div>
  
  <div style="flex: 0 0 auto; width: 480px; text-align: center;">
    <img src="https://github.com/ErickMonroy/InstitucionCrediticia/blob/main/README_IMG/Solicitar_prestamo.png?raw=true" width="390" alt="Préstamo">
    <p><em>Solicitud de Préstamo: Cálculo y emisión de préstamos</em></p>
  </div>
  
  <div style="flex: 0 0 auto; width: 480px; text-align: center;">
    <img src="https://github.com/ErickMonroy/InstitucionCrediticia/blob/main/README_IMG/Calculadora.png?raw=true" width="230" alt="Calculadora">
    <p><em>Calculadora: Herramienta de cálculo</em></p>
  </div>
</div>

</div>

## Tecnologías utilizadas:
- Java JDKVersión 17 
- IDE: **Apache NetBeans**
- Interfaz: Java Swing (AbsoluteLayout)
- Tipo de empaquetado: JAR (aplicación de escritorio) 


## 1. Requisitos del Sistema

### 1.1 Requisitos Mínimos
- **Sistema Operativo**: Windows 10/11, Linux, macOS
- **Java Runtime Environment (JRE)**: Versión 17 o superior
- **Memoria RAM**: 512 MB mínimo - 1 GB recomendado
- **Espacio en disco**: 100 MB


### 1.2 Requisitos Para Desarrollo
- **Java Development Kit**: JDK 17
- **Apache NetBeans**: Versión 12 o superior

## 2. Instalación y Configuración

### 2.1 Para Windows

1. Instalar Java JDK 17 o superior
   - Descargar desde: [Oracle JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
   - Ejecutar el instalador `.exe`
   - Configurar variable de entorno `JAVA_HOME` y `Path`
   - Verificar instalación: `java -version`

2. Instalar Apache NetBeans
    - Descargar desde: [Apache NetBeans](https://netbeans.apache.org/front/main/download/)
    - Ejecutar el instalador `.exe`

### 2.2 Para Linux 
1. Instalar Java JDK 17
    - Actualizar repositorios: `sudo apt update`
    - Instalar JDK 17: `sudo apt install openjdk-17-jdk` 
    - Verificar instalación: `java -version` `javac -version`
    - Configurar JAVA_HOME: `echo $JAVA_HOME`

### Configuración JDK en NetBeans:
- Abrir NetBeans
- Ir a Tools → Java Platforms
- Agregar nueva plataforma: Seleccionar carpeta del JDK 17
- Si usas JDK superior a 17, editar `pom.xml`
<br>

        <maven.compiler.source>19</maven.compiler.source>
        <maven.compiler.target>19</maven.compiler.target>   
