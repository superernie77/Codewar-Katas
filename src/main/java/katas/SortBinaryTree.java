package katas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SortBinaryTree {
	public static List<Integer> treeByLevels(Node root) {
	  	List<Integer> result = new ArrayList<>(); 
	    if (root == null) {
	      return result;
	    }
			

			Queue<Node> queue = new LinkedList<>();
			queue.add(root);

			while (!queue.isEmpty()) {
				Node node = queue.remove();
				
				result.add(node.value);
				

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}
			

			return result;
		}
}

class Node {
  public Node left;
  public Node right;
  public int value;
		  
  public Node(Node l, Node r, int v) {
	  left = l;
	  right = r;
	  value = v;
  }
}
