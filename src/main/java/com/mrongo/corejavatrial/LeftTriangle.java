/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrongo.corejavatrial;

/**
 *
 * @author zeroman
 */
public class LeftTriangle {
    
    public void printTriangle(){
        int i,j,row = 6;
        
        //Outer loop work for rows  
       for(i=0;i<=row;i++){
           for(j=row - i;j>0;j--){
//               for (j=2*(row-i); j>=1; j--){ 
               System.out.print(" ");
           }
                
           for(j=0;j<=i;j++){
               System.out.print("* ");
           }
           System.out.println();           
       }
        
    }
    
}
