package Package;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First Method
		Deque<String> ds = new ArrayDeque<>();
		ds.add("First");
		ds.add("Second");
		ds.add("Fifth");
		ds.addFirst("Third");
		ds.addLast("Fourth");
		ds.forEach(s-> System.out.println(s));
		System.out.println(ds.element());
		System.out.println("Polling element" + ds.peek());
		System.out.println(ds.peek());
		ds.remove();
		ds.poll();
		
		// Second Method
		
		Deque<String> dq = new ArrayDeque<>();
		dq.offer("For");
		dq.offerFirst("I am ");
		dq.offerLast("You");
		System.out.println(dq.getFirst());
		dq.forEach(s -> System.out.println(s));
		
		// Third Method
		
		Deque<Integer> da = new ArrayDeque<>();
		da.push(10);
		da.push(20);
		da.push(30);
		da.push(40);
		da.forEach(s-> System.out.println(s));
		System.out.println(da.peek());
		System.out.println(da.pop());
		System.out.println(da.peek());
	}
}