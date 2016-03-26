package grupo2.MacoWins;

public class Camisa implements Prenda{
	public int Precio;
	public boolean Importado;
	
	public Camisa(boolean importado){
		Precio = 200;
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

