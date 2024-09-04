import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar os 5 nomes
        String[] nomes = new String[5];

        // Laço para ler 5 nomes
        for (int i = 0; i < 5; i++) {
            System.out.println("funcionario 1: joão");
        System.out.println("funcionario 2: vitor");
        System.out.println("funcionario 3: julia");
        System.out.println("funcionario 4: felipe");
        System.out.println("funcionario 5: bafome");
            nomes[i] = scanner.nextLine();
        }

        // Fecha o scanner
        scanner.close();

        // Exibe os nomes lidos
        System.out.println("funcionario 1: joão");
        System.out.println("funcionario 2: vitor");
        System.out.println("funcionario 3: julia");
        System.out.println("funcionario 4: felipe");
        System.out.println("funcionario 5: bafome");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ": " + nomes[i]);
        }
    }
}
