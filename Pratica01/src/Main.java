void main() {
    Scanner scanner = new Scanner(System.in);
    Pessoa pessoa1 = new Pessoa();

    System.out.println("Insira seu nome: ");
    pessoa1.setNome(scanner.nextLine());

    System.out.println("Insira seu sobrenome: ");
    pessoa1.setSobrenome(scanner.nextLine());

    System.out.println("Insira sua idade, altura e peso: ");
    pessoa1.setIdade(scanner.nextInt());
    pessoa1.setAltura(scanner.nextDouble());
    pessoa1.setPeso(scanner.nextDouble());

    pessoa1.CalculaIMC();
    System.out.println("Seu IMC e: " + pessoa1.getIMC());
    pessoa1.InformaObesidade();

}