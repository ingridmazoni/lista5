public class FactoryRelatorioConcreto extends FactoryRelatorio {

	public Relatorio fabricaRelatorio(String tipoRelatorio) {
		Relatorio relatorio = null;
		if (tipoRelatorio.equalsIgnoreCase("Livros mais Vendidos")){
			relatorio = new RelatorioDeLivrosMaisVendidos();
			
		}
		else if( tipoRelatorio.equalsIgnoreCase("Clientes que mais compram")){
			relatorio = new RelatorioDeClientesQueMaisCompram();
		}
		return relatorio;
	}

}
