/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareroot;

public class SquareRoot {
public static void main(String[] args) {
double num, sroot, rerr;

    for (num = 1.0; num < 100.0; num++) {
        sroot = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " +sroot);
        
        // compute rounding error
        rerr = num - (sroot * sroot);
        System.out.println("Rounding error is " + rerr);
        System.out.println();
    }
    int i, j;
    
    for (i= 0, j = 10 ; i < j; i++, j--) 
        System.out.println("i and j: " + i + " " + j);
    
    int e;
    int result;
    
    for (int k = 0; k < 10; k++) {
        result = 1;
        e= k;
        while(e>0){
            result *= 2;
            e--;
        }
        System.out.println("2 to the " + k + " poswer is " + result);
    }
    
}   
}
