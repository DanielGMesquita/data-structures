import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		Stack s = new Stack();

        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        int remainder;

        while (number != 0) {
            remainder = number % 2; // resto da divisão do número por 2
            s.push(remainder);     // armazena na pilha
            number = number / 2;   // gera novo número resultado da divisão por 2
        }

        System.out.print("Binary number: ");
        while (!s.isEmpty()) {
            remainder = s.pop();
            System.out.print(remainder);
        }

        System.out.println("\nEnd of program");
        scanner.close();
    }
}