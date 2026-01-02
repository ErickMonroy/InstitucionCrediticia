/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Calculadora extends javax.swing.JFrame {

 
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Override the default close operation
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                // Perform additional actions if needed, e.g., hide or dispose of the window
                setVisible(false);
            }
        });
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_Expon = new javax.swing.JButton();
        btn_Porcentaje = new javax.swing.JButton();
        btn_Division = new javax.swing.JButton();
        btn_Multiplicacion = new javax.swing.JButton();
        btn_Suma = new javax.swing.JButton();
        btn_Resta = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_Punto = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(214, 239, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(153, 153, 153));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 312, 40));

        txtResultado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(51, 51, 51));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 59, 310, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC4.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setContentAreaFilled(false);
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC5.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 57, 57));

        btn_3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setContentAreaFilled(false);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 57, 57));

        btn_Expon.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_Expon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Expon.setText("^");
        btn_Expon.setBorder(null);
        btn_Expon.setContentAreaFilled(false);
        btn_Expon.setFocusPainted(false);
        btn_Expon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Expon.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Expon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC2.png"))); // NOI18N
        btn_Expon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExponActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Expon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 57, 57));

        btn_Porcentaje.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_Porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Porcentaje.setText("%");
        btn_Porcentaje.setBorder(null);
        btn_Porcentaje.setContentAreaFilled(false);
        btn_Porcentaje.setFocusPainted(false);
        btn_Porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Porcentaje.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Desktop\\InstitucionCrediticia\\IMG\\botonC.png")); // NOI18N
        btn_Porcentaje.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Desktop\\InstitucionCrediticia\\IMG\\botonC2.png")); // NOI18N
        btn_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 57, 57));

        btn_Division.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_Division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Division.setText("/");
        btn_Division.setBorder(null);
        btn_Division.setContentAreaFilled(false);
        btn_Division.setFocusPainted(false);
        btn_Division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC2.png"))); // NOI18N
        btn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 57, 57));

        btn_Multiplicacion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_Multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Multiplicacion.setText("x");
        btn_Multiplicacion.setBorder(null);
        btn_Multiplicacion.setContentAreaFilled(false);
        btn_Multiplicacion.setFocusPainted(false);
        btn_Multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC2.png"))); // NOI18N
        btn_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 57, 57));

        btn_Suma.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_Suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Suma.setText("+");
        btn_Suma.setBorder(null);
        btn_Suma.setContentAreaFilled(false);
        btn_Suma.setFocusPainted(false);
        btn_Suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC2.png"))); // NOI18N
        btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 57, 57));

        btn_Resta.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_Resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Resta.setText("-");
        btn_Resta.setBorder(null);
        btn_Resta.setContentAreaFilled(false);
        btn_Resta.setFocusPainted(false);
        btn_Resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC2.png"))); // NOI18N
        btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 57, 57));

        btn_C.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_C.setText("C");
        btn_C.setBorder(null);
        btn_C.setContentAreaFilled(false);
        btn_C.setFocusPainted(false);
        btn_C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC2.png"))); // NOI18N
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        jPanel2.add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 57, 57));

        btn_0.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setContentAreaFilled(false);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 57, 57));

        btn_Punto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_Punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_Punto.setText(".");
        btn_Punto.setBorder(null);
        btn_Punto.setContentAreaFilled(false);
        btn_Punto.setFocusPainted(false);
        btn_Punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_Punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 57, 57));

        btn_7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setContentAreaFilled(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 57, 57));

        btn_9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setContentAreaFilled(false);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 57, 57));

        btn_8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setContentAreaFilled(false);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 57, 57));

        btn_6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setContentAreaFilled(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 57, 57));

        btn_5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setContentAreaFilled(false);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 57, 57));

        btn_4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setContentAreaFilled(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 57, 57));

        btn_1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setContentAreaFilled(false);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 57, 57));

        btn_2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setContentAreaFilled(false);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC3.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonC.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 57, 57));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 340, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        
    try {

        String expression = txtOperacion.getText();

        double result = evaluarExpresion(expression);
        txtResultado.setText(String.valueOf(result));
        txtOperacion.setText(txtResultado.getText());
    } catch (Exception e) {
        
        
        txtResultado.setText("Error");
    }
}

// Función para evaluar manualmente
private double evaluarExpresion(String expresion) {
    String[] numeros;
    double num1, num2;

    if (expresion.contains("+")) {
        numeros = expresion.split("\\+");
        num1 = Double.parseDouble(numeros[0]);
        num2 = Double.parseDouble(numeros[1]);
        return num1 + num2;
    } else if (expresion.contains("-")) {
        numeros = expresion.split("-");
        num1 = Double.parseDouble(numeros[0]);
        num2 = Double.parseDouble(numeros[1]);
        return num1 - num2;
    }  else if (expresion.contains("X")) {
    numeros = expresion.split("X");
    num1 = Double.parseDouble(numeros[0]);
    num2 = Double.parseDouble(numeros[1]);
    return num1 * num2;
    }else if (expresion.contains("%")) {
    numeros = expresion.split("%");
    num1 = Double.parseDouble(numeros[0]);
    return num1 / 100;
    } else if (expresion.contains("/")) {
        numeros = expresion.split("/");
        num1 = Double.parseDouble(numeros[0]);
        num2 = Double.parseDouble(numeros[1]);
        return num1 / num2;
    } else if (expresion.contains("^")) {
        numeros = expresion.split("\\^");
        num1 = Double.parseDouble(numeros[0]);
        num2 = Double.parseDouble(numeros[1]);
        return Math.pow(num1, num2);
    }

    return 0.0; // no se reconoce ninguna operación

        
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        
        
        addNumber("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_ExponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExponActionPerformed
        addNumber("^");
    }//GEN-LAST:event_btn_ExponActionPerformed

    private void btn_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PorcentajeActionPerformed
        
        addNumber("%");
        
    }//GEN-LAST:event_btn_PorcentajeActionPerformed

    private void btn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivisionActionPerformed
        
        addNumber("/");
    }//GEN-LAST:event_btn_DivisionActionPerformed

    private void btn_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicacionActionPerformed
        
        addNumber("X");
    }//GEN-LAST:event_btn_MultiplicacionActionPerformed

    private void btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumaActionPerformed
        
        
        addNumber("+");
    }//GEN-LAST:event_btn_SumaActionPerformed

    private void btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestaActionPerformed
        
        addNumber("-");
    }//GEN-LAST:event_btn_RestaActionPerformed

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
       
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_CActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        
        
        addNumber("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PuntoActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btn_PuntoActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        
        addNumber("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        
        
        addNumber("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        
        addNumber("8");
        
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        
        
        addNumber("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        
        
        addNumber("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        
        
        addNumber("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        
        addNumber("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void addNumber(String digito){
        
        txtOperacion.setText(txtOperacion.getText()+digito);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_Division;
    private javax.swing.JButton btn_Expon;
    private javax.swing.JButton btn_Multiplicacion;
    private javax.swing.JButton btn_Porcentaje;
    private javax.swing.JButton btn_Punto;
    private javax.swing.JButton btn_Resta;
    private javax.swing.JButton btn_Suma;
    private javax.swing.JButton btn_igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
