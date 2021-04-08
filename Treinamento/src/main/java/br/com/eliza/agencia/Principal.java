package br.com.eliza.agencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numAgencia="";
		String nomAgencia="";
		ArrayList<Agencia> agencias = new ArrayList<Agencia>();
		for (int i=0;i<3;i++) {
			System.out.println("No.Agencia:");
			numAgencia = scanner.nextLine();
			System.out.println("Descr.Agencia:");
			nomAgencia = scanner.nextLine();
			Agencia a = new Agencia(Integer.parseInt(numAgencia), nomAgencia);
			if(a.getNumAgencia() > 0 && (nomAgencia != null && !"".equals(nomAgencia))){
				if (!agencias.contains(a)) {
					agencias.add(a);
				}
			}
					
			//}
		}
		scanner.close();
		System.out.println(agencias);
		Collections.sort(agencias,(ag1, ag2) -> ag1.getNumAgencia() - ag2.getNumAgencia());
		System.out.println(agencias);
	}
}
