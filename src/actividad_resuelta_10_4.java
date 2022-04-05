import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class actividad_resuelta_10_4 {

	public static void main(String[] args) {
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader("/home/alumnado/Documentos/programacion/workspace/FicherosDeTexto/src/NumerosReales.txt"));
			String texto =in.readLine();
			String[] subcad = texto.split(" ");
			double suma = 0;
			for (int i = 0; i < subcad.length; i++) {
				suma += Double.valueOf(subcad[i]);
			}
			System.out.println("Suma " + suma + "\tMedia: " + (suma/subcad.length));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(in != null) {
				try {
					in.close();
				}catch(IOException e){
					System.out.println(e);
					
				}
			}
		}

	}

}
