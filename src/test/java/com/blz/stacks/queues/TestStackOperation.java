package com.blz.stacks.queues;

import org.junit.Assert;
import org.junit.Test;

public class TestStackOperation {

	// UC1
	@Test
	public void added_3Numbers() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		StackOperations<Integer> stack = new StackOperations<Integer>();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode peek = stack.peek();
		Assert.assertEquals(myThirdNode, peek);
	}

}
