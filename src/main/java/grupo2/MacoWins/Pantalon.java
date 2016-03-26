package grupo2.MacoWins;

public class Pantalon implements Prenda{
	public int Precio;
	public boolean Importado;
	
	public Pantalon(boolean importado){
		Precio = 250;
		Importado = importado;
	}
	
	public double PrecioFinal (int valorNegocio){
		double precioFinal = valorNegocio * Precio;
		if (Importado) {
			return precioFinal * (1.3);
		}
		return precioFinal;
	}
}

