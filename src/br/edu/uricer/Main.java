/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculaImc calcular = new CalculaImc();
        String entrada;
        double imc = 0;
        String resultado = null;

        while (true) {
            System.out.println("CALCULANDO IMC");
            System.out.print("Informe o sexo da pessoa ou <exit> para sair: ");
            entrada = sc.nextLine();
            if(entrada.equals("exit")){
                break;
            }
            else{
            calcular.setSexo(entrada);
            
            System.out.print("Informe o peso da pessoa: ");
            entrada = sc.nextLine();
            double peso = Double.parseDouble(entrada);
            calcular.setPeso(peso);
            
            System.out.print("Informe a altura da pessoa: ");
            entrada = sc.nextLine();
            double altura = Double.parseDouble(entrada);
            calcular.setAltura(altura);
            try {
               imc = calcular.calculaIMC();
               resultado = calcular.verificaImc(imc, calcular.getSexo());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: entrada inválida!");
            }

            System.out.print("seu IMC mostra que seu peso esta: " + resultado);
            System.out.println("");
            }
        }
    }
    
}
