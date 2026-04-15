package demeter;

public class Pedido {
    private Cliente cliente;

    // Construtor
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    // Delegação protege o encapsulamento
    public String getCepDoCliente() {
        return this.cliente.getCep();
    }

    public Cliente getCliente() {
        return cliente;
    }
}
