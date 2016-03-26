package grupo2.MacoWins;

public class Saco implements Prenda{
	public int Precio;
	public boolean Importado;
	
	public Saco(boolean importado){
		Precio = 300;
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
