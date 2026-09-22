//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int Qdoacoes;
    double valorT = 0;
    double valor = 0;

    System.out.println("Escreva a quantidade de doações recebidas no dia:");
    Qdoacoes = input.nextInt();
    if (Qdoacoes <= 0) {
        System.out.println("Nenhuma doação informada");
    }
    double maior = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;
    for (int i = 1; i <= Qdoacoes; i++) {
        System.out.println("Excreva o valor de cada doação:");
        valor = input.nextDouble();
        valorT += valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    if (valor > maior) {
        maior = valor;
    }
    System.out.printf("Valor total arrecadado: %.2f\n", valorT);
    System.out.printf("Maior valor doado: %.2f\n", maior);
    System.out.printf("Menor valor doado: %.2f\n", menor);


}
