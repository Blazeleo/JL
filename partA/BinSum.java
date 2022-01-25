package satvik142;
import satvik19.Node;
import java.util.*;

public class BinSum {
	static Node getTree()
	{
		Node root = new Node(5);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		root.left.right.left = new Node(3);
		root.right.right = new Node(8);
		root.right.right.right = new Node(9);
		root.right.right.left = new Node(7);
		return root;
	}
	
	static int Difference(Node tree)
	{
		if(tree == null) return 0;
		return tree.data - Difference(tree.left) - Difference(tree.right);
	}
	public static void main(String[] args) {	
		Node tree = getTree();
		System.out.println(Difference(tree));
	}
}
