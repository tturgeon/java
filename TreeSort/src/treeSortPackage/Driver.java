package treeSortPackage;

import javax.swing.JOptionPane;

/*
 * Trevor Turgeon
 * 
 * Main class for tree project
 * creates a tree and lets user create and print parts of the tree
 */

public class Driver {

	public static void main(String[] args) {
		// builds a tree, root value = 10
		//initialize variables
		int nodes = 10;
		int toDo = 0;
		int enter = 0;
		int i = 0;
        Node root = new Node(10);
        
        while (i<1) {
        //find out what user wants to do
        try {
        	toDo = Integer.parseInt(JOptionPane.showInputDialog("What do you want to do? 1: Enter new node, 2: Delete Node, 3: Print tree in order, 4: Print tree in reverse, 0: End program"));
        	
        } catch (Exception e) {}
        
        if (toDo == 1) {
        	//find new value to enter
        	try {
            	enter = Integer.parseInt(JOptionPane.showInputDialog("What value do you want to enter? Please enter a number between 1 and 20"));
            } catch (Exception e) {}
        	//makes sure value is valid then enters it
        	if (enter < 1 || enter > 20) {
        		System.out.println("Sorry, invalid value");
        	} else {
        		root.insert(root, enter);
        		nodes++;
        	}
        	
        } else if (toDo == 2) {
        	//find value to delete
        	System.out.println("Sorry, can't delete nodes right now");
        } else if (toDo ==3) {
        	//print tree in order
        	System.out.println("Traversing tree in order");
        	root.printInOrder(root);
        } else if (toDo == 4) {
        	//print tree in reverse
        	System.out.println("Traversing tree front-to-back");
        	root.printFrontToBack(root, nodes);
        } else {
        	i++;
        }
        }
	}

}
