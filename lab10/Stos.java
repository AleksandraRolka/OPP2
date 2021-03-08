
public class Stos<T> {

	private Node<T> head;
	
	public Stos()
	{
		head = null;	
	}
	
	public void push(T x)
	{
		Node<T> newEl = new Node<T>(x);
		
		if (head == null) { 
			head = newEl; 
		}
		else { 
			Node<T> prevEl = newEl;
			Node<T> nextEl = head;
			
			while (nextEl != null) {
				prevEl.setNext(nextEl);
				prevEl = nextEl;
				nextEl = nextEl.getNext();
			}
			head = newEl; 
		}
	}
	public void pop()
	{
		head = head.getNext();
	}
	public String toString()
	{
		String res = "";
		Node<T> temp = head;
		while(temp.getNext() != null)
		{
			res += temp;
			temp = temp.getNext();
		}
		res += temp;
		return res;
	}
}


class Node<T> {
	
	private T val;
	private Node<T> next;
	
	Node(T val)
	{
		this.val = val;
		this.next = null;
	}
	public Node<T> getNext()
	{
		return this.next;
	}
	public void setNext( Node<T> obj)
	{
		this.next = obj;
	}
	public String toString()
	{
		return "{" + this.val + "} ";
	}
}