package clase2;

public class Pinguino extends Ave implements Inadador{

	public void nada() {
		// TODO Auto-generated method stub
		if (puedonadar()) {
			this.energia = this.energia - 8;
			System.out.printf("nada %.02f metros", Math.random() * 10);
		}

		else {
			System.out.println("no puedo nadar porque no tengo energia ");
		}
	}

	private boolean puedonadar() {
		return this.energia >= 8;
	}
	
}
