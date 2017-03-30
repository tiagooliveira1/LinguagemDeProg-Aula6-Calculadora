package com.opet.calculadora;

import com.opet.util.Reader;

public class Aula6_Calculadora
{

    public static void main(String[] args) throws Exception
    {


        System.out.println("Digite a operação desejada (+,-,*,/");
        String operacao = Reader.readString();

        System.out.println("Digite o primeiro número");
        double primeiroValor = Reader.readDouble();

        System.out.println("Digite o segundo número");
        double segundoValor = Reader.readDouble();

        double resultado = calcular(operacao, primeiroValor, segundoValor);
        System.out.println("Resultado é "+resultado);

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
