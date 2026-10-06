//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
   double salario = 0;
        int numerofilhos = 0;
        double somasalarios = 0;
        int qtdePessoas = 0;
        double mediasalarios = 0;
        double somafilhos = 0;
        double mediafilhos = 0;
        double maiorsalario = 0;
        double qtdeMenorSalarioMinimo = 0;
        int continuar = 1;


        while (continuar == 1) {
            System.out.println("Informe seu salário: ");
            salario = input.nextDouble();
            System.out.println("Informe o número de filhos: ");
            numerofilhos = input.nextInt();

            somasalarios = somasalarios + salario;
            somafilhos = somafilhos + numerofilhos;
            qtdePessoas = qtdePessoas + 1;

            if (salario > maiorsalario){
                maiorsalario = salario;
            }

            if (salario <= 1621.0){
                qtdeMenorSalarioMinimo++;
            }


            System.out.println("Deseja continuar? ");
            System.out.println("1 - SIM");
            System.out.println("2 - NAO");
            System.out.println("Selecione uma opção: ");
            continuar = input.nextInt();

        }
        mediasalarios = somasalarios / qtdePessoas;
        System.out.println("A media dos salario é: " + mediasalarios);

        mediafilhos = somafilhos / qtdePessoas;
        System.out.println("A media de filhos é: " + mediafilhos);

        System.out.println("O maior salário é: " + maiorsalario);
        System.out.println("Quantidade de pessoas que " +
                "recebem até 1 salario mínimo " + qtdeMenorSalarioMinimo);
        System.out.println("% de pessoas abaixo de 1 salario minimo: " +
                qtdeMenorSalarioMinimo / qtdePessoas * 100 + "%");
    }
}


