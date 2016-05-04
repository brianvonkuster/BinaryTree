
public class Node<T> {

	private Node parent = null;
	private Node left = null;
	private Node right = null;
	
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
	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right;
	}
	
	public Node getParent()
	{
		return parent;
	}
	
	public T getData()
	{
		return data;
	}
	
	// Setters
	public void setLeft(Node n)
	{
		left = n;
		left.parent = this;
	}
	
	public void setRight(Node n)
	{
		right = n;
		right.parent = this;
	}
	
	public void setParent(Node n)
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
