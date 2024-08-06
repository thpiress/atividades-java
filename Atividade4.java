/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Atividade4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s1, s2;
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        
        if (s1 % s2 == 0 || s2 % s1 == 0) {
            System.out.print("Sao multiplos");
        } else {
            System.out.print("Nao sao multiplos");
        }
        sc.close();
    }
}
