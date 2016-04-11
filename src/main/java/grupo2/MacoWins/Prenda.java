package grupo2.MacoWins;

public class Prenda {
	protected double precioBase;
	private static double valorNegocio;
	private Origen origen;
	private Marca marca;
	
	public void setMarca(Marca nombre) {
		this.marca = nombre;
	}
	public Marca getMarca() {
		return marca; 
	}
	
	public double PrecioFinal() {
		//Precio Final = (Valor fijo del negocio + Precio Base de la Prenda) x Tasa de Importación* coefNegocio
		double precioOriginal = (this.getValorNegocio() + this.getPrecioBase()) * this.getOrigen().tasaDeImportacion();
		return (precioOriginal * this.marca.GetCoeficiente(precioOriginal));
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getValorNegocio() {
		return valorNegocio;
	}

	public static void setValorNegocio(double valorNeg) {
		valorNegocio = valorNeg;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}
	
}

