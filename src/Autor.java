import java.util.Date;
import java.util.Collection;

public class Autor {

	private String nome;

	private Date dataNascimento;

	private Date dataFalecimento;

	private LocalComponent cidadeNascimento;

	private LocalComponent cidadeFalecimento;

	private String resumoBiografia;

	private int quantAutores;

	private static int getQuantAutores;

	private LocalComponent localComponent;

	
	public int getQuantAutores() {
		return quantAutores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataFalecimento() {
		return dataFalecimento;
	}

	public void setDataFalecimento(Date dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}

	public LocalComponent getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(LocalComponent cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public LocalComponent getCidadeFalecimento() {
		return cidadeFalecimento;
	}

	public void setCidadeFalecimento(LocalComponent cidadeFalecimento) {
		this.cidadeFalecimento = cidadeFalecimento;
	}

	public String getResumoBiografia() {
		return resumoBiografia;
	}

	public void setResumoBiografia(String resumoBiografia) {
		this.resumoBiografia = resumoBiografia;
	}

	public static int getGetQuantAutores() {
		return getQuantAutores;
	}

	public static void setGetQuantAutores(int getQuantAutores) {
		Autor.getQuantAutores = getQuantAutores;
	}

	public LocalComponent getLocalComponent() {
		return localComponent;
	}

	public void setLocalComponent(LocalComponent localComponent) {
		this.localComponent = localComponent;
	}

	public void setQuantAutores(int quantAutores) {
		this.quantAutores = quantAutores;
	}
	

}
