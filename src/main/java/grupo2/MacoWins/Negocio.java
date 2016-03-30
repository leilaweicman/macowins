package grupo2.MacoWins;

import java.util.ArrayList;

public class Negocio {
	private ArrayList<Venta> ventas = new ArrayList<Venta>();
	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public void registrarVenta(Venta venta){
		this.getVentas().add(venta);		
	}
}
