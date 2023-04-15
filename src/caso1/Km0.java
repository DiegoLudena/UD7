package caso1;

public class Km0 extends Producto{

	private int kilometros;

	
	public Km0(String matricula, String color, String modelo, int kilometros) {
		super(matricula, color, modelo);
		this.kilometros = kilometros; 
}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	@Override
	public String toString() {
		return "Km0 [" + super.toString() + ", kilometros=" + kilometros + "]";
	}

	
}