package AssertNotNull;

public class Coche {
	
	//ATRIBUTOS
	
	private String matricula; 
	private String marca; 
	private String modelo; 
	
	//CONSTRUCTOR
	
	public Coche(){
		this.matricula = matricula; 
		this.marca = marca; 
		this.modelo = modelo; 
	}
	
	public String crearA�adir(){
		Coche coche = new Coche();
		
		coche.setMatricula("5678YGD");
		coche.setMarca("seat");
		coche.setModelo("ibiza");
			
		return coche.getMarca(); 
	}
	
	//GETTERS Y SETTERS

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
}
