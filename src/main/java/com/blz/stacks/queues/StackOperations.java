package com.blz.stacks.queues;

public class StackOperations<K> {

	private final MyLinkedList myLinkedList;

	public StackOperations() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peek() {
		return myLinkedList.head;
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public boolean isEmpty() {
		return myLinkedList.isEmpty();
	}

}
