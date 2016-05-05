
public class Node<T> {

	private Node<T> parent = null;
	private Node<T> left = null;
	private Node<T> right = null;
	
	private T data;
	
	private boolean isRoot = false;
	
	// Empty node
	public Node()
	{
		
	}
	
	// Node with data
	public Node(T data)
	{
		this.data = data;
	}
	
	// Node with data, root information
	public Node(T data, boolean isRoot)
	{
		this.data = data;
		this.isRoot = isRoot;
	}
	
	// Getters
	public Node<T> getLeft()
	{
		return left;
	}
	
	public Node<T> getRight()
	{
		return right;
	}
	
	public Node<T> getParent()
	{
		return parent;
	}
	
	public T getData()
	{
		return data;
	}
	
	// Setters
	public void setLeft(Node<T> n)
	{
		left = n;
		left.parent = this;
	}
	
	public void setRight(Node<T> n)
	{
		right = n;
		right.parent = this;
	}
	
	public void setParent(Node<T> n)
	{
		parent = n;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public boolean isRoot()
	{
		if (isRoot)
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
}
