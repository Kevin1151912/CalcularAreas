/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public abstract class FiguraGeometrica {
    
    public abstract Double area();

    @Override
    public String toString() {
        return "figuraGeometrica{" + "area=" + area() + '}';
    }
    
    
}
