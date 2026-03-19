import java.util.Scanner;
import java.time.LocalDate;


void main() {
    Scanner scanner = new Scanner(System.in);
    Pessoa pessoas[] = new Pessoa[10];
    int count = 0;
    int idade = 0;
    LocalDate hoje = LocalDate.now();
    Data hojeData = new Data(hoje.getDayOfMonth(),hoje.getMonthValue(),hoje.getYear());

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
        pessoas[count-1].CalculaIMC();
    }while(count < 10);

    for(int i = 0; i < count; i++){
        System.out.println("Cadastro " + i+1 +":");
        System.out.println("Nome completo: " + pessoas[i].getNome() + pessoas[i].getSobrenome());
        System.out.println("Nome de referencia: " + pessoas[i].getSobrenome() + pessoas[i].getNome().toUpperCase());
        idade = pessoas[i].CalculaIdade(hojeData);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + pessoas[i].getPeso());
        System.out.println("Altura: " + pessoas[i].getAltura());
        System.out.println("IMC: " + pessoas[i].getIMC());
        pessoas[i].InformaObesidade();

    }
}