

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("=== CADASTRO DE MEDICAMENTO ===");

            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite o fabricante: ");
            String fabricante = sc.nextLine();

            System.out.print("Digite o preço: ");
            double preco = sc.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite a dosagem: ");
            String dosagem = sc.nextLine();

            Medicamento medicamento = new Medicamento(
                    nome, fabricante, preco, quantidade, dosagem
            );

            System.out.println("\n=== DADOS DO MEDICAMENTO ===");

            System.out.println("Nome: " + medicamento.nome);
            System.out.println("Fabricante: " + medicamento.fabricante);
            System.out.println("Preço: R$ " + medicamento.preco);
            System.out.println("Quantidade: " + medicamento.quantidade);
            System.out.println("Dosagem: " + medicamento.dosagem);

            sc.close();
        }
    }






