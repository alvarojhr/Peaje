package co.edu.upb.Peaje;

import java.io.*;

public class GuardarYLeerArchivo {
	
	public static void guardar(int[][] matrizAGuardar) throws IOException {
		int salir3 = 0, contador = 0;
		char salir4;
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;

		while(salir3 != 1) {
			System.out.println("\t\t\t\n\t\t Desea guardar en un archivo? \n\n\t\t\t 0: No \n\t\t\t 1: Si\t\t\t\n");
			salir4 = (char) System.in.read();
			
			if(salir4 == '1') {
				try {
					f = new File("Datos.txt");
					w = new FileWriter(f);
					bw = new BufferedWriter(w);
					wr = new PrintWriter(bw);
					
					wr.write("\t\t\t\t\t\t\t-------------------------------------------------" + "\n");
					wr.write("\t\t\t\t\t\t\t\t           CATEGORIAS" + "\n");
					wr.write("\t\t\t\t\t\t\t-------------------------------------------------" + "\n" + "\n");
					wr.write("\t\t\t\t\t" + "A" + "\t\t" + "B" + "\t\t" + "C" + "\t\t" + "D" + "\t\t" + "E" + "\t\t" + "F");
					
					wr.write("\n");
					for(int[] x: matrizAGuardar) {
						wr.write("\n ");
						if(contador == 0) {
							wr.write("Cantidad de vehiculos:" + "\t");
						}
						if(contador == 1) {
							wr.write("Cantidad de vehiculos gbmtls:");
						}
						if(contador == 2) {
							wr.write("Precio categoria:" + "\t");
						}
						if(contador == 3) {
							wr.write("Recaudo de cada categoria:");
						}
						
						for(int y: x) {
							wr.write("\t\t" + String.valueOf(y));
							wr.write(" ");
						}
						bw.newLine();
						contador++;
					}
					
					wr.close();
					bw.close();
					
				}
				catch(Exception e) {
					System.out.println("Ocurrio un error: " + e);
				}
			}
			salir3 = 1;
		}
	}
	
	public static void leerArchivo() {
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader("Datos.txt");
			br = new BufferedReader(fr);
			
			String linea;
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
