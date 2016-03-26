package grupo2.MacoWins.Classes;

public class Prenda {
	public int Precio;
	public boolean Importado;
	
	public double PrecioFinal (int valorNegocio){
		double precioFinal = valorNegocio * Precio;
		if (Importado) {
			return precioFinal * (1.3);
		}
		return precioFinal;
	}
}
