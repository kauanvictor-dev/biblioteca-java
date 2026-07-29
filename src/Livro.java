public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private Boolean status; // Regra a ser criada...

    public Livro (String titulo, String autor, int ano_publicacao, Boolean status) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
        this.status = status;
    }


    // FUNÇÃO EMPRESTAR LIVRO...

    public Boolean emprestar_livro() {
        if (status) {
            status = false; 
            return true;
        }

        return false;
    }

    // FUNÇÃO DEVOLVER LIVRO EMPRESTADO...

    public Boolean devolver_livro() {
        if (!status) {
            status = true; 
            return true;
        }
            return false;
        }

    // FUNÇÃO MOSTRAR Status DO LIVRO... 

    public String mostrarStatus() {
        if (status) {
            return " Status: Livro Disponível!";
        } else {
            return " Status: Livro Indisponível! ( Emprestado a Pouco tempo...";
        }
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

     public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
     public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

     public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
