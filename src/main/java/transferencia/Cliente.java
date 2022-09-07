package transferencia;

public class Cliente {
    //visibilida | tipo | nome do objeto
    private String nome;
    private String cpf;
    private String rg;

    //construtor
    public Cliente(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}

