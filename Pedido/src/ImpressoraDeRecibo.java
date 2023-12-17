public class ImpressoraDeRecibo {
    public void imprimirRecibo(Pedido pedido){
        for(Item item : pedido.itens) {
            System.out.println(item.nome + " : " + item.preco);
        }
        System.out.println("Total: " + pedido.calcularValorTotal());
    }
}
