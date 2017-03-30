package com.opet.calculadora;

import com.opet.util.Reader;

public class Aula6_Calculadora
{

    public static void main(String[] args) throws Exception
    {
        double resultado = 0;

        System.out.println("Digite a opera��o desejada (+,-,*,/) ou ! para fun��es complexas");
        String operacao = Reader.readString();

        if( operacao.equals("+") || operacao.equals("-") ||
            operacao.equals("/") || operacao.equals("*")
                        ) {

            System.out.println("Digite o primeiro n�mero");
            double primeiroValor = Reader.readDouble();

            System.out.println("Digite o segundo n�mero");
            double segundoValor = Reader.readDouble();

            resultado = calcular(operacao, primeiroValor, segundoValor);


        } else {
            System.out.println("Op��es avan�adas. Digite:");
            System.out.println("1- Fatorial");
            System.out.println("2- Quadrado");
            System.out.println("3- Cubo");
            System.out.println("4- M�dia de 5 n�meros");

            int operacao_avancada = Reader.readInt();
            System.out.println("Digite um n�mero");

            switch (operacao_avancada)
            {
                case 1:
                    /* fatora��o */
                    double valor = Reader.readDouble();
                    resultado = fatorial(valor);
                    break;
                case 2:
                    /* quadrado */
                    resultado = exponenciacao(Reader.readDouble(), 2);
                    break;
                case 3:
                    /* cubo */
                    resultado = exponenciacao(Reader.readDouble(), 3);
                    break;
                case 4:
                    /* cubo */
                    double valor1 = Reader.readDouble();
                    System.out.println("Digite o pr�ximo n�mero:");
                    double valor2 = Reader.readDouble();
                    System.out.println("Digite o pr�ximo n�mero:");
                    double valor3 = Reader.readDouble();
                    System.out.println("Digite o pr�ximo n�mero:");
                    double valor4 = Reader.readDouble();
                    System.out.println("Digite o pr�ximo n�mero:");
                    double valor5 = Reader.readDouble();

                    resultado = media(valor1, valor2, valor3, valor4, valor5);
                    break;

                default:
                    resultado = 0.00;
                    break;
            }

        }
        System.out.println("Resultado � "+resultado);

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
   public static double fatorial(double valor)
   {
       return 0;
   }
   public static double exponenciacao(double valor, int elevado)
   {
       return Math.pow(valor, elevado);
   }

   public static double media(double valor1, double valor2, double valor3, double valor4, double valor5 )
   {
       return (valor1+valor2+valor3+valor4+valor5)/5;
   }


}
