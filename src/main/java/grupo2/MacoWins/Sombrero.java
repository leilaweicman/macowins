package grupo2.MacoWins;

public class Sombrero extends Prenda {
	private double coeficienteMetro;

	public void setPrecioBase(double valor){
		precioBase = valor + (1 + this.getCoeficienteMetro());
	}

	public void setCoeficienteMetro(double cant){
		this.coeficienteMetro = cant;
	}
	
	public double getCoeficienteMetro(){
		return this.coeficienteMetro;
	}

}
