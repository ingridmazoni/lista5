import java.util.List;

public interface DaoEditora {

	

	public abstract void adicionar(Editora editora);

	public abstract void remover(Editora editora);

	public abstract void atualizar(Editora editora);

	public abstract List<Editora> listaEditora();

}
