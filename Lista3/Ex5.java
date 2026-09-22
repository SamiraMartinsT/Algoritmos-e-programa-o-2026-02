//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);
int N;
int resultado;
resultado=0;
    System.out.println("Você gostaria de ver a tabuada de qual número? ");
    N= input.nextInt();


        for (int i = 1; i <= 10; i++) {
            resultado = N * i;
            System.out.println(N + "x" + i + "=" + resultado);

    }

}
