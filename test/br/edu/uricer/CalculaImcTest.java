/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class CalculaImcTest {
    
    @Test
    public void testeM1() {
        CalculaImc calcular = new CalculaImc();
        calcular.setSexo("Masculino");
        calcular.setAltura(1.65);
        calcular.setPeso(80);
        double result = calcular.calculaIMC();
        String resultado = calcular.verificaImc(result, calcular.getSexo());
        String mensagem = "Acima do peso";        
        
        assertEquals(mensagem, resultado);
        
    }
    
    @Test
    public void testeM2() {
        CalculaImc calcular = new CalculaImc();
        calcular.setSexo("Masculino");
        calcular.setAltura(1.70);
        calcular.setPeso(75);
        double result = calcular.calculaIMC();
        String resultado = calcular.verificaImc(result, calcular.getSexo());
        String mensagem = "Peso ideal";        
        
        assertEquals(mensagem, resultado);
        
    }
    
    @Test
    public void testeM3() {
        CalculaImc calcular = new CalculaImc();
        calcular.setSexo("Masculino");
        calcular.setAltura(1.80);
        calcular.setPeso(50);
        double result = calcular.calculaIMC();
        String resultado = calcular.verificaImc(result, calcular.getSexo());
        String mensagem = "Abaixo do peso";        
        
        assertEquals(mensagem, resultado);
        
    }
    
    @Test
    public void testeF1() {
        CalculaImc calcular = new CalculaImc();
        calcular.setSexo("Feminino");
        calcular.setAltura(1.65);
        calcular.setPeso(85);
        double result = calcular.calculaIMC();
        String resultado = calcular.verificaImc(result, calcular.getSexo());
        String mensagem = "Acima do peso";        
        
        assertEquals(mensagem, resultado);
        
    }
    
    @Test
    public void testeF2() {
        CalculaImc calcular = new CalculaImc();
        calcular.setSexo("Feminino");
        calcular.setAltura(1.70);
        calcular.setPeso(70);
        double result = calcular.calculaIMC();
        String resultado = calcular.verificaImc(result, calcular.getSexo());
        String mensagem = "Peso ideal";        
        
        assertEquals(mensagem, resultado);
        
    }
    
    @Test
    public void testeF3() {
        CalculaImc calcular = new CalculaImc();
        calcular.setSexo("Feminino");
        calcular.setAltura(1.80);
        calcular.setPeso(55);
        double result = calcular.calculaIMC();
        String resultado = calcular.verificaImc(result, calcular.getSexo());
        String mensagem = "Abaixo do peso";        
        
        assertEquals(mensagem, resultado);
        
    }
    
    @Test
    public void testeProprio() {
        CalculaImc calcular = new CalculaImc();
        calcular.setSexo("feminino");
        calcular.setAltura(1.80);
        calcular.setPeso(55);
        double result = calcular.calculaIMC();
        String resultado = calcular.verificaImc(result, calcular.getSexo());
        String mensagem = "Abaixo do peso";        
        System.out.println(resultado);
        assertEquals(mensagem, resultado);
        
    }
}
