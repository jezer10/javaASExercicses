package programacionparalela;

public class HiloRunn2 implements Runnable {

	private static void impar() {
		int c = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {
				c += i;
				System.out.println("HILO 2( NUMERO PAR: " + i + " SUMA: " + c + " )");
			} else {

			}

		}
	}

	@Override
	public void run() {

		impar();

	}

}
