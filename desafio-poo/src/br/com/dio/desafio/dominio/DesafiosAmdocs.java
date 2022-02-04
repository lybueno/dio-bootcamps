package br.com.dio.desafio.dominio;

import java.io.IOException;
import java.util.Scanner;

public class DesafiosAmdocs {

    /* Desafio 01
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            int graus = leitor.nextInt();
            if (graus >= 0 && graus < 90) System.out.println("Bom Dia!!");
            else if(graus >= 90 && graus < 180) System.out.println("Boa Tarde!!");
            else if(graus >= 180 && graus < 270) System.out.println("Boa Noite!!");
            else if(graus >= 270 && graus < 360) System.out.println("De Madrugada!!");
            else System.out.println("Bom Dia!!");
        }
    } */
    /* Desafio 02
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            double graus = leitor.nextDouble();

            if (graus <= 360) {
                if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");
                else if (graus < 180) System.out.println("Boa Tarde!!");
                else if (graus < 270) System.out.println("Boa Noite!!");
                else if (graus < 360) System.out.println("De Madrugada!!");
                else System.out.println("Bom Dia!!");

                Double horas;
                if (graus >= 270) {
                    horas =((graus - 270.0) * 4.0) / 60.0;
                } else {                                   //Complete o código nos espaços em branco
                    horas =((graus * 4.0) / 60.0) + 6.0;
                }

                Double minutos = (horas * 60) % 60.0;
                Double segundos = (minutos * 60) % 60.0;

                if (segundos > 59) {
                    segundos = 0.0;
                    minutos += 1.0;
                }
                System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
            }
        }
    } */

    /* Desafio 3
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();

        if (H >= A && (L >= B || L >= C)) System.out.println("S");
        else if (H >= B && (L >= A || L >= C)) System.out.println("S");
        else if (H >= C && (L >= A || L >= B)) System.out.println("S");
        else System.out.println("N");
    } */

    /* Desafio II - 1
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int fatorial = 1;
        for(int i = numero; i >= 1; i--){
            fatorial *= i;
        }
        System.out.println(fatorial);
    } */

    /* Desafio II - 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        double fibonacci =
                ((Math.pow(((1 + Math.sqrt(5))/ 2), numero) - Math.pow(((1 - Math.sqrt(5))/ 2), numero)) / Math.sqrt(5));
        System.out.printf("%.1f", fibonacci);
    } */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int somaImpar = 0;

        if(num1 > num2){
            for (int i = num1 - 1; i > num2; i--){
                if(i % 2 != 0){
                    somaImpar += i;
                }
            }
        }
        else if(num1 < num2){
            for (int i = num2 - 1; i > num1; i--) {
                if(i % 2 != 0){
                    somaImpar += i;
                }
            }
        }

        System.out.println(somaImpar);
    }
}
