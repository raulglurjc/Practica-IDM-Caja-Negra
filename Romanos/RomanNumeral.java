
import java.lang.IllegalArgumentException;// Ver https://es.wikipedia.org/wiki/Numeraci%C3%B3n_romana1




public class RomanNumeral {

  // @param             s es un n ́umero romano
  // @return            el n ́umero s en base 10
  // @throws            IllegalArgumentException si s no es un n ́umero romano
  public int convierte(String s) throws IllegalArgumentException {


    char Rom[]= {' ','I','V','X','L','C','D','M'}; //GUARDAN LETRAS A COMPARAR
    int valor=0;


    if(comprobarArray(s,Rom)==true && comprobarOrden(s, Rom)==true) {
      valor = deRomanoaNatural(s,Rom);
      return valor;
    }else {
      throw new IllegalArgumentException("Solo se permiten números romanos validos");

    }
  }

  public static boolean comprobarArray (String romano, char [] Rom) {
    boolean estabien=false;
    boolean check=false;
    char letraC = ' ';
      char  letraCM = ' ';


    for(int i = 0; i < romano.length(); i++){
        letraC = romano.charAt(i);
        letraCM = Character.toUpperCase(letraC);
        for(int j = 0; j < Rom.length; j++){

          if (letraC== Rom[j] || letraCM==Rom[j]) {
          check=true;
          }

        }

    }

    if(check==true) {
      estabien=true;
    }

    return estabien;
  }

  public static boolean comprobarOrden (String romano, char [] Rom) {
    boolean estabien=true;

    char letraC = ' ';
      char letraC2 = ' ';
      char letraC3 = ' ';
      char letraC4 = ' ';
    int k=0;
    int m=0;
    int p=0;

    for(int i=0 ; i < romano.length(); i++){

      letraC = romano.charAt(i);
        letraC = Character.toUpperCase(letraC);
        k= i + 1;
        if(k<romano.length()) {


            letraC2 = romano.charAt(k);
            letraC2=Character.toUpperCase(letraC2);

        }else {
          letraC2= ' ';
        }
        m = k + 1;
        if(m<romano.length()) {

            letraC3 = romano.charAt(m);
            letraC3=Character.toUpperCase(letraC3);

        }else {
          letraC3= ' ';
        }
        p = m + 1;
        if(p<romano.length()) {


          letraC4 = romano.charAt(p);
          letraC4=Character.toUpperCase(letraC4);

        }else {
          letraC4= ' ';
        }

       if(letraC==letraC2) {
         if(letraC2==letraC3){
           if(letraC3==letraC4) {

                 return false;
           }
         }
       }

       if(letraC!=' ' ) {
         if(letraC!='I') {
      if(letraC!='V') {
        if(letraC!='X') {
          if(letraC!='L') {
            if(letraC!='C') {
              if(letraC!='D') {
                if(letraC!='M') {
                  return false;
                }
              }
            }
          }
        }
      }

         }
       }


       if(letraC=='V' && letraC2=='V'  ) {

         return false;
       } else if(letraC=='L' && letraC2=='L') {

          return false;
       } else if (letraC=='D' && letraC2=='D') {

           return false;
       }



       if( letraC2=='D' && letraC=='I' ) {

         return false;
       } else if(letraC2=='D' && letraC=='X') {

         return false;
       } else if(letraC2=='D' && letraC=='V') {

             return false;
       } else if(letraC2=='D' && letraC=='L') {

         return false;
       } else if(letraC2=='M' && letraC=='I') {

         return false;
       } else if(letraC2=='M' && letraC=='X') {

         return false;
       } else if(letraC2=='M' && letraC=='L') {

         return false;
       } else if(letraC2=='M' && letraC=='D') {

         return false;
       } else if(letraC2=='M' && letraC=='V') {

         return false;
       }else if(letraC2=='C' && letraC=='I') {

         return false;
       }else if(letraC2=='C' && letraC=='V') {

         return false;
       }else if(letraC2=='C' && letraC=='L') {

         return false;
       }

       if( (letraC2=='L' && letraC=='I') ) {

         return false;
       } else if(letraC2=='L' && letraC=='V') {

         return false;
       } else if(letraC2=='X' && letraC=='V') {

         return false;
       }



    }




  return estabien;

  }


    public static int deRomanoaNatural(String romano, char [] Rom) {

    	char letra1 = ' ';
        char letra2 = ' ';

        int valores[] = {0,1,5,10,50,100,500,1000};//SE LE DA VALOR A LA LETRAS
        int valor1=0;
        int valor2=0;
        int valorX=0;

        for(int i = 0; i < romano.length(); i++){//RECORRER TODA LA FRASE(numero romano)
        		int k= i + 1;
                letra1 = romano.charAt(i);
                letra1=Character.toUpperCase(letra1);
                if (k<romano.length()) {
                letra2 = romano.charAt(k);
                letra2=Character.toUpperCase(letra2);
                }

                for(int j = 0; j < Rom.length; j++){//RECORRE ARREGLO ROM
                if (letra1== Rom[j]) {
                	valor1= valores[j];
                	}
                }
                for(int l = 0; l < Rom.length; l++){
                	if(letra2==Rom[l]) {
                	valor2=valores[l];
                	}
                }
                if (valor2 > valor1  && letra1!='V' && letra1!='L' && letra1!='D') {
            		valorX= valorX + valor2 - valor1;
            		i=i+1;
            	}else {
            		valorX=valorX + valor1;
            	}
         }
        return valorX;
    }


}
