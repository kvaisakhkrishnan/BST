
public class Driver {
	public static void main(String args[]) {
		Tree<Integer> tree = new Tree<>();
		tree.addNode(56);
		tree.addNode(30);
		tree.addNode(70);
		tree.preOrder(tree.root);
		tree.search(tree.root, 30);
	}
	
}
