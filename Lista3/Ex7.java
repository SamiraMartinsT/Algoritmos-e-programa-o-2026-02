//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double notas = 0;
    double media= 0;
    double soma=0;
    int quantidade=0;

        System.out.println("Digite a nota do aluno:");
        notas = input.nextDouble();
        while (notas >= 0) {
            soma += notas;
            quantidade++;
            System.out.println("Digite a próxima nota, ou um valor negativo para parar.");
            notas = input.nextDouble();
        }
        if (quantidade > 0) {
           media = soma/ quantidade;
            System.out.println("Quantidades de notas válidas: "+ quantidade);
            System.out.printf("Média aritmética: %.2f%n", media);
        } else {
            System.out.println("Nota inválida;");

        }

    }






