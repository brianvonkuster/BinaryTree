
public class Tree<T> implements INT_Tree<T> {

	private Node<T> root = null;
	
	public Tree()
	{
		
	}
	
	@Override
	public boolean Search(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	public Node<T> getRoot()
	{
		return root;
	}
	
	@Override
	public boolean Insert(T item) {

		if (root == null)
		{
			root = new Node<T>(item);
			return true;
		}
		
		if (root.getLeft() == null)
		{
			root.setLeft(new Node<T>(item));
			return true;
		}
		else if (root.getRight() == null)
		{
			root.setRight(new Node<T>(item));
			return true;
		}
		
		return false;
	}

	@Override
	public boolean Delete(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void InOrder(Node<T> n) {
		if (n != null)
		{
			PostOrder(n.getLeft());
			System.out.println(n.getData());
			PostOrder(n.getRight());
		}
		
	}

	@Override
	public void PreOrder(Node<T> n) {
		if (n != null)
		{
			System.out.println(n.getData());
			PostOrder(n.getLeft());
			PostOrder(n.getRight());
		}
		
	}

	@Override
	public void PostOrder(Node<T> n) {
		if (n != null)
		{
			PostOrder(n.getLeft());
			PostOrder(n.getRight());
			System.out.println(n.getData());
		}
		
	}

	@Override
	public int GetSize() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return "";
	}

}
