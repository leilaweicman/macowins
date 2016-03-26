package grupo2.MacoWins;

public interface Prenda {
	public int Precio = 0;
	public boolean Importado = false;
	
	public abstract double PrecioFinal (int valorNegocio);
}
