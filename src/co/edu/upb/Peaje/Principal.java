package co.edu.upb.Peaje;
import java.io.*;

public class Principal {
	public static void main(String[] args) throws IOException{
		
		Programa d = new Programa();
		int[][] a = d.main();
		GuardarYLeerArchivo.guardar(a);
		
		System.out.println("\n\t\t-------------------------------------------------\n");
		System.out.println("\t\t\t\t    CATEGORIAS");
		System.out.println("\n\t\t-------------------------------------------------\n\n");
		System.out.println("\tA\tB\tC\tD\tE\tF");
		
		for(int xx = 0; xx < 4; xx++) {
			System.out.println("\t");
			for(int yy = 0; yy < 6; yy++) {
				System.out.print("\t" + a[xx][yy]);
			}
		}
		
		d.cleanUp();
	}
}
		