package AssertFalse;

public class Par {
	
	public static boolean par(int numero){
		
		boolean resultado = false; 
		
		if(numero%2 == 0){ //cuando son pares
			resultado = true; 
		}
		
		return resultado; 
	}

}
