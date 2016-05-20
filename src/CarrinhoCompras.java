import java.util.List;
import java.util.Collection;

public class CarrinhoCompras {
	
	private List<Item> itens;

	private double totalDeTodosOsItens;
		
	private CalculoDescontoStrategy calculoDescontoStrategy;
	
	public CarrinhoCompras() {
		calculoDescontoStrategy=new DescontoDeQuinzePorcento();
	}

	public void adicionarItens(Item item) {

	}

	public void removerItens(Item item) {

	}

	public List<Item> visualizaListaItens() {
		return null;
	}

	public double calculaTotalDeTodosOsItens() {
		return 0;
	}

	public double calculaDesconto() {
		return calculoDescontoStrategy.calculaDesconto(totalDeTodosOsItens);
	}

}
