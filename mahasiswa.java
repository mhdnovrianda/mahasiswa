
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
class FibonacciExample1{ 
    
    public static void main(String args[])  
    {    
        Scanner sc = new Scanner (System.in);
        int n1=1,n2=2,n3,i;
        System.out.print("Masukkan Angka : ");
        int count = sc.nextInt();
        System.out.print(n1+" "+n2);//printing 0 and 1    
    
        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }    
    }
} 
    

