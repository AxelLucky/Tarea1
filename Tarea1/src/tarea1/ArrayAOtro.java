/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Propietario
 */
public class ArrayAOtro {
    public void Vector(){
       int i;
       int arreglo1[]={1,2,3,4,5};
       int arreglo2[]=new int[5];
       for(i=0;i<arreglo1.length;i++)
       {    arreglo2[i]=arreglo1[i];
            System.out.println(arreglo2[i]+" ");
       }
    }
}