package caso1;

public class Programa {

	public static void main(String[] args) {
		//producto error = new producto ("0000BCD, "Verde", "Error"); No puedo crear un objeto de tipo Producto porque lo he definido como clase abtracta
		
		Nuevo coche1 = new Nuevo("1234DLM", "Amarillo", "Fiesta");
		Segundamano coche2 = new Segundamano("M6796ON", "Verde", "Mondeo", "Luis", 200000);
		Km0 coche3 = new Km0("2239FSH", "Plata", "Focus", 1200);
		
		System.out.println(coche1.toString());
		System.out.println(coche2.toString());
		System.out.println(coche3.toString());
	}

}
