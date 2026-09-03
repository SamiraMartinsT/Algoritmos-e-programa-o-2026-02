//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);

int idade;

    System.out.println("Digite sua idade:");
    idade = input.nextInt();

    if (idade <= 12) {
        System.out.println("Você se encaixa na categoria infantil");
    } else if (idade >=13 && idade <= 17) {
        System.out.println("Você se encaixa na categoria juvenil");
    } else {
        System.out.println("Você se encaixa na categoria adulto");
    }
}
