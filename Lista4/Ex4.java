//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int[] Tdia = new int[5];
    double fatutotal=0;
    double mediavendas=0;
    double abaixodamedia;
    double quantabaixo = 0;

    for (int i = 0; i < 5; i++) {
        System.out.println("Digite o valor das vendas do dia " + (i + 1) + ":");
        Tdia[i] = input.nextInt();
        fatutotal += Tdia[i];
    }
        mediavendas = fatutotal / 5;
        System.out.println("O faturamento total acumulado é R$ " + fatutotal);
        System.out.println("A média diária de vendas é de R$ " + mediavendas);


    for (int i = 0; i < 5; i++) {
        if (Tdia[i] < mediavendas) {
            quantabaixo = mediavendas - Tdia[i];
            System.out.printf("Dia %d ficou abaixo da média diária com R$ %.2f%n", i+1, quantabaixo);
        }
    }
}
