/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Atividade3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int number = input.nextInt();
        input.close();
        
        if (number %2 == 00) {
            System.out.println(number+" e par");
        } else {
            System.out.println(number+" e impar");
        }
    }
}
