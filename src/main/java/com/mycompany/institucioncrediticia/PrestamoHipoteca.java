/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.institucioncrediticia;

import java.time.LocalDate;


public class PrestamoHipoteca extends Prestamos {
    private String tipoPropiedad;
    private float valorPropiedad;

    public PrestamoHipoteca(
            Cliente cliente, 
            String nomPrestamista, 
            String aPaternoPtmista, 
            String aMaternoPtmista,
            TipoPrestamo tipoPrestamo, 
            LocalDate fechaPrestamo, 
            double tasaInteres,
            double montoPrestamo, 
            LocalDate fechaDesembolso,
            String tipoPropiedad, 
            float valorPropiedad
    ) 
    {
        super(cliente, 
                nomPrestamista, 
                aPaternoPtmista, 
                aMaternoPtmista, 
                tipoPrestamo, 
                fechaPrestamo,
                tasaInteres, 
                montoPrestamo, 
                fechaDesembolso
        );
        this.tipoPropiedad = tipoPropiedad;
        this.valorPropiedad = valorPropiedad;
    }

    public String getTipoPropiedad() {return tipoPropiedad;}
    public void setTipoPropiedad(String tipoPropiedad) 
    {this.tipoPropiedad = tipoPropiedad;
    }

    public float getValorPropiedad() {return valorPropiedad;}

    public void setValorPropiedad(float valorPropiedad) 
    {
        this.valorPropiedad = valorPropiedad;
    }
}
