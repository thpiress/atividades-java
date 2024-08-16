/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade6;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Atividade6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double renda;
        double valorAPagar = 0;
        
        System.out.print("Digite o valor da renda: R$");
        renda = sc.nextDouble();
        
        if (renda < 0){
            System.out.println("Valor Inserido Invalido Para Calcular!");
        } else if(renda <= 2000 && renda >= 0){
            System.out.println("Insento de Imposto de Renda!");
        } else if (renda <= 3000 && renda > 2000){
            valorAPagar = (renda - 2000) * 0.09;
        } else if(renda <= 4500 && renda > 3000){
            valorAPagar = ((renda - 3000) * 0.18) + 80;
        } else {
            valorAPagar = ((renda - 3000) * 0.28) + 350;
        }
        
        System.out.printf("Valor a Pagar: R$%.2f", valorAPagar);
        
    }
}
