//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);
int N1;
    System.out.println("Digite um número:");
    N1 = input.nextInt();

    if (N1 % 2==0) {
        System.out.println("O seu número é par");
    } else {
        System.out.println("O seu número é ímpar");
    }
}
