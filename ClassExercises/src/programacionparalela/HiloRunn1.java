package programacionparalela;

import java.sql.Time;

public class HiloRunn1 implements Runnable {
	public static int sandwichs=3;
	
	private String eaterName;
	
	

	public HiloRunn1(String eaterName) {
		super();
		this.eaterName = eaterName;
	}


	private static void par() {
		int c = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {

			} else {
				c += i;
				System.out.println("HILO 1( NUMERO PAR: " + i + " SUMA: " + c + " )");
			}

		}

	}
	
	
	private  void eatSand() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (sandwichs >0) {
			sandwichs-=1;
			System.out.println(this.eaterName+" se comio un sandwich");
		}
	}

	@Override
	public void run() {

		eatSand();

	}

}
