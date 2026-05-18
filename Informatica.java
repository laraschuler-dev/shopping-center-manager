public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + super.getNome() + ", quantidadeFuncionarios=" + super.getQuantidadeFuncionarios()
                + ", salarioBaseFuncionario="
                + super.getSalarioBaseFuncionario() + ", endereco=" + super.getEndereco() + ", dataFundacao="
                + super.getDataFundacao() + ", seguroEletronicos=" + seguroEletronicos + " ]";
    }

}
