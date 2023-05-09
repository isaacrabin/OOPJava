/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrongo.corejavatrial;

/**
 *
 * @author zeroman
 */
public class RightTriangle {
    int i,j,row = 6;
    public void printTriangle(){
        for(i=0;i<=row;i++){            
            for(j=0;j<=i;j++){
                System.out.print("* ");              
            }
              System.out.println();
        }
    }
    
}
