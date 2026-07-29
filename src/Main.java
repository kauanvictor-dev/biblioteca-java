public class Main {

    public static void main(String[] args) {

        // -- USUÁRIOS --

        Usuario usuario01 = new Usuario(
                "Kauan",
                18,
                "11122233344");

        Usuario usuario02 = new Usuario(
                "Maria",
                25,
                "55566677788");

        Usuario usuario03 = new Usuario(
                "João",
                16,
                "12345678901");


        //-- LIVROS --

        Livro livro01 = new Livro(
                "Java POO",
                "Deitel",
                2022,
                true);

        Livro livro02 = new Livro(
                "Clean Code",
                "Robert C. Martin",
                2008,
                true);

        Livro livro03 = new Livro(
                "Estrutura de Dados",
                "Loiane Groner",
                2020,
                true);


        // -- EMPRÉSTIMOS --

        Emprestimo emprestimo01 = new Emprestimo(
                usuario01,
                livro01,
                "29/07/2026");

        Emprestimo emprestimo02 = new Emprestimo(
                usuario02,
                livro02,
                "29/07/2026");

        Emprestimo emprestimo03 = new Emprestimo(
                usuario03,
                livro03,
                "29/07/2026");


        // -- DADOS DOS USUÁRIOS --

        System.out.println("========== USUÁRIOS ==========");

        System.out.println(usuario01.getNome());
        System.out.println(usuario01.identificacao_idade());
        System.out.println(usuario01.identificacao_cpf());

        System.out.println();

        System.out.println(usuario02.getNome());
        System.out.println(usuario02.identificacao_idade());
        System.out.println(usuario02.identificacao_cpf());

        System.out.println();

        System.out.println(usuario03.getNome());
        System.out.println(usuario03.identificacao_idade());
        System.out.println(usuario03.identificacao_cpf());



        // -- EMPRÉSTIMO 01 --

        System.out.println("\n========== EMPRÉSTIMO 01 ==========");

        System.out.println(emprestimo01.realizarEmprestimo());

        emprestimo01.mostrarEmprestimo();



        // -- EMPRÉSTIMO 02 --

        System.out.println("\n========== EMPRÉSTIMO 02 ==========");

        System.out.println(emprestimo02.realizarEmprestimo());

        emprestimo02.mostrarEmprestimo();



        //-- EMPRÉSTIMO 03 --

        System.out.println("\n========== EMPRÉSTIMO 03 ==========");

        System.out.println(emprestimo03.realizarEmprestimo());

        emprestimo03.mostrarEmprestimo();



        // -- DEVOLUÇÃO --

        System.out.println("\n========== DEVOLUÇÃO ==========");

        System.out.println(emprestimo01.devolverLivro());

        emprestimo01.mostrarEmprestimo();



        // -- STATUS DOS LIVROS --

        System.out.println("\n========== STATUS DOS LIVROS ==========");

        System.out.println(livro01.getTitulo() + livro01.mostrarStatus());
        System.out.println(livro02.getTitulo() + livro02.mostrarStatus());
        System.out.println(livro03.getTitulo() + livro03.mostrarStatus());

    }
}