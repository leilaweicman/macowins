package grupo2.MacoWins;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
	private static ArrayList<Prenda> list;
    public static void main( String[] args )
    {
    	list = new ArrayList<Prenda>();
    	Scanner in = new Scanner(System.in);    	
    	String prenda;
    	
    	System.out.println("Ingresar prenda (c: camisa, p: pantalon, s:saco)");
    	prenda = in.next();
    	while(!prenda.equals("terminar")){
    		//Lo implemento con ifs porque no me deja hacer un switch de strings
    		//Hay que ver como manejar el tema de si es importado o no.
    		//Por ahora seteo todo en importado
    		if(prenda.equals("c")){
    			Camisa c = new Camisa(true);
    			list.add(c);
    		}else if (prenda.equals("p")){
    			Pantalon p = new Pantalon(true);
    			list.add(p);
    		}else if(prenda.equals("s")){
    			Saco s = new Saco(true);
    			list.add(s);
    		}
        	System.out.println("Prenda agregada");
        	System.out.println("Ingresar prenda (c: camisa, p: pantalon, s:saco");
        	prenda = in.next();
    	}
    	System.out.println("terminó");
    	System.out.println(list);
    }
}
