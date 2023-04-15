package caso1;

public class Nuevo extends Producto{

	public Nuevo(String matricula, String color, String modelo) {
		super(matricula, color, modelo);
		
	}
		
	
	@Override
	public String toString() {
		return "Nuevo [" + super.toString() + "]";
	}

	
	

}
