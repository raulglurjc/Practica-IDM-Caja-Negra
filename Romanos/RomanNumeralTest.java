
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanNumeralTest
{
	String s;
	RomanNumeral numero = new RomanNumeral();



	@Test (expected = IllegalArgumentException.class)
		public void no_romano1()
		{
			s = "aXX";
			numero.convierte(s);
		}

	@Test (expected = IllegalArgumentException.class)
		public void no_romano2()
		{
			s = "123";
			numero.convierte(s);
		}

  @Test
  public void esromano1()
    {
      s = "MC";
      assertTrue("esromano1 ha fallado", 1100 == numero.convierte(s));
    }

	@Test
  public void esromano2()
    {
      s = "CCXLVIII";
      assertTrue("esromano2 ha fallado", 248 == numero.convierte(s));
    }
	@Test
  public void esromano3()
    {
      s = "MMMDCCCLXXIII";
      assertTrue("esromano3 ha fallado", 3873 == numero.convierte(s));
    }

	@Test
	public void esromano_minuscula1()
		{
			s = "mmmdccclxxiii";
			assertTrue("esromano_minuscula1 ha fallado", 3873 == numero.convierte(s));
		}

	@Test
	public void esromano_minuscula2()
		{
			s = "mCm";
			assertTrue("esromano_minuscula2 ha fallado", 1900 == numero.convierte(s));
		}

	@Test
	public void esromano_minuscula3()
		{
			s = "McM";
			assertTrue("esromano_minuscula3 ha fallado", 1900 == numero.convierte(s));
		}

}
