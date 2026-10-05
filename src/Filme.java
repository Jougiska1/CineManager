public class Filme {
    private int idFilme;
    private String titulo;
    private String genero;
    private int anoLancamento;
    private double valorLocacao;
    private int quantidadeEstoque;

    public int getIdFilme() { return idFilme; }
    public void setIdFilme(int idFilme) { this.idFilme = idFilme; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = anoLancamento; }

    public double getValorLocacao() { return valorLocacao; }
    public void setValorLocacao(double valorLocacao) { this.valorLocacao = valorLocacao; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }
}