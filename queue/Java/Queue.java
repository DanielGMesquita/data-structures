public class Queue {
	private int[] values;
	private int start;
	private int end;
	private int total;

	public Queue() {
		values = new int[10];
		start = 0;
		end = 0;
		total = 0;
	}

	public void insert(int e) {
		values[end] = e;
		end = (end + 1)%10;
		total++;
	}

	public int remove() {
		int element = values[start];
		start = (start + 1) % 10;
		total--;
		return element;
	}

	public boolean isEmpty() {
		return (total == 0);
	}

	public boolean isFull() {
		return (total == 10);
	}
}