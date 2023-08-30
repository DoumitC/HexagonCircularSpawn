/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hexagonproject3;

/**
 *
 * @author doumitc1
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class HexagonProject3{            

    public static int MainWidth = 1600;
    public static int MainHeight = 800;
    public static int HexagonWidth = 60;
    public static int HexagonHeight = 60;
    
  public static void main(String[] args){
      
      
      JFrame f;  
      f=new JFrame();
      
      String strNum = "";
      String Color = "";
      strNum = JOptionPane.showInputDialog(f,"Enter Numbner of Hexagon:");
      for(int i = 0; i < Integer.parseInt(strNum); i++){
          if(i%75 == 0 && HexagonWidth > 14){
              HexagonWidth -= 4;
              HexagonHeight -= 4;
          }
      }
      
      Color = JOptionPane.showInputDialog(f,"Enter Color (green, yellow, purple, red, blue, orange):");
        JFrame frame = new JFrame("Draw Hexagon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if(Integer.parseInt(strNum)<4){
            frame.add(new Hex123(Color,Integer.parseInt(strNum)));
        }else{
            if(Integer.parseInt(strNum)%4 ==  0){
                frame.add(new HexBase4(Color,Integer.parseInt(strNum)));
            }else if(Integer.parseInt(strNum)%4 ==  1){
                frame.add(new HexBase5(Color,Integer.parseInt(strNum)));
            }else if(Integer.parseInt(strNum)%4 ==  2){
                frame.add(new HexBase6(Color,Integer.parseInt(strNum)));
            }else if(Integer.parseInt(strNum)%4 ==  3){
                frame.add(new HexBase7(Color,Integer.parseInt(strNum)));
            }
        }
            
        //frame.add(new HexBase6("GREEN",Integer.parseInt(strNum)));
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

