package AssertNotNull;


public class Coche {
	
	//ATRIBUTOS
	
	private String matricula; 
	private String marca; 
	private String modelo; 
	
	//CONSTRUCTOR
	
	public Coche(){
	}
	
	//METODOS
	
	public double acelerar(double velocidad){
		
		//subir velocidad en autopista 
		velocidad = 80; 
		
		velocidad = velocidad*1.10;
		
			return velocidad; 
			
		}
	
	public
	
	
	public void crearAñadir(){
		Coche coche = new Coche();
		
		coche.setMatricula("5678YGD");
		coche.setMarca("seat");
		coche.setModelo("ibiza");

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
