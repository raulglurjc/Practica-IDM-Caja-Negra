import java.lang.IllegalArgumentException;
class Bisiestos {
	// @param   a                 un numero entero positivo
	// @return  true              si a es un a~no bisiesto
	//          false             en caso contrario.
	// @throws  IllegalArgumentException  si a no es un parametro valido.
	
	public static void main(String[] args) {
		System.out.println(Bisiestos.esBisiesto(Integer.parseInt(args[0])));
	}
	public static boolean esBisiesto(int a) throws IllegalArgumentException {
		if (a<0)
			throw new IllegalArgumentException("No están permitidos años negativos");
		
		return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;		
	}
}