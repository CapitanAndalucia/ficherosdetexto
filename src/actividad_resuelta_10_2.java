import java.io.FileReader;
import java.io.IOException;

public class actividad_resuelta_10_2 {

	public static void main(String[] args) {
		String texto = "";
		FileReader in =  null;
		
		try {
			in = new FileReader("/home/alumnado/Documentos/programacion/holamundo/HolaMundo.java");
			int c = in.read();
			while (c!=-1) {
				texto = texto + (char) c;
				c=in.read();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if (in != null) {
				try {
					in.close();
				}catch (IOException e) {
					System.out.println(e);
				}
			}
		}
		System.out.println(texto);
	}

}
