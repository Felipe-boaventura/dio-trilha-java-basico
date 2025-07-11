package io.github.felipeboaventura;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, gostaria de algumas informações.");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("\nNúmero da conta: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("\nAgência com o dígito: ");
        String agency = sc.nextLine();

        System.out.print("\nSaldo: ");
        int balance = sc.nextInt();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo R$" + balance + " já está disponível para saque.");

    }
}