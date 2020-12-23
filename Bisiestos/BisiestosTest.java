import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestosTest
{
	int a;
	Bisiestos anio = new Bisiestos();
	
	
	@Test (expected = IllegalArgumentException.class)
	   public void negativo()
	   {
		   a = -1940;
		   anio.esBisiesto (a);
	   }
	
	@Test
	public void true0()
	{
		a=0;   
		assertTrue ("Error true0: El año 0 es bisiesto", true == anio.esBisiesto (a));
	}
	
	
	
	@Test
	public void true1()
	{
		a=20;   
		assertTrue ("Error true1: El año 20 es bisiesto", true == anio.esBisiesto (a));
	}
	
	
	
	@Test
	public void true2()
	{
		a=2020;   
		assertTrue ("Error true2: El año 2020 es bisiesto", true == anio.esBisiesto (a));
	}
	
	
	
	@Test
	public void true3()
	{
		a=2024;
		assertTrue ("Error true3: El año 2024 es bisiesto", true == anio.esBisiesto (a));
	}
	
	
	
	@Test
	public void false1()
	{
		a=21;
		assertTrue ("Error false1: El año 2024 es bisiesto", false == anio.esBisiesto (a));
	}
	
	
	
	@Test
	public void false2()
	{
		a=2021;
		assertTrue ("Error false2: El año 2024 es bisiesto", false == anio.esBisiesto (a));
	}
	
	
	
	@Test
	public void false3()
	{
		a=2025;
		assertTrue ("Error false3: El año 2024 es bisiesto", false == anio.esBisiesto (a));
	}

	
}