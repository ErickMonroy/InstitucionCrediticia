/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.institucioncrediticia;

import java.time.LocalDate;


public class PrestamoPrenda extends Prestamos {
    private float prendaValorEst;
    private String descripPrenda;

    public PrestamoPrenda(Cliente cliente, 
            String nomPrestamista, 
            String aPaternoPtmista, 
            String aMaternoPtmista,
            TipoPrestamo tipoPrestamo, 
            LocalDate fechaPrestamo, 
            double tasaInteres,
            double montoPrestamo, 
            LocalDate fechaDesembolso,
            float prendaValorEst, 
            String descripPrenda
    ) 
    {
        super(cliente, nomPrestamista, aPaternoPtmista, aMaternoPtmista, tipoPrestamo, fechaPrestamo,
                tasaInteres, montoPrestamo, fechaDesembolso);
        this.prendaValorEst = prendaValorEst;
        this.descripPrenda = descripPrenda;
    }

    public float getPrendaValorEst() {return prendaValorEst;}
    public void setPrendaValorEst(float prendaValorEst) {this.prendaValorEst = prendaValorEst;}
    public String getDescripPrenda() {return descripPrenda;}
    public void setDescripPrenda(String descripPrenda) {this.descripPrenda = descripPrenda;
    }
}

