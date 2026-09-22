//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    String senha = "0";
    String resposta;
    int tentativas;
    tentativas = 1;

    System.out.println("Digite a senha de quatro digitos:");
    senha = input.nextLine();

    while (!senha.equals("1985")) {
        System.out.println("SENHA INCORRETA, ACESSO  NEGADO!");
        System.out.println("Digite a senha novamente:");
        tentativas++;
        senha = input.nextLine();
    }

    System.out.println("ACESSO AUTORIZADO! BEM-VINDO(A)");
    System.out.println("Tentativas = "+ tentativas );
}
