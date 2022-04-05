import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class actividad_resuelta_10_3 {

	public static void main(String[] args) {
		String texto = "";
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("/home/alumnado/Documentos/programacion/holamundo/HolaMundo.java"));
			String linea = in.readLine();
			while(linea!=null) {
				texto =texto+linea + '\n';
				linea = in.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(in!=null) {
				try {
					in.close();
				}catch(IOException e){
					System.out.println(e);
				}
			}
			
		}
		System.out.println(texto);
	}

}
