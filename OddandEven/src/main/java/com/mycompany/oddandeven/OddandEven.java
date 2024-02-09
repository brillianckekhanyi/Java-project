/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oddandeven;

import java.util.Scanner;

//package numberA;

public class OddandEven{
  
  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print(" ENTER A NUMBER TO TEST IF ITS EVEN OR ODD : ");
        number=input.nextInt();//accepting a number from user
        System.out.println();
        if(number%2==0)//checking if number is divisible by 2
        {
            //if true this statement will print
            System.out.println("the number is an even number");
        }
        else
            {
                //otherwise this statement will print
                System.out.println("the number is an odd number");
            }
    }
}
