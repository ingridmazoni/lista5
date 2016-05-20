import java.util.List;

public abstract class MsgPromocionalEAvisoDeLancamentos {
	
	private List<ObservadorCliente> listaObservadores;
	

	public void adicionar(ObservadorCliente cliente) {
		listaObservadores.add(cliente);
	}

	public void remover(ObservadorCliente cliente) {
		listaObservadores.remove(cliente);
	}

	public abstract void notificar();
	
	public List<ObservadorCliente> getObservadores(){
		return listaObservadores;
	}

}
