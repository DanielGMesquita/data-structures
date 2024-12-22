public class Converter{
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		Stack s = new Stack();

		int remainder;

		while (number != 0) {
			remainder = number % 2; // resto da divisão do numero por 2
			s.push(remainder); 		// armazena na pilha
			number = number/2;		// gera novo número resultado da divisão por 2
		}

		while (!s.isEmpty()) {
			remainder = s.pop();
			System.out.print(remainder);
		}

		System.out.println("\nfim do programa");
	}
}