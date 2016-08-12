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
    public static void mandaDados() {
        CalculaImc calcular = new CalculaImc();
        calcular.setSexo("Masculino");
        calcular.setAltura(1.65);
        calcular.setPeso(80);
        double result = calcular.calculaIMC();
        
        
        
        assertEquals(35, result);
        
    }
}
