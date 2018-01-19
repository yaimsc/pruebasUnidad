package AssertTrue;

public class Impar {

	
	public static boolean impar(int numero){
		
		boolean resultado = true; 
		
		if(numero%2 == 0){
			resultado = false; 
		}
		
		return resultado; 
	}
}
