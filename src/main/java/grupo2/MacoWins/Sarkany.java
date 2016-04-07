package grupo2.MacoWins;

public class Sarkany implements Marca {
	public double GetCoeficiente(double precioOriginal){
		if(precioOriginal>500){
			return (1.35);
		}else{
			return (1.1);
		}
	}
}