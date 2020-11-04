package com.blz.stacks.queues;

import org.junit.Assert;
import org.junit.Test;

public class TestQueue {

	// UC3
	@Test
	public void given3Numbers_AddedInQueue() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		INode peak = queue.peek();
		Assert.assertEquals(myFirstNode, peak);
	}

}
