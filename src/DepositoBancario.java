import java.util.Date;

public class DepositoBancario {

	private String nomeDepositante;

	private Date dataDeposito;

	private Date horaDeposito;

	private int terminal;

	private int numTransacaoOuDocumento;

	private int numAgenciaRemetente;

	private double valorDepositado;

	public String getNomeDepositante() {
		return nomeDepositante;
	}

	public void setNomeDepositante(String nomeDepositante) {
		this.nomeDepositante = nomeDepositante;
	}

	public Date getDataDeposito() {
		return dataDeposito;
	}

	public void setDataDeposito(Date dataDeposito) {
		this.dataDeposito = dataDeposito;
	}

	public Date getHoraDeposito() {
		return horaDeposito;
	}

	public void setHoraDeposito(Date horaDeposito) {
		this.horaDeposito = horaDeposito;
	}

	public int getTerminal() {
		return terminal;
	}

	public void setTerminal(int terminal) {
		this.terminal = terminal;
	}

	public int getNumTransacaoOuDocumento() {
		return numTransacaoOuDocumento;
	}

	public void setNumTransacaoOuDocumento(int numTransacaoOuDocumento) {
		this.numTransacaoOuDocumento = numTransacaoOuDocumento;
	}

	public int getNumAgenciaRemetente() {
		return numAgenciaRemetente;
	}

	public void setNumAgenciaRemetente(int numAgenciaRemetente) {
		this.numAgenciaRemetente = numAgenciaRemetente;
	}

	public double getValorDepositado() {
		return valorDepositado;
	}

	public void setValorDepositado(double valorDepositado) {
		this.valorDepositado = valorDepositado;
	}

	

}
