package grupo2.MacoWins;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
	public static ArrayList<Prenda> listPrendas;
	public static ArrayList<Venta> listVentas;
	public static int cantSacos = 0, cantPantalones = 0, cantCamisas = 0;
    public static void main( String[] args )
    {
    	listPrendas = new ArrayList<Prenda>();
    	listVentas = new ArrayList<Venta>();
    	RegistrarVentas();
    }
    
    public static void RegistrarVentas(){
    	Scanner in = new Scanner(System.in);    	
    	String prenda;
    	int cantidad;
    	
    	System.out.println("Ingresar prenda (c: camisa, p: pantalon, s:saco)");
    	prenda = in.next();
    	while(!prenda.equals("terminar")){
        	System.out.println("Ingresar cantidad");
        	cantidad = in.nextInt();
        	
        	RegistrarVenta(prenda, cantidad);
        	
        	System.out.println("Ingresar prenda (c: camisa, p: pantalon, s:saco");
        	prenda = in.next();
    	}
    	System.out.println("terminó");    	
    	
    }
    
    public static void RegistrarVenta(String prenda, int cantidad){
    	Venta v = new Venta();
    	v.cantidad = cantidad;
    	
		//Lo implemento con ifs porque no me deja hacer un switch de strings
		//Hay que ver como manejar el tema de si es importado o no.
		//Por ahora seteo todo en importado
		if(prenda.equals("c")){
			Camisa c = new Camisa(true);
			listPrendas.add(c);
			cantCamisas += cantidad;
			v.prenda = c;
		}else if (prenda.equals("p")){
			Pantalon p = new Pantalon(true);
			listPrendas.add(p);
			cantPantalones+= cantidad;  
			v.prenda = p;
		}else if(prenda.equals("s")){
			Saco s = new Saco(true);
			listPrendas.add(s);
			cantSacos+= cantidad;
			v.prenda = s;
		}			
		listVentas.add(v);		
    	System.out.println("Prenda agregada");
    }
}
