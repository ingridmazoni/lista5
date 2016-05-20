import java.util.Collection;
import java.util.List;

public class CartaoCredito {

	private String nomeTitular;

	private String númeroCartao;

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

	public String getNúmeroCartao() {
		return númeroCartao;
	}

	public void setNúmeroCartao(String númeroCartao) {
		this.númeroCartao = númeroCartao;
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
