package dao;

import classes.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Flávio
 */
public class VendaDAO {
    
    private List<Venda> lista = null;

    public VendaDAO() {
        lista = new ArrayList<Venda>();
    }
    
    public void adicionarVenda(Venda venda)
    {
        lista.add(venda);
    }
    
    public void removerVenda(int numero)
    {
        Venda v = getNumero();
        if(v != null)
        {
            lista.remove(v);
        }
    }
    
    public void alterarVenda(Venda venda)
    {        
        Venda v ;
        int ind = lista.indexOf(cli);
        lista.set(ind,cliente);  
    }
    
    public Cliente buscarCliente(String cpf)
    {
        Venda v = null;
        for(Venda venda: lista)
        {
            if(venda.().equals(cpf))
                v = venda;
        }
        return v;
    }
    
    public List<Venda> todosClientes()
    {
        return lista;
    }
    
}
