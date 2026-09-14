//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);
int mes;

    System.out.println("Digite o número do mês:");
    mes = input.nextInt();

    switch (mes) {
        case 1:
        System.out.println("O MÊS REFERENTE É JANEIRO");
        break;
        case 2:
        System.out.println("O MÊS REFERENTE É FEVEREIRO");
        break;
        case 3:
        System.out.println("O MÊS REFERENTE É MARÇO");
        break;
        case 4:
        System.out.println("O MÊS REFERENTE É ABRIL");
        break;
        case 5:
        System.out.println("O MÊS REFERENTE É MAIO");
        break;
        case 6:
        System.out.println("O MÊS REFERENTE É JUNHO");
        break;
        case 7:
        System.out.println("O MÊS REFERENTE É JULHO");
        break;
        case 8:
        System.out.println("O MÊS REFERENTE É AGOSTO");
        break;
        case 9:
        System.out.println("O MÊS REFERENTE É SETEMBRO");
        break;
        case 10:
        System.out.println("O MÊS REFERENTE É OUTUBRO");
        break;
        case 11:
        System.out.println("O MÊS REFERENTE É NOVEMBRO");
        break;
        case 12:
        System.out.println("O MÊS REFERENTE É DEZEMBRO");
        break;
        default :
            System.out.println("ERRO: número inválido.");
    }
}
