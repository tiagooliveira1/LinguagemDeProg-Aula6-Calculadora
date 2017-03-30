package com.opet.calculadora;

public class Aula6_Calculadora
{

    public static void main(String[] args)
    {
        int valor = 1;
        double soma = calcular("/", 2, 5);
        System.out.println(soma);

    }

   public static double calcular( String operacao, double valor1 , double valor2 )
   {

       if(operacao.equals("+"))
           return valor1+valor2;
       if(operacao.equals("-"))
           return valor1-valor2;
       if(operacao.equals("/"))
           return valor1 / valor2;
       if(operacao.equals("*"))
           return valor1*valor2;

       return 0;

   }

}
