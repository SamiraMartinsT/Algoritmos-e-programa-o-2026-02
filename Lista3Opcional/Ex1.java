//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner (System.in);
double x;
double fx;
    System.out.println("Digite o valor de X: ");
    x = input.nextDouble();

    if (x <= 1) {
        fx = 1;
        System.out.println("f(x)= " + "" + fx);
    } else if (x > 1 && x <=2) {
        fx = 2;
        System.out.println("f(x)= " + "" + fx);
    } else if (x >2 && x<=3 ) {
        fx = x * x;
        System.out.println("f(x)= "+ "" + fx);
    } else {
        fx = x * x * x;
        System.out.println("f(x)= "+ ""+ fx);
    }

}
