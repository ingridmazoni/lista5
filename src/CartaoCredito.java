import java.util.Collection;
import java.util.List;

public class CartaoCredito {

	private String nomeTitular;

	private String n�meroCartao;

	private String validade;

	private String digitosDeSeguranca;

	private Bandeira bandeira;

	public Boolean efetuarAnaliseDeCredito() {
		return null;
	}

	public Boolean efetuarAprovacaoDePagamento() {
		return null;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getN�meroCartao() {
		return n�meroCartao;
	}

	public void setN�meroCartao(String n�meroCartao) {
		this.n�meroCartao = n�meroCartao;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getDigitosDeSeguranca() {
		return digitosDeSeguranca;
	}

	public void setDigitosDeSeguranca(String digitosDeSeguranca) {
		this.digitosDeSeguranca = digitosDeSeguranca;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	
	

}
