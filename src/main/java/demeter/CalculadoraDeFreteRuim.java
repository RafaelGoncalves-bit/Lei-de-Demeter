package demeter;

public class CalculadoraDeFreteRuim {
    public void calcular(Pedido pedido) {
        // VIOLAÇÃO DA LEI DE DEMETER:
        String cep = pedido.getCliente().getEndereco().getCep();
        // ... lógica de cálculo usando o CEP ...
        System.out.println("CEP obtido violando Lei de Demeter: " + cep);
    }
}