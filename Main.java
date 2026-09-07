//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);
double renda;
double prestacao;


    System.out.println("Digite sua renda mensal:");
    renda = input.nextDouble();
    System.out.println("Digite o valor da prestação mensal:");
    prestacao = input.nextDouble();

    if (prestacao > renda * 0.3) {
        System.out.println("FINANCIAMENTO NEGADO POR BAIXA RENDA");
    } else if (prestacao >3000 && renda < 10000) {
        System.out.println("FINANCIAMENTO NEGADO POR ALTA PRESTAÇÃO");
    }else {
        System.out.println("FINANCIAMENTO APROVADO");
    }

}
