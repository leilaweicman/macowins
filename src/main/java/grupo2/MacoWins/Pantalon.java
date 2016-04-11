package grupo2.MacoWins;

public class Pantalon extends Prenda{
	private double cmTela;

	public void setPrecioBase(double valor){
		precioBase = valor + (1 * this.getCmTela());
	}

	public void setCmTela(double cant){
		this.cmTela = cant;
	}
	
	public double getCmTela(){
		return this.cmTela;
	}
}

