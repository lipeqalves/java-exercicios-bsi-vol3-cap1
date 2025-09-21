/**
 * 5.Crie uma classe TesteProduto. No método main desta classe, instancie três
 * produtos e dois fornecedores de acordo com o esquema a seguir.
 *
 * 6. Modifique a classe TesteProduto e conceda um aumento de 15% nos dois
 * produtos. Utilize o método atualizarPreco para esta operação.
 */
public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Fornecedor fornecedor1 = new Fornecedor();
        Fornecedor fornecedor2 = new Fornecedor();

        fornecedor1.cnpj = "1234321";
        fornecedor1.nome = "Zé Maria";

        fornecedor2.cnpj = "543212345";
        fornecedor2.nome = "Cláudio";

        produto1.codigo = 1;
        produto1.nome = "TV LCD";
        produto1.valor = 3500f;
        produto1.fornecedor = fornecedor1;
        produto1.atualizarPreco(15);

        produto2.codigo = 2;
        produto2.nome = "Notebook";
        produto2.valor = 2000f;
        produto2.fornecedor = fornecedor2;
        produto2.atualizarPreco(15);


        produto3.codigo = 3;
        produto3.nome = "Impressora";
        produto3.valor = 232f;
        produto3.fornecedor = fornecedor2;

        System.out.println("Produto   | " + " Codigo | " + " Valor | " + " Fornecdido | " + " CNPJ    | ");
        System.out.println("" + produto1.nome + "    |" + produto1.codigo + "        |"
                + produto1.valor + "  |  " + produto1.fornecedor.nome + "   | "
                + produto1.fornecedor.cnpj + "  |");
        System.out.println("" + produto2.nome + "  |" + produto2.codigo + "        |"
                + produto2.valor + "  |  " + produto2.fornecedor.nome + "    | "
                + produto2.fornecedor.cnpj + "|");
        System.out.println("" + produto3.nome + "|" + produto3.codigo + "        |"
                + produto3.valor + "   |  " + produto3.fornecedor.nome + "    | "
                + produto3.fornecedor.cnpj + "|");

    }
}
