package treeSortPackage;

/*
 * Trevor Turgeon
 * 
 * methods that interact with trees and nodes
 * can insert nodes into trees
 * can print trees in order
 * can print trees in reverse order
 */

public class Node {
    Node left;

    Node right;

    int value;

    public Node(int value) {
      this.value = value;
    }
    
    
    
    public void insert(Node node, int value) {
    	//builds tree and prints out where values are placed
	    if (value < node.value) {
	      if (node.left != null) {
	        insert(node.left, value);
	      } else {
	        System.out.println("  Inserted " + value + " to left of "
	            + node.value);
	        node.left = new Node(value);
	      }
	    } else if (value > node.value) {
	      if (node.right != null) {
	        insert(node.right, value);
	      } else {
	        System.out.println("  Inserted " + value + " to right of "
	            + node.value);
	        node.right = new Node(value);
	      }
	    }
	  }
    
    public void printInOrder(Node node) {
    	//prints out tree in order
	    if (node != null) {
	      printInOrder(node.left);
	      System.out.println("  Traversed " + node.value);
	      printInOrder(node.right);
	    }
	  }
	
	 public void printFrontToBack(Node node, int camera) {
		 //prints out tree in reverse order
		    if (node == null)
		      return;
		    if (node.value > camera) {
		      // print in order
		      printFrontToBack(node.left, camera);
		      System.out.println("  Traversed " + node.value);
		      printFrontToBack(node.right, camera);
		    } else if (node.value < camera) {
		      // print reverse order
		      printFrontToBack(node.right, camera);
		      System.out.println("  Traversed " + node.value);
		      printFrontToBack(node.left, camera);
		    } else {
		      // order doesn't matter
		      printFrontToBack(node.left, camera);
		      printFrontToBack(node.right, camera);
		    }
		  }
 }