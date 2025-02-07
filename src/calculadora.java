import java.util.Scanner;

public class calculadora {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uam operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            int escolha = scanner.nextInt();

            if (escolha == 5) {
                continuar = false;
                System.out.println("Saindo...");
                continue;
            };
            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}