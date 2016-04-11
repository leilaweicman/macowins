package grupo2.MacoWins;

import org.junit.Before;
import org.junit.Test;
import grupo2.MacoWins.Camisa;
import junit.framework.Assert;

public class PrendaTest {
	
	private Camisa camisa;
	private Pantalon pantalon;
	private Saco saco;
	private Sombrero sombrero;
	private Zapatos zapatos;
	
	@Before
	public void init(){
		camisa= new Camisa();
		pantalon= new Pantalon();		
		saco= new Saco();	
		sombrero= new Sombrero ();
		zapatos= new Zapatos();
		Prenda.setValorNegocio(20);		
		camisa.setOrigen(new Importada());
		camisa.setMarca(new Armani());
	
		pantalon.setOrigen(new Nacional());
		pantalon.setMarca(new Sarkany());
		pantalon.setCmTela(15.0);
		pantalon.setPrecioBase(250);
		
		saco.setOrigen(new Importada());
		saco.setCantBotones(25);
		saco.setPrecioBase(300);
		saco.setMarca(new Sarkany());
		
		sombrero.setOrigen(new Nacional());
		sombrero.setCoeficienteMetro(40);
		sombrero.setPrecioBase(150);
		
		
		zapatos.setOrigen(new Importada());
		zapatos.setTalle(39);
		zapatos.setPrecioBase(400);
		zapatos.setMarca(new Sarkany());
	}
	
	@Test
	public void PrecioBaseDeCamisaEs200(){	
		Assert.assertEquals(200.0, camisa.getPrecioBase());		
	}
	@Test	
	public void PrecioBaseDePantalonEs265(){
		Assert.assertEquals(265.0, pantalon.getPrecioBase());		
	}
	@Test
	public void PrecioBaseDeSacoEs550(){
		Assert.assertEquals(550.0, saco.getPrecioBase());		
	}

	@Test
	public void PrecioBaseDeSombreroEs191(){
		Assert.assertEquals(191.0, sombrero.getPrecioBase());		
	}
	
	@Test
	public void PrecioBaseDeZapatosEs595(){
		Assert.assertEquals(595.0, zapatos.getPrecioBase());		
	}
	
	@Test
	public void PrecioFinalDelSacoNoEs300(){
		Assert.assertNotSame(300.0, saco.PrecioFinal());		
	}
	
	@Test
	public void PrecioFinalDelPantalonEs313(){
		Assert.assertEquals(313.5,pantalon.PrecioFinal());
	}	
	
	@Test
	public void PrecioFinalDeCamisaEs471() {
		Assert.assertEquals(471.9,camisa.PrecioFinal());
	}
	
	
	@Test
	public void PrecioFinalDeZapatosEs1079() {
		Assert.assertEquals(1079.325,zapatos.PrecioFinal());
	}
}
