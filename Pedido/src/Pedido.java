import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    List<Item> itens = new ArrayList<>();
    public void adicionarItem(String nome, double preco){
        this.itens.add(new Item(nome, preco));
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for(Item item : itens){
            total +=item.preco;
        }
        return total;
    }

    public abstract double calculaValorTotal();
}
