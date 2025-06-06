import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a capacidade da mochila: ");
        int capacidade = scanner.nextInt();

        System.out.print("Digite o número de itens: ");
        int n = scanner.nextInt();

        Item[] itens = new Item[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Item " + (i + 1) + ":");
            System.out.print("  Valor: ");
            int valor = scanner.nextInt();
            System.out.print("  Peso: ");
            int peso = scanner.nextInt();
            itens[i] = new Item(valor, peso);
        }

        double resultado = MochilaFracionaria.resolver(itens, capacidade);

        System.out.println("\nValor máximo que pode ser carregado: " + resultado);

        scanner.close();
    }
}
