import java.util.Arrays;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {

        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
public String toString() {
    return "Shopping [nome=" + nome
            + ", endereco=" + endereco
            + ", lojas=" + Arrays.toString(lojas)
            + "]";
}

    public boolean insereLoja(Loja loja) {

        for (int i = 0; i < lojas.length; i++) {

            if (lojas[i] == null) {

                lojas[i] = loja;

                return true;
            }
        }

        return false;
    }

    public boolean removeLoja(String nomeLoja) {

        for (int i = 0; i < lojas.length; i++) {

            if (lojas[i] != null &&
                    lojas[i].getNome().equals(nomeLoja)) {

                lojas[i] = null;

                return true;
            }
        }

        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {

        int contador = 0;

        for (int i = 0; i < lojas.length; i++) {

            if (lojas[i] != null) {

                if (tipoLoja.equals("Cosmético") &&
                        lojas[i] instanceof Cosmetico) {

                    contador++;

                } else if (tipoLoja.equals("Vestuário") &&
                        lojas[i] instanceof Vestuario) {

                    contador++;

                } else if (tipoLoja.equals("Bijuteria") &&
                        lojas[i] instanceof Bijuteria) {

                    contador++;

                } else if (tipoLoja.equals("Alimentação") &&
                        lojas[i] instanceof Alimentacao) {

                    contador++;

                } else if (tipoLoja.equals("Informática") &&
                        lojas[i] instanceof Informatica) {

                    contador++;
                }
            }
        }

        if (!tipoLoja.equals("Cosmético") &&
                !tipoLoja.equals("Vestuário") &&
                !tipoLoja.equals("Bijuteria") &&
                !tipoLoja.equals("Alimentação") &&
                !tipoLoja.equals("Informática")) {

            return -1;
        }

        return contador;
    }

    public Informatica lojaSeguroMaisCaro() {

        Informatica lojaMaisCara = null;

        for (int i = 0; i < lojas.length; i++) {

            if (lojas[i] instanceof Informatica) {

                Informatica lojaInfo = (Informatica) lojas[i];

                if (lojaMaisCara == null ||
                        lojaInfo.getSeguroEletronicos() > lojaMaisCara.getSeguroEletronicos()) {

                    lojaMaisCara = lojaInfo;
                }
            }
        }

        return lojaMaisCara;
    }
}