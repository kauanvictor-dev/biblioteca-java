public class Emprestimo {

    private Usuario usuario;
    private Livro livro;
    private String dataEmprestimo;
    private boolean emprestado;

    public Emprestimo(Usuario usuario, Livro livro, String dataEmprestimo) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.emprestado = false;
    }

    // FUNÇÃO REALIZAR EMPRÉSTIMO...
    
    public String realizarEmprestimo() {

        if (usuario.getIdade() < 18) {
            return "EMPRÉSTIMO NEGADO! USUÁRIO MENOR DE IDADE.";
        }

        if (usuario.getCpf().length() != 11) {
            return "EMPRÉSTIMO NEGADO! CPF INVÁLIDO.";
        }

        if (!livro.emprestar_livro()) {
            return "EMPRÉSTIMO NEGADO! LIVRO INDISPONÍVEL.";
        }

        emprestado = true;

        return "EMPRÉSTIMO REALIZADO COM SUCESSO!";
    }

    // FUNÇÃO DEVOLVER LIVRO...

    public String devolverLivro() {

        if (!emprestado) {
            return "NÃO EXISTE EMPRÉSTIMO ATIVO.";
        }

        livro.devolver_livro();

        emprestado = false;

        return "LIVRO DEVOLVIDO COM SUCESSO!";
    }

    // FUNÇÃO MOSTRAR DADOS DO EMPRÉSTIMO...

    public void mostrarEmprestimo() {

        System.out.println("========= EMPRÉSTIMO =========");
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Data: " + dataEmprestimo);
        System.out.println(livro.mostrarStatus());
        System.out.println("==============================");
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
}