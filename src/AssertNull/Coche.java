package AssertNull;


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
	
	public Object crearA�adir(){
		Coche coche = new Coche();
		
		coche.setMatricula("5678YGD");
		
		return null; 
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
