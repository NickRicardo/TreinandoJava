package br.com.nicolas;

import java.util.Scanner;
/**
 * @author nicolas.santos
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int numero = s.nextInt();
        verificarPositivoNegativo(numero);
        System.out.println(numero);
        s.close();
    }

    public static void verificarPositivoNegativo(int numero) {
        if (numero > 0) {
            System.out.println("O numero " + numero + " é Positivo");
        } else if (numero < 0) {
            System.out.println("O numero " + numero + " é Negativo");
        } else {
            System.out.println("O número é Zero");
        }
    }
}

//Exercício 1 (Básico):
//Escreva um programa que leia um número inteiro do usuário e
// imprima "Positivo" se o número for maior que 0, "Negativo"
// se for menor que 0, e "Zero" se for igual a 0.