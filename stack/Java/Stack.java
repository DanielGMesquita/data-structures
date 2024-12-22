public class Stack {
	private int values[];
	private int top;

	public Stack() {
		values = new int[10];
		top = -1; ////pilha vazia, abaixo de 0 que é a primeira posição de um item
	}

	public void push(int element) {
		top++;
		values[top] = element;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == 9);
	}

	public int pop() {
		int element = values[top];
		top--;
		return element;
	}
}

// tratamentos de erros e exceções ficam fora da pilha, a responsabilidade é da aplicação