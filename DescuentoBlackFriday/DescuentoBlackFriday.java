import java.lang.IllegalArgumentException;
import java.util.Date;
public class DescuentoBlackFriday {
// @param precioOriginal es el precio de un producto marcado en la etiqueta
// porcentajeDescuento es el descuento a aplicar expresado como un porcentaje que ha de ser >= 0
// @return el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
// un descuento de porcentajeDescuento
// @throws IllegalArgumentException si precioOriginal es negativo o porcentajeDescuento es negativo

public double precioFinal (double precioOriginal, double porcentajeDescuento, Date date){ // throws IllegalArgumentException (double precioOriginal, double porcentajeDescuento,int dia, int mes)
//
	double lastPrice = precioOriginal;
	if(comprobarFechaCorrecta(date) == true && comprobarPrecioYDescuento(precioOriginal,porcentajeDescuento) == true ) {
		if(comprobarBlackFriday(date) == true) {
			lastPrice= lastPrice*porcentajeDescuento;
		}
	}
//	else {
//	poner aqui el throws
//	}
	return lastPrice;
}
public static boolean comprobarFechaCorrecta(Date date) { //(int dia, int mes)



	int ms=0;
	int di=0;
	di = date.getDay(); // di = dia
	ms = date.getMonth(); //ms = mes
	if (di>0 && di<=31) {
		if(ms>0 && ms<=12) {
			if (ms==1 || ms==3 || ms==5 || ms==7 || ms==8 || ms== 10 || ms== 12) {
				if(di>31) {
					return false;
				}
			}
			if (ms==4 || ms==6 || ms==9 || ms==11) {
				if(di>30) {
					return false;
				}
			}
			if (ms==2 && di>28) {
				return false;
			}

		return true;

		}else {
			return false;
		}


	} else {
		return false;
	}


}
public static boolean comprobarPrecioYDescuento(double precio, double descuento) {
	if (precio>0 && descuento>=0 && descuento<=1) {
		return true;
	}else {
		return false;
	}
}
public static boolean comprobarBlackFriday(Date date) { // (int dia, int mes)
  int ms=0;
  int di=0;
	if(comprobarFechaCorrecta(date) == true)
	{
		di = date.getDay(); // di = dia
		ms = date.getMonth(); //ms = mes
		if(di==29 && ms==11) {
			return true;
		}
    else
      return false;
	}
  else {
		return false;
	}
}

}
