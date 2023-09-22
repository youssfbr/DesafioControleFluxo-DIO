package com.github.youssfbr.DesafioControleFluxo;

import com.github.youssfbr.DesafioControleFluxo.services.exceptions.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println();

            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = sc.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = sc.nextInt();

            contar(parametroUm, parametroDois);

        }
        catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.err.println("O valor digitado é inválido! Digite um valor de número inteiro.");
        }

        sc.close();
    }

    private static void contar(final int parametroUm, final int parametroDois) {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int resultado = parametroDois - parametroUm;

        System.out.println();

        for (int i = 1; i <= resultado; i++ ) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}