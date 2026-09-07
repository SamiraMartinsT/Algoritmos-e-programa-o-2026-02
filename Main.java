//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);
double graus;
String resposta;

    System.out.println("Digite a temperatura em graus Celsius:");
    graus = input.nextDouble();

    input.skip(("\\R"));

    System.out.println("Você quer converter para Fahrenheit ou Kelvin?");
    System.out.println("[1] Fahrenheit  [2] Kelvin");
    resposta = input.nextLine();

    if (resposta.equals ("1")) {
        graus = graus * 1.8 + 32;
        System.out.println("A temperatura em Fahrenheit é:" + "" + graus);
    }else if (resposta.equals("2")) {
        graus = graus + 273.15;
        System.out.println("A temperatura em Kelvin é:" + "" + graus);
    } else {
        System.out.println("Esta opção é inválida.");

     }
}
