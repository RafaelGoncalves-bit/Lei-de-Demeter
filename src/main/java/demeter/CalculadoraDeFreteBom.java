package demeter;

public class CalculadoraDeFreteBom {
    public void calcular(Pedido pedido) {
        // CONFORME A LEI DE DEMETER:
        String cep = pedido.getCepDoCliente();
        // ... lógica de cálculo ...
        System.out.println("CEP obtido conforme Lei de Demeter: " + cep);
    }
}
