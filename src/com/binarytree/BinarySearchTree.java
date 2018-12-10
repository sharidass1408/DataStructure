package com.binarytree;

public class BinarySearchTree {

	public static void main(String[] args) {

		int[] sortedArray = {0,1,2,3,4,5,6};
		
		insertNode(0, sortedArray.length-1, sortedArray, null);
		
	}
	
	private static void insertNode(int left, int right, int[] sortedArray, Node parentNode) {
		
		int middle = (left + right)/2;
		
		if(parentNode == null) {
			
			parentNode = new Node(sortedArray[middle]);
		}
		
		insertNode(left, middle-1, sortedArray, parentNode.leftChild );
			
		insertNode( middle+1, right, sortedArray, parentNode.rightChild );
		
	}



}
