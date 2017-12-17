/*
 * This is the class that implements the queue data structure.
 * You may decide what data structure to use to implement it.
 */
public class Queue implements QueueInterface {
	
	private Node head;
	// Uses a linked list data structure to implement a Queue.
	
	public Queue() {
		head = null;
	}

	// inserts an element to the back of the queue
	public void enqueue(String record) {
		Node newNode = new Node();
		newNode.record = record;
		Node pointer = head;
		
		while (true) {
			if (pointer == null) {
				newNode.next = head; 
				head = newNode;
				break;
			} else if (pointer.next == null) {
				pointer.next = newNode;
				newNode.next = null;
				break;
			} else {
				pointer = pointer.next;
			}
		}
		
	}

	// removes element from the front of the queue and returns its value.
	public String dequeue() {
		if (head == null) {
			return "";
		} else {
			Node pointer = head;
			head = pointer.next;
			return pointer.record;
		}
	}


	public void printQueue() {
		Node pointer = head;
		System.out.println("QUEUE");
		System.out.println("-------");
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}
	
	
	
}
