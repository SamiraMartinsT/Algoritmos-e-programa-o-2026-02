//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    
Scanner input = new Scanner (System.in);
double altura;
double peso;
double IMC;
    System.out.println("Digite seu peso em Kg: ");
    peso =  input.nextInt();
    System.out.println("Digite sua altura em metros:" );
    altura = input.nextInt();

    IMC = peso/altura * altura;
    System.out.println("O IMC calculado foi:"+ " "+ IMC);
}
