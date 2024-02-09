/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

/**
 *
 * @author Dell
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n=10,FirstNum=0,SecondNum=1;
        int Nextnum;
        for(int i=1;i<=n;i++)
        {
         System.out.print(FirstNum+ " , ");
         Nextnum=FirstNum+ SecondNum;
         FirstNum=SecondNum;
         SecondNum=Nextnum;
        }
    
        
    }
}

