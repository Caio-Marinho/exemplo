package exemplo;

public class exemplo_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<=10;i++) {
			// Operador ternario age como um if-else em situações que não exigem uma complexidade.
			System.out.println(i % 2 == 0 ? i +" é par" : i +" é impar"); // Operador ternario {condição} ? {caso seja verdade} : {caso seja falso}
		}

	}

}