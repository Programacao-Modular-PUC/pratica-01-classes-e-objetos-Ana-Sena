import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    Pessoa pessoas[] = new Pessoa[10];
    int count = 0;

    for (int i = 0; i < 10; i++){
        pessoas[i] = new Pessoa();
    }

    do {
        count++;
        System.out.println("Insira seu nome: ");
        pessoas[count - 1].setNome(scanner.nextLine());

        System.out.println("Insira seu sobrenome: ");
        pessoas[count - 1].setSobrenome(scanner.nextLine());

        if(count > 1 && pessoas[count-1].equals(pessoas[count-2])) {
            System.out.println("Nome e sobrenome repetidos!");
            break;
        }

        System.out.println("Insira sua altura e peso: ");
        pessoas[count-1].setAltura(scanner.nextDouble());
        pessoas[count-1].setPeso(scanner.nextDouble());

        System.out.println("Insira sua data de nascimento");
        System.out.println("Dia:");
        int dia = scanner.nextInt();

        System.out.println("Mês:");
        int mes = scanner.nextInt();

        System.out.println("Ano:");
        int ano = scanner.nextInt();
        scanner.nextLine();

        pessoas[count-1].setData_nasc(new Data(dia, mes, ano));
    }while(count <= 10);

    for(int i = 0; i < count; i++){
        System.out.println()
        System.out.println("Seu IMC e: " + pessoas[i].getIMC());
    }

    //Cadastro 1:
    //Nome completo: Jos´e Oliveira Silva
    //Nome de referˆencia: Oliveira Silva, JOS´E
    //Idade: (valor idade)
    //Peso: (valor peso)
    //Altura: (valor altura)
    //IMC: (valor IMC)
    //Classifica¸c˜ao: (classifica¸c˜ao corporal)

}