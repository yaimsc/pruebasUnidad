package AssertFalse;

public class Impar {
	
	public static boolean impar(int numero){
		
		boolean resultado = false; 
		
		if(numero%2 == 0){ //cuando son pares
			resultado = true; 
		}
		
		return resultado; 
	}

}
