package grupo2.MacoWins;

public class Zapatos extends Prenda {
	private double talle;

	public void setPrecioBase(double valor){
		precioBase = valor + (5 * this.getTalle());
	}

	public void setTalle(double cant){
		this.talle = cant;
	}
	
	public double getTalle(){
		return this.talle;
	}

}
