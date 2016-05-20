import java.util.List;

public interface DaoLivro {
	
	public abstract void adicionar(Livro livro);

	public abstract void remover(Livro livro);

	public abstract void atualizar(Livro livro);

	public abstract List<Livro> listaLivros();

}
