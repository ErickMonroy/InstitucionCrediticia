/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.institucioncrediticia;

import java.time.LocalDate;


public class PrestamoNomina extends Prestamos {
    private String numNomina;
    private float montoDescuento;
    private String periodicidad;

    public PrestamoNomina(Cliente cliente, 
            String nomPrestamista, 
            String aPaternoPtmista, 
            String aMaternoPtmista,
            TipoPrestamo tipoPrestamo, 
            LocalDate fechaPrestamo, 
            double tasaInteres,
            double montoPrestamo,
            LocalDate fechaDesembolso,
            String numNomina, 
            float montoDescuento, 
            String periodicidad
    )
    {
        super(cliente, nomPrestamista, aPaternoPtmista, aMaternoPtmista, tipoPrestamo, fechaPrestamo,
                tasaInteres, montoPrestamo, fechaDesembolso);
        this.numNomina = numNomina;
        this.montoDescuento = montoDescuento;
        this.periodicidad = periodicidad;
    }

    public String getNumNomina() {return numNomina;}
    public void setNumNomina(String numNomina) {this.numNomina = numNomina;}
    public float getMontoDescuento() {return montoDescuento;}
    public void setMontoDescuento(float montoDescuento) {this.montoDescuento = montoDescuento;}
    public String getPeriodicidad() {return periodicidad;}
    public void setPeriodicidad(String periodicidad) {this.periodicidad = periodicidad;}
}

