/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1;

/**
 *
 * @author aluno.den
 */
public class Atividade1 {

    public static void main(String[] args) {
        int idade = 30;
        float preco1 = 2100.00F;
        float preco2 = 650.00F;
        char sexo = 'M';
        String codigo = "5290";
        
        System.out.printf("Produtos: \n Computador, o preço é: %.2f,", preco1);
        System.out.printf(" Mesa de Escritorio, o preço é: %.2f", preco2);
        System.out.printf("\n Registro: %d anos de idade, codigo %s e sexo %c", idade, codigo, sexo);
        System.out.printf("\n Medida com oito casas decimais: ");
        System.out.printf("\n Arredondando(Três casas decimais): ");
        System.out.printf("\n Decimal usado nos EUA: ");
    }
}