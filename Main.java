//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);
int idade;
int idadeMe;

    System.out.println("Qual sua idade?");
    idade = input.nextInt();
    idadeMe = idade *12;

    System.out.println("Sua idade em meses é: "+ ""+ idadeMe);
}
