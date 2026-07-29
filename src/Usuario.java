public class Usuario {
    private String nome;
    private int idade;
    private String cpf;

    public Usuario (String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // FUNÇÃO DE IDADE (MAIOR OU MENOR)...

    public String identificacao_idade() {
        if (idade >= 18) {
            return "Acesso Liberado!";
        } else {
            return "Acesso Negado! ( Você precisa ter mais de 17 anos para acessar nosso Sistema.";
        }
    }

    // FUNÇÃO DE CPF ( EXTRA )...
    
    public String identificacao_cpf() {
        if (cpf.length() == 11) {
            return "CPF VALIDADO COM SUCESSO!";
        } else {
            return "Numero de Caracteres Invalidos";
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
