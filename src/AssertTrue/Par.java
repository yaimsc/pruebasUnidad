package AssertTrue;

public class Par {

	
	public static boolean par(int numero){
		
		boolean resultado = true; 
		
		if(numero%2 == 0){
			resultado = false; 
		}
		
		return resultado; 
	}
}
