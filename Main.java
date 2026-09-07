//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    double precoU;
    int quanti;
    int codigo;
    double contaT;
    double desconto;

    precoU = 0;
    contaT = 0;

    System.out.println("Informe o código do produto:");
    codigo = input.nextInt();

    System.out.println("Informe a quantidade de produtos:");
    quanti = input.nextInt();

    if (codigo >= 0 && codigo <= 10) {
        precoU = 10;
        contaT = quanti * 10;
        System.out.println("O valor total da compra foi de " + "" + contaT);
    } else if (codigo >= 11 && codigo <= 20) {
        precoU = 15;
        contaT = quanti * 15;
        System.out.println("O valor total da compra foi de " + "" + contaT);
    } else if (codigo >= 21 && codigo <= 30) {
        precoU = 20;
        contaT = quanti * 20;
        System.out.println("O valor total da compra foi de " + "" + contaT);
    } else {
        precoU = 30;
        contaT = quanti * 30;
        System.out.println("O valor total da compra foi de " + "" + contaT);
    }
    contaT = quanti * precoU;

    if (contaT >= 250) {
        desconto = contaT * 5 / 100;
        contaT = contaT - desconto;
        System.out.println("O valor total da compra com o desconto aplicado é;" + contaT);
    } else if (contaT >= 250 && contaT <= 500) {
        desconto = contaT * 10 / 100;
        contaT = contaT - desconto;
        System.out.println("O valor total da compra com o desconto aplicado é;" + contaT);
    } else if (contaT > 500) {
        desconto = contaT * 15 / 100;
        contaT = contaT - desconto;
        System.out.println("O valor total da compra com o desconto aplicado é;" + contaT);
    } else {
        System.out.println("O VALOR DA COMPRA NÃO SE APLICA DESCONTO");

    }
}

