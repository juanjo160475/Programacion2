package clase2;

public class Pato extends Ave implements Ivolador, Inadador {
	private String nombre;
	

	public Pato() {
		this.nombre = "anonimo";
		this.energia = 10;
	}

	public Pato(String nombre) {
		this.nombre = nombre;
		this.energia = 10;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void cantar() {
		System.out.println("hola soy un pato " + this.nombre);
		super.cantar();
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		if (puedoVolar()) {
			this.energia = this.energia - 6;
			System.out.printf("vola %.02f metros", Math.random() * 10);
		}

		else {
			System.out.println("no puedo volar porque no tengo energia ");
		}
	}

	private boolean puedoVolar() {
		return this.energia >= 6;
	}
	public void nada() {
		// TODO Auto-generated method stub
		if (puedonadar()) {
			this.energia = this.energia - 1;
			System.out.printf("nada %.02f metros", Math.random() * 10);
		}

		else {
			System.out.println("no puedo nadar porque no tengo energia ");
		}
	}

	private boolean puedonadar() {
		return this.energia >= 1;
	}
}
