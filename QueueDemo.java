import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.offer(10);
		priorityQueue.offer(5);
		System.out.println(priorityQueue.poll());
	}
}