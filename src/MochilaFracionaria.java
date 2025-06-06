import java.util.Arrays;
import java.util.Comparator;

public class MochilaFracionaria {

    public static double resolver(Item[] itens, int capacidade) {
        // Ordenar os itens por valor/peso (decrescente)
        Arrays.sort(itens, Comparator.comparingDouble(Item::getValorPorPeso).reversed());

        double valorTotal = 0.0;
        int capacidadeRestante = capacidade;

        for (Item item : itens) {
            if (item.getPeso() <= capacidadeRestante) {
                capacidadeRestante -= item.getPeso();
                valorTotal += item.getValor();
            } else {
                double fracao = (double) capacidadeRestante / item.getPeso();
                valorTotal += item.getValor() * fracao;
                break;
            }
        }

        return valorTotal;
    }
}
