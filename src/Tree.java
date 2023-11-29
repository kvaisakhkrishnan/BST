
public class Tree<T extends Comparable<T>> {
	Node<T> root;
	Tree(){
		root = null;
	}
	void addNode(T data) {
		Node<T> node = new Node<>(data);
		if(root == null) {
			root = node;
		}
		else {
			Node<T> iterator = root;
			while(iterator != null) {
				if((iterator.data.compareTo(data)) > 0) {
					//left branch
					if(iterator.left == null) {
						iterator.left = node;
						return;
					}
					else {
						iterator = iterator.left;
					}
				}
				else {
					//right branch
					if(iterator.right == null) {
						iterator.right = node;
						return;
					}
					else {
						iterator = iterator.right;
					}
				}
			}
		}
	}
	
	public void preOrder(Node<T> node) {
		if(node == null) {
			return;
		}
		else {
			preOrder(node.left);
			System.out.println(node.data);
			preOrder(node.right);
		}
	}
	public void search(Node<T> node, T item) {
		if(node == null) {
			return;
		}
		else {
			search(node.left, item);
			if(node.data.equals(item)) {
				System.out.println("FOUND");
				return;
			}
			search(node.right, item);
		}
	}
}
