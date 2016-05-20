import java.util.List;
import java.util.Date;


public class Pedido {

	private List<Item> itens;

	private Date dataPedido;

	private Endereco enderecoEntrega;

	private Cliente cliente;

	private CartaoCredito cartao;

	private Status statusPedido;

	private DepositoBancario depositoBancario;

	private double totalDoPedido;

	private static int quantPedidos;

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CartaoCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoCredito cartao) {
		this.cartao = cartao;
	}

	public Status getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(Status statusPedido) {
		this.statusPedido = statusPedido;
	}

	public DepositoBancario getDepositoBancario() {
		return depositoBancario;
	}

	public void setDepositoBancario(DepositoBancario depositoBancario) {
		this.depositoBancario = depositoBancario;
	}

	public double getTotalDoPedido() {
		return totalDoPedido;
	}

	public void setTotalDoPedido(double totalDoPedido) {
		this.totalDoPedido = totalDoPedido;
	}

	public static int getQuantPedidos() {
		return quantPedidos;
	}

	public static void setQuantPedidos(int quantPedidos) {
		Pedido.quantPedidos = quantPedidos;
	}

	

}
