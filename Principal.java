import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Loja loja = null;
        Produto produto = null;

        int op;

        do {

            System.out.println("Escolha uma das opções: ");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto ");
            System.out.println("(3) sair");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {

                System.out.println("Informe o nome da loja: ");
                String nome = sc.nextLine();

                System.out.println("Informe a quantidade de funcionários: ");
                int quantidadeFuncionarios = sc.nextInt();

                System.out.println("Informe salario Base do Funcionário: ");
                double salarioBaseFuncionario = sc.nextDouble();
                sc.nextLine();

                System.out.println("Informe o Endereço: ");
                System.out.println("Rua: ");
                String rua = sc.nextLine();

                System.out.println("Cidade: ");
                String cidade = sc.nextLine();

                System.out.println("Estado: ");
                String estado = sc.nextLine();

                System.out.println("País: ");
                String pais = sc.nextLine();

                System.out.println("CEP: ");
                String cep = sc.nextLine();

                System.out.println("Número: ");
                String numero = sc.nextLine();

                System.out.println("Complemento: ");
                String complemento = sc.nextLine();

                System.out.println("Informe a data de fundação: ");
                System.out.println("Dia: ");
                int dia = sc.nextInt();
                System.out.println("Mês: ");
                int mes = sc.nextInt();
                System.out.println("Ano: ");
                int ano = sc.nextInt();
                sc.nextLine();

                System.out.println("Informe a quantidade máxima de produtos: ");
                int quantidadeMaximaProdutos = sc.nextInt();
                sc.nextLine();

                Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                Data dataFundacao = new Data(dia, mes, ano);

                loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao,
                        quantidadeMaximaProdutos);

            } else if (op == 2) {

                System.out.println("Informe o nome do produto: ");
                String nome = sc.nextLine();

                System.out.println("Informe o preço do produto: ");
                double preco = sc.nextDouble();
                sc.nextLine();

                System.out.println("Informe a data de validade do produto: ");

                System.out.println("Dia: ");
                int dia = sc.nextInt();
                System.out.println("Mês: ");
                int mes = sc.nextInt();
                System.out.println("Ano: ");
                int ano = sc.nextInt();
                sc.nextLine();

                Data dataValidade = new Data(dia, mes, ano);
                produto = new Produto(nome, preco, dataValidade);

            } else if (op != 3) {
                System.out.println("Opção inválida! Tente novamente");
            }

        } while (op != 3);

        System.out.println("Saindo do menu!");

        if (loja != null) {
            System.out.println(loja);
        } else {
            System.out.println("Não foi criada nenhuma loja");
        }

        if (produto != null) {
            Data data = new Data(20, 10, 2023);
            if (produto.estaVencido(data)) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }
        } else {
            System.out.println("Não foi criado nenhum produto");
        }

        sc.close();
    }
}
