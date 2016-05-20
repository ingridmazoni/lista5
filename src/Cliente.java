import java.util.List;
import java.util.Collection;

public class Cliente implements ObservadorCliente {

	private CadastroNacionalDePessoa cpf;

	private String nome;

	private Endereco endereco;

	private String telefone;

	private String email;

	private String login;

	private String senha;

	private List <CartaoCredito> listaCartoes;

	private static int quantClientes;

	private Professor professor;

	private Estudante estudante;

	public void validaSenha() {

	}

	public void atualizar(MsgPromocionalEAvisoDeLancamentos lancamentosEPromocoes) {
		MsgPromocionalEAvisoDeLancamentosConcreto msgPromoEAvisoLanc = (MsgPromocionalEAvisoDeLancamentosConcreto) lancamentosEPromocoes;
		System.out.println(msgPromoEAvisoLanc.visualizarMsgPromocional());
	}

	public CadastroNacionalDePessoa getCpf() {
		return cpf;
	}

	public void setCpf(CadastroNacionalDePessoa cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<CartaoCredito> getListaCartoes() {
		return listaCartoes;
	}

	public void setListaCartoes(List<CartaoCredito> listaCartoes) {
		this.listaCartoes = listaCartoes;
	}

	public static int getQuantClientes() {
		return quantClientes;
	}

	public static void setQuantClientes(int quantClientes) {
		Cliente.quantClientes = quantClientes;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

}
