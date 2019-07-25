package ds;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList {

	Node head = null;
	Node next = null;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;			
		}
	}
/*	public void add(int i){
		
		Node node = new Node(i);
		
		node.next = head;
		
		head = node;
	}*/
	
	public void add(int i){
		Node node = new Node(i);
		if(head == null){
			head = next = node;
		} else {
			next.next = node;
		}
//		next = node.next;
	}
	
	public SinglyLinkedList() {
	}

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(1);
		sll.add(2);
		sll.add(3);
		sll.add(4);
		sll.add(5);
//		 sll.head.next.next.next.next = sll.head;
		Node tmp = sll.head;
		
		List<Node> list = new ArrayList<>();
		
		while(tmp != null){
			if(list.contains(tmp)){
				System.out.println("Loop Found");
				break;
			}
			list.add(tmp);
			tmp = tmp.next;
		}
		
		tmp = sll.head;
		while(tmp != null){
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
		
		Node prev = null;
		tmp = sll.head;
		Node head = null;
		while(tmp != null){
			Node nextNode = tmp.next;
			tmp.next = prev;		
			head = prev = tmp;
			tmp = nextNode;
		}
		
		sll.head = head;
		
		System.out.println("----------------" + head);
		
		tmp = sll.head;
		while(tmp != null){
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}

}
