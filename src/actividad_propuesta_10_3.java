import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class actividad_propuesta_10_3 {

	public static void main(String[] args) {
		BufferedReader flujo = null;
		int numero = 0;
		int sumanum=0;
		double altura=0;
		double sumaltura = 0;
		int contadoredad =0;
		int contadoralt = 0;
		String nombre = "";
		try {
			flujo = new BufferedReader(new FileReader("/home/alumnado/Documentos/programacion/workspace/FicherosDeTexto/src/Enteros.txt"));
			Scanner s;
			
			String linea = flujo.readLine();
			while (linea != null) {
				s = new Scanner(linea).useLocale(Locale.US);
				if(s.hasNext()) {
					nombre = s.next();
					System.out.print(nombre +" ");
				}
				if(s.hasNextInt()) {
					numero = s.nextInt();
					System.out.print(numero + " ");
					sumanum+=numero;
					contadoredad++;
				}
				if(s.hasNextDouble()) {
					altura = s.nextDouble();
					System.out.println(altura + " ");
					sumaltura +=altura;
					contadoralt++;
				}
				linea = flujo.readLine();
			}
			System.out.println("Media edad: " + (sumanum/contadoredad));
			System.out.println("Media altura: " + (sumaltura/contadoralt));
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
