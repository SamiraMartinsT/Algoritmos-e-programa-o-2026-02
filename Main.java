//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input= new Scanner (System.in);
int numero=0;
long fatorial=1;
    System.out.println("Digite um número inteiro:");
    numero = input.nextInt();

    for (int i = numero; i >=1; i-- ) {
        fatorial = fatorial *i ;

    } System.out.println( "O fatorial é:");
    System.out.println( fatorial );
}
