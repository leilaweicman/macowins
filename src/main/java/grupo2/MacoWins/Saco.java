package grupo2.MacoWins;

public class Saco extends Prenda{
	private double cantBotones;

	public void setPrecioBase(double valor){
		precioBase = valor + (10 * this.getCantBotones());
	}

	public void setCantBotones(double cant){
		this.cantBotones = cant;
	}
	
	public double getCantBotones(){
		return this.cantBotones;
	}

}
