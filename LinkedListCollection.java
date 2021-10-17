//LinkedListCollection


import java.util.LinkedList;

class LinkedListCollection {
	public static void main(String[] args)
	{

		LinkedList<Integer> ll= new LinkedList<Integer>();

		for (int i = 1; i <= 5; i++)
			ll.add(i);

		System.out.println(ll);
		ll.set(2, 45);
		ll.equals(ll);
		
		ll.remove(3);
//		ll.set(3, 45);

		
		System.out.println(ll);

		
		for (int i = 0; i < ll.size(); i++)
			System.out.print(ll.get(i) + " ");
	}
}
