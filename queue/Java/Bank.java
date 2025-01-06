public class Bank {
	public static void main (String args[]) {
		Queue q = new Queue();
		int e;

		q.insert(50);
		q.insert(34);
		q.insert(199);
		q.insert(324);
		q.insert(170);
		q.insert(1);
		q.insert(3);
		q.insert(36);
		q.insert(14);
		q.insert(1001);
		q.insert(15);
		q.insert(312);

		System.out.println("Teste de fila:");
		while(!q.isEmpty()) {
			e = q.remove();
			System.out.println("Senha processada: " + e);
		}
	}
}