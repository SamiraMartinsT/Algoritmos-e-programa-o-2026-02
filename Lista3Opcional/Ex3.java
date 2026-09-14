//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int idade;
    double Kg;
    double massaC;
    int dosagem;
    int gotas;

dosagem = 0;

    System.out.println("Qual a sua idade:");
    idade = input.nextInt();
    System.out.println("Qual o seu peso em Kg:");
    Kg = input.nextInt();

    if (idade >= 12 && Kg >= 60) {
        dosagem= 1000;
    }else if (idade >= 12 && Kg <= 60) {
        dosagem = 875;
    }
    if (idade < 12) {
        System.out.println("Qual sua massa corporea?");
        massaC = input.nextDouble();

        if (massaC < 5) {
            System.out.println("VOCÊ NÃO PODE CONSUMIR ESSE MEDICAMENTO");
        } else if (massaC >= 5 && massaC <= 9) {
            dosagem =125;
        } else if (massaC >= 9.1 && massaC <= 16) {
            dosagem = 250;
        } else if (massaC >= 16.1 && massaC <= 24) {
           dosagem = 375;
        } else if (massaC >= 24.1 && massaC <= 30) {
            dosagem = 500;
        } else {
            dosagem = 750;
        }
    } gotas = dosagem *20/500;
    System.out.println("Dosagem: "+ dosagem + "mg");
    System.out.println("Gotas: "+ gotas +" "+ "gotas");

}
