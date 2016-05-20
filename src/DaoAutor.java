import java.util.List;

public interface DaoAutor {

	public abstract void adicionar(Autor autor);

	public abstract void remover(Autor autor);

	public abstract void atualizar(Autor autor);

	public abstract List<Autor> listaAutor();

}
