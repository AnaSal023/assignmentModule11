/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oldDrawingSys;

/**
 *
 * @author MoaathAlrajab
 */
public class Circle extends Shape{
    @Override
     public void draw(int x1, int y1, int r) {
        System.out.println("Circle from center (" + x1 + ";" + y1 + "), with radius(" + r + ")");
    }

    @Override
    public void draw(int x, int y, int width, int height) {
        
    }
}
