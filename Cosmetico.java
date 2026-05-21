public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome,
                 int quantidadeFuncionarios,
                 double salarioBaseFuncionario,
                 Endereco endereco,
                 Data dataFundacao,
                 double taxaComercializacao,
                 int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
public String toString() {
    return "Cosmetico {" +
            "\n nome = " + super.getNome() +
            "\n quantidadeFuncionarios = " + super.getQuantidadeFuncionarios() +
            "\n salarioBaseFuncionario = " + super.getSalarioBaseFuncionario() +
            "\n endereco = " + super.getEndereco() +
            "\n dataFundacao = " + super.getDataFundacao() +
            "\n taxaComercializacao = " + taxaComercializacao +
            "\n}";
}

}
