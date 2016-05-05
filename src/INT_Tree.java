
public interface INT_Tree <T> {

	public boolean Search(T item);
	public boolean Insert(T item);
	public boolean Delete(T item);
	
	public void InOrder(Node<T> n);
	public void PreOrder(Node<T> n);
	public void PostOrder(Node<T> n);
	
	public int GetSize();
	public boolean isEmpty();
	public void clear();
	
}
