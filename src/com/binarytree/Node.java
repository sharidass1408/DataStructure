package com.binarytree;

public class Node {
	
	int data;
	Node leftChild;
	Node rightChild;

	public Node(int data) {
		this.data = data;
	}
	
	
	public void insert(int value){
		
		if(value <= data) {
			
			if(leftChild == null) {
				leftChild = new Node(value);
			}else {
				leftChild.insert(value);
			}	
			
		} else {
			
			if(rightChild == null){
				rightChild = new Node(value);
			}else {
				rightChild.insert(value);
			}
				
		}
		
	}
	
	public boolean contains(int value) {
		
		if(value == this.data) {
			
			return true;
			
		}else if(value < this.data) {
			
			if(leftChild !=null)
				leftChild.contains(value);
			else
				return false;
			
		}else {
			
			if(rightChild != null)
				rightChild.contains(value);
			else
				return false;
		}
		
		return false;
	}
	
	public void printInOrder() {
		
		if(this.leftChild != null)
			leftChild.printInOrder();
			
		System.out.println(this.data);
		
		if(this.rightChild != null)
			rightChild.printInOrder();
	}
	
	public void printPreOrder() {
		
		System.out.println(this.data);

		if(this.leftChild != null)
			leftChild.printPreOrder();
		
		if(this.rightChild != null)
			rightChild.printPreOrder();
	}
	
	public void  postOrder() {
		
		if(this.leftChild != null)
			leftChild.postOrder();
		
		if(this.rightChild != null)
			rightChild.postOrder();

		System.out.println(this.data);
		
	}
	
}
