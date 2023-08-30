/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hexagonproject3;

/**
 *
 * @author doumitc1
 */

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;


public class Hex123 extends JPanel{
    private int HexagonNumber;
    private String ColorChosen;
    int HexagonWidth = HexagonProject3.HexagonWidth;
    int HexagonHeight = HexagonProject3.HexagonHeight;
    int MainWidth = HexagonProject3.MainWidth;
    int MainHeight = HexagonProject3.MainHeight;  
    int ControllerCircle = 0;
    int CircleMultiplier = 0;

    public Hex123(String COLOR, int HexNum){
        setPreferredSize(new Dimension(MainWidth, MainHeight));
        HexagonNumber = HexNum;
        ColorChosen = COLOR;        
    }

@Override
    public void paintComponent(Graphics g){
        
        Polygon p = new Polygon();
        super.paintComponent(g);

            


            if(HexagonNumber == 1){                                                        
                
                int[] xPoints = {HexagonWidth,HexagonWidth,HexagonWidth/2,0,0,HexagonWidth/2};
                int[] yPoints = {HexagonHeight/4,3*HexagonHeight/4,HexagonHeight,3*HexagonHeight/4,HexagonHeight/4,0};
        
                for(int i = 0; i<6; i++){
                    xPoints[i] += MainWidth/2;
                    yPoints[i] += MainHeight/2;
                }                              
                                
                if (ColorChosen.equals("green")){
                    g.setColor(Color.GREEN);
                }else if(ColorChosen.equals("red")){
                    g.setColor(Color.RED);
                }else if(ColorChosen.equals("blue")){
                    g.setColor(Color.BLUE);
                }else if(ColorChosen.equals("purple")){
                    g.setColor(Color.magenta);
                }else if(ColorChosen.equals("orange")){
                    g.setColor(Color.ORANGE);
                }else if(ColorChosen.equals("yellow")){
                    g.setColor(Color.YELLOW);
                }
                g.fillPolygon(xPoints, yPoints, xPoints.length);
                g.setColor(Color.BLACK);
                g.drawPolygon(xPoints, yPoints, xPoints.length);    
                
                
            }else if(HexagonNumber == 2){
                
                for(int j = 0; j<2 ;j++){                              
                
                int[] xPoints = {HexagonWidth,HexagonWidth,HexagonWidth/2,0,0,HexagonWidth/2};
                int[] yPoints = {HexagonHeight/4,3*HexagonHeight/4,HexagonHeight,3*HexagonHeight/4,HexagonHeight/4,0};
        
                for(int i = 0; i<6; i++){
                    xPoints[i] += MainWidth/2;
                    yPoints[i] += MainHeight/2;
                }
                
                if(j == 1){
                    for(int i = 0; i<6; i++){
                    xPoints[i] += HexagonWidth;                                           
                    }       
                           
                }else if(j == 2){
                    for(int i = 0; i<6; i++){
                    xPoints[i] += HexagonWidth/2;
                    yPoints[i] += 3*HexagonHeight/4;
                    }
                }else if(j == 0){
                    for(int i = 0; i<6; i++){
                    xPoints[i] -= 0;
                    yPoints[i] -= 0;
                    }
                }
                
                
                if (ColorChosen.equals("green")){
                    g.setColor(Color.GREEN);
                }else if(ColorChosen.equals("red")){
                    g.setColor(Color.RED);
                }else if(ColorChosen.equals("blue")){
                    g.setColor(Color.BLUE);
                }else if(ColorChosen.equals("purple")){
                    g.setColor(Color.magenta);
                }else if(ColorChosen.equals("orange")){
                    g.setColor(Color.ORANGE);
                }else if(ColorChosen.equals("yellow")){
                    g.setColor(Color.YELLOW);
                }
                g.fillPolygon(xPoints, yPoints, xPoints.length);
                g.setColor(Color.BLACK);
                g.drawPolygon(xPoints, yPoints, xPoints.length);    
                }
                
            }else if(HexagonNumber == 3){
                for(int j = 0; j<3 ;j++){                              
                
                int[] xPoints = {HexagonWidth,HexagonWidth,HexagonWidth/2,0,0,HexagonWidth/2};
                int[] yPoints = {HexagonHeight/4,3*HexagonHeight/4,HexagonHeight,3*HexagonHeight/4,HexagonHeight/4,0};
        
                for(int i = 0; i<6; i++){
                    xPoints[i] += MainWidth/2;
                    yPoints[i] += MainHeight/2;
                }
                
                if(j == 1){
                    for(int i = 0; i<6; i++){
                    xPoints[i] += HexagonWidth;                                           
                    }       
                           
                }else if(j == 2){
                    for(int i = 0; i<6; i++){
                    xPoints[i] += HexagonWidth/2;
                    yPoints[i] += 3*HexagonHeight/4;
                    }
                }else if(j == 0){
                    for(int i = 0; i<6; i++){
                    xPoints[i] -= 0;
                    yPoints[i] -= 0;
                    }
                }
                
                
                if (ColorChosen.equals("green")){
                    g.setColor(Color.GREEN);
                }else if(ColorChosen.equals("red")){
                    g.setColor(Color.RED);
                }else if(ColorChosen.equals("blue")){
                    g.setColor(Color.BLUE);
                }else if(ColorChosen.equals("purple")){
                    g.setColor(Color.magenta);
                }else if(ColorChosen.equals("orange")){
                    g.setColor(Color.ORANGE);
                }else if(ColorChosen.equals("yellow")){
                    g.setColor(Color.YELLOW);
                }
                g.fillPolygon(xPoints, yPoints, xPoints.length);
                g.setColor(Color.BLACK);
                g.drawPolygon(xPoints, yPoints, xPoints.length);    
                }   
            }

    }
}

