package grupo2.MacoWins;

public abstract class Prenda {
	public int Precio = 0;
	public boolean Importado = false;
	private double tasaImportacion = (1.3);
	
	public double PrecioFinal (int valorNegocio){
		double precioFinal = valorNegocio * Precio;
		if (Importado) {
			return precioFinal * tasaImportacion;
		}
		return precioFinal;
	};
}
