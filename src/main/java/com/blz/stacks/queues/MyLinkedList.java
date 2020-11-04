package com.blz.stacks.queues;

public class MyLinkedList<K> {
	static INode head;
	static INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> newNode) {
		if (this.tail == null && this.head == null) {
			this.tail = newNode;
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode<K> myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode<K> pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;

	}

	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode<K> search(INode<K> key) {
		INode<K> tempNode = head;
		while (!tempNode.getNext().equals(key)) {
			tempNode = tempNode.getNext();
		}
		return key;
	}

	public void searchAndInsertValue(INode<K> key, INode<K> newNode) {
		INode<K> tempNode = head;
		while (!tempNode.getNext().equals(key)) {
			tempNode = tempNode.getNext();
		}
		INode<K> tempNode1 = key.getNext();
		key.setNext(newNode);
		newNode.setNext(tempNode1);
	}

	public INode<K> deleteNodeInBetween(INode<K> key) {
		INode firstNode = head;
		INode tempNode = head;
		while (tempNode != key) {
			tempNode = tempNode.getNext();
		}
		this.head = tempNode;
		pop();
		INode LastNode = this.head;
		this.head = firstNode;
		INode tempNode1 = this.head;
		while (tempNode1.getNext() != key) {
			tempNode1 = tempNode1.getNext();
		}
		tempNode1.setNext(LastNode);
		return this.head;
	}

	public int size() {
		int size = 0;
		if (this.head == null)
			return size;
		else
			size = 1;
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size;
	}

}
