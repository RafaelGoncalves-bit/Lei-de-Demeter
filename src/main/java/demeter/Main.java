package demeter;

public class Main {
    public static void main(String[] args) {
        // Criar objetos
        Endereco endereco = new Endereco("12345-678");
        Cliente cliente = new Cliente(endereco);
        Pedido pedido = new Pedido(cliente);

        // Exemplo bom (conforme Lei de Demeter)
        CalculadoraDeFreteBom calcBom = new CalculadoraDeFreteBom();
        calcBom.calcular(pedido);

        // Exemplo ruim (violação da Lei de Demeter)
        CalculadoraDeFreteRuim calcRuim = new CalculadoraDeFreteRuim();
        calcRuim.calcular(pedido);
    }
}
