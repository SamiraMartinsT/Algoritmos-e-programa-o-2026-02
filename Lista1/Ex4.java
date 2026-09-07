//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);
double valor;
double porc;
double novoV;
    System.out.println("Digite o valor do produto: ");
    valor = input.nextInt();
    porc = valor * 10/100;
    novoV = valor - porc;

    System.out.println("O produto com 10% de desconto é" + " " + novoV);
}
