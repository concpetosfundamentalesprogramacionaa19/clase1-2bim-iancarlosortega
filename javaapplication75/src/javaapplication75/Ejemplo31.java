/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        boolean bandera = true;
        int opcion;
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1-12", "12.1-16","16.1-19","19.1-20"
        ,"20.1-adelante"};
        
        while(bandera==true){
            System.out.println("Ingrese la nota:");
        double cantidad = entrada.nextDouble();
        if(cantidad <=8){
            datos[0] = datos[0] + 1;
        }else{
            if(cantidad>8 && cantidad <=12){
                datos[1] = datos[1] + 1;
            }else{
                if(cantidad>12 && cantidad <=16){
                    datos[2] = datos[2] + 1;
                } else {
                    if(cantidad>16 && cantidad<=19){
                        datos[3] = datos[3] + 1;
                    } else {
                        if(cantidad>19 && cantidad<=20){
                            datos[4] = datos[4] + 1;
                        } else {
                            if(cantidad>20){
                                datos[5] = datos[5] + 1;
                            }
                        }
                    }
                }
                
            }
         }
            System.out.println("En caso de ya no querer ingresar mas notas "
                    + "presione |1|");
            opcion = entrada.nextInt();
            if(opcion==1){
                bandera = false;
            }
        }
        System.out.println("Notas ingresadas:");
        
        for(int i = 0; i<datos.length; i++){
            System.out.printf("%s = %d\n", rangos[i], datos[i]);
        }
        


    }
}
