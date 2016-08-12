/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

/**
 *
 * @author aluno
 */
public class CalculaImc {

    String sexo;
    double altura;
    double peso;
    
    public double calculaIMC(){
        double result = 0;
        
        result = peso /(altura*altura);
        
        return result;
    }
    
    public String verificaImc(double imc, String sexo){
        String resultado = "";
        if(sexo.equalsIgnoreCase("Feminino")){
            if(imc <= 25.8 && imc >= 19.1){
                resultado = "Peso ideal";
            } else if(imc > 25.8){
                resultado = "Acima do peso";
            } else{
                resultado = "Abaixo do peso";
            }
        } else if(sexo.equalsIgnoreCase("Masculino")){
            if(imc <= 26.4 && imc >= 20.7){
                resultado = "Peso ideal";
            } else if(imc > 26.4){
                resultado = "Acima do peso";
            } else{
                resultado = "Abaixo do peso";
            }            
        } else{
            resultado = "Sexo inválido";
        }
        return resultado;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
