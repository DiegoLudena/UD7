package caso1;

public abstract class Producto {
	
	private String matricula;
	private String color;
	private String modelo;
	
	public Producto(String matricula, String color, String modelo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public String toString() {
		return "matricula=" + matricula + ", color=" + color + ", modelo=" + modelo;
	}

	
	
}
