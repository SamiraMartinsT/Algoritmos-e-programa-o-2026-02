//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
Scanner input = new Scanner (System.in);
double a;
double b;
double c;
double delta;
    System.out.println("Digite o valor de A:");
    a = input.nextDouble();
    System.out.println("Digite o valor de B:");
    b = input.nextDouble();
    System.out.println("Digite o valor de C:");
    c = input.nextDouble();

    if (a == 0) {
        System.out.println("NÃO SE TRATA DE UMA EQUAÇÃO DO SEGUNDO GRAU.");
    } else {
        delta = ((b * b) - 4 * (a * c));
        if (delta < 0) {
            System.out.println("NÃO EXISTEM RAÍZES REAIS.");
          }else if (delta > 0) {
            System.out.println("EXISTEM DUAS RAÍZES REAIS DIFERENTES.");
            } else {
            System.out.println("EXISTEM DUAS RAÍZES REAIS IGUAIS");
        }
    }

}
