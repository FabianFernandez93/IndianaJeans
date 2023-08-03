package utility;



public class Utilidad {

	public void tiempoEspera(String mensaje, int sleepTimer) {
		System.out.println("**  " + mensaje + "  **");
		for (int i = 0; i < 10; i++) {
			try {
				System.out.print(".");
				Thread.sleep(sleepTimer);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public void limpiaPantalla() {
		
		
	}
}
