/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        
        if (n <= 0) {
            System.out.print("Seu número é negativo");
        } else {
            System.out.print("Seu número é positivo");
        }
        
        sc.close();
    }
}
