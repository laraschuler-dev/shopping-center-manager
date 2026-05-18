public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;

    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + super.getNome() + ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios()
                + ", salarioBaseFuncionario="
                + super.getSalarioBaseFuncionario() + ", endereco=" + super.getEndereco() + ", dataFundacao="
                + super.getDataFundacao() + ", metaVendas=" + metaVendas + " ]";
    }

}
