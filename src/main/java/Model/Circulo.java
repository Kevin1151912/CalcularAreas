/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class Circulo extends FiguraGeometrica{
    
    private Integer radio;
    

    public Circulo(Integer radio) {
        this.radio = radio;
    }

    public Circulo() {
    }
    
    @Override
    public Double area(){
        return Math.PI*Math.pow(radio,2);
        
    }
    
}
