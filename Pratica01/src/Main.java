void main() {
    Scanner scanner = new Scanner(System.in);
    TrianguloRetangulo triangulo = new TrianguloRetangulo();

    System.out.println("Insira o valor dos dois catetos do triangulo: ");
    triangulo.setC1(scanner.nextDouble());
    triangulo.setC2(scanner.nextDouble());

    triangulo.CalculaArea();
    triangulo.CalculaHipotenusa();

    System.out.println("A área do triângulo é " + triangulo.getArea());
    System.out.println("A hipotenusa é igual a " + triangulo.getH());


}