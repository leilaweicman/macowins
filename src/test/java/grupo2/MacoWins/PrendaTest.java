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
		pantalon.setOrigen(new Nacional());
		saco.setOrigen(new Importada());
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
	public void PrecioFinalDelPantalonEs300(){
		Assert.assertEquals(416.0, saco.PrecioFinal());		
	}
}
