import static org.junit.Assert.assertTrue;
import org.junit.*;
import java.util.*;

public class EmbotelladoraTest {
	private int pequenas, grandes, total;   // Entrada
	Embotelladora aux = new Embotelladora();

	   @Test (expected = NoSolution.class)
	   public void valor_negativo1() throws NoSolution
	   {
		   aux.calculaBotellasPequenas (-4, 5, 10);
	   }

     @Test (expected = NoSolution.class)
	   public void valor_negativo2() throws NoSolution
	   {
		   aux.calculaBotellasPequenas (4, -5, 10);
	   }

     @Test (expected = NoSolution.class)
	   public void valor_negativo3() throws NoSolution
	   {
		   aux.calculaBotellasPequenas (4, 5, -10);
	   }

     @Test (expected = NoSolution.class)
	   public void valor_negativo4() throws NoSolution
	   {
		   aux.calculaBotellasPequenas (-4, -5, -10);
	   }


	   @Test
	   public void test1() throws NoSolution
     {
		   assertTrue ("Error en test1",1 ==  aux.calculaBotellasPequenas (1, 1, 6));
	   }

     @Test
	   public void test2() throws NoSolution
     {
		   assertTrue ("Error en test2", 0 ==  aux.calculaBotellasPequenas (1, 1, 5));
	   }

     @Test
	   public void test3() throws NoSolution
     {
		   assertTrue ("Error en test3", 5 ==  aux.calculaBotellasPequenas (7, 0, 5));
	   }

     @Test 
	   public void test4() throws NoSolution
     {
		   assertTrue ("Error en test4", 0 ==  aux.calculaBotellasPequenas (0, 1, 5));
	   }

     @Test (expected = NoSolution.class)
	   public void test5() throws NoSolution
     {
		   aux.calculaBotellasPequenas (3, 7, 34);
	   }

     @Test
	   public void test6() throws NoSolution
     {
		   assertTrue ("Error en test4", 4 ==  aux.calculaBotellasPequenas (8, 7, 34));
	   }

     @Test
	   public void test7() throws NoSolution
     {
		   assertTrue ("Error en test4", 34 ==  aux.calculaBotellasPequenas (40, 0, 34));
	   }

     @Test (expected = NoSolution.class)
	   public void test8() throws NoSolution
     {
		   aux.calculaBotellasPequenas (0, 7, 34);
	   }

     @Test (expected = NoSolution.class)
	   public void test9() throws NoSolution
     {
		   aux.calculaBotellasPequenas (31, 0, 34);
	   }

     @Test (expected = NoSolution.class)
	   public void test10() throws NoSolution
	   {
		   aux.calculaBotellasPequenas (2, 2, 100);
	   }





}
