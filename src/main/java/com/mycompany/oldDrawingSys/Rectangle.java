/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oldDrawingSys;

/**
 *
 * @author MoaathAlrajab
 */
public class Rectangle extends Shape{
    @Override
     public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate top-left corner (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }

    @Override
    public void draw(int x1, int y1, int r) {
       
    }
}
