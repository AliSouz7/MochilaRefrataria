public class Item {
    private int valor;
    private int peso;

    public Item(int valor, int peso) {
        this.valor = valor;
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    public double getValorPorPeso() {
        return (double) valor / peso;
    }
}
