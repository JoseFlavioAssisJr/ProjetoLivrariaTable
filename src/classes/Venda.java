package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author José Flávio
 */
public class Venda {
    private static int numero;
    private Cliente cliente;
    private List<Item> lista;
    private float valorTotal;    
    private Date data;

    public Venda() {
        lista = new ArrayList<Item>();
        numero ++;
        
        data = new Date();
    }
    
    public void adicionarItem(Item item){
        lista.add(item);
    }
    
    public Item buscarItem(int codigo){
        Item it = null;
        for(Item i: lista){
            if (codigo == i.getLivro().getCodigo())
                it = i;
        }
        return it;
    }
    
    public void removerItem(int codigo){
        Item i = buscarItem(codigo);
        if(i != null){
            lista.remove(i);
        }
    }
    
    public void calcularTotalVenda(){
        float soma = 0;
        for(Item i : lista){
            soma += i.getValorDoItem();
        }
        this.valorTotal = soma;
    }
    
    @Override
    public String toString(){
        String str = "";
        str += "---------- Dados da venda "+ numero + " ----------";
        str += "\nData da venda: " +getData();
        str += "\nCPF do cliente: " +cliente.getCpf();
        str += "\nNome do Cliente: " + cliente.getNome();
        for(Item i : lista){
            str += i.toString();
        }
        str += "\nValor Total = R$" + valorTotal;
         return str;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Venda.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getData() {
        
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM//yyyy");
        String dt = fm.format(data);
        
        return dt;
    }
}
