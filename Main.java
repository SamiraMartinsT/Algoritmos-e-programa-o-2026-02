//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);
double salario;
double aumento;
double Satual;

    System.out.println("Escreva o salário atual:");
    salario = input.nextInt();
    aumento = salario * 10/100;
    System.out.println("O valor do aumento é de :" + " "+ aumento);
    Satual = salario + aumento;

    System.out.println("O salário reajustado é" + " " + Satual);

}
