/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import com.mycompany.institucioncrediticia.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Botones extends Cliente{
     private static Registros formulario;
    private static Cliente cliente[] = new Cliente[1000];
    private static int contador;

    public static void main(String args[]) {
      iniciarFormulario();
    

    }
    private static void iniciarFormulario() {
        System.out.println("Iniciando la aplicación...");

        if (formulario == null) {
            formulario = new Registros();
            cliente = new Cliente[1000];
            contador = 0;

            formulario.setVisible(true);
            System.out.println("El formulario ha sido inicializado.");
        } else {
            System.out.println("El formulario ya ha sido inicializado.");
        }
    }
    /**private String nombre;
    private String dni;
    private String nomPrestatario;
    private String aPaterno;
    private String aMaterno;
    private int edad;
    private String sexo;
    private String domicilio;
    private String numTel;
    private String correoElec;**/
    public static void guardar(String nom, String aP, String aM, int ed, String sex, String dom, String tel, String correo) {
        iniciarFormulario();
  
    if (cliente == null) {
        System.out.println("Error: el array cliente no ha sido inicializado.");
        return;
    }

    Cliente nuevoCliente = new Cliente(nom, aP, aM, ed, sex, dom, tel, correo);
    cliente[contador] = nuevoCliente;
    contador++;
    
    
    try (PrintWriter writer = new PrintWriter(new FileWriter("clientes.txt", true))) {
        writer.println(nuevoCliente.toString());
    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.println("Cliente guardado:");
    System.out.println(nuevoCliente.toString());
    
    
    System.out.println("Cliente guardado:");
    System.out.println(cliente[contador - 1].toString()); 
    }
    
    public static void buscar(String bus) {
       iniciarFormulario();

        if (cliente == null) {
            System.out.println("Error: el array cliente no ha sido inicializado.");
            return;
        }

    if (cliente == null) {
        System.out.println("Error: el array cliente no ha sido inicializado.");
        return;
    }

    for (int j = 0; j < contador; j++) {
        if (cliente[j] != null && cliente[j].getNombre().equalsIgnoreCase(bus)) {
            formulario.cargardatos(cliente[j]);
            System.out.println("Cliente encontrado:");
            System.out.println(cliente[j].toString());
            return;
        }
    }
    System.out.println("Cliente no encontrado para la búsqueda: " + bus);

      
       } 
    public static void eliminar(String bus) {
     iniciarFormulario();

    if (cliente == null) {
        System.out.println("Error: el array cliente no ha sido inicializado.");
        return;
    }

    for (int j = 0; j < contador; j++) {
        if (cliente[j] != null && cliente[j].getNombre().equalsIgnoreCase(bus)) {
            // Eliminar el cliente del ArrayList
            for (int k = j; k < contador - 1; k++) {
                cliente[k] = cliente[k + 1];
            }
            cliente[contador - 1] = null;
            contador--;

            // Limpiar campos de texto en el formulario
            formulario.limpiarCampos();

            System.out.println("Cliente eliminado:");
            System.out.println(cliente[j].toString());
            return;
        }
    }
    System.out.println("Cliente no encontrado para la búsqueda: " + bus);
}
}
