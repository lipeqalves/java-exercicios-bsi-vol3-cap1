/**
 * 1. Implemente em Java uma classe que represente um produto. Um produto tem
 * como atributos um código (um inteiro), um nome (uma string) e um valor (um
 * float).
 * -----------------------------------------------------------------
 * 3. Modifique a classe Produto implementada na questão 1 e faça com que cada
 * produto tenha uma associação com um fornecedor. Em outras palavras, crie um
 * atributo fornecedor (do tipo Fornecedor) na classe Produto.
 */
public class Produto {
    int codigo;
    String nome;
    float valor;
    Fornecedor fornecedor;

    void atualizarPreco(float perc) {
         valor = valor * (1 + perc/100);
    }
}
