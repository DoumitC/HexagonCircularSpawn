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

public class HexBase5 extends JPanel{
    private int HexagonNumber;
    private String ColorChosen;
    int HexagonWidth = HexagonProject3.HexagonWidth;
    int HexagonHeight = HexagonProject3.HexagonHeight;
    int MainWidth = HexagonProject3.MainWidth;
    int MainHeight = HexagonProject3.MainHeight;  
    int ControllerCircle = 0;
    int CircleMultiplier = 0;

    public HexBase5(String COLOR, int HexNum){
        setPreferredSize(new Dimension(MainWidth, MainHeight));
        HexagonNumber = HexNum;
        ColorChosen = COLOR;        
    }

    @Override
    public void paintComponent(Graphics g){
        
        Polygon p = new Polygon();
        super.paintComponent(g);


            boolean yNeeded = true;
            int RegPatternNeeded = 4;
            int SidePatternNeeded = 1;
            int xIncrement = -HexagonWidth/2;
            int yIncrement = 3*HexagonHeight/4;
            int HexagonCtr = 0;
            int OGx = HexagonWidth*4;
            
            //Creating Base 5 Template
            
            for(int j = 0; j<5 ;j++){                              
                
                int[] xPoints = {HexagonWidth,HexagonWidth,HexagonWidth/2,0,0,HexagonWidth/2};
                int[] yPoints = {HexagonHeight/4,3*HexagonHeight/4,HexagonHeight,3*HexagonHeight/4,HexagonHeight/4,0};
        
                for(int i = 0; i<6; i++){
                    xPoints[i] += MainWidth/2;
                    yPoints[i] += MainHeight/2;
                }
                
                if(j == 1){
                    for(int i = 0; i<6; i++){
                    xPoints[i] += HexagonWidth/2;
                    yPoints[i] -= 3*HexagonHeight/4;                        
                    }       
                           
                }else if(j == 2){
                    for(int i = 0; i<6; i++){
                    xPoints[i] += HexagonWidth/2;
                    yPoints[i] += 3*HexagonHeight/4;
                    }
                }else if(j == 3){
                    for(int i = 0; i<6; i++){
                    xPoints[i] -= HexagonWidth/2;
                    yPoints[i] += 3*HexagonHeight/4;
                    }
                }else if(j == 4){
                    for(int i = 0; i<6; i++){
                    xPoints[i] -= HexagonWidth/2;
                    yPoints[i] -= 3*HexagonHeight/4;
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
            
            // Smaller Circle
            
            int xMainCoord = HexagonWidth*2;
            int yMainCoord = 0;
            
            for(int j = 0; j<(HexagonNumber-5);j++){
                
                int[] xPoints = {HexagonWidth,HexagonWidth,HexagonWidth/2,0,0,HexagonWidth/2};
                int[] yPoints = {HexagonHeight/4,3*HexagonHeight/4,HexagonHeight,3*HexagonHeight/4,HexagonHeight/4,0};
        
                for(int i = 0; i<6; i++){
                    xPoints[i] += MainWidth/2;
                    yPoints[i] += MainHeight/2;
                }
                
                if(j<32){
                    if(j<4){
                        if(j == 0){
                        for(int i = 0; i<6; i++){
                        xPoints[i] += HexagonWidth;
                                     
                            }       
                           
                        }else if(j == 1){
                            for(int i = 0; i<6; i++){
                            xPoints[i] -= HexagonWidth;
               
                            }
                        }else if(j == 2){
                            for(int i = 0; i<6; i++){
                            xPoints[i] += HexagonWidth*2;
                        
                            }
                        }else if(j == 3){
                            for(int i = 0; i<6; i++){
                            xPoints[i] -= HexagonWidth*2;
               
                            }
                        }                                           
                       
                    }else if((j >= 4 && j< 12)|| (j>=16 && j<28)){
                        
                        if(j==16){
                            xMainCoord = HexagonWidth*3;
                             yMainCoord = 0;
                        }
                        
                        if((j)%4==0){
                            xMainCoord += xIncrement;
                            yMainCoord += yIncrement;
                        }
                                        
                                                            
                        if((j)%4==0){
                            for(int i = 0; i<6; i++){
                                xPoints[i] += xMainCoord;
                                yPoints[i] += yMainCoord;
                            }  
                        }else if((j)%4==1){
                            for(int i = 0; i<6; i++){
                                xPoints[i] += xMainCoord;
                                yPoints[i] -= yMainCoord;
                            }  
                        }else if((j)%4==2){
                            for(int i = 0; i<6; i++){
                               xPoints[i] -= xMainCoord;
                               yPoints[i] += yMainCoord;
                            }  
                        }else if((j)%4==3){
                            for(int i = 0; i<6; i++){
                                xPoints[i] -= xMainCoord;
                                yPoints[i] -= yMainCoord;
                            }  
                        }
                    }else if(j >= 12 && j < 16){
                                                                       
                                                
                       if((j)%4==0){
                            for(int i = 0; i<6; i++){
                                xPoints[i] += HexagonWidth*3;
                               
                            }  
                        }else if((j)%4==1){
                            for(int i = 0; i<6; i++){
                                xPoints[i] -= HexagonWidth*3;
                                
                            }  
                        }else if((j)%4==2){
                            for(int i = 0; i<6; i++){
                               
                               yPoints[i] += 3*HexagonHeight/2;
                            }  
                        }else if((j)%4==3){
                            for(int i = 0; i<6; i++){
                                
                                yPoints[i] -= 3*HexagonHeight/2;
                            }  
                        } 
                    }else if(j >= 28 && j < 32){
                        
                        if(j==28){
                            xMainCoord = 3*HexagonWidth/2;
                             yMainCoord = 9*HexagonHeight/4;
                        }
                        
                        if((j)%4==0){
                            xMainCoord += xIncrement*2;
                            
                        }
                        
                        if((j)%4==0){
                            for(int i = 0; i<6; i++){
                                xPoints[i] += xMainCoord;
                                yPoints[i] += yMainCoord;
                            }  
                        }else if((j)%4==1){
                            for(int i = 0; i<6; i++){
                                xPoints[i] -= xMainCoord;
                                yPoints[i] += yMainCoord;
                            }  
                        }else if((j)%4==2){
                            for(int i = 0; i<6; i++){
                               xPoints[i] += xMainCoord;
                               yPoints[i] -= yMainCoord;
                            }  
                        }else if((j)%4==3){
                            for(int i = 0; i<6; i++){
                                xPoints[i] -= xMainCoord;
                                yPoints[i] -= yMainCoord;
                            }  
                        }
                    }
                    
                }else{
                    
                    
                    //Bigger Circle                                                           
                               
                   
                    if (j==32){
                        xMainCoord = HexagonWidth*4;
                        OGx = xMainCoord;
                        yMainCoord = 0;
                        yNeeded = true;
                        ControllerCircle = 0;
                        CircleMultiplier = 0;
                        
                    }
                    
                    
                    
                    if(HexagonCtr<(4*RegPatternNeeded)){
                    
                    if((j)%4==0){
                    xMainCoord += xIncrement;
                    yMainCoord += yIncrement;
                    }
                                        
                                                            
                    if((j)%4==0){
                        for(int i = 0; i<6; i++){
                            xPoints[i] += xMainCoord;
                            yPoints[i] += yMainCoord;
                        }  
                    }else if((j)%4==1){
                        for(int i = 0; i<6; i++){
                            xPoints[i] += xMainCoord;
                            yPoints[i] -= yMainCoord;
                        }  
                    }else if((j)%4==2){
                        for(int i = 0; i<6; i++){
                            xPoints[i] -= xMainCoord;
                            yPoints[i] += yMainCoord;
                        }  
                    }else if((j)%4==3){
                        for(int i = 0; i<6; i++){
                            xPoints[i] -= xMainCoord;
                            yPoints[i] -= yMainCoord;
                        }  
                    }
                    
                }else{
                    if(HexagonCtr<(SidePatternNeeded+RegPatternNeeded)*4){
                        
                        if((j)%4==0){
                        xMainCoord += (xIncrement*2);                        
                        }
                        if((j)%4==0){
                            for(int i = 0; i<6; i++){
                                xPoints[i] += xMainCoord;
                                yPoints[i] += yMainCoord;
                            }  
                        }else if((j)%4==1){
                            for(int i = 0; i<6; i++){
                                xPoints[i] += xMainCoord;
                                yPoints[i] -= yMainCoord;
                            }  
                        }else if((j)%4==2){
                        for(int i = 0; i<6; i++){
                            xPoints[i] -= xMainCoord;
                            yPoints[i] += yMainCoord;
                            }  
                        }else if((j)%4==3){
                            for(int i = 0; i<6; i++){
                                xPoints[i] -= xMainCoord;
                                yPoints[i] -= yMainCoord;
                            }  
                        } 
                        
                        if (ControllerCircle == 3 && HexagonCtr==(((SidePatternNeeded+RegPatternNeeded)*4)-1)){
                            CircleMultiplier = 0;
                            ControllerCircle = 0;
                            
                            xMainCoord = OGx + HexagonWidth;
                            OGx = xMainCoord;
                            HexagonCtr = -1;
                            if(yNeeded){
                                yNeeded = false;
                                SidePatternNeeded++;
                            }else{
                                yNeeded = true;
                                //SidePatternNeeded++;
                            }
                            RegPatternNeeded++;
                            yMainCoord =0;
                            
                        }
                        
                    }else{
                        
                        xMainCoord = OGx;
                        
                        if(yNeeded){
                            
                            if((j)%4==0){
                                for(int i = 0; i<6; i++){
                                    xPoints[i] += xMainCoord + (HexagonWidth*CircleMultiplier);
                                    //yPoints[i] += 0;
                                }  
                            }else if((j)%4==1){
                                for(int i = 0; i<6; i++){
                                    xPoints[i] -= xMainCoord + (HexagonWidth*CircleMultiplier);
                                    //yPoints[i] -= yMainCoord;
                                }  
                            }else if((j)%4==2){
                                for(int i = 0; i<6; i++){
                                    //xPoints[i] -= xMainCoord;
                                    yPoints[i] += yMainCoord;
                                }  
                            }else if((j)%4==3){
                                for(int i = 0; i<6; i++){
                                    //xPoints[i] -= xMainCoord;
                                    yPoints[i] -= yMainCoord;
                                }  
                            }    
                            
                        }else{
                            if((j)%4==0){
                                for(int i = 0; i<6; i++){
                                    xPoints[i] += xMainCoord;                                    
                                }  
                            }else if((j)%4==1){
                                for(int i = 0; i<6; i++){
                                    xPoints[i] -= xMainCoord;
                                }  
                            }else if((j)%4==2){
                                for(int i = 0; i<6; i++){
                                    xPoints[i] -= xMainCoord + (HexagonWidth*CircleMultiplier);
                                    //yPoints[i] += yMainCoord;
                                }  
                            }else if((j)%4==3){
                                for(int i = 0; i<6; i++){
                                    xPoints[i] += xMainCoord + (HexagonWidth*CircleMultiplier);
                                    //yPoints[i] -= yMainCoord;
                                }  
                            }
                            
                        }
                        
                        
                        
                        if(HexagonCtr==((SidePatternNeeded+RegPatternNeeded)*4)+3 || (ControllerCircle == 3 && HexagonCtr==(((SidePatternNeeded+RegPatternNeeded)*4)-1))){
                            if (ControllerCircle == 0){
                                CircleMultiplier = 1;
                                ControllerCircle++;
                            }else if(ControllerCircle == 1){
                                CircleMultiplier = 1;
                                ControllerCircle++;
                            }else if(ControllerCircle == 2){
                                CircleMultiplier = 1;
                                ControllerCircle++;
                            }else if(ControllerCircle == 3){
                                CircleMultiplier = 0;
                                ControllerCircle = 0;
                            }
                            
                            xMainCoord += HexagonWidth;
                            OGx = xMainCoord;
                            HexagonCtr = -1;
                            if(yNeeded){
                                yNeeded = false;
                                SidePatternNeeded++;
                            }else{
                                yNeeded = true;
                                //SidePatternNeeded++;
                            }
                            RegPatternNeeded++;
                            yMainCoord =0;
                        }
                                                                        
                    }
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
                
                 if(j>=32){
                    HexagonCtr++;
                }
                
            }




    }
}

