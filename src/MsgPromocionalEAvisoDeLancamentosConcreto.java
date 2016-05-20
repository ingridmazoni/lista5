import java.util.List;

public class MsgPromocionalEAvisoDeLancamentosConcreto extends MsgPromocionalEAvisoDeLancamentos {

	private String msgPromocional;
	private List<Livro> listaLancamentos;
	private MsgPromocionalEAvisoDeLancamentosConcreto msgPromoEAvisoLanc;
	
	public MsgPromocionalEAvisoDeLancamentosConcreto(){
		msgPromoEAvisoLanc = new MsgPromocionalEAvisoDeLancamentosConcreto();
	}
	
	
	public List<Livro> obterListaLancamentos() {
		return listaLancamentos;
	}
	
	public void addLancamento(Livro livro) {
		listaLancamentos.add(livro);
		msgPromoEAvisoLanc.notificar();

	}

	public void removeLancamento(Livro livro) {
		listaLancamentos.remove(livro);
	}


	public String visualizarMsgPromocional() {
		return msgPromocional;
	}
	
	public void editaMsgPromocional(String msg) {
		msgPromocional =msg;
		msgPromoEAvisoLanc.notificar();
	}
	
	public void notificar() {
		for(ObservadorCliente oc: msgPromoEAvisoLanc.getObservadores()){
			oc.atualizar(this);
		}

	}

	
	
}
