/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.institucioncrediticia;

import java.time.LocalDate;

public class PrestamoHerencia extends Prestamos {
    private float ingresosMensuales;

    public PrestamoHerencia(Cliente cliente, String nomPrestamista, String aPaternoPtmista, String aMaternoPtmista,
                            TipoPrestamo tipoPrestamo, LocalDate fechaPrestamo, double tasaInteres,
                            double montoPrestamo, LocalDate fechaDesembolso, float ingresosMensuales) {
        super(cliente, nomPrestamista, aPaternoPtmista, aMaternoPtmista, tipoPrestamo, fechaPrestamo,
                tasaInteres, montoPrestamo, fechaDesembolso);
        this.ingresosMensuales = ingresosMensuales;
    }

    public float getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(float ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }
}
