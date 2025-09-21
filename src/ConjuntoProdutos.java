/**
 * 9. Baseado na classe BancoContas do capítulo, crie uma classe chamada
ConjuntoProdutos que contenha um array que possa guardar até 100
produtos e forneça métodos que permitam inserir, remover, atualizar, mostrar e
atualizar o preço dos produtos. O conjunto não deve permitir que produtos com o
mesmo código sejam cadastrados no conjunto.
 */
public class ConjuntoProdutos {
    Produto[] produtos;
    int indice;
    ConjuntoProdutos(){
        produtos = new Produto[100];
        indice = 0;
    }
    int getIndice(int codigo){
        int n;
        boolean achou = false;
        int i = 0;
        while((!achou) && (i < indice)){
            n = produtos[i].codigo;
            if(n == codigo){
                achou = true;
            }else {
                i = i + 1;
            }
        }
        return i;
    }
    void inserir(Produto produto){
        int i = getIndice(produto.codigo);
        if (i == indice){
            produtos[indice] = produto;
            indice = indice + 1;
            System.out.println("Cadastro realizado com sucesso");
        }else{
            System.out.println("Produto já cadastrada");
        }
    }
    void atualizar(Produto produto){
        int i = getIndice(produto.codigo);
        if(i == indice){
            System.out.println("Produto não existe");
        }else{
            produtos[i] = produto;
            System.out.println("Produto atualizado com sucesso");
        }
    }
    void remover(int codigo){
        int i = getIndice(codigo);
        if(i == indice){
            System.out.println("Produto inexistente");
        }else{
            produtos[i] = produtos[indice - 1];
            indice = indice - 1;
            System.out.println("Produto removida com sucesso");
        }
    }
    void mostrar(int codigo){
        int i = getIndice(codigo);
        if(i == indice){
            System.out.println("Produto inexistente");
        }else{
            System.out.println("Produto   | " + " Codigo | " + " Valor | " + " Fornecdido | " + " CNPJ    | ");
            System.out.println("" + produtos[i].nome + "    |" + produtos[i].codigo + "        |"
                + produtos[i].valor + "  |  " + produtos[i].fornecedor.nome + "   | "
                + produtos[i].fornecedor.cnpj + "  |");
        }
    }
    void atualizarPreco(int codigo, float perc){
        int i = getIndice(codigo);
        if(i == indice){
            System.out.println("Produto inexistente");
        }else{
            produtos[i].valor = produtos[i].valor * (1 + perc/100);
            System.out.println("Preço do produto atualizado com sucesso");
        }
    }
}
