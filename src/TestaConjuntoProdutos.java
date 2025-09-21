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
        int opcao = 1;
        Produto produto = new Produto();
        Fornecedor fornecedor = new Fornecedor();

        do{
            System.out.println("\n===== MENU DE PRODUTO =====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Vizualizar Produto");
            System.out.println("4 - Atualizar Produto");
            System.out.println("5 - Atualizar Preço do Produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            int codigo;
            float perc;
            switch (opcao) {
                case 1:
                    System.out.println("Digite o codigo do produto a ser cadastrado: ");
                    produto.codigo = teclado.nextInt();
                    System.out.println("Digite o nome do produto");
                    produto.nome = teclado.next();
                    System.out.println("Digite o valor");
                    produto.valor = teclado.nextFloat();

                    System.out.println("Digite o nome do fornecedor: ");
                    fornecedor.nome = teclado.next();
                    System.out.println("Digite o cnpj do fornecedor: ");
                    fornecedor.cnpj = teclado.next();

                    produto.fornecedor = fornecedor;

                    produtos.inserir(produto);
                    break;
                case 2:
                    System.out.println("Codigo do produto que vai ser removido: ");
                    codigo = teclado.nextInt();
                    produtos.remover(codigo);
                    break;
                case 3:
                    System.out.println("Qual produto vc que vizualizar");
                    codigo = teclado.nextInt();
                    produtos.mostrar(codigo);
                    break;
                case 4:
                    System.out.println("Digite o codigo do produto a ser atualizado: ");
                    produto.codigo = teclado.nextInt();
                    System.out.println("Digite o nome do produto");
                    produto.nome = teclado.next();
                    System.out.println("Digite o valor");
                    produto.valor = teclado.nextFloat();

                    System.out.println("Digite o nome do fornecedor: ");
                    fornecedor.nome = teclado.next();
                    System.out.println("Digite o cnpj do fornecedor: ");
                    fornecedor.cnpj = teclado.next();

                    produto.fornecedor = fornecedor;

                    produtos.atualizar(produto);
                    break;
                case 5:
                    System.out.println("Digite o codigo do produto para atualizar o preço");
                    codigo = teclado.nextInt();
                    System.out.println("Digite a porcentagem do valor do produto");
                    perc = teclado.nextFloat();
                    produtos.atualizarPreco(codigo, perc);
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Incorreta! Escolha uma das opções do menu!\n");
                    break;
            }
        }while(opcao!=0);
        teclado.close();
    }
}
