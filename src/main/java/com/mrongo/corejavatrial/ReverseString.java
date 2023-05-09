/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrongo.corejavatrial;

/**
 *
 * @author zeroman
 */
public class ReverseString {
    
    String name = "ognorM";
    int i,j;
    char resultArray1;
    public void reverseName(){
        char[] resultArray = name.toCharArray();           
        
        for(i=resultArray.length -1;i>0;i--){
          this.resultArray1= resultArray[i];
            System.out.print(resultArray[i]);
        
        }
        System.out.print(name.charAt(0));
//        for(i=resultArray.length;i>=0;i--){
//               System.out.print(resultArray[i]);
//        }
//        System.out.println(name.toCharArray());
    }
    
}
