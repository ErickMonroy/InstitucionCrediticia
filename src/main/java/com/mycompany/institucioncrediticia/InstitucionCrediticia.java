/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.institucioncrediticia;
import java.util.ArrayList;
import java.util.List;

public class InstitucionCrediticia {
    private final List<Cuenta> cuentas;
    private final List<PrestamoAval> prestamosConAval;
    private final List<PrestamoHerencia> prestamosHerencia;
    private final List<PrestamoHipoteca> prestamosHipoteca;
    private final List<PrestamoNomina> prestamosNomina;
    private final List<PrestamoPrenda> prestamosPrenda;  // Nueva lista

    public InstitucionCrediticia() {
        this.cuentas = new ArrayList<>();
        this.prestamosConAval = new ArrayList<>();
        this.prestamosHerencia = new ArrayList<>();
        this.prestamosHipoteca = new ArrayList<>();
        this.prestamosNomina = new ArrayList<>();
        this.prestamosPrenda = new ArrayList<>();  // Inicialización de la nueva lista
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public List<PrestamoAval> getPrestamosConAval() {
        return prestamosConAval;
    }

    public List<PrestamoHerencia> getPrestamosHerencia() {
        return prestamosHerencia;
    }

    public List<PrestamoHipoteca> getPrestamosHipoteca() {
        return prestamosHipoteca;
    }

    public List<PrestamoNomina> getPrestamosNomina() {
        return prestamosNomina;
    }

    public List<PrestamoPrenda> getPrestamosPrenda() {  // Nuevo getter
        return prestamosPrenda;
    }

    public void abrirCuenta(Cliente cliente) {
        Cuenta nuevaCuenta = new Cuenta(cliente);
        cuentas.add(nuevaCuenta);
        System.out.println("Se ha abierto una nueva cuenta para el cliente: " + cliente.getNombre());
    }

    public void realizarTransaccion(Cuenta cuenta, double monto, boolean esDeposito) {
        // Método existente
    }

    public void agregarPrestamoAval(PrestamoAval prestamoAval) {
        prestamosConAval.add(prestamoAval);
        System.out.println("Se ha agregado un nuevo préstamo con aval para el cliente: " +
                prestamoAval.getCliente().getNombre());
    }

    public void agregarPrestamoHerencia(PrestamoHerencia prestamoHerencia) {
        prestamosHerencia.add(prestamoHerencia);
        System.out.println("Se ha agregado un nuevo préstamo de herencia para el cliente: " +
                prestamoHerencia.getCliente().getNombre());
    }

    public void agregarPrestamoHipoteca(PrestamoHipoteca prestamoHipoteca) {
        prestamosHipoteca.add(prestamoHipoteca);
        System.out.println("Se ha agregado un nuevo préstamo hipotecario para el cliente: " +
                prestamoHipoteca.getCliente().getNombre());
    }

    public void agregarPrestamoNomina(PrestamoNomina prestamoNomina) {
        prestamosNomina.add(prestamoNomina);
        System.out.println("Se ha agregado un nuevo préstamo de nómina para el cliente: " +
                prestamoNomina.getCliente().getNombre());
    }

    // Nuevo método para agregar préstamos de tipo PrestamoPrenda
    public void agregarPrestamoPrenda(PrestamoPrenda prestamoPrenda) {
        prestamosPrenda.add(prestamoPrenda);
        System.out.println("Se ha agregado un nuevo préstamo de prenda para el cliente: " +
                prestamoPrenda.getCliente().getNombre());
    }
}



