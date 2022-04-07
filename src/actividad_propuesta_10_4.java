import java.io.*;
import java.util.Scanner;

public class actividad_propuesta_10_4 {

	public static void main(String[] args) {
		BufferedWriter out = null;
		BufferedReader in = null;
		
		String cad="";
		Scanner sc = new Scanner(System.in); 
		sc.useDelimiter("\n");
		
		try {
			File archivo = new File("ejemplo.txt");
			if(archivo.createNewFile()) {
				System.out.println("Archivo: " + archivo.getName());
			}else {
				System.out.println("El archivo ya existe");
			}
			
			out = new BufferedWriter(new FileWriter("ejemplo.txt",true));
			
			
			while(!cad.equalsIgnoreCase("fin")) {
			
				
			System.out.println("Escribeme lo que quieres añadir: ");
			cad = sc.next();
			out.write(cad);
			out.newLine();
			}	
			out.flush();
			in = new BufferedReader(new FileReader("ejemplo.txt"));
			
			String texto= "";
			String c = in.readLine();
			
			while(c!= null) {

				texto = texto + c + '\n';
				c=in.readLine();
				
			}
			
			System.out.println(texto);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			if(out != null) {
				try {
					
					out.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			if(in != null) {
				try {
					
					in.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
		}


	}

}
