import java.util.Collection;
import java.util.List;

public class Editora {

	private CadastroNacionalDePessoa cnpj;

	private String nome;

	private String endereco;

	private int numero;

	private String cep;

	private String estado;

	private String cidade;

	private String telefone;

	private String email;

	private String site;

	private static int quantEditora;

	public CadastroNacionalDePessoa getCnpj() {
		return cnpj;
	}

	public void setCnpj(CadastroNacionalDePessoa cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public static int getQuantEditora() {
		return quantEditora;
	}

	public static void setQuantEditora(int quantEditora) {
		Editora.quantEditora = quantEditora;
	}

	
}
