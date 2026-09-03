//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double energia;
    double conta;

    System.out.println("Escreva a quantidade de Kwt consumidos no mês:");
    energia = input.nextDouble();

    if (energia >= 100) {
        conta = energia * 0.5;
        System.out.println("O  valor da sua conta de energia é:" + "" + conta);
    } else if (energia >= 110 && energia <= 200) {
        conta = energia * 0.7;
        System.out.println("O valor da sua conta de energia é:" + "" + conta);
    } else{
        conta = energia * 0.90;
        System.out.println("O valor da sua conta de energia é:" + "" + conta);
    }

}
