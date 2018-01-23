package AssertEquals;

public class Persona {

	private String nombre; 
	private String dni; 
	private int edad; 
	
	public Persona (){
		
	}
	
	public Persona(String nombre, String dni){
		this.nombre = nombre; 
		this.dni = dni; 
	}
	
	
	public int cumplirAños(int edad){
		if(edad <= 10){
			edad++; 
		}
		return edad; 
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre; 
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public static Object sacarNombre() {
		String nombre1 = "Lore"; 
		return nombre1; 

	}
	
	

}
