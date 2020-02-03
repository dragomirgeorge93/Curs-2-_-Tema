package main;

public class Exercitiul4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		for(int i=1; i<10; i++) {
			suma += suma + i;
		}
			System.out.println("Suma este:" + suma);
	}

}

// "suma += suma + i", este egal cu "suma = suma + suma + i" iar cand i=9, suma o sa fie 1013;