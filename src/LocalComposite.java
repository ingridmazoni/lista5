import java.util.List;

public class LocalComposite extends LocalComponent {

	private List<LocalComponent> local;

	
	public void adicionar(LocalComponent local) {
		this.local.add(local);
	}

	public void remover(LocalComponent local) {
		this.local.remove(local);
	}

	

}
