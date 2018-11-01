package classes;

/**
 *
 * @author José Flávio
 */
public class Item {
    private Livro livro;
    private int quantidade;
    private float valorDoItem;

    public Item(Livro livro) {
        this.livro = livro;
    }

    public Item() {
    }
    
    public void calcularValorItem(){
        this.valorDoItem = quantidade*livro.getValor();
    }
    
    public String toString(){
        String str = "";
        str += "---------- Livro de código "+ livro.getCodigo() + " ----------";
        str += "\nTítulo: " +livro.getTitulo();
        str += "\nEditora: " +livro.getFornecedor();
        str += "\nValor Unitário: " +livro.getValor();
        str += "\nQuantidade: " + quantidade + " - Valor do Item: R$" +valorDoItem;
        
        return str;

    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorDoItem() {
        return valorDoItem;
    }

    public void setValorDoItem(float valorDoItem) {
        this.valorDoItem = valorDoItem;
    }
}
