public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        LivroFisico livroFisico = new LivroFisico(
                "Dom Casmurro",
                "Machado de Assis",
                256,
                0.5
        );

        Ebook ebook = new Ebook(
                "O Senhor dos Anéis",
                "J. R. R. Tolkien",
                1200,
                15.8
        );

        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);

        System.out.println("=== LIVROS DA BIBLIOTECA ===");
        biblioteca.listarLivros();

        System.out.println("=== BUSCA POR TÍTULO ===");

        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("Dom Casmurro");

        if (livroEncontrado != null) {
            livroEncontrado.descricao();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}