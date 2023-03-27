package co.edu.upb.Peaje;

import java.io.*;
import java.util.Scanner;

public class Programa {
	Scanner lectura = new Scanner(System.in);
	public int[][]  main() throws IOException {
		// TODO Auto-generated method stub
		int valor_0 = 9400, valor_1 = 0, valor_2 = 10500, valor_3 = 21700,valor_4 = 27600, valor_5 = 31200; //Valores del precio de cada categoria
		int[][] m = new int[4][6];
		
		for(int i = 2; i<3; i++) {
			for(int j = 0; j < 6; j++) {
				m[i][j] = valor_0;
				m[i][j + 1] = valor_1;
				m[i][j + 2] = valor_2;
				m[i][j + 3] = valor_3;
				m[i][j + 4] = valor_4;
				m[i][j + 5] = valor_5;
				j = 6;
			}
		}
		
		menu(m);
		
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < 6; j++) {
				m[3][j] = m[i][j] * m[2][j];
			}
		}
		
		return m;
	}
	
	public void menu(int[][] archivoFinal) {
		int salir  =  0, rta = 0, valorAPagar = 0;
		String peaje;
		while(salir != 1) {
			System.out.println("\n\t\t-----------------------------------------------\n");
			System.out.println("\t\t\t Peaje Rio Blanco / Santander");
			System.out.println("\n\t\t-----------------------------------------------\n\n");
			
			System.out.println("\t\t\t\tCATEGORIAS DE VEHICULOS\n");
            System.out.println("\t\t A = Carros, Camperos, Camionetas\n");
            System.out.println("\t\t B = Motos\n");
            System.out.println("\t\t C = Buses, busetas, microbuses\n");
            System.out.println("\t\t D = Camiones de carga de dos ejes\n");
            System.out.println("\t\t E = Camiones de carga de tres ejes\n");
            System.out.println("\t\t F = Camiones de carga de cuatro y cinco ejes\n");
            System.out.println("\t\t G = Leer un archivo\n");
            System.out.println("\t\t\t\tEscoja La categoria\n");
            
            peaje = lectura.next();
            peaje = peaje.toUpperCase();
            switch(peaje) {
            
	            case "A" : 
	            	System.out.println("\t\tEs un vehiculo Gubernamental?\t\t\n");
	            	System.out.println("\n\n\t\t\t 0: No \n\t\t\t 1: Si\t\t\t\n");
	            	
	            	rta = lectura.nextInt();
	            	
	            	if(rta == 0) {
	            		System.out.println("\t\tCobra 9400$ Pesos\n");
	            		archivoFinal[0][0] += 1;
	            		valorAPagar = 9400;
	            		System.out.println("\t\tValor entregado por el conductor: \t\t\n");
	            		int valorEntregado = lectura.nextInt();
	            		System.out.println(valorEntregado - valorAPagar + "$");
	            	}
	            	else {
	            		System.out.println("\t\tNo cobra nada, es un vehiculo gubernamental\n");
	            		archivoFinal[1][0] += 1;
	            	}
	            	break;
            
	            case "B" : 
	            	System.out.println("\t\tEs un vehiculo Gubernamental?\t\t\n");
	            	System.out.println("\n\n\t\t\t 0: No \n\t\t\t 1: Si\t\t\t\n");
	            	
	            	rta = lectura.nextInt();
	            	
	            	if(rta == 0) {
	            		System.out.println("\t\tNo paga\n");
	            		archivoFinal[0][1] += 1;
	            	}
	            	else {
	            		System.out.println("\t\tNo cobra nada, es un vehiculo gubernamental\n");
	            		archivoFinal[1][1] += 1;
	            	}
	            	break;
	            	
	            case "C" : 
	            	System.out.println("\t\tEs un vehiculo Gubernamental?\t\t\n");
	            	System.out.println("\n\n\t\t\t 0: No \n\t\t\t 1: Si\t\t\t\n");
	            	
	            	rta = lectura.nextInt();
	            	
	            	if(rta == 0) {
	            		System.out.println("\t\tCobra 10500$ Pesos\n");
	            		archivoFinal[0][2] += 1;
	            		valorAPagar = 10500;
	            		System.out.println("\t\tValor entregado por el conductor: \t\t\n");
	            		int valorEntregado = lectura.nextInt();
	            		System.out.println(valorEntregado - valorAPagar + "$");
	            	}
	            	else {
	            		System.out.println("\t\tNo cobra nada, es un vehiculo gubernamental\n");
	            		archivoFinal[1][2] += 1;
	            	}
	            	break;
	            
	            case "D" : 
	            	System.out.println("\t\tEs un vehiculo Gubernamental?\t\t\n");
	            	System.out.println("\n\n\t\t\t 0: No \n\t\t\t 1: Si\t\t\t\n");
	            	
	            	rta = lectura.nextInt();
	            	
	            	if(rta == 0) {
	            		System.out.println("\t\tCobra 21600$ Pesos\n");
	            		archivoFinal[0][3] += 1;
	            		valorAPagar = 21600;
	            		System.out.println("\t\tValor entregado por el conductor: \t\t\n");
	            		int valorEntregado = lectura.nextInt();
	            		System.out.println(valorEntregado - valorAPagar + "$");
	            	}
	            	else {
	            		System.out.println("\t\tNo cobra nada, es un vehiculo gubernamental\n");
	            		archivoFinal[1][3] += 1;
	            	}
	            	break;
	            	
	            case "E" : 
	            	System.out.println("\t\tEs un vehiculo Gubernamental?\t\t\n");
	            	System.out.println("\n\n\t\t\t 0: No \n\t\t\t 1: Si\t\t\t\n");
	            	
	            	rta = lectura.nextInt();
	            	
	            	if(rta == 0) {
	            		System.out.println("\t\tCobra 27700$ Pesos\n");
	            		archivoFinal[0][4] += 1;
	            		valorAPagar = 27700;
	            		System.out.println("\t\tValor entregado por el conductor: \t\t\n");
	            		int valorEntregado = lectura.nextInt();
	            		System.out.println(valorEntregado - valorAPagar + "$");
	            	}
	            	else {
	            		System.out.println("\t\tNo cobra nada, es un vehiculo gubernamental\n");
	            		archivoFinal[1][4] += 1;
	            	}
	            	break;
	            	
	            case "F" : 
	            	System.out.println("\t\tEs un vehiculo Gubernamental?\t\t\n");
	            	System.out.println("\n\n\t\t\t 0: No \n\t\t\t 1: Si\t\t\t\n");
	            	
	            	rta = lectura.nextInt();
	            	
	            	if(rta == 0) {
	            		System.out.println("\t\tCobra 31200$ Pesos\n");
	            		archivoFinal[0][5] += 1;
	            		valorAPagar = 31200;
	            		System.out.println("\t\tValor entregado por el conductor: \t\t\n");
	            		int valorEntregado = lectura.nextInt();
	            		System.out.println(valorEntregado - valorAPagar + "$");
	            	}
	            	else {
	            		System.out.println("\t\tNo cobra nada, es un vehiculo gubernamental\n");
	            		archivoFinal[1][5] += 1;
	            	}
	            	break;
	            	
	            case "G" : 
	            	GuardarYLeerArchivo.leerArchivo();
	            	System.exit(0);
	            	break;
	          
	            default:
	            	System.out.println("Ingrese una opción valida");
	            	continue;
            
            }
            
            System.out.println("\t\t\t\n\t\t Desea salir? \n\n\t\t\t 0: No \n\t\t\t 1: Si\t\t\t\n");
            salir = lectura.nextInt();
		}

	}

	public void cleanUp() {
		lectura.close();
	}
}
