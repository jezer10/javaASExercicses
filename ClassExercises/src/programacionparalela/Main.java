package programacionparalela;


public class Main {
	static HiloRunn1 hr1,hr2,hr3,hr4,hr5,hr6,hr7,hr8,hr9,hr10;
	

	
	public static void main(String[] args) {
		hr1=new HiloRunn1("eater1");
		hr2=new HiloRunn1("eater2");
		hr3=new HiloRunn1("eater3");
		hr4=new HiloRunn1("eater4");
		hr5=new HiloRunn1("eater5");
		hr6=new HiloRunn1("eater6");
		hr7=new HiloRunn1("eater7");
		hr8=new HiloRunn1("eater8");
		hr9=new HiloRunn1("eater9");
		hr10=new HiloRunn1("eater10");
		hr1.run();
		hr2.run();
		hr3.run();
		hr4.run();
		hr5.run();
		hr6.run();
		hr7.run();
		hr8.run();
		hr9.run();
		hr10.run();
		
		
		
		
		
		
		
//		ExecutorService executor1 = Executors.newSingleThreadExecutor();
//		executor1.submit(() -> {
//			Exercises.task1();
//		});
//		
//		ExecutorService executor2 = Executors.newSingleThreadExecutor();
//		executor2.submit(() -> {
//			Exercises.task2();
//		});
//		/*ExecutorService executor3 = Executors.newSingleThreadExecutor();
//		executor3.submit(() -> {
//			Exercises.task3();
//		});*/
	}
}
