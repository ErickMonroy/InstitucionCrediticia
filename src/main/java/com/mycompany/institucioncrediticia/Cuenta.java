/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.institucioncrediticia;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private final Cliente cliente;
    private double saldo;
    private List<Prestamos> prestamos;

    // Constructor
    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
        this.prestamos = new ArrayList<>();
    }

    // Métodos originales de Cuenta
    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public void agregarPrestamo(Prestamos prestamo) {
        prestamos.add(prestamo);
    }

    public List<Prestamos> getPrestamos() {
        return prestamos;
    }


}


