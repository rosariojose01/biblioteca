package biblioteca;

public class Emprestimo {
    private String data, hora;
    private Usuario usuario;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(String data, String hora, Usuario usuario, Livro livro) {
        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
        this.livro = livro;
    }
    
    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }    

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
    public void mostrarEmprestimo(){
        System.out.println("**** Empréstimo ****");
        System.out.println("Usuario: " +this.getUsuario().getNome());
        System.out.println("Data: " +this.getData());
        System.out.println("Hora: " +this.getHora());
        System.out.println("Livro: " +this.getLivro().getTitulo());
        System.out.println("\n");
    }
}
