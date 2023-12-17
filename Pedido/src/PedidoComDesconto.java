public class PedidoComDesconto extends Pedido {
    private double desconto;
    public PedidoComDesconto(double desconto){
        this.desconto = desconto;
    }

    @Override
    public double calculaValorTotal(){
        double total = super.calcularValorTotal();
        return total - (total * desconto / 100);
    }

}


