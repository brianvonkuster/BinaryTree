
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Double> n = new Node<Double>(2.0);
		n.setLeft(new Node<Double>(3.0));
		n.setRight(new Node<Double>(4.0));
		
		System.out.println(n.getData());
		System.out.println(n.getLeft().getData());
		System.out.println(n.getRight().getData());
		System.out.println(n.getRight().getParent().getData());
	}

}
