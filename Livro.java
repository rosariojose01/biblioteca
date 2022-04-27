package biblioteca;

public class Livro {
    private String titulo, area, editora, autor;
    private int ano, edicao, paginas;

    public Livro() {
    }

    public Livro(String titulo, String autor, String area, String editora, int ano, int edicao, int paginas) {
        this.titulo = titulo;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.paginas = paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
    
    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }
}
