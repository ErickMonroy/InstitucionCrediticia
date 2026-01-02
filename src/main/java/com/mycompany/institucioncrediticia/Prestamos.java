/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.institucioncrediticia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamos {

    public static void solicitarPrestamo(String nomPrestamista, String aPaternoPtmista, String aMaternoPtmista, TipoPrestamo tipoPrestamo, double tasaInteres, double montoPrestamo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private List<Prestamos> historialPrestamos;

    private Cliente cliente;
    private String nomPrestamista;
    private String aPaternoPtmista;
    private String aMaternoPtmista;
    private TipoPrestamo tipoPrestamo;
    private LocalDate fechaPrestamo;
    private double tasaInteres;
    private double montoPrestamo;
    private LocalDate fechaDesembolso;

    // Constructor
    public Prestamos(Cliente cliente, String nomPrestamista, String aPaternoPtmista, String aMaternoPtmista,
                     TipoPrestamo tipoPrestamo, LocalDate fechaPrestamo, double tasaInteres,
                     double montoPrestamo, LocalDate fechaDesembolso) {
        this.cliente = cliente;
        this.nomPrestamista = nomPrestamista;
        this.aPaternoPtmista = aPaternoPtmista;
        this.aMaternoPtmista = aMaternoPtmista;
        this.tipoPrestamo = tipoPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.tasaInteres = tasaInteres;
        this.montoPrestamo = montoPrestamo;
        this.fechaDesembolso = fechaDesembolso;
        this.historialPrestamos = new ArrayList<>(); // Inicializa la lista en el constructor
    }

    public void setHistorialPrestamos(List<Prestamos> historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNomPrestamista(String nomPrestamista) {
        this.nomPrestamista = nomPrestamista;
    }

    public void setaPaternoPtmista(String aPaternoPtmista) {
        this.aPaternoPtmista = aPaternoPtmista;
    }

    public void setaMaternoPtmista(String aMaternoPtmista) {
        this.aMaternoPtmista = aMaternoPtmista;
    }

    public void setTipoPrestamo(TipoPrestamo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public void setFechaDesembolso(LocalDate fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
    }
    
    
    public Prestamos() {
        this.historialPrestamos = new ArrayList<>();
    }

    public List<Prestamos> getHistorialPrestamos() {
        return historialPrestamos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNomPrestamista() {
        return nomPrestamista;
    }

    public String getaPaternoPtmista() {
        return aPaternoPtmista;
    }

    public String getaMaternoPtmista() {
        return aMaternoPtmista;
    }

    public TipoPrestamo getTipoPrestamo() {
        return tipoPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public LocalDate getFechaDesembolso() {
        return fechaDesembolso;
    }

    

    // Método para agregar un préstamo al historial
    public void agregarPrestamo(Prestamos prestamo) {
        this.historialPrestamos.add(prestamo);
    }

    // Método para obtener el historial de préstamos
    public List<Prestamos> obtenerHistorialPrestamos() {
        return this.historialPrestamos;
    }

    // Otros métodos si es necesario
}
