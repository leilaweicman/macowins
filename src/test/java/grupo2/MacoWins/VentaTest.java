package grupo2.MacoWins;

import org.junit.Before;
import org.junit.Test;
import grupo2.MacoWins.Camisa;
import junit.framework.Assert;
import java.util.Date;


public class VentaTest {
	private Camisa camisa;
	private Venta venta;
	private int cantidad = 4;
	
	@Before
	public void init(){
		camisa= new Camisa();
		venta = new Venta();
		Prenda.setValorNegocio(20);		
		camisa.setOrigen(new Importada());
		venta.setFecha(new Date());
		venta.setCantidad(cantidad);
		venta.setPrenda(camisa);
	}
	
	@Test
	public void FechaLaDeHoy(){	
		Assert.assertEquals(new Date(), venta.getFecha());		
	}
	
	@Test
	public void LaCantidadQueCorresponde(){	
		Assert.assertEquals(cantidad, venta.getCantidad());		
	}
	
	@Test
	public void LaPrendaEsCamisa(){	
		Assert.assertEquals(camisa, venta.getPrenda());		
	}
	
	
}
