package com.blz.stacks.queues;

public class Queue<K> {
	private final MyLinkedList myLinkedList;

	public Queue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}

	public INode peek() {
		return myLinkedList.head;
	}
	
	public INode dequeue() {
		return myLinkedList.pop();
	}

}
