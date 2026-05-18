public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + super.getNome() + ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios() + ", salarioBaseFuncionario="
                + super.getSalarioBaseFuncionario() + ", endereco=" + super.getEndereco() + ", dataFundacao=" + super.getDataFundacao() + ", dataAlvara=" + dataAlvara + " ]";
    }

}
