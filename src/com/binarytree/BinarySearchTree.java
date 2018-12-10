package com.binarytree;

public class BinarySearchTree {

	public static void main(String[] args) {

		int[] sortedArray = {0,1,2,3,4,5,6};
		
		Node rootNode = null;
		
		insertNode(0, sortedArray.length-1, sortedArray, rootNode);
		
		System.out.println("In order traversal");
		rootNode.printInOrder();
		
		System.out.println("Pre order traversal");
		rootNode.printPreOrder();
		
		System.out.println("Post order traversal");
		rootNode.printPostOrder();
		
	}
	
	private static void insertNode(int left, int right, int[] sortedArray, Node parentNode) {
		
		if(left >right)
			return;
		
		int middle = (left + right)/2;
		
		if(parentNode == null) {
			
			parentNode = new Node(sortedArray[middle]);
		}
		
		insertNode(left, middle-1, sortedArray, parentNode.leftChild );
			
		insertNode( middle+1, right, sortedArray, parentNode.rightChild );
		
	}



}
