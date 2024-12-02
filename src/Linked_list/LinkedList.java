package Linked_list;

public class LinkedList {

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;

		}

	}

	public static Node head;
	public static Node tail;

	// add First
	public void addFirst(int data) {
		// create a new node
		// new node.next = head
		// head = newNode

		// create new Node
		Node newNode = new Node(data);

		// if head is null in the Node the create a edge case
		if (head == null) {
			head = tail = newNode;
			return;
		}

		// new Node.next = head
		newNode.next = head;

		// head = newNode step 3
		head = newNode;

	}

	// add last
	public void addLast(int data) {

		// create a new Node
		// tail.next = newNode;
		// tail = newNode;

		// step 1 Create new Node
		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step 2 Tail.next = newNode
		tail.next = newNode;

		// step 3 tail = newNode
		tail = newNode;

	}

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.addFirst(1);
		ll.addFirst(2);

	}

}
