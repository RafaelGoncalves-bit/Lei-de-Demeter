package demeter;

public class Cliente {
    private Endereco endereco;

    // Construtor
    public Cliente(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return endereco.getCep();
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
