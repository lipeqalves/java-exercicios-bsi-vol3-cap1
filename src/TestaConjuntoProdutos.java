/**
 * 10. Baseado na classe Programa, crie uma classe TestaConjuntoProdutos
 * que permita que o usuário use o teclado para utilizar todos os recursos da
 * classe ConjuntoProdutos.
 */
import java.util.Scanner;
public class TestaConjuntoProdutos {
    public static void main(String[] args) {
        ConjuntoProdutos produtos = new ConjuntoProdutos();
        Scanner teclado = new Scanner(System.in);
        
        Produto produto = new Produto();
        Fornecedor fornecedor = new Fornecedor();

        System.out.println("Digite o codigo do produto a ser cadastrado: ");
        produto.codigo = teclado.nextInt();
        System.out.println("Digite o nome do produto");
        produto.nome = teclado.next();
        System.out.println("Digite o o valor");
        produto.valor = teclado.nextFloat();

        System.out.println("Digite o nome do fornecedor: ");
        fornecedor.nome = teclado.next();
        System.out.println("Digite o cnpj do fornecedor: ");
        fornecedor.cnpj = teclado.next();

        produto.fornecedor = fornecedor;

        produtos.inserir(produto);
        int codigo;
        float perc;

        System.out.println("Digite o codigo do produto");
        codigo = teclado.nextInt();
        System.out.println("Digite a porcentagem do valor do produto");
        perc = teclado.nextFloat();

        produtos.atualizarPreco(codigo, perc);

        System.out.println("Qual produto vc que vizualizar");

        codigo = teclado.nextInt();
        produtos.mostrar(codigo);


        teclado.close();
    }
}
