package caso1;

public class Segundamano extends Producto {


	private String propietarioanterior;
	private int kilometros;
	
	public Segundamano(String matricula, String color, String modelo, String propietarioanterior, int kilometros) {
		super(matricula, color, modelo);
		this.propietarioanterior = propietarioanterior;
		this.kilometros = kilometros;		
		
	}
	

	public String getPropietarioanterior() {
		return propietarioanterior;
	}

	public void setPropietarioanterior(String propietarioanterior) {
		this.propietarioanterior = propietarioanterior;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Segundamano [" + super.toString() + ", propietarioanterior=" + propietarioanterior + ", kilometros=" + kilometros + "]";
	}
	
	
}
