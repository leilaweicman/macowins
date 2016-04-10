package grupo2.MacoWins;

import org.junit.Before;
import org.junit.Test;
import grupo2.MacoWins.Camisa;
import junit.framework.Assert;

public class PrendaTest {
	
	private Camisa camisa;
	private Pantalon pantalon;
	private Saco saco;
	
	@Before
	public void init(){
		camisa= new Camisa();
		pantalon= new Pantalon();		
		saco= new Saco();	
		
		Prenda.setValorNegocio(20);		
		camisa.setOrigen(new Importada());
		camisa.setMarca(new Armani());
		pantalon.setOrigen(new Nacional());
		pantalon.setMarca(new Sarkany());
		saco.setOrigen(new Importada());
		saco.setMarca(new Sarkany());
	}
	
	@Test
	public void PrecioBaseDeCamisaEs200(){	
		Assert.assertEquals(200.0, camisa.getPrecioBase());		
	}
	@Test	
	public void PrecioBaseDePantalonEs250(){
		Assert.assertEquals(250.0, pantalon.getPrecioBase());		
	}
	@Test
	public void PrecioBaseDeSacoEs300(){
		Assert.assertEquals(300.0, saco.getPrecioBase());		
	}
	
	@Test
	public void PrecioFinalDelSacoNoEs300(){
		Assert.assertNotSame(300.0, saco.PrecioFinal());		
	}
	
	@Test
	public void PrecioFinalDelPantalonEs297(){
		Assert.assertEquals(297.0,pantalon.PrecioFinal());
	}	
	
	@Test
	public void PrecioFinalDeCamisaEs471() {
		Assert.assertEquals(471.9,camisa.PrecioFinal());
	}
}
