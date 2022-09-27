/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Circulo;
import Model.FiguraGeometrica;
import Model.Rectangulo;
import Model.Triangulo;
import Views.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kevin
 */
public class Control implements ActionListener {
    
    private Circulo circulo;
    private Rectangulo rectangulo;
    private Triangulo triangulo;
    private Vista vista;

    public Control(Circulo c, Rectangulo r, Triangulo t, Vista v) {
        super();
        this.circulo = c;
        this.rectangulo = r;
        this.triangulo = t;
        this.vista = v;
        actionListener(this);
    }
    
    private void actionListener(ActionListener control){
    
        System.out.println("Peurrr");
        vista.btnGuardar.addActionListener(control);
        vista.btnCalcular.addActionListener(control);
        vista.btnMostrar.addActionListener(control);
        
    }

        @Override
        public void actionPerformed(ActionEvent e) {

            try{
                System.out.println("action");
                    if(e.getActionCommand().equals("Guardar")){
                        System.out.println("hhhhhh");
                        Double base = Double.parseDouble(vista.txtBase.getText());
                        Double altura = Double.parseDouble(vista.txtAltura.getText());

                        triangulo.setBase(base);
                        triangulo.setAltura(altura);
                    }    
                        else if(e.getActionCommand().contentEquals("Calcular")){
                            triangulo.area();
                            FiguraGeometrica fg = new Triangulo();
                            fg.area();
                        }
                        else if(e.getActionCommand().contentEquals("Mostrar")){
                            vista.txtArea.setText(String.valueOf(triangulo.area()));
                        }

            }
            catch(Exception a) {
                 System.out.println("Something went wrong.");
                 }


        }

}
