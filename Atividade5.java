/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Atividade5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int codigo;
        float preco = 0.0f;
        int quantidade = 0;
        float valorAPagar = 0.0f;
        
        System.out.println("Escolha o codigo: ");
        codigo = sc.nextInt();
        
        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();
        
        if(codigo == 1) {
            valorAPagar = 4 * quantidade;
        } else if(codigo == 2){
            valorAPagar = 4.5f * quantidade;
        } else if(codigo == 3){
            valorAPagar = 5 * quantidade;
        } else if(codigo == 4){
            valorAPagar = 2 * quantidade;
        } else if(codigo == 5){
            valorAPagar = 1.5f * quantidade;
        } else {
            System.out.println("Codigo Invalido!");
        }
        
        System.out.printf("Total: R$ %.2f", valorAPagar);
    }
}
