
public class Embotelladora {
// @param pequenas: n�umero de botellas en almac�en de 1L
// grandes : n�umero de botellas en almac�en de 5L
// total : n�umero total de litros que hay que embotellar
// @return n�umero de botellas peque~nas necesarias para embotellar el total de l�1quido, teniendo
// en cuenta que hay que minimizar el n�umero de botellas peque~nas: primero
// se rellenan las grandes
// @throws NoSolution si no es posible embotellar todo el l�1quido
public static void main(String[] args) throws NoSolution{
  System.out.println( Embotelladora.calculaBotellasPequenas(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])) );
}

	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {
		int pequenastotales= 0;
		if (comprobarSolucion(pequenas,grandes,total)== true) {
			pequenastotales=solucion(pequenas,grandes, total);
					if(pequenastotales!=-1) {
            return pequenastotales;
					}
          else
			       throw new NoSolution ("Parámetros inválidos");
		}
		else
			throw new NoSolution ("Parámetros inválidos");

	}
	public static boolean comprobarSolucion (int peq, int gr, int tot) {
		int totalpq= 1* peq;
		int totalgr=5*gr;
		int totallitros= totalpq + totalgr;

		if(tot<=0) {
			return false;
		}
		if(peq<0) {
			return false;
		}

		if(gr<0) {
			return false;
		}

		if(totallitros<tot) {
			return false;
		}else {
			return true;
		}
	}
  public static int solucion (int peq, int gr, int tot) {
  		int restoTotal=0;
  		if (comprobarSolucion(peq,gr,tot)== true) {

  			int totalGr=1;
  				if(gr>=0) {
  					totalGr=5*gr;
  				}
  			if(totalGr>0  ) {
  				if (totalGr<tot) {

  				restoTotal= tot%totalGr;
  				}	else {
  					int a = tot%5;
  					restoTotal=a;
            if(restoTotal==0)
              return 0;
  				}
  			}else if(totalGr== 0 && peq >= tot) {
  				return tot;
  			} else {
  				return -1;
  			}

  				if (restoTotal<=peq && restoTotal!=0) {
  					return restoTotal;
  				}else {
  					return -1;
  				}
  		}else {
  			return -1;
  		}
  	}
  }
