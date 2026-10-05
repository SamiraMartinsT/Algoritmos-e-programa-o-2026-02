//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);

    int[] Tdia = new int[5];
    double TTOTAL = 0;
    double media = 0;
    for (int i = 0; i < 5; i++) {
        System.out.println("Digite a temperatura do dia " + (i+1));
        Tdia [i] = input.nextInt();
        TTOTAL += Tdia[i];

    }
    media = TTOTAL / 5;
    System.out.println("Temperatura média: " + media);

    System.out.println("Dias com temperatura acima da média:");
    for (int i = 0; i <  5; i++)
        if (Tdia[i] > media) {
            System.out.println("Dia "+ (i+1) + ": "+ Tdia[i]);

        }


}
