public class Produto {
    private String nome;
    private double preco;
    public Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: [nome: " + nome + ", preço: R$ " + preco + "]";
    }

    public boolean estaVencido(Data data) {
        if (data.getAno() > this.dataValidade.getAno()) {
            return true;
        } else if (data.getAno() < this.dataValidade.getAno()) {
            return false;
        } else {
            if (data.getMes() > this.dataValidade.getMes()) {
                return true;
            } else if (data.getMes() < this.dataValidade.getMes()) {
                return false;
            } else {
                if (data.getDia() > this.dataValidade.getDia()) {
                    return true;
                } else {
                    return false;
                }

            }

        }

    }

}
