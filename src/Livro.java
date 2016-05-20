import java.util.Date;
import java.util.List;
import java.util.Collection;

public class Livro {

	private String titulo;

	private String isbn;

	private double precoVenda;

	private double precoCusto;

	private double margemDeLucro;

	private FormatoLivro formatoLivro;

	private int numeroPaginas;

	private Date dataPublicacao;

	private int quantidadeEmEstoque;

	private String resumo;

	private String capa;

	private String indice;

	private List<Autor> autor;

	private List<Categoria > categoria ;
	
	private Editora editora;

	private static int quantLivros;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getMargemDeLucro() {
		return margemDeLucro;
	}

	public void setMargemDeLucro(double margemDeLucro) {
		this.margemDeLucro = margemDeLucro;
	}

	public FormatoLivro getFormatoLivro() {
		return formatoLivro;
	}

	public void setFormatoLivro(FormatoLivro formatoLivro) {
		this.formatoLivro = formatoLivro;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public String getIndice() {
		return indice;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public List<Autor> getAutor() {
		return autor;
	}

	public void setAutor(List<Autor> autor) {
		this.autor = autor;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public static int getQuantLivros() {
		return quantLivros;
	}

	public static void setQuantLivros(int quantLivros) {
		Livro.quantLivros = quantLivros;
	}


	
}
